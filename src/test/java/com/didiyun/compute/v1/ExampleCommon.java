package com.didiyun.compute.v1;

import com.didiyun.base.v1.Error;
import com.didiyun.base.v1.Header;
import com.didiyun.base.v1.JobInfo;
import com.didiyun.common.Auth;
import com.didiyun.common.Utils;
import com.google.api.client.util.Sets;
import com.google.api.client.util.Strings;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.ManagedChannel;
import org.apache.commons.codec.binary.Hex;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by Glacier on 2018/10/31.
 */
public class ExampleCommon {

    @Test
    public void allInOne() throws Exception {

        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub dc2Stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        EipGrpc.EipBlockingStub eipStub = EipGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        EbsGrpc.EbsBlockingStub ebsStub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        VpcGrpc.VpcBlockingStub vpcStub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        SgGrpc.SgBlockingStub sgStub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        SnapGrpc.SnapBlockingStub snapStub = SnapGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());

        String dc2Uuid = "";
        String securityGroupUuid = "";
        String securityGroupRuleUuid = "", securityGroupRuleUuid2 = "";
        String vpcUuid = "";
        String subnetUuid = "", subnetUuid2 = "";
        String snapshotUuid = "";
        String eipUuid = "", eipUuid2 = "";
        String ebsUuid = "", ebsUuid2 = "";
        String sshKeyUuid = "";
        try {
            //0. ListImage
            String imageUuid1 = "", imageUuid2 = "";
            ListImageResponse imgList = dc2Stub.listImage(ListImageRequest.newBuilder().build());
            Utils.printWithJsonString(imgList);
            Assert.assertNotNull(imgList);
            Assert.assertNotNull(imgList.getError());
            Assert.assertEquals(imgList.getError().getErrno(), 0);
            for (ListImageResponse.Image img : imgList.getDataList()) {
                if ("CentOS-7.4".equals(img.getName())) {
                    imageUuid1 = img.getImgUuid();
                } else if ("Ubuntu-16.04".equals(img.getName())) {
                    imageUuid2 = img.getImgUuid();
                }
            }
            System.out.println("imageUuid1:\t" + imageUuid1 + "\timageUuid2:\t" + imageUuid2);
            Assert.assertNotEquals(imageUuid1, "");
            Assert.assertNotEquals(imageUuid2, "");

            //1. ListVpc
            ListVpcResponse vpcList = vpcStub.listVpc(ListVpcRequest.newBuilder().setStart(0).setLimit(10).build());
            Utils.printWithJsonString(vpcList);
            Assert.assertNotNull(vpcList);
            Assert.assertNotNull(vpcList.getError());
            Assert.assertEquals(vpcList.getError().getErrno(), 0);

            //2. CreateVpc
            CreateVpcResponse createVpcResp = vpcStub.createVpc(CreateVpcRequest.newBuilder()
                    .setHeader(Header.newBuilder()
                            .setRegionId("gz")
                            .build())
                    .setName("create-vpc-by-sdk")
                    .setCidr("172.16.0.0/12")
                    .addSubnet(CreateSubnetInput.newBuilder()
                            .setName("create-vpc-by-sdk")
                            .setCidr("172.16.0.0/24")
                            .setZoneId("gz01")
                            .build())
                    .build());
            Utils.printWithJsonString(createVpcResp);
            Assert.assertNotNull(createVpcResp);
            Assert.assertNotNull(createVpcResp.getError());
            Assert.assertEquals(createVpcResp.getError().getErrno(), 0);
            JobResultResponse createVpcJob = pollingJobResult(channel, "gz", createVpcResp.getDataList());
            Assert.assertNotNull(createVpcJob);
            Assert.assertNotNull(createVpcJob.getError());
            Assert.assertEquals(createVpcJob.getError().getErrno(), 0);
            for (JobInfo job : createVpcJob.getDataList()) {
                vpcUuid = job.getResourceUuid();
            }
            System.out.println("vpcUuid:\t" + vpcUuid);
            Assert.assertNotEquals(vpcUuid, "");

            //3. GetVpcByUuid
            GetVpcByUuidResponse vpc = vpcStub.getVpcByUuid(GetVpcByUuidRequest.newBuilder()
                    .setHeader(Header.newBuilder()
                            .setRegionId("gz")
                            .build())
                    .setVpcUuid(vpcUuid)
                    .build());
            Utils.printWithJsonString(vpc);
            Assert.assertNotNull(vpc);
            Assert.assertNotNull(vpc.getError());
            Assert.assertEquals(vpc.getError().getErrno(), 0);

            //4. GetVpcTotalCnt
            GetVpcTotalCntResponse vpcTotalCnt = vpcStub.getVpcTotalCnt(GetVpcTotalCntRequest.newBuilder()
                    .setHeader(Header.newBuilder()
                            .setRegionId("gz")
                            .build())
                    .build());
            Utils.printWithJsonString(vpcTotalCnt);
            Assert.assertNotNull(vpcTotalCnt);
            Assert.assertNotNull(vpcTotalCnt.getError());
            Assert.assertEquals(vpcTotalCnt.getError().getErrno(), 0);

            //5. ChangeVpcName
            ChangeVpcNameResponse changeVpcNameResp = vpcStub.changeVpcName(ChangeVpcNameRequest.newBuilder()
                    .setHeader(Header.newBuilder()
                            .setRegionId("gz")
                            .build())
                    .addVpc(ChangeVpcNameRequest.Input.newBuilder()
                            .setVpcUuid(vpcUuid)
                            .setName("change-vpc-name-by-sdk")
                            .build())
                    .build());
            Utils.printWithJsonString(changeVpcNameResp);
            Assert.assertNotNull(changeVpcNameResp);
            Assert.assertNotNull(changeVpcNameResp.getError());
            Assert.assertEquals(changeVpcNameResp.getError().getErrno(), 0);
            JobResultResponse changeVpcNameJob = pollingJobResult(channel, "gz", changeVpcNameResp.getDataList());
            Assert.assertNotNull(changeVpcNameJob);
            Assert.assertNotNull(changeVpcNameJob.getError());
            Assert.assertEquals(changeVpcNameJob.getError().getErrno(), 0);

            //6. ListSubnet
            ListSubnetResponse subnetList = vpcStub.listSubnet(ListSubnetRequest.newBuilder()
                    .setStart(0)
                    .setLimit(10)
                    .setCondition(ListSubnetCondition.newBuilder()
                            .setVpcUuid(vpcUuid)
                            .build())
                    .build());
            Utils.printWithJsonString(subnetList);
            Assert.assertNotNull(subnetList);
            Assert.assertNotNull(subnetList.getError());
            Assert.assertEquals(subnetList.getError().getErrno(), 0);
            subnetUuid = subnetList.getDataCount() > 0 ? subnetList.getData(0).getSubnetUuid() : "";
            System.out.println("SubnetUuid:\t" + subnetUuid);
            Assert.assertNotNull(subnetUuid);
            Assert.assertNotEquals(subnetUuid, "");

            //7. CreateSubnet
            CreateSubnetResponse createSubnetResp = vpcStub.createSubnet(CreateSubnetRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setVpcUuid(vpcUuid)
                    .addSubnet(CreateSubnetInput.newBuilder()
                            .setName("create-subnet-by-sdk")
                            .setCidr("172.16.1.0/24")
                            .setZoneId("gz02")
                            .build())
                    .build());
            Utils.printWithJsonString(createSubnetResp);
            Assert.assertNotNull(createSubnetResp);
            Assert.assertNotNull(createSubnetResp.getError());
            Assert.assertEquals(createSubnetResp.getError().getErrno(), 0);
            JobResultResponse createSubnetJob = pollingJobResult(channel, "gz", createSubnetResp.getDataList());
            Assert.assertNotNull(createSubnetJob);
            Assert.assertNotNull(createSubnetJob.getError());
            Assert.assertEquals(createSubnetJob.getError().getErrno(), 0);
            for (JobInfo job : createSubnetJob.getDataList()) {
                subnetUuid2 = job.getResourceUuid();
            }
            System.out.println("SubnetUuid 2:\t" + subnetUuid2);
            Assert.assertNotNull(subnetUuid2);
            Assert.assertNotEquals(subnetUuid2, "");

            //8. GetSubnetTotalCnt
            GetSubnetTotalCntResponse subnetTotalCnt = vpcStub.getSubnetTotalCnt(GetSubnetTotalCntRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build()).setVpcUuid(vpcUuid).build());
            Utils.printWithJsonString(subnetTotalCnt);
            Assert.assertNotNull(subnetTotalCnt);
            Assert.assertNotNull(subnetTotalCnt.getError());
            Assert.assertEquals(subnetTotalCnt.getError().getErrno(), 0);

