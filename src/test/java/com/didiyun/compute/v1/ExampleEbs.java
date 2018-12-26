package com.didiyun.compute.v1;

import com.didiyun.base.v1.Header;
import com.didiyun.common.Auth;
import com.didiyun.common.Utils;
import io.grpc.ManagedChannel;
import org.junit.Test;

/**
 * Created by Glacier on 2018/11/1.
 */
public class ExampleEbs {

    @Test
    public void ListEbs() throws Exception {
        ListEbsRequest request = ListEbsRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setStart(0)
                .setLimit(10)
                .setSimplify(true)
                .setCondition(ListEbsCondition.newBuilder()
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EbsGrpc.EbsBlockingStub stub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListEbsResponse response = stub.listEbs(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetEbsByUuid() throws Exception {
        GetEbsByUuidRequest request = GetEbsByUuidRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setEbsUuid("2c5c3e95c083518a8c23a6ea557ab163")
                .build();
        ManagedChannel channel = Auth.newChannel();
        EbsGrpc.EbsBlockingStub stub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetEbsByUuidResponse response = stub.getEbsByUuid(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetEbsTotalCnt() throws Exception {
        GetEbsTotalCntRequest request = GetEbsTotalCntRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EbsGrpc.EbsBlockingStub stub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetEbsTotalCntResponse response = stub.getEbsTotalCnt(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void CreateEbs() throws Exception {
        CreateEbsRequest request = CreateEbsRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setCount(2)
                .setName("rlx-create-ebs-by-sdk")
                .setSize(23)
                .setDiskType("SSD")
                .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                .build();
        ManagedChannel channel = Auth.newChannel();
        EbsGrpc.EbsBlockingStub stub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateEbsResponse response = stub.createEbs(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void AttachEbsToDc2() throws Exception {
        AttachEbsRequest request = AttachEbsRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addEbs(AttachEbsRequest.Input.newBuilder()
                        .setEbsUuid("fc7e50bdf5045a3e98f6d083ce5797f0")
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .addEbs(AttachEbsRequest.Input.newBuilder()
                        .setEbsUuid("ffadc45cb72f5c1cbf417d28e4f3b3fd")
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EbsGrpc.EbsBlockingStub stub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        AttachEbsResponse response = stub.attachEbs(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DetachEbsFromDc2() throws Exception {
        DetachEbsRequest request = DetachEbsRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addEbs(DetachEbsRequest.Input.newBuilder()
                        .setEbsUuid("fc7e50bdf5045a3e98f6d083ce5797f0")
                        .build())
                .addEbs(DetachEbsRequest.Input.newBuilder()
                        .setEbsUuid("ffadc45cb72f5c1cbf417d28e4f3b3fd")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EbsGrpc.EbsBlockingStub stub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DetachEbsResponse response = stub.detachEbs(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeEbsSize() throws Exception {
        ChangeEbsSizeRequest request = ChangeEbsSizeRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addEbs(ChangeEbsSizeRequest.Input.newBuilder()
                        .setEbsUuid("fc7e50bdf5045a3e98f6d083ce5797f0")
                        .setSize(33)
                        .build())
                .addEbs(ChangeEbsSizeRequest.Input.newBuilder()
                        .setEbsUuid("ffadc45cb72f5c1cbf417d28e4f3b3fd")
                        .setSize(32)
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EbsGrpc.EbsBlockingStub stub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeEbsSizeResponse response = stub.changeEbsSize(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeEbsName() throws Exception {
        ChangeEbsNameRequest request = ChangeEbsNameRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addEbs(ChangeEbsNameRequest.Input.newBuilder()
                        .setEbsUuid("fc7e50bdf5045a3e98f6d083ce5797f0")
                        .setName("rlx-change-ebs-name-by-sdk")
                        .build())
                .addEbs(ChangeEbsNameRequest.Input.newBuilder()
                        .setEbsUuid("ffadc45cb72f5c1cbf417d28e4f3b3fd")
                        .setName("rlx-change-ebs-name-by-sdk")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EbsGrpc.EbsBlockingStub stub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeEbsNameResponse response = stub.changeEbsName(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DeleteEbs() throws Exception {
        DeleteEbsRequest request = DeleteEbsRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addEbs(DeleteEbsRequest.Input.newBuilder()
                        .setEbsUuid("fc7e50bdf5045a3e98f6d083ce5797f0")
                        .build())
                .addEbs(DeleteEbsRequest.Input.newBuilder()
                        .setEbsUuid("ffadc45cb72f5c1cbf417d28e4f3b3fd")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        EbsGrpc.EbsBlockingStub stub = EbsGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DeleteEbsResponse response = stub.deleteEbs(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }
}
