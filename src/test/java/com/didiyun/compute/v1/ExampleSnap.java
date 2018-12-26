package com.didiyun.compute.v1;

import com.didiyun.base.v1.Header;
import com.didiyun.common.Auth;
import com.didiyun.common.Utils;
import io.grpc.ManagedChannel;
import org.junit.Test;

/**
 * Created by Glacier on 2018/11/5.
 */
public class ExampleSnap {

    @Test
    public void ListSnapshot() throws Exception {
        ListSnapshotRequest request = ListSnapshotRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setStart(0)
                .setLimit(10)
                .build();
        ManagedChannel channel = Auth.newChannel();
        SnapGrpc.SnapBlockingStub stub = SnapGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListSnapshotResponse response = stub.listSnapshot(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetSnapshotTotalCnt() throws Exception {
        GetSnapshotTotalCntRequest request = GetSnapshotTotalCntRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SnapGrpc.SnapBlockingStub stub = SnapGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetSnapshotTotalCntResponse response = stub.getSnapshotTotalCnt(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void CreateDc2Snapshot() throws Exception {
        CreateSnapshotRequest request = CreateSnapshotRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                .setSnapName("rlx-create-dc2-snap-by-sdk")
                .build();
        ManagedChannel channel = Auth.newChannel();
        SnapGrpc.SnapBlockingStub stub = SnapGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateSnapshotResponse response = stub.createSnapshot(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void CreateEbsSnapshot() throws Exception {
        CreateSnapshotRequest request = CreateSnapshotRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setEbsUuid("fc7e50bdf5045a3e98f6d083ce5797f0")
                .setSnapName("rlx-create-ebs-snap-by-sdk")
                .build();
        ManagedChannel channel = Auth.newChannel();
        SnapGrpc.SnapBlockingStub stub = SnapGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateSnapshotResponse response = stub.createSnapshot(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DeleteSnapshot() throws Exception {
        DeleteSnapshotRequest request = DeleteSnapshotRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addSnap(DeleteSnapshotRequest.Input.newBuilder()
                        .setSnapUuid("5e424b25acec5a819cedd56e813416ae")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SnapGrpc.SnapBlockingStub stub = SnapGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DeleteSnapshotResponse response = stub.deleteSnapshot(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void RevertSnapshot() throws Exception {
        RevertSnapshotRequest request = RevertSnapshotRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addSnap(RevertSnapshotRequest.Input.newBuilder()
                        .setSnapUuid("b53b316981de59058d2b81a9d78ceb62")
                        .build())
                .addSnap(RevertSnapshotRequest.Input.newBuilder()
                        .setSnapUuid("cbdf48e02fd35359b814cea1f02f8929")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SnapGrpc.SnapBlockingStub stub = SnapGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        RevertSnapshotResponse response = stub.revertSnapshot(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeSnapshotName() throws Exception {
        ChangeSnapshotNameRequest request = ChangeSnapshotNameRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addSnap(ChangeSnapshotNameRequest.Input.newBuilder()
                        .setSnapUuid("b53b316981de59058d2b81a9d78ceb62")
                        .setName("rlx-change-snap-name-by-sdk")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        SnapGrpc.SnapBlockingStub stub = SnapGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeSnapshotNameResponse response = stub.changeSnapshotName(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }
}
