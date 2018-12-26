package com.didiyun.compute.v1;

import com.didiyun.base.v1.Header;
import com.didiyun.common.Auth;
import com.didiyun.common.Utils;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import org.apache.commons.codec.binary.Hex;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Glacier on 2018/10/29.
 */
public class ExampleDc2 {

    @Test
    public void ListDc2() throws Exception {
        ListDc2Request request = ListDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .setZoneId("all")
                        .build())
                .setStart(0)
                .setLimit(10)
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListDc2Response response = stub.listDc2(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetDc2ByUuid() throws Exception {
        GetDc2ByUuidRequest request = GetDc2ByUuidRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetDc2ByUuidResponse response = stub.getDc2ByUuid(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void GetDc2TotalCnt() throws Exception {
        GetDc2TotalCntRequest request = GetDc2TotalCntRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setIp("10.255.0.182")
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        GetDc2TotalCntResponse response = stub.getDc2TotalCnt(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void CreateDc2() throws Exception {
        CreateDc2Request request = CreateDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setImgUuid("46b447a8b0a146779bbde3ca40e56843")
                .setSubnetUuid("3eb6cdc398404573824b1a1ee6b661ec")
                .setDc2Model("dc2.s1.small1.d20")
                .setName("rlx-test-create-dc2-by-sdk")
                .setPassword(String.valueOf(Hex.encodeHex("123qweQWE".getBytes())))
                .setEip(CreateDc2Request.Eip.newBuilder()
                        .setBandwidth(1)
                        .build())
                .addEbs(CreateDc2Request.Ebs.newBuilder()
                        .setCount(2)
                        .setSize(25)
                        .setDiskType("SSD")
                        .setName("rlx-test-create-dc2-by-sdk")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateDc2Response response = stub.createDc2(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeDc2Spec() throws Exception {
        ChangeDc2SpecRequest request = ChangeDc2SpecRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(ChangeDc2SpecRequest.Input.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .setDc2Model("dc2.s1.large4.d20")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeDc2SpecResponse response = stub.changeDc2Spec(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();

    }

    @Test
    public void StartDc2() throws Exception {
        StartDc2Request request = StartDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(StartDc2Request.Input.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        StartDc2Response response = stub.startDc2(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void StopDc2() throws Exception {
        StopDc2Request request = StopDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(StopDc2Request.Input.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        StopDc2Response response = stub.stopDc2(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void RebootDc2() throws Exception {
        RebootDc2Request request = RebootDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(RebootDc2Request.Input.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        RebootDc2Response response = stub.rebootDc2(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ReinstallDc2System() throws Exception {
        ReinstallDc2SystemRequest request = ReinstallDc2SystemRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(ReinstallDc2SystemRequest.Input.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .setImgUuid("b26a715242c642be883687d7073a0b1f")
                        .setPassword(String.valueOf(Hex.encodeHex("123qweQWE".getBytes())))
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ReinstallDc2SystemResponse response = stub.reinstallDc2System(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeDc2Password() throws Exception {
        ChangeDc2PasswordRequest request = ChangeDc2PasswordRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(ChangeDc2PasswordRequest.Input.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .setPassword(String.valueOf(Hex.encodeHex("123qweQWE".getBytes())))
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeDc2PasswordResponse response = stub.changeDc2Password(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void ChangeDc2Name() throws Exception {
        ChangeDc2NameRequest request = ChangeDc2NameRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(ChangeDc2NameRequest.Input.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .setName("rlx-test-change-dc2-name-by-sdk")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeDc2NameResponse response = stub.changeDc2Name(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }

    @Test
    public void DestroyDc2() throws Exception {
        DestroyDc2Request request = DestroyDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addDc2(DestroyDc2Request.Input.newBuilder()
                        .setDc2Uuid("953777262c9e5bd48d1a5379ca220811")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DestroyDc2Response response = stub.destroyDc2(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        JobResultResponse jobResponse = ExampleCommon.pollingJobResult(channel, "gz", response.getDataList());
        Utils.printWithJsonString(jobResponse);
        channel.shutdown();
    }


    @Test
    public void ListImage() throws Exception {
        ListImageRequest request = ListImageRequest.newBuilder()
                .setHeader(Header.newBuilder().build()).build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListImageResponse response = stub.listImage(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void AsyncListImage() throws Exception {
        ListImageRequest request = ListImageRequest.newBuilder()
                .setHeader(Header.newBuilder().build()).build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2Stub stub = Dc2Grpc.newStub(channel).withCallCredentials(Auth.fetchToken());
        CountDownLatch c = new CountDownLatch(1);
        stub.listImage(request, new StreamObserver<ListImageResponse>() {
            @Override
            public void onNext(ListImageResponse listImageResponse) {
                try {
                    Utils.printWithJsonString(listImageResponse);
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                channel.shutdown();
                c.countDown();
            }
        });
        c.await();
    }

    @Test
    public void ListSshKey() throws Exception {
        ListSshKeyRequest request = ListSshKeyRequest.newBuilder().build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListSshKeyResponse response = stub.listSshKey(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void CreateSshKey() throws Exception {
        CreateSshKeyRequest request = CreateSshKeyRequest.newBuilder()
                .setName("rlx-create-sshkey-by-sdk")
                .setKey("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDLPkD03IMvLLWMCO1R3M8xEIcePWj9MPKpFh/dOuraLWnP9tBNIgtEjFXHzomO1i72z8dwEpBy+Xk15RWoMV+C8F4eR9fUpl75On433ji4mLVfIGxDb4CYhWeT0O4KG7fkr4GU6266DBxHVX0HiykNjxHCjO5+fCJ6eeeHVPqfEDO+ZLXE92mxMbdb647wjrTIg94E4sJ6LhRmqHml/W8gS+L0TCcbhNbhyp71hsYrDM/2NTLeU7ehZrhUYNoTxgcHtLI24QT5W+vYLvWTasv0dTsK/CHMlewwjFEJJuhQ9LTSjffPB19xEMgc265a7TolBWEja8L+1VgqhHH3lh35 renlixiang@didichuxing.com")
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CreateSshKeyResponse response = stub.createSshKey(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void DeleteSshKey() throws Exception {
        DeleteSshKeyRequest request = DeleteSshKeyRequest.newBuilder()
                .setPubKeyUuid("aa7abd7d6753564394d99695a5829277")
                .build();
        ManagedChannel channel = Auth.newChannel();
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        DeleteSshKeyResponse response = stub.deleteSshKey(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }
}