            //9. ChangeSubnetName
            ChangeSubnetNameResponse changeSubnetNameResp = vpcStub.changeSubnetName(ChangeSubnetNameRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setVpcUuid(vpcUuid)
                    .addSubnet(ChangeSubnetNameRequest.Input.newBuilder()
                            .setSubnetUuid(subnetUuid)
                            .setName("change-subnet-name-by-sdk")
                            .build())
                    .build());
            Utils.printWithJsonString(changeSubnetNameResp);
            Assert.assertNotNull(changeSubnetNameResp);
            Assert.assertNotNull(changeSubnetNameResp.getError());
            Assert.assertEquals(changeSubnetNameResp.getError().getErrno(), 0);
            JobResultResponse changeSubnetNameJob = pollingJobResult(channel, "gz", changeSubnetNameResp.getDataList());
            Assert.assertNotNull(changeSubnetNameJob);
            Assert.assertNotNull(changeSubnetNameJob.getError());
            Assert.assertEquals(changeSubnetNameJob.getError().getErrno(), 0);

            //10. ListSecurityGroup
            ListSgResponse sgList = sgStub.listSg(ListSgRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setStart(0)
                    .setLimit(10)
                    .setCondition(ListSgCondition.newBuilder()
                            .setVpcUuid(vpcUuid)
                            .build())
                    .build());
            Utils.printWithJsonString(sgList);
            Assert.assertNotNull(sgList);
            Assert.assertNotNull(sgList.getError());
            Assert.assertEquals(sgList.getError().getErrno(), 0);

            //11. GetSecurityGroupTotalCnt
            GetSgTotalCntResponse sgTotalCnt = sgStub.getSgTotalCnt(GetSgTotalCntRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setVpcUuid(vpcUuid)
                    .build());
            Utils.printWithJsonString(sgTotalCnt);
            Assert.assertNotNull(sgTotalCnt);
            Assert.assertNotNull(sgTotalCnt.getError());
            Assert.assertEquals(sgTotalCnt.getError().getErrno(), 0);

            //12. CreateSecurityGroup
            CreateSgResponse createSgResp = sgStub.createSg(CreateSgRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setName("create-sg-by-sdk")
                    .setVpcUuid(vpcUuid)
                    .build());
            Utils.printWithJsonString(createSgResp);
            Assert.assertNotNull(createSgResp);
            Assert.assertNotNull(createSgResp.getError());
            Assert.assertEquals(createSgResp.getError().getErrno(), 0);
            JobResultResponse createSgJob = pollingJobResult(channel, "gz", createSgResp.getDataList());
            Assert.assertNotNull(createSgJob);
            Assert.assertNotNull(createSgJob.getError());
            Assert.assertEquals(createSgJob.getError().getErrno(), 0);
            for (JobInfo job : createSgJob.getDataList()) {
                securityGroupUuid = job.getResourceUuid();
            }
            System.out.println("securityGroupUuid:\t" + securityGroupUuid);
            Assert.assertNotNull(securityGroupUuid);
            Assert.assertNotEquals(securityGroupUuid, "");

            //13. ChangeSecurityGroupName
            ChangeSgNameResponse changeSgNameResp = sgStub.changeSgName(ChangeSgNameRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addSg(ChangeSgNameRequest.Input.newBuilder()
                            .setSgUuid(securityGroupUuid)
                            .setName("change-sg-name-by-sdk")
                            .build())
                    .build());
            Utils.printWithJsonString(changeSgNameResp);
            Assert.assertNotNull(changeSgNameResp);
            Assert.assertNotNull(changeSgNameResp.getError());
            Assert.assertEquals(changeSgNameResp.getError().getErrno(), 0);
            JobResultResponse changeSgNameJob = pollingJobResult(channel, "gz", changeSgNameResp.getDataList());
            Assert.assertNotNull(changeSgNameJob);
            Assert.assertNotNull(changeSgNameJob.getError());
            Assert.assertEquals(changeSgNameJob.getError().getErrno(), 0);

            //14. CreateSecurityGroupRule
            CreateSgRuleResponse createSgRuleResp = sgStub.createSgRule(CreateSgRuleRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setSgUuid(securityGroupUuid)
                    .addSgRule(CreateSgRuleInput.newBuilder()
                            .setStartPort(3306)
                            .setEndPort(3306)
                            .setProtocol("TCP")
                            .setAllowedCidr("172.16.0.0/16")
                            .setType("Ingress")
                            .build())
                    .addSgRule(CreateSgRuleInput.newBuilder()
                            .setStartPort(6379)
                            .setEndPort(7777)
                            .setProtocol("UDP")
                            .setAllowedCidr("0.0.0.0/0")
                            .setType("Egress")
                            .build())
                    .build());
            Utils.printWithJsonString(createSgRuleResp);
            Assert.assertNotNull(createSgRuleResp);
            Assert.assertNotNull(createSgRuleResp.getError());
            Assert.assertEquals(createSgRuleResp.getError().getErrno(), 0);
            JobResultResponse createSgRuleJob = pollingJobResult(channel, "gz", createSgRuleResp.getDataList());
            Assert.assertNotNull(createSgRuleJob);
            Assert.assertNotNull(createSgRuleJob.getError());
            Assert.assertEquals(createSgRuleJob.getError().getErrno(), 0);

