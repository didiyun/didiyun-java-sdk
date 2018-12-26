package com.didiyun.common;

import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.OAuth2Credentials;
import io.grpc.CallCredentials;
import io.grpc.ManagedChannel;
import io.grpc.auth.MoreCallCredentials;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

import javax.net.ssl.SSLException;


/**
 * Created by Glacier on 2018/10/31.
 */
public class Auth {

    public static ManagedChannel newChannel() throws SSLException {
        return NettyChannelBuilder.forAddress(Config.ServerHost, Config.ServerPort)
                .sslContext(GrpcSslContexts
                        .forClient()
                        .build())
                .negotiationType(NegotiationType.TLS)
                .overrideAuthority("open.didiyunapi.com")
                .userAgent("didiyun-java-sdk-client/v1")
                .build();
    }

    public static CallCredentials fetchToken() {
        return MoreCallCredentials.from(
                OAuth2Credentials.create(
                        new AccessToken(Config.APIToken, null)
                )
        );
    }

}
