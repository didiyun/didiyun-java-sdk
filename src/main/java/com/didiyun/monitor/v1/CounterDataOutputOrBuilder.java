// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor/v1/counter.proto

package com.didiyun.monitor.v1;

public interface CounterDataOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.monitor.v1.CounterDataOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *资源类型
   * </pre>
   *
   * <code>string resourceType = 1;</code>
   */
  java.lang.String getResourceType();
  /**
   * <pre>
   *资源类型
   * </pre>
   *
   * <code>string resourceType = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceTypeBytes();

  /**
   * <pre>
   *所查询的曲线tags
   * </pre>
   *
   * <code>string monitorTags = 2;</code>
   */
  java.lang.String getMonitorTags();
  /**
   * <pre>
   *所查询的曲线tags
   * </pre>
   *
   * <code>string monitorTags = 2;</code>
   */
  com.google.protobuf.ByteString
      getMonitorTagsBytes();

  /**
   * <pre>
   *监控指标名
   * </pre>
   *
   * <code>string metric = 3;</code>
   */
  java.lang.String getMetric();
  /**
   * <pre>
   *监控指标名
   * </pre>
   *
   * <code>string metric = 3;</code>
   */
  com.google.protobuf.ByteString
      getMetricBytes();

  /**
   * <pre>
   *监控指标别名
   * </pre>
   *
   * <code>string metricAlias = 4;</code>
   */
  java.lang.String getMetricAlias();
  /**
   * <pre>
   *监控指标别名
   * </pre>
   *
   * <code>string metricAlias = 4;</code>
   */
  com.google.protobuf.ByteString
      getMetricAliasBytes();

  /**
   * <pre>
   *曲线上的点坐标
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataValue values = 5;</code>
   */
  java.util.List<com.didiyun.monitor.v1.CounterDataValue> 
      getValuesList();
  /**
   * <pre>
   *曲线上的点坐标
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataValue values = 5;</code>
   */
  com.didiyun.monitor.v1.CounterDataValue getValues(int index);
  /**
   * <pre>
   *曲线上的点坐标
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataValue values = 5;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   *曲线上的点坐标
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataValue values = 5;</code>
   */
  java.util.List<? extends com.didiyun.monitor.v1.CounterDataValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   *曲线上的点坐标
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataValue values = 5;</code>
   */
  com.didiyun.monitor.v1.CounterDataValueOrBuilder getValuesOrBuilder(
      int index);
}
