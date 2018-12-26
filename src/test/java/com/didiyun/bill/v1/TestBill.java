package com.didiyun.bill.v1;

import com.didiyun.common.Auth;
import com.didiyun.common.Utils;
import io.grpc.ManagedChannel;
import org.junit.Test;

/**
 * Created by Glacier on 2018/11/6.
 */
public class TestBill {

    @Test
    public void checkDc2Price() throws Exception {
        CheckDc2PriceRequest request = CheckDc2PriceRequest.newBuilder()
                .setDc2Goods(CheckDc2PriceInput.newBuilder()
                        .setPayPeriod(1)
                        .setDc2Model("dc2.s1.large4.d20")
                        .setEip(CheckEipPriceInput.newBuilder()
                                .setBandwidth(12)
                                .build())
                        .addEbs(CheckEbsPriceInput.newBuilder()
                                .setSize(30)
                                .setDiskType("SSD")
                                .build())
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        BillGrpc.BillBlockingStub stub = BillGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CheckPriceResponse response = stub.checkDc2Price(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void checkEipPrice() throws Exception {
        CheckEipPriceRequest request = CheckEipPriceRequest.newBuilder()
                .setEipGoods(CheckEipPriceInput.newBuilder()
                        .setPayPeriod(2)
                        .setBandwidth(1)
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        BillGrpc.BillBlockingStub stub = BillGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CheckPriceResponse response = stub.checkEipPrice(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void checkEbsPrice() throws Exception {
        CheckEbsPriceRequest request = CheckEbsPriceRequest.newBuilder()
                .setEbsGoods(CheckEbsPriceInput.newBuilder()
                        .setPayPeriod(2)
                        .setSize(30)
                        .setDiskType("SSD")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        BillGrpc.BillBlockingStub stub = BillGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        CheckPriceResponse response = stub.checkEbsPrice(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void continueList() throws Exception {
        ContinueListRequest request = ContinueListRequest.newBuilder()
                .setStart(0)
                .setLimit(10)
                .setCondition(ContinueListCondition.newBuilder()
                        .setResourceType("dc2")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        BillGrpc.BillBlockingStub stub = BillGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ContinueListResponse response = stub.continueList(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void continueMonthly() throws Exception {
        ContinueMonthlyRequest request = ContinueMonthlyRequest.newBuilder()
                .setPayPeriod(2)
                .addResource(ResourceItemInput.newBuilder()
                        .setResourceUuid("e0dd4100a9275897ad1a56422d697956")
                        .setResourceType("eip")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        BillGrpc.BillBlockingStub stub = BillGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ContinueMonthlyResponse response = stub.continueMonthly(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void changeToMonthly() throws Exception {
        ChangeToMonthlyRequest request = ChangeToMonthlyRequest.newBuilder()
                .setPayPeriod(1)
                .addResource(ResourceItemInput.newBuilder()
                        .setResourceUuid("86e85c57c6e85bbebf8d76f55166d31e")
                        .setResourceType("dc2")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        BillGrpc.BillBlockingStub stub = BillGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeToMonthlyResponse response = stub.changeToMonthly(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void changeExpireStrategy() throws Exception {
        ChangeExpireStrategyRequest request = ChangeExpireStrategyRequest.newBuilder()
                .setAutoRenewCnt(5)
                .setAutoSwitch(false)
                .addResource(ResourceItemInput.newBuilder()
                        .setResourceUuid("e0dd4100a9275897ad1a56422d697956")
                        .setResourceType("eip")
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        BillGrpc.BillBlockingStub stub = BillGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ChangeExpireStrategyResponse response = stub.changeExpireStrategy(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

}