            //15. ListSecurityGroupRule
            ListSgRuleResponse sgRuleList = sgStub.listSgRule(ListSgRuleRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setStart(0)
                    .setLimit(10)
                    .setCondition(ListSgRuleCondition.newBuilder()
                            .setSgUuid(securityGroupUuid)
                            .build())
                    .build());
            Utils.printWithJsonString(sgRuleList);
            Assert.assertNotNull(sgRuleList);
            Assert.assertNotNull(sgRuleList.getError());
            Assert.assertEquals(sgRuleList.getError().getErrno(), 0);
            securityGroupRuleUuid = sgRuleList.getDataCount() > 0 ? sgRuleList.getData(0).getSgRuleUuid() : "";
            securityGroupRuleUuid2 = sgRuleList.getDataCount() > 1 ? sgRuleList.getData(1).getSgRuleUuid() : "";
            System.out.println("SecurityGroupRuleUuid:\t" + securityGroupRuleUuid);
            System.out.println("SecurityGroupRuleUuid 2:\t" + securityGroupRuleUuid2);
            Assert.assertNotNull(securityGroupRuleUuid);
            Assert.assertNotNull(securityGroupRuleUuid2);
            Assert.assertNotEquals(securityGroupRuleUuid, "");
            Assert.assertNotEquals(securityGroupRuleUuid2, "");

            //16. GetSecurityGroupRuleTotalCnt
            GetSgRuleTotalCntResponse sgRuleTotalCnt = sgStub.getSgRuleTotalCnt(GetSgRuleTotalCntRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setSgUuid(securityGroupUuid)
                    .build());
            Utils.printWithJsonString(sgRuleTotalCnt);
            Assert.assertNotNull(sgRuleTotalCnt);
            Assert.assertNotNull(sgRuleTotalCnt.getError());
            Assert.assertEquals(sgRuleTotalCnt.getError().getErrno(), 0);

            //17. CreateDC2
            CreateDc2Response createDc2Resp = dc2Stub.createDc2(CreateDc2Request.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").setZoneId("gz01").build())
                    .setName("create-dc2-by-sdk")
                    .setImgUuid(imageUuid1)
                    .setSubnetUuid(subnetUuid)
                    .setDc2Model("dc2.s1.small1.d20")
                    .setPassword(String.valueOf(Hex.encodeHex("123qweQWE".getBytes())))
                    .setEip(CreateDc2Request.Eip.newBuilder()
                            .setBandwidth(1)
                            .build())
                    .addEbs(CreateDc2Request.Ebs.newBuilder()
                            .setCount(1)
                            .setSize(20)
                            .setDiskType("SSD")
                            .setName("create-dc2-by-sdk")
                            .build())
                    .build());
            Utils.printWithJsonString(createDc2Resp);
            Assert.assertNotNull(createDc2Resp);
            Assert.assertNotNull(createDc2Resp.getError());
            Assert.assertEquals(createDc2Resp.getError().getErrno(), 0);
            JobResultResponse createDc2Job = pollingJobResult(channel, "gz", createDc2Resp.getDataList());
            Assert.assertNotNull(createDc2Job);
            Assert.assertNotNull(createDc2Job.getError());
            Assert.assertEquals(createDc2Job.getError().getErrno(), 0);
            for (JobInfo job : createDc2Job.getDataList()) {
                Assert.assertTrue(job.getSuccess());
                dc2Uuid = job.getResourceUuid();
            }
            System.out.println("DC2Uuid:\t" + dc2Uuid);
            Assert.assertNotNull(dc2Uuid);
            Assert.assertNotEquals(dc2Uuid, "");

            //18. GetDC2ByUuid
            GetDc2ByUuidResponse dc2 = dc2Stub.getDc2ByUuid(GetDc2ByUuidRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setDc2Uuid(dc2Uuid)
                    .build());
            Utils.printWithJsonString(dc2);
            Assert.assertNotNull(dc2);
            Assert.assertNotNull(dc2.getError());
            Assert.assertEquals(dc2.getError().getErrno(), 0);
            EipInfo dc2Eip = dc2.getDataCount() > 0 ? dc2.getData(0).getEip() : null;
            EbsInfo dc2Ebs = dc2.getDataCount() > 0 ? (dc2.getData(0).getEbsCount() > 0 ? dc2.getData(0).getEbs(0) : null) : null;
            Assert.assertNotNull(dc2Eip);
            Assert.assertNotNull(dc2Ebs);
            eipUuid = dc2Eip.getEipUuid();
            ebsUuid = dc2Ebs.getEbsUuid();
            System.out.println("EIPUuid:\t" + eipUuid);
            System.out.println("EBSUuid:\t" + ebsUuid);
            Assert.assertNotNull(eipUuid);
            Assert.assertNotNull(ebsUuid);
            Assert.assertNotEquals(eipUuid, "");
            Assert.assertNotEquals(ebsUuid, "");

            //19. ListDC2
            ListDc2Response dc2List = dc2Stub.listDc2(ListDc2Request.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setStart(0)
                    .setLimit(10)
                    .setCondition(ListDc2Condition.newBuilder()
                            .setVpcUuid(vpcUuid)
                            .build())
                    .build());
            Utils.printWithJsonString(dc2List);
            Assert.assertNotNull(dc2List);
            Assert.assertNotNull(dc2List.getError());
            Assert.assertEquals(dc2List.getError().getErrno(), 0);

            //20. GetDC2TotalCnt
            GetDc2TotalCntResponse dc2TotalCnt = dc2Stub.getDc2TotalCnt(GetDc2TotalCntRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setVpcUuid(vpcUuid)
                    .build());
            Utils.printWithJsonString(dc2TotalCnt);
            Assert.assertNotNull(dc2TotalCnt);
            Assert.assertNotNull(dc2TotalCnt.getError());
            Assert.assertEquals(dc2TotalCnt.getError().getErrno(), 0);

            //21. StopDC2
            StopDc2Response stopDc2Resp = dc2Stub.stopDc2(StopDc2Request.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addDc2(StopDc2Request.Input.newBuilder()
                            .setDc2Uuid(dc2Uuid)
                            .build())
                    .build());
            Utils.printWithJsonString(stopDc2Resp);
            Assert.assertNotNull(stopDc2Resp);
            Assert.assertNotNull(stopDc2Resp.getError());
            Assert.assertEquals(stopDc2Resp.getError().getErrno(), 0);
            JobResultResponse stopDc2Job = pollingJobResult(channel, "gz", stopDc2Resp.getDataList());
            Assert.assertNotNull(stopDc2Job);
            Assert.assertNotNull(stopDc2Job.getError());
            Assert.assertEquals(stopDc2Job.getError().getErrno(), 0);

            //22. StartDC2
            StartDc2Response startDc2Resp = dc2Stub.startDc2(StartDc2Request.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addDc2(StartDc2Request.Input.newBuilder()
                            .setDc2Uuid(dc2Uuid)
                            .build())
                    .build());
            Utils.printWithJsonString(startDc2Resp);
            Assert.assertNotNull(startDc2Resp);
            Assert.assertNotNull(startDc2Resp.getError());
            Assert.assertEquals(startDc2Resp.getError().getErrno(), 0);
            JobResultResponse startDc2Job = pollingJobResult(channel, "gz", startDc2Resp.getDataList());
            Assert.assertNotNull(startDc2Job);
            Assert.assertNotNull(startDc2Job.getError());
            Assert.assertEquals(startDc2Job.getError().getErrno(), 0);

