package com.didiyun.common;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;

/**
 * Created by Glacier on 2018/10/31.
 */
public class Utils {

    public static String toJsonString(MessageOrBuilder obj) throws InvalidProtocolBufferException {
        return JsonFormat.printer().print(obj);
    }

    public static void printWithJsonString(MessageOrBuilder obj) throws InvalidProtocolBufferException {
        System.out.println(toJsonString(obj));
    }

    public static void printRequestAndResponseWithJsonString(MessageOrBuilder req, MessageOrBuilder resp) throws InvalidProtocolBufferException {
        System.out.println("-------------request--------------");
        printWithJsonString(req);
        System.out.println("-----------request end------------");
        System.out.println("------------ response-------------");
        printWithJsonString(resp);
        System.out.println("-----------response end-------------");
    }

}
