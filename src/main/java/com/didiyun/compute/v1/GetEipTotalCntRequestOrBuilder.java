// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/eip.proto

package com.didiyun.compute.v1;

public interface GetEipTotalCntRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.GetEipTotalCntRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.Header getHeader();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   *精确匹配EIP
   * </pre>
   *
   * <code>string eip = 2;</code>
   */
  java.lang.String getEip();
  /**
   * <pre>
   *精确匹配EIP
   * </pre>
   *
   * <code>string eip = 2;</code>
   */
  com.google.protobuf.ByteString
      getEipBytes();

  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 3;</code>
   */
  java.util.List<java.lang.String>
      getEipUuidsList();
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 3;</code>
   */
  int getEipUuidsCount();
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 3;</code>
   */
  java.lang.String getEipUuids(int index);
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 3;</code>
   */
  com.google.protobuf.ByteString
      getEipUuidsBytes(int index);
}
