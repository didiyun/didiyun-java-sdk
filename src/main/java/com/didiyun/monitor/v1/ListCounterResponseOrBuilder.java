// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor/v1/counter.proto

package com.didiyun.monitor.v1;

public interface ListCounterResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.monitor.v1.ListCounterResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  boolean hasError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.Error getError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterOutput data = 2;</code>
   */
  java.util.List<com.didiyun.monitor.v1.CounterOutput> 
      getDataList();
  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterOutput data = 2;</code>
   */
  com.didiyun.monitor.v1.CounterOutput getData(int index);
  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterOutput data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterOutput data = 2;</code>
   */
  java.util.List<? extends com.didiyun.monitor.v1.CounterOutputOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterOutput data = 2;</code>
   */
  com.didiyun.monitor.v1.CounterOutputOrBuilder getDataOrBuilder(
      int index);
}