            //23. RebootDC2
            RebootDc2Response rebootDc2Resp = dc2Stub.rebootDc2(RebootDc2Request.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addDc2(RebootDc2Request.Input.newBuilder()
                            .setDc2Uuid(dc2Uuid)
                            .build())
                    .build());
            Utils.printWithJsonString(rebootDc2Resp);
            Assert.assertNotNull(rebootDc2Resp);
            Assert.assertNotNull(rebootDc2Resp.getError());
            Assert.assertEquals(rebootDc2Resp.getError().getErrno(), 0);
            JobResultResponse rebootDc2Job = pollingJobResult(channel, "gz", rebootDc2Resp.getDataList());
            Assert.assertNotNull(rebootDc2Job);
            Assert.assertNotNull(rebootDc2Job.getError());
            Assert.assertEquals(rebootDc2Job.getError().getErrno(), 0);

            //24. ChangeDC2Name
            ChangeDc2NameResponse changeDc2NameResp = dc2Stub.changeDc2Name(ChangeDc2NameRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addDc2(ChangeDc2NameRequest.Input.newBuilder()
                            .setDc2Uuid(dc2Uuid)
                            .setName("change-dc2-name-by-sdk")
                            .build())
                    .build());
            Utils.printWithJsonString(changeDc2NameResp);
            Assert.assertNotNull(changeDc2NameResp);
            Assert.assertNotNull(changeDc2NameResp.getError());
            Assert.assertEquals(changeDc2NameResp.getError().getErrno(), 0);
            JobResultResponse changeDc2NameJob = pollingJobResult(channel, "gz", changeDc2NameResp.getDataList());
            Assert.assertNotNull(changeDc2NameJob);
            Assert.assertNotNull(changeDc2NameJob.getError());
            Assert.assertEquals(changeDc2NameJob.getError().getErrno(), 0);

            //25. ChangeDC2Password
            ChangeDc2PasswordResponse changeDc2PasswordResp = dc2Stub.changeDc2Password(ChangeDc2PasswordRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addDc2(ChangeDc2PasswordRequest.Input.newBuilder()
                            .setDc2Uuid(dc2Uuid)
                            .setPassword(String.valueOf(Hex.encodeHex("123qweQWE".getBytes())))
                            .build())
                    .build());
            Utils.printWithJsonString(changeDc2PasswordResp);
            Assert.assertNotNull(changeDc2PasswordResp);
            Assert.assertNotNull(changeDc2PasswordResp.getError());
            Assert.assertEquals(changeDc2PasswordResp.getError().getErrno(), 0);
            JobResultResponse changeDc2PasswordJob = pollingJobResult(channel, "gz", changeDc2PasswordResp.getDataList());
            Assert.assertNotNull(changeDc2PasswordJob);
            Assert.assertNotNull(changeDc2PasswordJob.getError());
            Assert.assertEquals(changeDc2PasswordJob.getError().getErrno(), 0);

            //26. ReinstallDC2System
            ReinstallDc2SystemResponse reinstallDc2SystemResp = dc2Stub.reinstallDc2System(ReinstallDc2SystemRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addDc2(ReinstallDc2SystemRequest.Input.newBuilder()
                            .setDc2Uuid(dc2Uuid)
                            .setImgUuid(imageUuid2)
                            .setPassword(String.valueOf(Hex.encodeHex("123qweQWE".getBytes())))
                            .build())
                    .build());
            Utils.printWithJsonString(reinstallDc2SystemResp);
            Assert.assertNotNull(reinstallDc2SystemResp);
            Assert.assertNotNull(reinstallDc2SystemResp.getError());
            Assert.assertEquals(reinstallDc2SystemResp.getError().getErrno(), 0);
            JobResultResponse reinstallDc2SystemJob = pollingJobResult(channel, "gz", reinstallDc2SystemResp.getDataList());
            Assert.assertNotNull(reinstallDc2SystemJob);
            Assert.assertNotNull(reinstallDc2SystemJob.getError());
            Assert.assertEquals(reinstallDc2SystemJob.getError().getErrno(), 0);

            //27. ListSshKey
            ListSshKeyResponse sshKeyList = dc2Stub.listSshKey(ListSshKeyRequest.newBuilder().build());
            Utils.printWithJsonString(sshKeyList);
            Assert.assertNotNull(sshKeyList);
            Assert.assertNotNull(sshKeyList.getError());
            Assert.assertEquals(sshKeyList.getError().getErrno(), 0);

            //28. CreateSshKey
            CreateSshKeyResponse createSshKeyResp = dc2Stub.createSshKey(CreateSshKeyRequest.newBuilder()
                    .setName("create-sshkey-by-sdk")
                    .setKey("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDkKbEFh0vj2cRMRtjsTz/eVXNYpQuGTgPFq1jI9ICTbirP2Q1ZQNM9giCRlGCB8gjyj3NCDXdG9zxIlrfIWDS1YntMndGSEkqvw7o7smDIp3jn8EiDPEsxYwgazil5SbTQOJsECFN92J63Ayrz91HnmLS5sk4mvSJv6vTP4rkEw2OEJTBEbRaSrhcXPCm22OVI69vKNCOmOMfzf31z3FyhfWJywTu/Pw4QDWJ+reHptwANUkNHZVkwaNWH0WOs/krWLnCWD2JFPcEf7Rj+Uk9ImuI7GVJ34obCuLZ86Spe1wivSZz4luoSXznhXEKQaBP0ngfLuQzYuOR9dAXw6Mvh")
                    .build());
            Utils.printWithJsonString(createSshKeyResp);
            Assert.assertNotNull(createSshKeyResp);
            Assert.assertNotNull(createSshKeyResp.getError());
            Assert.assertEquals(createSshKeyResp.getError().getErrno(), 0);
            for (SshKey key : createSshKeyResp.getDataList()) {
                sshKeyUuid = key.getPubKeyUuid();
            }
            System.out.println("SSHKeyUuid:\t" + sshKeyUuid);
            Assert.assertNotNull(sshKeyList);
            Assert.assertNotEquals(sshKeyList, "");

            //29. DeleteSshKey

            //30. ChangeDC2Spec
            ChangeDc2SpecResponse changeDc2SpecResp = dc2Stub.changeDc2Spec(ChangeDc2SpecRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addDc2(ChangeDc2SpecRequest.Input.newBuilder()
                            .setDc2Uuid(dc2Uuid)
                            .setDc2Model("dc2.s1.small2.d40")
                            .build())
                    .build());
            Utils.printWithJsonString(changeDc2SpecResp);
            Assert.assertNotNull(changeDc2SpecResp);
            Assert.assertNotNull(changeDc2SpecResp.getError());
            Assert.assertEquals(changeDc2SpecResp.getError().getErrno(), 0);
            JobResultResponse changeDc2SpecJob = pollingJobResult(channel, "gz", changeDc2SpecResp.getDataList());
            Assert.assertNotNull(changeDc2SpecJob);
            Assert.assertNotNull(changeDc2SpecJob.getError());
            Assert.assertEquals(changeDc2SpecJob.getError().getErrno(), 0);

