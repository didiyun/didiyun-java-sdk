// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor/v1/counter.proto

package com.didiyun.monitor.v1;

/**
 * Protobuf type {@code didi.cloud.monitor.v1.ListCounterDataRequest}
 */
public  final class ListCounterDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.monitor.v1.ListCounterDataRequest)
    ListCounterDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCounterDataRequest.newBuilder() to construct.
  private ListCounterDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCounterDataRequest() {
    counter_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListCounterDataRequest(
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
            com.didiyun.base.v1.Header.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.didiyun.base.v1.Header.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              counter_ = new java.util.ArrayList<com.didiyun.monitor.v1.CounterDataInput>();
              mutable_bitField0_ |= 0x00000002;
            }
            counter_.add(
                input.readMessage(com.didiyun.monitor.v1.CounterDataInput.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        counter_ = java.util.Collections.unmodifiableList(counter_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.monitor.v1.ListCounterDataRequest.class, com.didiyun.monitor.v1.ListCounterDataRequest.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private com.didiyun.base.v1.Header header_;
  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.Header getHeader() {
    return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
  }
  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int COUNTER_FIELD_NUMBER = 2;
  private java.util.List<com.didiyun.monitor.v1.CounterDataInput> counter_;
  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  public java.util.List<com.didiyun.monitor.v1.CounterDataInput> getCounterList() {
    return counter_;
  }
  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  public java.util.List<? extends com.didiyun.monitor.v1.CounterDataInputOrBuilder> 
      getCounterOrBuilderList() {
    return counter_;
  }
  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  public int getCounterCount() {
    return counter_.size();
  }
  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  public com.didiyun.monitor.v1.CounterDataInput getCounter(int index) {
    return counter_.get(index);
  }
  /**
   * <pre>
   *查询的曲线信息
   * </pre>
   *
   * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
   */
  public com.didiyun.monitor.v1.CounterDataInputOrBuilder getCounterOrBuilder(
      int index) {
    return counter_.get(index);
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < counter_.size(); i++) {
      output.writeMessage(2, counter_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    for (int i = 0; i < counter_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, counter_.get(i));
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
    if (!(obj instanceof com.didiyun.monitor.v1.ListCounterDataRequest)) {
      return super.equals(obj);
    }
    com.didiyun.monitor.v1.ListCounterDataRequest other = (com.didiyun.monitor.v1.ListCounterDataRequest) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getCounterList()
        .equals(other.getCounterList());
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getCounterCount() > 0) {
      hash = (37 * hash) + COUNTER_FIELD_NUMBER;
      hash = (53 * hash) + getCounterList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.ListCounterDataRequest parseFrom(
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
  public static Builder newBuilder(com.didiyun.monitor.v1.ListCounterDataRequest prototype) {
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
   * Protobuf type {@code didi.cloud.monitor.v1.ListCounterDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.monitor.v1.ListCounterDataRequest)
      com.didiyun.monitor.v1.ListCounterDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.monitor.v1.ListCounterDataRequest.class, com.didiyun.monitor.v1.ListCounterDataRequest.Builder.class);
    }

    // Construct using com.didiyun.monitor.v1.ListCounterDataRequest.newBuilder()
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
        getCounterFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (counterBuilder_ == null) {
        counter_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        counterBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataRequest_descriptor;
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.ListCounterDataRequest getDefaultInstanceForType() {
      return com.didiyun.monitor.v1.ListCounterDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.ListCounterDataRequest build() {
      com.didiyun.monitor.v1.ListCounterDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.ListCounterDataRequest buildPartial() {
      com.didiyun.monitor.v1.ListCounterDataRequest result = new com.didiyun.monitor.v1.ListCounterDataRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (counterBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          counter_ = java.util.Collections.unmodifiableList(counter_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.counter_ = counter_;
      } else {
        result.counter_ = counterBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.didiyun.monitor.v1.ListCounterDataRequest) {
        return mergeFrom((com.didiyun.monitor.v1.ListCounterDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.monitor.v1.ListCounterDataRequest other) {
      if (other == com.didiyun.monitor.v1.ListCounterDataRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (counterBuilder_ == null) {
        if (!other.counter_.isEmpty()) {
          if (counter_.isEmpty()) {
            counter_ = other.counter_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCounterIsMutable();
            counter_.addAll(other.counter_);
          }
          onChanged();
        }
      } else {
        if (!other.counter_.isEmpty()) {
          if (counterBuilder_.isEmpty()) {
            counterBuilder_.dispose();
            counterBuilder_ = null;
            counter_ = other.counter_;
            bitField0_ = (bitField0_ & ~0x00000002);
            counterBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCounterFieldBuilder() : null;
          } else {
            counterBuilder_.addAllMessages(other.counter_);
          }
        }
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
      com.didiyun.monitor.v1.ListCounterDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.monitor.v1.ListCounterDataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.didiyun.base.v1.Header header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> headerBuilder_;
    /**
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(
        com.didiyun.base.v1.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder mergeHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.didiyun.base.v1.Header.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<com.didiyun.monitor.v1.CounterDataInput> counter_ =
      java.util.Collections.emptyList();
    private void ensureCounterIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        counter_ = new java.util.ArrayList<com.didiyun.monitor.v1.CounterDataInput>(counter_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.monitor.v1.CounterDataInput, com.didiyun.monitor.v1.CounterDataInput.Builder, com.didiyun.monitor.v1.CounterDataInputOrBuilder> counterBuilder_;

    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public java.util.List<com.didiyun.monitor.v1.CounterDataInput> getCounterList() {
      if (counterBuilder_ == null) {
        return java.util.Collections.unmodifiableList(counter_);
      } else {
        return counterBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public int getCounterCount() {
      if (counterBuilder_ == null) {
        return counter_.size();
      } else {
        return counterBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataInput getCounter(int index) {
      if (counterBuilder_ == null) {
        return counter_.get(index);
      } else {
        return counterBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public Builder setCounter(
        int index, com.didiyun.monitor.v1.CounterDataInput value) {
      if (counterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCounterIsMutable();
        counter_.set(index, value);
        onChanged();
      } else {
        counterBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public Builder setCounter(
        int index, com.didiyun.monitor.v1.CounterDataInput.Builder builderForValue) {
      if (counterBuilder_ == null) {
        ensureCounterIsMutable();
        counter_.set(index, builderForValue.build());
        onChanged();
      } else {
        counterBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public Builder addCounter(com.didiyun.monitor.v1.CounterDataInput value) {
      if (counterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCounterIsMutable();
        counter_.add(value);
        onChanged();
      } else {
        counterBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public Builder addCounter(
        int index, com.didiyun.monitor.v1.CounterDataInput value) {
      if (counterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCounterIsMutable();
        counter_.add(index, value);
        onChanged();
      } else {
        counterBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public Builder addCounter(
        com.didiyun.monitor.v1.CounterDataInput.Builder builderForValue) {
      if (counterBuilder_ == null) {
        ensureCounterIsMutable();
        counter_.add(builderForValue.build());
        onChanged();
      } else {
        counterBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public Builder addCounter(
        int index, com.didiyun.monitor.v1.CounterDataInput.Builder builderForValue) {
      if (counterBuilder_ == null) {
        ensureCounterIsMutable();
        counter_.add(index, builderForValue.build());
        onChanged();
      } else {
        counterBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public Builder addAllCounter(
        java.lang.Iterable<? extends com.didiyun.monitor.v1.CounterDataInput> values) {
      if (counterBuilder_ == null) {
        ensureCounterIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, counter_);
        onChanged();
      } else {
        counterBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public Builder clearCounter() {
      if (counterBuilder_ == null) {
        counter_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        counterBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public Builder removeCounter(int index) {
      if (counterBuilder_ == null) {
        ensureCounterIsMutable();
        counter_.remove(index);
        onChanged();
      } else {
        counterBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataInput.Builder getCounterBuilder(
        int index) {
      return getCounterFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataInputOrBuilder getCounterOrBuilder(
        int index) {
      if (counterBuilder_ == null) {
        return counter_.get(index);  } else {
        return counterBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public java.util.List<? extends com.didiyun.monitor.v1.CounterDataInputOrBuilder> 
         getCounterOrBuilderList() {
      if (counterBuilder_ != null) {
        return counterBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(counter_);
      }
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataInput.Builder addCounterBuilder() {
      return getCounterFieldBuilder().addBuilder(
          com.didiyun.monitor.v1.CounterDataInput.getDefaultInstance());
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataInput.Builder addCounterBuilder(
        int index) {
      return getCounterFieldBuilder().addBuilder(
          index, com.didiyun.monitor.v1.CounterDataInput.getDefaultInstance());
    }
    /**
     * <pre>
     *查询的曲线信息
     * </pre>
     *
     * <code>repeated .didi.cloud.monitor.v1.CounterDataInput counter = 2;</code>
     */
    public java.util.List<com.didiyun.monitor.v1.CounterDataInput.Builder> 
         getCounterBuilderList() {
      return getCounterFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.monitor.v1.CounterDataInput, com.didiyun.monitor.v1.CounterDataInput.Builder, com.didiyun.monitor.v1.CounterDataInputOrBuilder> 
        getCounterFieldBuilder() {
      if (counterBuilder_ == null) {
        counterBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.didiyun.monitor.v1.CounterDataInput, com.didiyun.monitor.v1.CounterDataInput.Builder, com.didiyun.monitor.v1.CounterDataInputOrBuilder>(
                counter_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        counter_ = null;
      }
      return counterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.monitor.v1.ListCounterDataRequest)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.monitor.v1.ListCounterDataRequest)
  private static final com.didiyun.monitor.v1.ListCounterDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.monitor.v1.ListCounterDataRequest();
  }

  public static com.didiyun.monitor.v1.ListCounterDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCounterDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListCounterDataRequest>() {
    @java.lang.Override
    public ListCounterDataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListCounterDataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListCounterDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCounterDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.monitor.v1.ListCounterDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

