package com.didiyun.compute.v1;

import com.didiyun.base.v1.Header;
import com.didiyun.common.Auth;
import com.didiyun.common.Utils;
import io.grpc.ManagedChannel;
import org.junit.Test;

/**
 * Created by Glacier on 2018/11/5.
 */
public class ExampleSg {

    @Test
    public void ListSg() throws Exception {
        ListSgRequest request = ListSgRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setStart(0)
                .setLimit(10)
                .setCondition(ListSgCondition.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListSgResponse response = stub.listSg(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetSgTotalCnt() throws Exception {
        GetSgTotalCntRequest request = GetSgTotalCntRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetSgTotalCntResponse response = stub.getSgTotalCnt(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void CreateSg() throws Exception {
        CreateSgRequest request = CreateSgRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setName("rlx-create-sg-by-sdk")
                .setVpcUuid("518f6c80c72351e5a18391392dba753f")
                .addSgRule(CreateSgRuleInput.newBuilder()
                        .setType("Ingress")
                        .setProtocol("TCP")
                        .setStartPort(23)
                        .setEndPort(45)
                        .setAllowedCidr("10.0.0.0/16")
                        .build())
                .addSgRule(CreateSgRuleInput.newBuilder()
                        .setType("Egress")
                        .setProtocol("UDP")
                        .setStartPort(67)
                        .setEndPort(89)
                        .setAllowedCidr("10.0.0.0/16")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateSgResponse response = stub.createSg(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DeleteSg() throws Exception {
        DeleteSgRequest request = DeleteSgRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addSg(DeleteSgRequest.Input.newBuilder()
                        .setSgUuid("2c5c3e95c083518a8c23a6ea557ab163")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DeleteSgResponse response = stub.deleteSg(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeSgName() throws Exception {
        ChangeSgNameRequest request = ChangeSgNameRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addSg(ChangeSgNameRequest.Input.newBuilder()
                        .setSgUuid("bf1c91e095555268b723fd44fbc63403")
                        .setName("rlx-change-sg-name-by-sdk")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeSgNameResponse response = stub.changeSgName(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void AttachDc2ToSg() throws Exception {
        AttachDc2ToSgRequest request = AttachDc2ToSgRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(AttachDc2ToSgRequest.Dc2.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .addSg(AttachDc2ToSgRequest.Sg.newBuilder()
                        .setSgUuid("db1a4d0fa0e14d1a93c18fadf97b3065")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        AttachDc2ToSgResponse response = stub.attachDc2ToSg(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DetachDc2FromSg() throws Exception {
        DetachDc2FromSgRequest request = DetachDc2FromSgRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(DetachDc2FromSgRequest.Dc2.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .addSg(DetachDc2FromSgRequest.Sg.newBuilder()
                        .setSgUuid("db1a4d0fa0e14d1a93c18fadf97b3065")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DetachDc2FromSgResponse response = stub.detachDc2FromSg(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ListSgRule() throws Exception {
        ListSgRuleRequest request = ListSgRuleRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setStart(0)
                .setLimit(10)
                .setCondition(ListSgRuleCondition.newBuilder()
                        .setSgUuid("db1a4d0fa0e14d1a93c18fadf97b3065")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListSgRuleResponse response = stub.listSgRule(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetSgRuleTotalCnt() throws Exception {
        GetSgRuleTotalCntRequest request = GetSgRuleTotalCntRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setSgUuid("db1a4d0fa0e14d1a93c18fadf97b3065")
                .setType("Egress")
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetSgRuleTotalCntResponse response = stub.getSgRuleTotalCnt(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void CreateSgRule() throws Exception {
        CreateSgRuleRequest request = CreateSgRuleRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setSgUuid("db1a4d0fa0e14d1a93c18fadf97b3065")
                .addSgRule(CreateSgRuleInput.newBuilder()
                        .setType("Ingress")
                        .setProtocol("TCP")
                        .setStartPort(45)
                        .setEndPort(67)
                        .setAllowedCidr("10.12.13.0/24")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateSgRuleResponse response = stub.createSgRule(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DeleteSgRule() throws Exception {
        DeleteSgRuleRequest request = DeleteSgRuleRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addSgRule(DeleteSgRuleRequest.Input.newBuilder()
                        .setSgRuleUuid("f317ee995a0c53b69a79ad5615e9c34b")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SgGrpc.SgBlockingStub stub = SgGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DeleteSgRuleResponse response = stub.deleteSgRule(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }
}