            //31. ListEip
            ListEipResponse eipList = eipStub.listEip(ListEipRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setStart(0)
                    .setLimit(10)
                    .build());
            Utils.printWithJsonString(eipList);
            Assert.assertNotNull(eipList);
            Assert.assertNotNull(eipList.getError());
            Assert.assertEquals(eipList.getError().getErrno(), 0);

            //32. GetEipTotalCnt
            GetEipTotalCntResponse eipTotalCnt = eipStub.getEipTotalCnt(GetEipTotalCntRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .build());
            Utils.printWithJsonString(eipTotalCnt);
            Assert.assertNotNull(eipTotalCnt);
            Assert.assertNotNull(eipTotalCnt.getError());
            Assert.assertEquals(eipTotalCnt.getError().getErrno(), 0);

            //33. CreateEip
            CreateEipResponse createEipResp = eipStub.createEip(CreateEipRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setBandwidth(2)
                    .setChargeWithFlow(true)
                    .build());
            Utils.printWithJsonString(createEipResp);
            Assert.assertNotNull(createEipResp);
            Assert.assertNotNull(createEipResp.getError());
            Assert.assertEquals(createEipResp.getError().getErrno(), 0);
            JobResultResponse createEipJob = pollingJobResult(channel, "gz", createEipResp.getDataList());
            Utils.printWithJsonString(createEipJob);
            Assert.assertNotNull(createEipJob);
            Assert.assertNotNull(createEipJob.getError());
            Assert.assertEquals(createEipJob.getError().getErrno(), 0);
            for (JobInfo job : createEipJob.getDataList()) {
                Assert.assertTrue(job.getSuccess());
                eipUuid2 = job.getResourceUuid();
            }
            System.out.println("EIPUuid 2:\t" + eipUuid2);
            Assert.assertNotNull(eipUuid2);
            Assert.assertNotEquals(eipUuid2, "");

            //34. GetEipByUuid
            GetEipByUuidResponse eip = eipStub.getEipByUuid(GetEipByUuidRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setEipUuid(eipUuid2)
                    .build());
            Utils.printWithJsonString(eip);
            Assert.assertNotNull(eip);
            Assert.assertNotNull(eip.getError());
            Assert.assertEquals(eip.getError().getErrno(), 0);

            //35. DetachEipFromDc2
            DetachEipFromDc2Response detachEipResp = eipStub.detachEipFromDc2(DetachEipFromDc2Request.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addEip(DetachEipFromDc2Request.Input.newBuilder()
                            .setEipUuid(eipUuid)
                            .build())
                    .build());
            Utils.printWithJsonString(detachEipResp);
            Assert.assertNotNull(detachEipResp);
            Assert.assertNotNull(detachEipResp.getError());
            Assert.assertEquals(detachEipResp.getError().getErrno(), 0);
            JobResultResponse detachEipJob = pollingJobResult(channel, "gz", detachEipResp.getDataList());
            Assert.assertNotNull(detachEipJob);
            Assert.assertNotNull(detachEipJob.getError());
            Assert.assertEquals(detachEipJob.getError().getErrno(), 0);

            //36. AttachEipToDc2
            AttachEipToDc2Response attachEipResp = eipStub.attachEipToDc2(AttachEipToDc2Request.newBuilder()
                    .setHeader(Header.newBuilder().build())
                    .addEip(AttachEipToDc2Request.Input.newBuilder()
                            .setEipUuid(eipUuid2)
                            .setBindingUuid(dc2Uuid)
                            .build())
                    .build());
            Utils.printWithJsonString(attachEipResp);
            Assert.assertNotNull(attachEipResp);
            Assert.assertNotNull(attachEipResp.getError());
            Assert.assertEquals(attachEipResp.getError().getErrno(), 0);
            JobResultResponse attachEipJob = pollingJobResult(channel, "gz", attachEipResp.getDataList());
            Assert.assertNotNull(attachEipJob);
            Assert.assertNotNull(attachEipJob.getError());
            Assert.assertEquals(attachEipJob.getError().getErrno(), 0);

            //37. ChangeEipBandwidth
            ChangeEipBandwidthResponse changeEipBandwidthResp = eipStub.changeEipBandwidth(ChangeEipBandwidthRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addEip(ChangeEipBandwidthRequest.Input.newBuilder()
                            .setEipUuid(eipUuid2)
                            .setBandwidth(2)
                            .build())
                    .build());
            Utils.printWithJsonString(changeEipBandwidthResp);
            Assert.assertNotNull(changeEipBandwidthResp);
            Assert.assertNotNull(changeEipBandwidthResp.getError());
            Assert.assertEquals(changeEipBandwidthResp.getError().getErrno(), 0);
            JobResultResponse changeEipBandwidthJob = pollingJobResult(channel, "gz", changeEipBandwidthResp.getDataList());
            Assert.assertNotNull(changeEipBandwidthJob);
            Assert.assertNotNull(changeEipBandwidthJob.getError());
            Assert.assertEquals(changeEipBandwidthJob.getError().getErrno(), 0);

            //39. ListEBS
            ListEbsResponse ebsList = ebsStub.listEbs(ListEbsRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setStart(0)
                    .setLimit(10)
                    .setCondition(ListEbsCondition.newBuilder()
                            .addDc2Uuids(dc2Uuid)
                            .build())
                    .build());
            Utils.printWithJsonString(ebsList);
            Assert.assertNotNull(ebsList);
            Assert.assertNotNull(ebsList.getError());
            Assert.assertEquals(ebsList.getError().getErrno(), 0);

            //40. GetEBSTotalCnt
            GetEbsTotalCntResponse ebsTotalCnt = ebsStub.getEbsTotalCnt(GetEbsTotalCntRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addDc2Uuids(dc2Uuid)
                    .build());
            Utils.printWithJsonString(ebsTotalCnt);
            Assert.assertNotNull(ebsTotalCnt);
            Assert.assertNotNull(ebsTotalCnt.getError());
            Assert.assertEquals(ebsTotalCnt.getError().getErrno(), 0);

            //41. CreateEBS
            CreateEbsResponse createEbsResp = ebsStub.createEbs(CreateEbsRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setCount(1)
                    .setName("create-ebs-by-sdk")
                    .setSize(20)
                    .setDiskType("SSD")
                    .build());
            Utils.printWithJsonString(createEbsResp);
            Assert.assertNotNull(createEbsResp);
            Assert.assertNotNull(createEbsResp.getError());
            Assert.assertEquals(createEbsResp.getError().getErrno(), 0);
            JobResultResponse createEbsJob = pollingJobResult(channel, "gz", createEbsResp.getDataList());
            Assert.assertNotNull(createEbsJob);
            Assert.assertNotNull(createEbsJob.getError());
            Assert.assertEquals(createEbsJob.getError().getErrno(), 0);
            for (JobInfo job : createEbsJob.getDataList()) {
                Assert.assertTrue(job.getSuccess());
                ebsUuid2 = job.getResourceUuid();
            }
            System.out.println("EBSUuid 2:\t" + ebsUuid2);
            Assert.assertNotNull(ebsUuid2);
            Assert.assertNotEquals(ebsUuid2, "");

