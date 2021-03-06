// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.ListSgCondition}
 */
public  final class ListSgCondition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.ListSgCondition)
    ListSgConditionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSgCondition.newBuilder() to construct.
  private ListSgCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSgCondition() {
    sgUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    vpcUuid_ = "";
    dc2Uuid_ = "";
    dc2Exclude_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListSgCondition(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              sgUuids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            sgUuids_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            vpcUuid_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dc2Uuid_ = s;
            break;
          }
          case 32: {

            dc2Exclude_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        sgUuids_ = sgUuids_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.ListSgCondition.class, com.didiyun.compute.v1.ListSgCondition.Builder.class);
  }

  private int bitField0_;
  public static final int SGUUIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList sgUuids_;
  /**
   * <pre>
   *查询此uuid集合的SG
   * </pre>
   *
   * <code>repeated string sgUuids = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getSgUuidsList() {
    return sgUuids_;
  }
  /**
   * <pre>
   *查询此uuid集合的SG
   * </pre>
   *
   * <code>repeated string sgUuids = 1;</code>
   */
  public int getSgUuidsCount() {
    return sgUuids_.size();
  }
  /**
   * <pre>
   *查询此uuid集合的SG
   * </pre>
   *
   * <code>repeated string sgUuids = 1;</code>
   */
  public java.lang.String getSgUuids(int index) {
    return sgUuids_.get(index);
  }
  /**
   * <pre>
   *查询此uuid集合的SG
   * </pre>
   *
   * <code>repeated string sgUuids = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSgUuidsBytes(int index) {
    return sgUuids_.getByteString(index);
  }

  public static final int VPCUUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object vpcUuid_;
  /**
   * <pre>
   *查询此uuid对应的VPC下的SG
   * </pre>
   *
   * <code>string vpcUuid = 2;</code>
   */
  public java.lang.String getVpcUuid() {
    java.lang.Object ref = vpcUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vpcUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *查询此uuid对应的VPC下的SG
   * </pre>
   *
   * <code>string vpcUuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVpcUuidBytes() {
    java.lang.Object ref = vpcUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vpcUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DC2UUID_FIELD_NUMBER = 3;
  private volatile java.lang.Object dc2Uuid_;
  /**
   * <pre>
   *查询此uuid对应的DC2相关的SG
   * </pre>
   *
   * <code>string dc2Uuid = 3;</code>
   */
  public java.lang.String getDc2Uuid() {
    java.lang.Object ref = dc2Uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dc2Uuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *查询此uuid对应的DC2相关的SG
   * </pre>
   *
   * <code>string dc2Uuid = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDc2UuidBytes() {
    java.lang.Object ref = dc2Uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dc2Uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DC2EXCLUDE_FIELD_NUMBER = 4;
  private boolean dc2Exclude_;
  /**
   * <pre>
   *与dc2Uuid配合使用，不传或传false，表示查询此DC2所绑定的SG列表，传true表示查询此DC2未绑定的SG列表
   * </pre>
   *
   * <code>bool dc2Exclude = 4;</code>
   */
  public boolean getDc2Exclude() {
    return dc2Exclude_;
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
    for (int i = 0; i < sgUuids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sgUuids_.getRaw(i));
    }
    if (!getVpcUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, vpcUuid_);
    }
    if (!getDc2UuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dc2Uuid_);
    }
    if (dc2Exclude_ != false) {
      output.writeBool(4, dc2Exclude_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < sgUuids_.size(); i++) {
        dataSize += computeStringSizeNoTag(sgUuids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSgUuidsList().size();
    }
    if (!getVpcUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, vpcUuid_);
    }
    if (!getDc2UuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dc2Uuid_);
    }
    if (dc2Exclude_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, dc2Exclude_);
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
    if (!(obj instanceof com.didiyun.compute.v1.ListSgCondition)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.ListSgCondition other = (com.didiyun.compute.v1.ListSgCondition) obj;

    boolean result = true;
    result = result && getSgUuidsList()
        .equals(other.getSgUuidsList());
    result = result && getVpcUuid()
        .equals(other.getVpcUuid());
    result = result && getDc2Uuid()
        .equals(other.getDc2Uuid());
    result = result && (getDc2Exclude()
        == other.getDc2Exclude());
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
    if (getSgUuidsCount() > 0) {
      hash = (37 * hash) + SGUUIDS_FIELD_NUMBER;
      hash = (53 * hash) + getSgUuidsList().hashCode();
    }
    hash = (37 * hash) + VPCUUID_FIELD_NUMBER;
    hash = (53 * hash) + getVpcUuid().hashCode();
    hash = (37 * hash) + DC2UUID_FIELD_NUMBER;
    hash = (53 * hash) + getDc2Uuid().hashCode();
    hash = (37 * hash) + DC2EXCLUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDc2Exclude());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.ListSgCondition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListSgCondition parseFrom(
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
  public static Builder newBuilder(com.didiyun.compute.v1.ListSgCondition prototype) {
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
   * Protobuf type {@code didi.cloud.compute.v1.ListSgCondition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.ListSgCondition)
      com.didiyun.compute.v1.ListSgConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.ListSgCondition.class, com.didiyun.compute.v1.ListSgCondition.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.ListSgCondition.newBuilder()
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
      sgUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      vpcUuid_ = "";

      dc2Uuid_ = "";

      dc2Exclude_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgCondition_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListSgCondition getDefaultInstanceForType() {
      return com.didiyun.compute.v1.ListSgCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListSgCondition build() {
      com.didiyun.compute.v1.ListSgCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListSgCondition buildPartial() {
      com.didiyun.compute.v1.ListSgCondition result = new com.didiyun.compute.v1.ListSgCondition(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        sgUuids_ = sgUuids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.sgUuids_ = sgUuids_;
      result.vpcUuid_ = vpcUuid_;
      result.dc2Uuid_ = dc2Uuid_;
      result.dc2Exclude_ = dc2Exclude_;
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
      if (other instanceof com.didiyun.compute.v1.ListSgCondition) {
        return mergeFrom((com.didiyun.compute.v1.ListSgCondition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.ListSgCondition other) {
      if (other == com.didiyun.compute.v1.ListSgCondition.getDefaultInstance()) return this;
      if (!other.sgUuids_.isEmpty()) {
        if (sgUuids_.isEmpty()) {
          sgUuids_ = other.sgUuids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSgUuidsIsMutable();
          sgUuids_.addAll(other.sgUuids_);
        }
        onChanged();
      }
      if (!other.getVpcUuid().isEmpty()) {
        vpcUuid_ = other.vpcUuid_;
        onChanged();
      }
      if (!other.getDc2Uuid().isEmpty()) {
        dc2Uuid_ = other.dc2Uuid_;
        onChanged();
      }
      if (other.getDc2Exclude() != false) {
        setDc2Exclude(other.getDc2Exclude());
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
      com.didiyun.compute.v1.ListSgCondition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.ListSgCondition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList sgUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSgUuidsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        sgUuids_ = new com.google.protobuf.LazyStringArrayList(sgUuids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *查询此uuid集合的SG
     * </pre>
     *
     * <code>repeated string sgUuids = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getSgUuidsList() {
      return sgUuids_.getUnmodifiableView();
    }
    /**
     * <pre>
     *查询此uuid集合的SG
     * </pre>
     *
     * <code>repeated string sgUuids = 1;</code>
     */
    public int getSgUuidsCount() {
      return sgUuids_.size();
    }
    /**
     * <pre>
     *查询此uuid集合的SG
     * </pre>
     *
     * <code>repeated string sgUuids = 1;</code>
     */
    public java.lang.String getSgUuids(int index) {
      return sgUuids_.get(index);
    }
    /**
     * <pre>
     *查询此uuid集合的SG
     * </pre>
     *
     * <code>repeated string sgUuids = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSgUuidsBytes(int index) {
      return sgUuids_.getByteString(index);
    }
    /**
     * <pre>
     *查询此uuid集合的SG
     * </pre>
     *
     * <code>repeated string sgUuids = 1;</code>
     */
    public Builder setSgUuids(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSgUuidsIsMutable();
      sgUuids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询此uuid集合的SG
     * </pre>
     *
     * <code>repeated string sgUuids = 1;</code>
     */
    public Builder addSgUuids(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSgUuidsIsMutable();
      sgUuids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询此uuid集合的SG
     * </pre>
     *
     * <code>repeated string sgUuids = 1;</code>
     */
    public Builder addAllSgUuids(
        java.lang.Iterable<java.lang.String> values) {
      ensureSgUuidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sgUuids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询此uuid集合的SG
     * </pre>
     *
     * <code>repeated string sgUuids = 1;</code>
     */
    public Builder clearSgUuids() {
      sgUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询此uuid集合的SG
     * </pre>
     *
     * <code>repeated string sgUuids = 1;</code>
     */
    public Builder addSgUuidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSgUuidsIsMutable();
      sgUuids_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object vpcUuid_ = "";
    /**
     * <pre>
     *查询此uuid对应的VPC下的SG
     * </pre>
     *
     * <code>string vpcUuid = 2;</code>
     */
    public java.lang.String getVpcUuid() {
      java.lang.Object ref = vpcUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vpcUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *查询此uuid对应的VPC下的SG
     * </pre>
     *
     * <code>string vpcUuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVpcUuidBytes() {
      java.lang.Object ref = vpcUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vpcUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *查询此uuid对应的VPC下的SG
     * </pre>
     *
     * <code>string vpcUuid = 2;</code>
     */
    public Builder setVpcUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vpcUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询此uuid对应的VPC下的SG
     * </pre>
     *
     * <code>string vpcUuid = 2;</code>
     */
    public Builder clearVpcUuid() {
      
      vpcUuid_ = getDefaultInstance().getVpcUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询此uuid对应的VPC下的SG
     * </pre>
     *
     * <code>string vpcUuid = 2;</code>
     */
    public Builder setVpcUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vpcUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dc2Uuid_ = "";
    /**
     * <pre>
     *查询此uuid对应的DC2相关的SG
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public java.lang.String getDc2Uuid() {
      java.lang.Object ref = dc2Uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dc2Uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *查询此uuid对应的DC2相关的SG
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDc2UuidBytes() {
      java.lang.Object ref = dc2Uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dc2Uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *查询此uuid对应的DC2相关的SG
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public Builder setDc2Uuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dc2Uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询此uuid对应的DC2相关的SG
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public Builder clearDc2Uuid() {
      
      dc2Uuid_ = getDefaultInstance().getDc2Uuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询此uuid对应的DC2相关的SG
     * </pre>
     *
     * <code>string dc2Uuid = 3;</code>
     */
    public Builder setDc2UuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dc2Uuid_ = value;
      onChanged();
      return this;
    }

    private boolean dc2Exclude_ ;
    /**
     * <pre>
     *与dc2Uuid配合使用，不传或传false，表示查询此DC2所绑定的SG列表，传true表示查询此DC2未绑定的SG列表
     * </pre>
     *
     * <code>bool dc2Exclude = 4;</code>
     */
    public boolean getDc2Exclude() {
      return dc2Exclude_;
    }
    /**
     * <pre>
     *与dc2Uuid配合使用，不传或传false，表示查询此DC2所绑定的SG列表，传true表示查询此DC2未绑定的SG列表
     * </pre>
     *
     * <code>bool dc2Exclude = 4;</code>
     */
    public Builder setDc2Exclude(boolean value) {
      
      dc2Exclude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *与dc2Uuid配合使用，不传或传false，表示查询此DC2所绑定的SG列表，传true表示查询此DC2未绑定的SG列表
     * </pre>
     *
     * <code>bool dc2Exclude = 4;</code>
     */
    public Builder clearDc2Exclude() {
      
      dc2Exclude_ = false;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.ListSgCondition)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.ListSgCondition)
  private static final com.didiyun.compute.v1.ListSgCondition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.ListSgCondition();
  }

  public static com.didiyun.compute.v1.ListSgCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSgCondition>
      PARSER = new com.google.protobuf.AbstractParser<ListSgCondition>() {
    @java.lang.Override
    public ListSgCondition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListSgCondition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListSgCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSgCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.ListSgCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

