package com.didiyun.compute.v1;

import com.didiyun.base.v1.Header;
import com.didiyun.common.Auth;
import com.didiyun.common.Utils;
import io.grpc.ManagedChannel;
import org.junit.Test;

/**
 * Created by Glacier on 2018/11/5.
 */
public class ExampleVpc {

    @Test
    public void ListVpc() throws Exception {
        ListVpcRequest request = ListVpcRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setStart(0)
                .setLimit(10)
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListVpcResponse response = stub.listVpc(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetVpcByUuid() throws Exception {
        GetVpcByUuidRequest request = GetVpcByUuidRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setVpcUuid("518f6c80c72351e5a18391392dba753f")
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetVpcByUuidResponse response = stub.getVpcByUuid(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetVpcTotalCnt() throws Exception {
        GetVpcTotalCntRequest request = GetVpcTotalCntRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetVpcTotalCntResponse response = stub.getVpcTotalCnt(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void CreateVpc() throws Exception {
        CreateVpcRequest request = CreateVpcRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setName("rlx-create-vpc-by-sdk")
                .setCidr("172.16.0.0/12")
                .addSubnet(CreateSubnetInput.newBuilder()
                        .setName("rlx-create-vpc-by-sdk")
                        .setCidr("172.16.0.0/16")
                        .setZoneId("gz01")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateVpcResponse response = stub.createVpc(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DeleteVpc() throws Exception {
        DeleteVpcRequest request = DeleteVpcRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addVpc(DeleteVpcRequest.Input.newBuilder()
                        .setVpcUuid("518f6c80c72351e5a18391392dba753f")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DeleteVpcResponse response = stub.deleteVpc(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeVpcName() throws Exception {
        ChangeVpcNameRequest request = ChangeVpcNameRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addVpc(ChangeVpcNameRequest.Input.newBuilder()
                        .setVpcUuid("518f6c80c72351e5a18391392dba753f")
                        .setName("rlx-change-vpc-name-by-sdk")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeVpcNameResponse response = stub.changeVpcName(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ListSubnet() throws Exception {
        ListSubnetRequest request = ListSubnetRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .setZoneId("gz01")
                        .build())
                .setStart(0)
                .setLimit(10)
                .setCondition(ListSubnetCondition.newBuilder()
                        .setVpcUuid("518f6c80c72351e5a18391392dba753f")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListSubnetResponse response = stub.listSubnet(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetSubnetByUuid() throws Exception {
        GetSubnetByUuidRequest request = GetSubnetByUuidRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setVpcUuid("94c1bab9f6795e6c9d8cae89fe5fd357")
                .setSubnetUuid("a5ee60c07b124319b10549476a8a6190")
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetSubnetByUuidResponse response = stub.getSubnetByUuid(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetSubnetTotalCnt() throws Exception {
        GetSubnetTotalCntRequest request = GetSubnetTotalCntRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setVpcUuid("2a84e7317d235aa9a60da460bc65e102")
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetSubnetTotalCntResponse response = stub.getSubnetTotalCnt(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void CreateSubnet() throws Exception {
        CreateSubnetRequest request = CreateSubnetRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addSubnet(CreateSubnetInput.newBuilder()
                        .setName("rlx-create-subnet-by-sdk")
                        .setCidr("172.18.0.1/16")
                        .setZoneId("gz02")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateSubnetResponse response = stub.createSubnet(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DeleteSubnet() throws Exception {
        DeleteSubnetRequest request = DeleteSubnetRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setVpcUuid("518f6c80c72351e5a18391392dba753f")
                .addSubnet(DeleteSubnetRequest.Input.newBuilder()
                        .setSubnetUuid("1769323a42d042a3bc86c3551441900c")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DeleteSubnetResponse response = stub.deleteSubnet(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeSubnetName() throws Exception {
        ChangeSubnetNameRequest request = ChangeSubnetNameRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setVpcUuid("518f6c80c72351e5a18391392dba753f")
                .addSubnet(ChangeSubnetNameRequest.Input.newBuilder()
                        .setSubnetUuid("312362f94b6b5b8287ab8ab7dd06f69d")
                        .setName("rlx-change-subnet-name-by-sdk")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        VpcGrpc.VpcBlockingStub stub = VpcGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeSubnetNameResponse response = stub.changeSubnetName(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }
}
