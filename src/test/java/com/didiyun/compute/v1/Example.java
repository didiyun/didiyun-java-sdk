package com.didiyun.compute.v1;

import com.didiyun.base.v1.Header;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.OAuth2Credentials;
import com.google.protobuf.util.JsonFormat;
import io.grpc.ManagedChannel;
import io.grpc.auth.MoreCallCredentials;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

/**
 * Created by Glacier on 2018/12/11.
 */
public class Example {

    private static String ServerHost = "open.didiyunapi.com";
    private static int ServerPort = 8080;
    private static String Token = "1321bd3074e35c7abe04e5cbdf6e6d9a71f6ef19d58c544d96078400befc319e";

    public static void main(String[] args) throws Exception {
        //1. 创建一个gRPC Channel
        ManagedChannel channel = NettyChannelBuilder.forAddress(ServerHost, ServerPort)
                .sslContext(GrpcSslContexts
                        .forClient()
                        .build())
                .negotiationType(NegotiationType.TLS)
                .userAgent("didiyun-java-sdk-client/v1")
                .build();
        //2. 使用OAuth2 Token验证方式，根据channel创建一个stub
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(
                MoreCallCredentials.from(
                        OAuth2Credentials.create(
                                new AccessToken(Token, null)
                        )
                ));
        //3. 组装请求体
        ListDc2Request request = ListDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setStart(0)
                .setLimit(10)
                .build();
        //4. 发起请求并处理应答或错误
        ListDc2Response response = stub.listDc2(request);
        System.out.println(JsonFormat.printer().print(response));
        if (response.getError().getErrno() != 0) {
            throw new Exception(response.getError().getErrmsg());
        }
    }

}
