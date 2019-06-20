package com.didiyun.monitor.v1;

import com.didiyun.base.v1.Header;
import com.didiyun.common.Auth;
import com.didiyun.common.Utils;
import com.didiyun.compute.v1.Dc2Grpc;
import com.didiyun.compute.v1.ListDc2Request;
import com.didiyun.compute.v1.ListDc2Response;
import com.google.common.collect.Lists;
import io.grpc.ManagedChannel;
import org.junit.Test;

/**
 * Created by Glacier on 2019/6/20.
 */
public class ExampleCounter {

    @Test
    public void ListCounter() throws Exception {
        ListCounterRequest request = ListCounterRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addResource(CounterResource.newBuilder()
                        .setResourceType("dc2")
                        .addResourceUuids("3a4044a5d9b2555d8617a853a3bec8ef")
                        .addAllMetric(Lists.newArrayList("cpu.util", "disk.read", "disk.write"))
                        .build())
                .addResource(CounterResource.newBuilder()
                        .setResourceType("eip")
                        .addResourceUuids("fcde51c1c4115e2487ee04fcb81e7531")
                        .addAllMetric(Lists.newArrayList("rxbytes", "txbytes"))
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        MonitorGrpc.MonitorBlockingStub stub = MonitorGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListCounterResponse response = stub.listCounter(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

    @Test
    public void ListCounterData() throws Exception {
        ListCounterDataRequest request = ListCounterDataRequest.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .addCounter(CounterDataInput.newBuilder()
                        .setResourceType("dc2")
                        .setResourceUuid("3a4044a5d9b2555d8617a853a3bec8ef")
                        .setMonitorTags("device=vda")
                        .setMetric("disk.write")
                        .setStartTime(1560944187)
                        .setEndTime(1560947787)
                        .build())
                .addCounter(CounterDataInput.newBuilder()
                        .setResourceType("dc2")
                        .setResourceUuid("3a4044a5d9b2555d8617a853a3bec8ef")
                        .setMonitorTags("device=vdb")
                        .setMetric("disk.read")
                        .setStartTime(1560944187)
                        .setEndTime(1560947787)
                        .build())
                .addCounter(CounterDataInput.newBuilder()
                        .setResourceType("eip")
                        .setResourceUuid("fcde51c1c4115e2487ee04fcb81e7531")
                        .setMetric("rxbytes")
                        .setStartTime(1560944187)
                        .setEndTime(1560947787)
                        .build())
                .build();
        ManagedChannel channel = Auth.newChannel();
        MonitorGrpc.MonitorBlockingStub stub = MonitorGrpc.newBlockingStub(channel).withCallCredentials(Auth.fetchToken());
        ListCounterDataResponse response = stub.listCounterData(request);
        Utils.printRequestAndResponseWithJsonString(request, response);
        channel.shutdown();
    }

}
