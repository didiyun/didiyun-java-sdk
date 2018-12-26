package com.didiyun.compute.v1;

import com.didiyun.base.v1.Header;
import com.didiyun.common.Auth;
import com.didiyun.common.Utils;
import io.grpc.ManagedChannel;
import org.junit.Test;

/**
 * Created by Glacier on 2018/11/1.
 */
public class ExampleEip {

    @Test
    public void ListEip() throws Exception {
        ListEipRequest request = ListEipRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setStart(0)
                .setLimit(10)
                .setSimplify(true)
                .setCondition(ListEipCondition.newBuilder()
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EipGrpc.EipBlockingStub stub = EipGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListEipResponse response = stub.listEip(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetEipByUuid() throws Exception {
        GetEipByUuidRequest request = GetEipByUuidRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setEipUuid("2a84e7317d235aa9a60da460bc65e102")
                .build();
        ManagedChannel channel = Auth.newChannel();
        EipGrpc.EipBlockingStub stub = EipGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetEipByUuidResponse response = stub.getEipByUuid(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetEipTotalCnt() throws Exception {
        GetEipTotalCntRequest request = GetEipTotalCntRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz"))
                .build();
        ManagedChannel channel = Auth.newChannel();
        EipGrpc.EipBlockingStub stub = EipGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetEipTotalCntResponse response = stub.getEipTotalCnt(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void CreateEip() throws Exception {
        CreateEipRequest request = CreateEipRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setBandwidth(1)
                .setChargeWithFlow(true)
                .setBindingUuid("b8bf159d2ce258f98b27aedafcaadc91")
                .build();
        ManagedChannel channel = Auth.newChannel();
        EipGrpc.EipBlockingStub stub = EipGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateEipResponse response = stub.createEip(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DetachEipFromDc2() throws Exception {
        DetachEipFromDc2Request request = DetachEipFromDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addEip(DetachEipFromDc2Request.Input.newBuilder()
                        .setEipUuid("2a84e7317d235aa9a60da460bc65e102")
                        .build())
                .addEip(DetachEipFromDc2Request.Input.newBuilder()
                        .setEipUuid("e0dd4100a9275897ad1a56422d697956")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EipGrpc.EipBlockingStub stub = EipGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DetachEipFromDc2Response response = stub.detachEipFromDc2(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void AttachEipToDc2() throws Exception {
        AttachEipToDc2Request request = AttachEipToDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addEip(AttachEipToDc2Request.Input.newBuilder()
                        .setEipUuid("2a84e7317d235aa9a60da460bc65e102")
                        .setBindingUuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .addEip(AttachEipToDc2Request.Input.newBuilder()
                        .setEipUuid("e0dd4100a9275897ad1a56422d697956")
                        .setBindingUuid("b8bf159d2ce258f98b27aedafcaadc91")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EipGrpc.EipBlockingStub stub = EipGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        AttachEipToDc2Response response = stub.attachEipToDc2(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeEipBandwidth() throws Exception {
        ChangeEipBandwidthRequest request = ChangeEipBandwidthRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addEip(ChangeEipBandwidthRequest.Input.newBuilder()
                        .setEipUuid("2a84e7317d235aa9a60da460bc65e102")
                        .setBandwidth(2)
                        .setChargeWithFlow(true)
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EipGrpc.EipBlockingStub stub = EipGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeEipBandwidthResponse response = stub.changeEipBandwidth(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DeleteEip() throws Exception {
        DeleteEipRequest request = DeleteEipRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addEip(DeleteEipRequest.Input.newBuilder()
                        .setEipUuid("2a84e7317d235aa9a60da460bc65e102")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EipGrpc.EipBlockingStub stub = EipGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DeleteEipResponse response = stub.deleteEip(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }
}