            //42. GetEBSByUuid
            GetEbsByUuidResponse ebs = ebsStub.getEbsByUuid(GetEbsByUuidRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setEbsUuid(ebsUuid2)
                    .build());
            Utils.printWithJsonString(ebs);
            Assert.assertNotNull(ebs);
            Assert.assertNotNull(ebs.getError());
            Assert.assertEquals(ebs.getError().getErrno(), 0);

            //43. DetachEBSFromDC2
            DetachEbsResponse detachEbsResp = ebsStub.detachEbs(DetachEbsRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addEbs(DetachEbsRequest.Input.newBuilder()
                            .setEbsUuid(ebsUuid)
                            .build())
                    .build());
            Utils.printWithJsonString(detachEbsResp);
            Assert.assertNotNull(detachEbsResp);
            Assert.assertNotNull(detachEbsResp.getError());
            Assert.assertEquals(detachEbsResp.getError().getErrno(), 0);
            JobResultResponse detachEbsJob = pollingJobResult(channel, "gz", detachEbsResp.getDataList());
            Assert.assertNotNull(detachEbsJob);
            Assert.assertNotNull(detachEbsJob.getError());
            Assert.assertEquals(detachEbsJob.getError().getErrno(), 0);

            //44. AttachEBSToDC2
            AttachEbsResponse attachEbsResp = ebsStub.attachEbs(AttachEbsRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addEbs(AttachEbsRequest.Input.newBuilder()
                            .setEbsUuid(ebsUuid2)
                            .setDc2Uuid(dc2Uuid)
                            .build())
                    .build());
            Utils.printWithJsonString(attachEbsResp);
            Assert.assertNotNull(attachEbsResp);
            Assert.assertNotNull(attachEbsResp.getError());
            Assert.assertEquals(attachEbsResp.getError().getErrno(), 0);
            JobResultResponse attachEbsJob = pollingJobResult(channel, "gz", attachEbsResp.getDataList());
            Assert.assertNotNull(attachEbsJob);
            Assert.assertNotNull(attachEbsJob.getError());
            Assert.assertEquals(attachEbsJob.getError().getErrno(), 0);

            //45. ChangeEBSName
            ChangeEbsNameResponse changeEbsNameResp = ebsStub.changeEbsName(ChangeEbsNameRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addEbs(ChangeEbsNameRequest.Input.newBuilder()
                            .setEbsUuid(ebsUuid)
                            .setName("change-ebs-name-by-sdk")
                            .build())
                    .addEbs(ChangeEbsNameRequest.Input.newBuilder()
                            .setEbsUuid(ebsUuid2)
                            .setName("change-ebs-name-by-sdk")
                            .build())
                    .build());
            Utils.printWithJsonString(changeEbsNameResp);
            Assert.assertNotNull(changeEbsNameResp);
            Assert.assertNotNull(changeEbsNameResp.getError());
            Assert.assertEquals(changeEbsNameResp.getError().getErrno(), 0);
            JobResultResponse changeEbsNameJob = pollingJobResult(channel, "gz", changeEbsNameResp.getDataList());
            Assert.assertNotNull(changeEbsNameJob);
            Assert.assertNotNull(changeEbsNameJob.getError());
            Assert.assertEquals(changeEbsNameJob.getError().getErrno(), 0);

            //46. ChangeEBSSize
            ChangeEbsSizeResponse changeEbsSizeResp = ebsStub.changeEbsSize(ChangeEbsSizeRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addEbs(ChangeEbsSizeRequest.Input.newBuilder()
                            .setEbsUuid(ebsUuid2)
                            .setSize(21)
                            .build())
                    .build());
            Utils.printWithJsonString(changeEbsSizeResp);
            Assert.assertNotNull(changeEbsSizeResp);
            Assert.assertNotNull(changeEbsSizeResp.getError());
            Assert.assertEquals(changeEbsSizeResp.getError().getErrno(), 0);
            JobResultResponse changeEbsSizeJob = pollingJobResult(channel, "gz", changeEbsSizeResp.getDataList());
            Assert.assertNotNull(changeEbsSizeJob);
            Assert.assertNotNull(changeEbsSizeJob.getError());
            Assert.assertEquals(changeEbsSizeJob.getError().getErrno(), 0);

            //47. DeleteEBS

            //48. ListSnapshot
            ListSnapshotResponse snapList = snapStub.listSnapshot(ListSnapshotRequest.newBuilder()
                    .setStart(0)
                    .setLimit(10)
                    .build());
            Utils.printWithJsonString(snapList);
            Assert.assertNotNull(snapList);
            Assert.assertNotNull(snapList.getError());
            Assert.assertEquals(snapList.getError().getErrno(), 0);

            //49. GetSnapshotTotalCnt
            GetSnapshotTotalCntResponse snapTotalCnt = snapStub.getSnapshotTotalCnt(GetSnapshotTotalCntRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .build());
            Utils.printWithJsonString(snapTotalCnt);
            Assert.assertNotNull(snapTotalCnt);
            Assert.assertNotNull(snapTotalCnt.getError());
            Assert.assertEquals(snapTotalCnt.getError().getErrno(), 0);

            //50. CreateSnapshot
            CreateSnapshotResponse createSnapResp = snapStub.createSnapshot(CreateSnapshotRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .setDc2Uuid(dc2Uuid)
                    .setSnapName("create-snap-by-sdk")
                    .build());
            Utils.printWithJsonString(createSnapResp);
            Assert.assertNotNull(createSnapResp);
            Assert.assertNotNull(createSnapResp.getError());
            Assert.assertEquals(createSnapResp.getError().getErrno(), 0);
            JobResultResponse createSnapJob = pollingJobResult(channel, "gz", createSnapResp.getDataList());
            Assert.assertNotNull(createSnapJob);
            Assert.assertNotNull(createSnapJob.getError());
            Assert.assertEquals(createSnapJob.getError().getErrno(), 0);
            for (JobInfo job : createSnapJob.getDataList()) {
                Assert.assertTrue(job.getSuccess());
                snapshotUuid = job.getResourceUuid();
            }
            System.out.println("SnapshotUuid:\t" + snapshotUuid);
            Assert.assertNotNull(snapshotUuid);
            Assert.assertNotEquals(snapshotUuid, "");

            //51. RevertSnapshot
            RevertSnapshotResponse revertSnapResp = snapStub.revertSnapshot(RevertSnapshotRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addSnap(RevertSnapshotRequest.Input.newBuilder()
                            .setSnapUuid(snapshotUuid)
                            .build())
                    .build());
            Utils.printWithJsonString(revertSnapResp);
            Assert.assertNotNull(revertSnapResp);
            Assert.assertNotNull(revertSnapResp.getError());
            Assert.assertEquals(revertSnapResp.getError().getErrno(), 0);
            JobResultResponse revertSnapJob = pollingJobResult(channel, "gz", revertSnapResp.getDataList());
            Assert.assertNotNull(revertSnapJob);
            Assert.assertNotNull(revertSnapJob.getError());
            Assert.assertEquals(revertSnapJob.getError().getErrno(), 0);

