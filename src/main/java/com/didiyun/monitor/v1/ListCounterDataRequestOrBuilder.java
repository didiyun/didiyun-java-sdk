// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor/v1/counter.proto

package com.didiyun.monitor.v1;

public interface ListCounterDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.monitor.v1.ListCounterDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.Header getHeader();
  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  java.util.List<com.didiyun.monitor.v1.CounterDataInput> 
      getCounterList();
  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  com.didiyun.monitor.v1.CounterDataInput getCounter(int index);
  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  int getCounterCount();
  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  java.util.List<? extends com.didiyun.monitor.v1.CounterDataInputOrBuilder> 
      getCounterOrBuilderList();
  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  com.didiyun.monitor.v1.CounterDataInputOrBuilder getCounterOrBuilder(
      int index);
}
