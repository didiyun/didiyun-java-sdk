// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor/v1/counter.proto

package com.didiyun.monitor.v1;

/**
 * Protobuf type {@code didi.cloud.monitor.v1.CounterDataInput}
 */
public  final class CounterDataInput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.monitor.v1.CounterDataInput)
    CounterDataInputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CounterDataInput.newBuilder() to construct.
  private CounterDataInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CounterDataInput() {
    resourceType_ = "";
    resourceUuid_ = "";
    monitorTags_ = "";
    metric_ = "";
    startTime_ = 0L;
    endTime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CounterDataInput(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceUuid_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            monitorTags_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            metric_ = s;
            break;
          }
          case 40: {

            startTime_ = input.readInt64();
            break;
          }
          case 48: {

            endTime_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterDataInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterDataInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.monitor.v1.CounterDataInput.class, com.didiyun.monitor.v1.CounterDataInput.Builder.class);
  }

  public static final int RESOURCETYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceType_;
  /**
   * <pre>
   *资源类型
   * </pre>
   *
   * <code>string resourceType = 1;</code>
   */
  public java.lang.String getResourceType() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *资源类型
   * </pre>
   *
   * <code>string resourceType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceTypeBytes() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCEUUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object resourceUuid_;
  /**
   * <pre>
   *资源Uuid
   * </pre>
   *
   * <code>string resourceUuid = 2;</code>
   */
  public java.lang.String getResourceUuid() {
    java.lang.Object ref = resourceUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *资源Uuid
   * </pre>
   *
   * <code>string resourceUuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResourceUuidBytes() {
    java.lang.Object ref = resourceUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MONITORTAGS_FIELD_NUMBER = 3;
  private volatile java.lang.Object monitorTags_;
  /**
   * <pre>
   *要查询的曲线tags,多个用逗号分隔
   * </pre>
   *
   * <code>string monitorTags = 3;</code>
   */
  public java.lang.String getMonitorTags() {
    java.lang.Object ref = monitorTags_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      monitorTags_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *要查询的曲线tags,多个用逗号分隔
   * </pre>
   *
   * <code>string monitorTags = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMonitorTagsBytes() {
    java.lang.Object ref = monitorTags_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      monitorTags_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRIC_FIELD_NUMBER = 4;
  private volatile java.lang.Object metric_;
  /**
   * <pre>
   *要查询的指标名称
   * </pre>
   *
   * <code>string metric = 4;</code>
   */
  public java.lang.String getMetric() {
    java.lang.Object ref = metric_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metric_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *要查询的指标名称
   * </pre>
   *
   * <code>string metric = 4;</code>
   */
  public com.google.protobuf.ByteString
      getMetricBytes() {
    java.lang.Object ref = metric_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metric_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIME_FIELD_NUMBER = 5;
  private long startTime_;
  /**
   * <pre>
   *开始时间，单位为秒时间戳
   * </pre>
   *
   * <code>int64 startTime = 5;</code>
   */
  public long getStartTime() {
    return startTime_;
  }

  public static final int ENDTIME_FIELD_NUMBER = 6;
  private long endTime_;
  /**
   * <pre>
   *结束时间，单位为秒时间戳
   * </pre>
   *
   * <code>int64 endTime = 6;</code>
   */
  public long getEndTime() {
    return endTime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getResourceTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceType_);
    }
    if (!getResourceUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceUuid_);
    }
    if (!getMonitorTagsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, monitorTags_);
    }
    if (!getMetricBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, metric_);
    }
    if (startTime_ != 0L) {
      output.writeInt64(5, startTime_);
    }
    if (endTime_ != 0L) {
      output.writeInt64(6, endTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceType_);
    }
    if (!getResourceUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceUuid_);
    }
    if (!getMonitorTagsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, monitorTags_);
    }
    if (!getMetricBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, metric_);
    }
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, startTime_);
    }
    if (endTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, endTime_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.didiyun.monitor.v1.CounterDataInput)) {
      return super.equals(obj);
    }
    com.didiyun.monitor.v1.CounterDataInput other = (com.didiyun.monitor.v1.CounterDataInput) obj;

    boolean result = true;
    result = result && getResourceType()
        .equals(other.getResourceType());
    result = result && getResourceUuid()
        .equals(other.getResourceUuid());
    result = result && getMonitorTags()
        .equals(other.getMonitorTags());
    result = result && getMetric()
        .equals(other.getMetric());
    result = result && (getStartTime()
        == other.getStartTime());
    result = result && (getEndTime()
        == other.getEndTime());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESOURCETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResourceType().hashCode();
    hash = (37 * hash) + RESOURCEUUID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceUuid().hashCode();
    hash = (37 * hash) + MONITORTAGS_FIELD_NUMBER;
    hash = (53 * hash) + getMonitorTags().hashCode();
    hash = (37 * hash) + METRIC_FIELD_NUMBER;
    hash = (53 * hash) + getMetric().hashCode();
    hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (37 * hash) + ENDTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.CounterDataInput parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.didiyun.monitor.v1.CounterDataInput prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code didi.cloud.monitor.v1.CounterDataInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.monitor.v1.CounterDataInput)
      com.didiyun.monitor.v1.CounterDataInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterDataInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterDataInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.monitor.v1.CounterDataInput.class, com.didiyun.monitor.v1.CounterDataInput.Builder.class);
    }

    // Construct using com.didiyun.monitor.v1.CounterDataInput.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceType_ = "";

      resourceUuid_ = "";

      monitorTags_ = "";

      metric_ = "";

      startTime_ = 0L;

      endTime_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterDataInput_descriptor;
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.CounterDataInput getDefaultInstanceForType() {
      return com.didiyun.monitor.v1.CounterDataInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.CounterDataInput build() {
      com.didiyun.monitor.v1.CounterDataInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.CounterDataInput buildPartial() {
      com.didiyun.monitor.v1.CounterDataInput result = new com.didiyun.monitor.v1.CounterDataInput(this);
      result.resourceType_ = resourceType_;
      result.resourceUuid_ = resourceUuid_;
      result.monitorTags_ = monitorTags_;
      result.metric_ = metric_;
      result.startTime_ = startTime_;
      result.endTime_ = endTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.didiyun.monitor.v1.CounterDataInput) {
        return mergeFrom((com.didiyun.monitor.v1.CounterDataInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.monitor.v1.CounterDataInput other) {
      if (other == com.didiyun.monitor.v1.CounterDataInput.getDefaultInstance()) return this;
      if (!other.getResourceType().isEmpty()) {
        resourceType_ = other.resourceType_;
        onChanged();
      }
      if (!other.getResourceUuid().isEmpty()) {
        resourceUuid_ = other.resourceUuid_;
        onChanged();
      }
      if (!other.getMonitorTags().isEmpty()) {
        monitorTags_ = other.monitorTags_;
        onChanged();
      }
      if (!other.getMetric().isEmpty()) {
        metric_ = other.metric_;
        onChanged();
      }
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
      }
      if (other.getEndTime() != 0L) {
        setEndTime(other.getEndTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.didiyun.monitor.v1.CounterDataInput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.monitor.v1.CounterDataInput) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceType_ = "";
    /**
     * <pre>
     *资源类型
     * </pre>
     *
     * <code>string resourceType = 1;</code>
     */
    public java.lang.String getResourceType() {
      java.lang.Object ref = resourceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *资源类型
     * </pre>
     *
     * <code>string resourceType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceTypeBytes() {
      java.lang.Object ref = resourceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *资源类型
     * </pre>
     *
     * <code>string resourceType = 1;</code>
     */
    public Builder setResourceType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *资源类型
     * </pre>
     *
     * <code>string resourceType = 1;</code>
     */
    public Builder clearResourceType() {
      
      resourceType_ = getDefaultInstance().getResourceType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *资源类型
     * </pre>
     *
     * <code>string resourceType = 1;</code>
     */
    public Builder setResourceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceUuid_ = "";
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public java.lang.String getResourceUuid() {
      java.lang.Object ref = resourceUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResourceUuidBytes() {
      java.lang.Object ref = resourceUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public Builder setResourceUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public Builder clearResourceUuid() {
      
      resourceUuid_ = getDefaultInstance().getResourceUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *资源Uuid
     * </pre>
     *
     * <code>string resourceUuid = 2;</code>
     */
    public Builder setResourceUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object monitorTags_ = "";
    /**
     * <pre>
     *要查询的曲线tags,多个用逗号分隔
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public java.lang.String getMonitorTags() {
      java.lang.Object ref = monitorTags_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        monitorTags_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *要查询的曲线tags,多个用逗号分隔
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMonitorTagsBytes() {
      java.lang.Object ref = monitorTags_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        monitorTags_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *要查询的曲线tags,多个用逗号分隔
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public Builder setMonitorTags(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      monitorTags_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *要查询的曲线tags,多个用逗号分隔
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public Builder clearMonitorTags() {
      
      monitorTags_ = getDefaultInstance().getMonitorTags();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *要查询的曲线tags,多个用逗号分隔
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public Builder setMonitorTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      monitorTags_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object metric_ = "";
    /**
     * <pre>
     *要查询的指标名称
     * </pre>
     *
     * <code>string metric = 4;</code>
     */
    public java.lang.String getMetric() {
      java.lang.Object ref = metric_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metric_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *要查询的指标名称
     * </pre>
     *
     * <code>string metric = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMetricBytes() {
      java.lang.Object ref = metric_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metric_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *要查询的指标名称
     * </pre>
     *
     * <code>string metric = 4;</code>
     */
    public Builder setMetric(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      metric_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *要查询的指标名称
     * </pre>
     *
     * <code>string metric = 4;</code>
     */
    public Builder clearMetric() {
      
      metric_ = getDefaultInstance().getMetric();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *要查询的指标名称
     * </pre>
     *
     * <code>string metric = 4;</code>
     */
    public Builder setMetricBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      metric_ = value;
      onChanged();
      return this;
    }

    private long startTime_ ;
    /**
     * <pre>
     *开始时间，单位为秒时间戳
     * </pre>
     *
     * <code>int64 startTime = 5;</code>
     */
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <pre>
     *开始时间，单位为秒时间戳
     * </pre>
     *
     * <code>int64 startTime = 5;</code>
     */
    public Builder setStartTime(long value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *开始时间，单位为秒时间戳
     * </pre>
     *
     * <code>int64 startTime = 5;</code>
     */
    public Builder clearStartTime() {
      
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private long endTime_ ;
    /**
     * <pre>
     *结束时间，单位为秒时间戳
     * </pre>
     *
     * <code>int64 endTime = 6;</code>
     */
    public long getEndTime() {
      return endTime_;
    }
    /**
     * <pre>
     *结束时间，单位为秒时间戳
     * </pre>
     *
     * <code>int64 endTime = 6;</code>
     */
    public Builder setEndTime(long value) {
      
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *结束时间，单位为秒时间戳
     * </pre>
     *
     * <code>int64 endTime = 6;</code>
     */
    public Builder clearEndTime() {
      
      endTime_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:didi.cloud.monitor.v1.CounterDataInput)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.monitor.v1.CounterDataInput)
  private static final com.didiyun.monitor.v1.CounterDataInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.monitor.v1.CounterDataInput();
  }

  public static com.didiyun.monitor.v1.CounterDataInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CounterDataInput>
      PARSER = new com.google.protobuf.AbstractParser<CounterDataInput>() {
    @java.lang.Override
    public CounterDataInput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CounterDataInput(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CounterDataInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CounterDataInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.monitor.v1.CounterDataInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