            //52. ChangeSnapshotName
            ChangeSnapshotNameResponse changeSnapNameResp = snapStub.changeSnapshotName(ChangeSnapshotNameRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addSnap(ChangeSnapshotNameRequest.Input.newBuilder()
                            .setSnapUuid(snapshotUuid)
                            .setName("change-snap-name-by-sdk")
                            .build())
                    .build());
            Utils.printWithJsonString(changeSnapNameResp);
            Assert.assertNotNull(changeSnapNameResp);
            Assert.assertNotNull(changeSnapNameResp.getError());
            Assert.assertEquals(changeSnapNameResp.getError().getErrno(), 0);
            JobResultResponse changeSnapNameJob = pollingJobResult(channel, "gz", changeSnapNameResp.getDataList());
            Assert.assertNotNull(changeSnapNameJob);
            Assert.assertNotNull(changeSnapNameJob.getError());
            Assert.assertEquals(changeSnapNameJob.getError().getErrno(), 0);

            //53. DeleteSnapshot

            //54. AttachDc2ToSecurityGroup
            AttachDc2ToSgResponse attachDc2ToSgResp = sgStub.attachDc2ToSg(AttachDc2ToSgRequest.newBuilder()
                    .setHeader(Header.newBuilder().setRegionId("gz").build())
                    .addDc2(AttachDc2ToSgRequest.Dc2.newBuilder()
                            .setDc2Uuid(dc2Uuid)
                            .build())
                    .addSg(AttachDc2ToSgRequest.Sg.newBuilder()
                            .setSgUuid(securityGroupUuid)
                            .build())
                    .build());
            Utils.printWithJsonString(attachDc2ToSgResp);
            Assert.assertNotNull(attachDc2ToSgResp);
            Assert.assertNotNull(attachDc2ToSgResp.getError());
            Assert.assertEquals(attachDc2ToSgResp.getError().getErrno(), 0);
            JobResultResponse attachDc2ToSgJob = pollingJobResult(channel, "gz", attachDc2ToSgResp.getDataList());
            Assert.assertNotNull(attachDc2ToSgJob);
            Assert.assertNotNull(attachDc2ToSgJob.getError());
            Assert.assertEquals(attachDc2ToSgJob.getError().getErrno(), 0);

            //55. DetachDc2FromSecurityGroup
            DetachDc2FromSgResponse detachDc2FromSgResp = sgStub.detachDc2FromSg(DetachDc2FromSgRequest.newBuilder()
                    .addDc2(DetachDc2FromSgRequest.Dc2.newBuilder()
                            .setDc2Uuid(dc2Uuid)
                            .build())
                    .addSg(DetachDc2FromSgRequest.Sg.newBuilder()
                            .setSgUuid(securityGroupUuid)
                            .build())
                    .build());
            Utils.printWithJsonString(detachDc2FromSgResp);
            Assert.assertNotNull(detachDc2FromSgResp);
            Assert.assertNotNull(detachDc2FromSgResp.getError());
            Assert.assertEquals(detachDc2FromSgResp.getError().getErrno(), 0);
            JobResultResponse detachDc2FromSgJob = pollingJobResult(channel, "gz", detachDc2FromSgResp.getDataList());
            Assert.assertNotNull(detachDc2FromSgJob);
            Assert.assertNotNull(detachDc2FromSgJob.getError());
            Assert.assertEquals(detachDc2FromSgJob.getError().getErrno(), 0);

            //56. DeleteSecurityGroupRule

            //57. DeleteSecurityGroup

            //58. DeleteDC2

            //59. DeleteSubnet

            //60. DeleteVPC

        } finally {
            if (!Strings.isNullOrEmpty(sshKeyUuid)) {
                //29. DeleteSshKey
                DeleteSshKeyResponse deleteSshKeyResp = dc2Stub.deleteSshKey(DeleteSshKeyRequest.newBuilder()
                        .setPubKeyUuid(sshKeyUuid)
                        .build());
                Utils.printWithJsonString(deleteSshKeyResp);
                Assert.assertNotNull(deleteSshKeyResp);
                Assert.assertNotNull(deleteSshKeyResp.getError());
                Assert.assertEquals(deleteSshKeyResp.getError().getErrno(), 0);
            }
            if (!Strings.isNullOrEmpty(eipUuid)) {
                //38. DeleteEip
                DeleteEipRequest.Builder deleteEipReqBuilder = DeleteEipRequest.newBuilder()
                        .setHeader(Header.newBuilder().setRegionId("gz").build())
                        .addEip(DeleteEipRequest.Input.newBuilder()
                                .setEipUuid(eipUuid)
                                .build());
                if (!Strings.isNullOrEmpty(eipUuid2)) {
                    deleteEipReqBuilder.addEip(DeleteEipRequest.Input.newBuilder()
                            .setEipUuid(eipUuid2)
                            .build());
                }
                DeleteEipResponse deleteEipResp = eipStub.deleteEip(deleteEipReqBuilder.build());
                Utils.printWithJsonString(deleteEipResp);
                Assert.assertNotNull(deleteEipResp);
                Assert.assertNotNull(deleteEipResp.getError());
                Assert.assertEquals(deleteEipResp.getError().getErrno(), 0);
                JobResultResponse deleteEipJob = pollingJobResult(channel, "gz", deleteEipResp.getDataList());
            }
            if (!Strings.isNullOrEmpty(ebsUuid)) {
                //47. DeleteEBS
                DeleteEbsRequest.Builder deleteEbsReqBuilder = DeleteEbsRequest.newBuilder()
                        .setHeader(Header.newBuilder().setRegionId("gz").build())
                        .addEbs(DeleteEbsRequest.Input.newBuilder()
                                .setEbsUuid(ebsUuid)
                                .build());
                if (!Strings.isNullOrEmpty(ebsUuid2)) {
                    deleteEbsReqBuilder.addEbs(DeleteEbsRequest.Input.newBuilder()
                            .setEbsUuid(ebsUuid2)
                            .build());
                }
                DeleteEbsResponse deleteEbsResp = ebsStub.deleteEbs(deleteEbsReqBuilder.build());
                Utils.printWithJsonString(deleteEbsResp);
                Assert.assertNotNull(deleteEbsResp);
                Assert.assertNotNull(deleteEbsResp.getError());
                Assert.assertEquals(deleteEbsResp.getError().getErrno(), 0);
                JobResultResponse deleteEbsJob = pollingJobResult(channel, "gz", deleteEbsResp.getDataList());
            }

            if (!Strings.isNullOrEmpty(snapshotUuid)) {
                //53. DeleteSnapshot
                DeleteSnapshotResponse deleteSnapResp = snapStub.deleteSnapshot(DeleteSnapshotRequest.newBuilder()
                        .setHeader(Header.newBuilder().setRegionId("gz").build())
                        .addSnap(DeleteSnapshotRequest.Input.newBuilder()
                                .setSnapUuid(snapshotUuid)
                                .build())
                        .build());
                Utils.printWithJsonString(deleteSnapResp);
                Assert.assertNotNull(deleteSnapResp);
                Assert.assertNotNull(deleteSnapResp.getError());
                Assert.assertEquals(deleteSnapResp.getError().getErrno(), 0);
                JobResultResponse deleteSnapJob = pollingJobResult(channel, "gz", deleteSnapResp.getDataList());
            }
            if (!Strings.isNullOrEmpty(securityGroupRuleUuid)) {
                //56. DeleteSecurityGroupRule
                DeleteSgRuleRequest.Builder deleteSgRuleReqBuilder = DeleteSgRuleRequest.newBuilder()
                        .setHeader(Header.newBuilder().setRegionId("gz").build())
                        .addSgRule(DeleteSgRuleRequest.Input.newBuilder()
                                .setSgRuleUuid(securityGroupRuleUuid)
                                .build());
                if (!Strings.isNullOrEmpty(securityGroupRuleUuid2)) {
                    deleteSgRuleReqBuilder.addSgRule(DeleteSgRuleRequest.Input.newBuilder()
                            .setSgRuleUuid(securityGroupRuleUuid2)
                            .build());
                }
                DeleteSgRuleResponse deleteSgRuleResp = sgStub.deleteSgRule(deleteSgRuleReqBuilder.build());
                Utils.printWithJsonString(deleteSgRuleResp);
                Assert.assertNotNull(deleteSgRuleResp);
                Assert.assertNotNull(deleteSgRuleResp.getError());
                Assert.assertEquals(deleteSgRuleResp.getError().getErrno(), 0);
                JobResultResponse deleteSgRuleJob = pollingJobResult(channel, "gz", deleteSgRuleResp.getDataList());
            }
            if (!Strings.isNullOrEmpty(securityGroupUuid)) {
                //57. DeleteSecurityGroup
                DeleteSgResponse deleteSgResp = sgStub.deleteSg(DeleteSgRequest.newBuilder()
                        .setHeader(Header.newBuilder().setRegionId("gz").build())
                        .addSg(DeleteSgRequest.Input.newBuilder()
                                .setSgUuid(securityGroupUuid)
                                .build())
                        .build());
                Utils.printWithJsonString(deleteSgResp);
                Assert.assertNotNull(deleteSgResp);
                Assert.assertNotNull(deleteSgResp.getError());
                Assert.assertEquals(deleteSgResp.getError().getErrno(), 0);
                JobResultResponse deleteSgJob = pollingJobResult(channel, "gz", deleteSgResp.getDataList());
            }
            if (!Strings.isNullOrEmpty(dc2Uuid)) {
                //58. DeleteDC2
                DestroyDc2Response destroyDc2Resp = dc2Stub.destroyDc2(DestroyDc2Request.newBuilder()
                        .setHeader(Header.newBuilder().setRegionId("gz").build())
                        .addDc2(DestroyDc2Request.Input.newBuilder()
                                .setDc2Uuid(dc2Uuid)
                                .build())
                        .build());
                Utils.printWithJsonString(destroyDc2Resp);
                Assert.assertNotNull(destroyDc2Resp);
                Assert.assertNotNull(destroyDc2Resp.getError());
                Assert.assertEquals(destroyDc2Resp.getError().getErrno(), 0);
                JobResultResponse destroyDc2Job = pollingJobResult(channel, "gz", destroyDc2Resp.getDataList());
            }
            if (!Strings.isNullOrEmpty(subnetUuid)) {
                //59. DeleteSubnet
                DeleteSubnetRequest.Builder deleteSubnetReqBuilder = DeleteSubnetRequest.newBuilder()
                        .setHeader(Header.newBuilder().setRegionId("gz").build())
                        .setVpcUuid(vpcUuid)
                        .addSubnet(DeleteSubnetRequest.Input.newBuilder()
                                .setSubnetUuid(subnetUuid)
                                .build());
                if (!Strings.isNullOrEmpty(subnetUuid2)) {
                    deleteSubnetReqBuilder.addSubnet(DeleteSubnetRequest.Input.newBuilder()
                            .setSubnetUuid(subnetUuid2)
                            .build());
                }
                DeleteSubnetResponse deleteSubnetResp = vpcStub.deleteSubnet(deleteSubnetReqBuilder.build());
                Utils.printWithJsonString(deleteSubnetResp);
                Assert.assertNotNull(deleteSubnetResp);
                Assert.assertNotNull(deleteSubnetResp.getError());
                Assert.assertEquals(deleteSubnetResp.getError().getErrno(), 0);
                JobResultResponse deleteSubnetJob = pollingJobResult(channel, "gz", deleteSubnetResp.getDataList());
            }
            if (!Strings.isNullOrEmpty(vpcUuid)) {
                //60. DeleteVPC
                DeleteVpcResponse deleteVpcResp = vpcStub.deleteVpc(DeleteVpcRequest.newBuilder()
                        .setHeader(Header.newBuilder().setRegionId("gz").build())
                        .addVpc(DeleteVpcRequest.Input.newBuilder()
                                .setVpcUuid(vpcUuid)
                                .build())
                        .build());
                Utils.printWithJsonString(deleteVpcResp);
                Assert.assertNotNull(deleteVpcResp);
                Assert.assertNotNull(deleteVpcResp.getError());
                Assert.assertEquals(deleteVpcResp.getError().getErrno(), 0);
                JobResultResponse deleteVpcJob = pollingJobResult(channel, "gz", deleteVpcResp.getDataList());
            }
        }

        channel.shutdown();
        System.out.println("done");
    }

    public static JobResultResponse getJobResult(ManagedChannel channel, String regionId, Set<String> jobUuidSet) throws InvalidProtocolBufferException {
        JobResultRequest request = JobResultRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId(regionId)
                        .build())
                .addAllJobUuids(jobUuidSet)
                .build();
        CommonGrpc.CommonBlockingStub stub = CommonGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        JobResultResponse response = stub.jobResult(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        return response;
    }

    @Test
    public void ListRegionAndZone() throws Exception {
        ListRegionAndZoneRequest request = ListRegionAndZoneRequest.newBuilder()
                .setCondition(ListRegionAndZoneRequest.Condition.newBuilder()
                        .setProduct("dc2")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        CommonGrpc.CommonBlockingStub stub = CommonGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListRegionAndZoneResponse response = stub.listRegionAndZone(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    public static JobResultResponse pollingJobResult(ManagedChannel channel, String regionId, Set<String> jobUuidSet) throws InvalidProtocolBufferException, InterruptedException {
        HashSet<JobInfo> doneJobInfo = Sets.newHashSet();
        JobResultResponse response;
        Error error;
        while (true) {
            response = getJobResult(channel, regionId, jobUuidSet);
            error = response.getError();
            response.getDataList().forEach(jobInfo -> {
                if (jobInfo.getDone()) {
                    doneJobInfo.add(jobInfo);
                    jobUuidSet.remove(jobInfo.getJobUuid());
                }
            });
            if (jobUuidSet.size() == 0 || (error != null && error.getErrno() != 0)) {
                break;
            }
            Thread.sleep(1000);
        }
        return JobResultResponse.newBuilder()
                .setError(response.getError())
                .addAllData(doneJobInfo)
                .build();
    }

    public static JobResultResponse pollingJobResult(ManagedChannel channel, String regionId, List<JobInfo> jobInfoList) throws InvalidProtocolBufferException, InterruptedException {
        HashSet<String> jobUuidSet = Sets.newHashSet();
        jobInfoList.forEach(jobInfo -> jobUuidSet.add(jobInfo.getJobUuid()));
        return pollingJobResult(channel, regionId, jobUuidSet);
    }

}
