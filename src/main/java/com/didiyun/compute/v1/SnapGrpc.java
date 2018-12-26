package com.didiyun.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: compute/v1/snap.proto")
public final class SnapGrpc {

  private SnapGrpc() {}

  public static final String SERVICE_NAME = "didi.cloud.compute.v1.Snap";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSnapshotRequest,
      com.didiyun.compute.v1.ListSnapshotResponse> getListSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSnapshot",
      requestType = com.didiyun.compute.v1.ListSnapshotRequest.class,
      responseType = com.didiyun.compute.v1.ListSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSnapshotRequest,
      com.didiyun.compute.v1.ListSnapshotResponse> getListSnapshotMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSnapshotRequest, com.didiyun.compute.v1.ListSnapshotResponse> getListSnapshotMethod;
    if ((getListSnapshotMethod = SnapGrpc.getListSnapshotMethod) == null) {
      synchronized (SnapGrpc.class) {
        if ((getListSnapshotMethod = SnapGrpc.getListSnapshotMethod) == null) {
          SnapGrpc.getListSnapshotMethod = getListSnapshotMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListSnapshotRequest, com.didiyun.compute.v1.ListSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Snap", "ListSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSnapshotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SnapMethodDescriptorSupplier("ListSnapshot"))
                  .build();
          }
        }
     }
     return getListSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSnapshotTotalCntRequest,
      com.didiyun.compute.v1.GetSnapshotTotalCntResponse> getGetSnapshotTotalCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSnapshotTotalCnt",
      requestType = com.didiyun.compute.v1.GetSnapshotTotalCntRequest.class,
      responseType = com.didiyun.compute.v1.GetSnapshotTotalCntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSnapshotTotalCntRequest,
      com.didiyun.compute.v1.GetSnapshotTotalCntResponse> getGetSnapshotTotalCntMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSnapshotTotalCntRequest, com.didiyun.compute.v1.GetSnapshotTotalCntResponse> getGetSnapshotTotalCntMethod;
    if ((getGetSnapshotTotalCntMethod = SnapGrpc.getGetSnapshotTotalCntMethod) == null) {
      synchronized (SnapGrpc.class) {
        if ((getGetSnapshotTotalCntMethod = SnapGrpc.getGetSnapshotTotalCntMethod) == null) {
          SnapGrpc.getGetSnapshotTotalCntMethod = getGetSnapshotTotalCntMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetSnapshotTotalCntRequest, com.didiyun.compute.v1.GetSnapshotTotalCntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Snap", "GetSnapshotTotalCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSnapshotTotalCntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSnapshotTotalCntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SnapMethodDescriptorSupplier("GetSnapshotTotalCnt"))
                  .build();
          }
        }
     }
     return getGetSnapshotTotalCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSnapshotRequest,
      com.didiyun.compute.v1.CreateSnapshotResponse> getCreateSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSnapshot",
      requestType = com.didiyun.compute.v1.CreateSnapshotRequest.class,
      responseType = com.didiyun.compute.v1.CreateSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSnapshotRequest,
      com.didiyun.compute.v1.CreateSnapshotResponse> getCreateSnapshotMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSnapshotRequest, com.didiyun.compute.v1.CreateSnapshotResponse> getCreateSnapshotMethod;
    if ((getCreateSnapshotMethod = SnapGrpc.getCreateSnapshotMethod) == null) {
      synchronized (SnapGrpc.class) {
        if ((getCreateSnapshotMethod = SnapGrpc.getCreateSnapshotMethod) == null) {
          SnapGrpc.getCreateSnapshotMethod = getCreateSnapshotMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateSnapshotRequest, com.didiyun.compute.v1.CreateSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Snap", "CreateSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSnapshotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SnapMethodDescriptorSupplier("CreateSnapshot"))
                  .build();
          }
        }
     }
     return getCreateSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSnapshotRequest,
      com.didiyun.compute.v1.DeleteSnapshotResponse> getDeleteSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSnapshot",
      requestType = com.didiyun.compute.v1.DeleteSnapshotRequest.class,
      responseType = com.didiyun.compute.v1.DeleteSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSnapshotRequest,
      com.didiyun.compute.v1.DeleteSnapshotResponse> getDeleteSnapshotMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSnapshotRequest, com.didiyun.compute.v1.DeleteSnapshotResponse> getDeleteSnapshotMethod;
    if ((getDeleteSnapshotMethod = SnapGrpc.getDeleteSnapshotMethod) == null) {
      synchronized (SnapGrpc.class) {
        if ((getDeleteSnapshotMethod = SnapGrpc.getDeleteSnapshotMethod) == null) {
          SnapGrpc.getDeleteSnapshotMethod = getDeleteSnapshotMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DeleteSnapshotRequest, com.didiyun.compute.v1.DeleteSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Snap", "DeleteSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSnapshotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SnapMethodDescriptorSupplier("DeleteSnapshot"))
                  .build();
          }
        }
     }
     return getDeleteSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.RevertSnapshotRequest,
      com.didiyun.compute.v1.RevertSnapshotResponse> getRevertSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevertSnapshot",
      requestType = com.didiyun.compute.v1.RevertSnapshotRequest.class,
      responseType = com.didiyun.compute.v1.RevertSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.RevertSnapshotRequest,
      com.didiyun.compute.v1.RevertSnapshotResponse> getRevertSnapshotMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.RevertSnapshotRequest, com.didiyun.compute.v1.RevertSnapshotResponse> getRevertSnapshotMethod;
    if ((getRevertSnapshotMethod = SnapGrpc.getRevertSnapshotMethod) == null) {
      synchronized (SnapGrpc.class) {
        if ((getRevertSnapshotMethod = SnapGrpc.getRevertSnapshotMethod) == null) {
          SnapGrpc.getRevertSnapshotMethod = getRevertSnapshotMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.RevertSnapshotRequest, com.didiyun.compute.v1.RevertSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Snap", "RevertSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.RevertSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.RevertSnapshotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SnapMethodDescriptorSupplier("RevertSnapshot"))
                  .build();
          }
        }
     }
     return getRevertSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeSnapshotNameRequest,
      com.didiyun.compute.v1.ChangeSnapshotNameResponse> getChangeSnapshotNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeSnapshotName",
      requestType = com.didiyun.compute.v1.ChangeSnapshotNameRequest.class,
      responseType = com.didiyun.compute.v1.ChangeSnapshotNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeSnapshotNameRequest,
      com.didiyun.compute.v1.ChangeSnapshotNameResponse> getChangeSnapshotNameMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeSnapshotNameRequest, com.didiyun.compute.v1.ChangeSnapshotNameResponse> getChangeSnapshotNameMethod;
    if ((getChangeSnapshotNameMethod = SnapGrpc.getChangeSnapshotNameMethod) == null) {
      synchronized (SnapGrpc.class) {
        if ((getChangeSnapshotNameMethod = SnapGrpc.getChangeSnapshotNameMethod) == null) {
          SnapGrpc.getChangeSnapshotNameMethod = getChangeSnapshotNameMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeSnapshotNameRequest, com.didiyun.compute.v1.ChangeSnapshotNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Snap", "ChangeSnapshotName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeSnapshotNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeSnapshotNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SnapMethodDescriptorSupplier("ChangeSnapshotName"))
                  .build();
          }
        }
     }
     return getChangeSnapshotNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SnapStub newStub(io.grpc.Channel channel) {
    return new SnapStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SnapBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SnapBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SnapFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SnapFutureStub(channel);
  }

  /**
   */
  public static abstract class SnapImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取snap列表
     * </pre>
     */
    public void listSnapshot(com.didiyun.compute.v1.ListSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取snap数量
     * </pre>
     */
    public void getSnapshotTotalCnt(com.didiyun.compute.v1.GetSnapshotTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSnapshotTotalCntResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSnapshotTotalCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建snap
     * </pre>
     */
    public void createSnapshot(com.didiyun.compute.v1.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除snap
     * </pre>
     */
    public void deleteSnapshot(com.didiyun.compute.v1.DeleteSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * 还原snap
     * </pre>
     */
    public void revertSnapshot(com.didiyun.compute.v1.RevertSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.RevertSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRevertSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * 改名snap
     * </pre>
     */
    public void changeSnapshotName(com.didiyun.compute.v1.ChangeSnapshotNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeSnapshotNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeSnapshotNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListSnapshotRequest,
                com.didiyun.compute.v1.ListSnapshotResponse>(
                  this, METHODID_LIST_SNAPSHOT)))
          .addMethod(
            getGetSnapshotTotalCntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetSnapshotTotalCntRequest,
                com.didiyun.compute.v1.GetSnapshotTotalCntResponse>(
                  this, METHODID_GET_SNAPSHOT_TOTAL_CNT)))
          .addMethod(
            getCreateSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateSnapshotRequest,
                com.didiyun.compute.v1.CreateSnapshotResponse>(
                  this, METHODID_CREATE_SNAPSHOT)))
          .addMethod(
            getDeleteSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DeleteSnapshotRequest,
                com.didiyun.compute.v1.DeleteSnapshotResponse>(
                  this, METHODID_DELETE_SNAPSHOT)))
          .addMethod(
            getRevertSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.RevertSnapshotRequest,
                com.didiyun.compute.v1.RevertSnapshotResponse>(
                  this, METHODID_REVERT_SNAPSHOT)))
          .addMethod(
            getChangeSnapshotNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeSnapshotNameRequest,
                com.didiyun.compute.v1.ChangeSnapshotNameResponse>(
                  this, METHODID_CHANGE_SNAPSHOT_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class SnapStub extends io.grpc.stub.AbstractStub<SnapStub> {
    private SnapStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnapStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnapStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取snap列表
     * </pre>
     */
    public void listSnapshot(com.didiyun.compute.v1.ListSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取snap数量
     * </pre>
     */
    public void getSnapshotTotalCnt(com.didiyun.compute.v1.GetSnapshotTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSnapshotTotalCntResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSnapshotTotalCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建snap
     * </pre>
     */
    public void createSnapshot(com.didiyun.compute.v1.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除snap
     * </pre>
     */
    public void deleteSnapshot(com.didiyun.compute.v1.DeleteSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 还原snap
     * </pre>
     */
    public void revertSnapshot(com.didiyun.compute.v1.RevertSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.RevertSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevertSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 改名snap
     * </pre>
     */
    public void changeSnapshotName(com.didiyun.compute.v1.ChangeSnapshotNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeSnapshotNameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeSnapshotNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SnapBlockingStub extends io.grpc.stub.AbstractStub<SnapBlockingStub> {
    private SnapBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnapBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnapBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取snap列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListSnapshotResponse listSnapshot(com.didiyun.compute.v1.ListSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取snap数量
     * </pre>
     */
    public com.didiyun.compute.v1.GetSnapshotTotalCntResponse getSnapshotTotalCnt(com.didiyun.compute.v1.GetSnapshotTotalCntRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSnapshotTotalCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建snap
     * </pre>
     */
    public com.didiyun.compute.v1.CreateSnapshotResponse createSnapshot(com.didiyun.compute.v1.CreateSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除snap
     * </pre>
     */
    public com.didiyun.compute.v1.DeleteSnapshotResponse deleteSnapshot(com.didiyun.compute.v1.DeleteSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 还原snap
     * </pre>
     */
    public com.didiyun.compute.v1.RevertSnapshotResponse revertSnapshot(com.didiyun.compute.v1.RevertSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getRevertSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 改名snap
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeSnapshotNameResponse changeSnapshotName(com.didiyun.compute.v1.ChangeSnapshotNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeSnapshotNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SnapFutureStub extends io.grpc.stub.AbstractStub<SnapFutureStub> {
    private SnapFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnapFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnapFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取snap列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListSnapshotResponse> listSnapshot(
        com.didiyun.compute.v1.ListSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取snap数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetSnapshotTotalCntResponse> getSnapshotTotalCnt(
        com.didiyun.compute.v1.GetSnapshotTotalCntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSnapshotTotalCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建snap
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateSnapshotResponse> createSnapshot(
        com.didiyun.compute.v1.CreateSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除snap
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DeleteSnapshotResponse> deleteSnapshot(
        com.didiyun.compute.v1.DeleteSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 还原snap
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.RevertSnapshotResponse> revertSnapshot(
        com.didiyun.compute.v1.RevertSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRevertSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 改名snap
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeSnapshotNameResponse> changeSnapshotName(
        com.didiyun.compute.v1.ChangeSnapshotNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeSnapshotNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SNAPSHOT = 0;
  private static final int METHODID_GET_SNAPSHOT_TOTAL_CNT = 1;
  private static final int METHODID_CREATE_SNAPSHOT = 2;
  private static final int METHODID_DELETE_SNAPSHOT = 3;
  private static final int METHODID_REVERT_SNAPSHOT = 4;
  private static final int METHODID_CHANGE_SNAPSHOT_NAME = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SnapImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SnapImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SNAPSHOT:
          serviceImpl.listSnapshot((com.didiyun.compute.v1.ListSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_SNAPSHOT_TOTAL_CNT:
          serviceImpl.getSnapshotTotalCnt((com.didiyun.compute.v1.GetSnapshotTotalCntRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSnapshotTotalCntResponse>) responseObserver);
          break;
        case METHODID_CREATE_SNAPSHOT:
          serviceImpl.createSnapshot((com.didiyun.compute.v1.CreateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSnapshotResponse>) responseObserver);
          break;
        case METHODID_DELETE_SNAPSHOT:
          serviceImpl.deleteSnapshot((com.didiyun.compute.v1.DeleteSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSnapshotResponse>) responseObserver);
          break;
        case METHODID_REVERT_SNAPSHOT:
          serviceImpl.revertSnapshot((com.didiyun.compute.v1.RevertSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.RevertSnapshotResponse>) responseObserver);
          break;
        case METHODID_CHANGE_SNAPSHOT_NAME:
          serviceImpl.changeSnapshotName((com.didiyun.compute.v1.ChangeSnapshotNameRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeSnapshotNameResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SnapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SnapBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.compute.v1.SnapOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Snap");
    }
  }

  private static final class SnapFileDescriptorSupplier
      extends SnapBaseDescriptorSupplier {
    SnapFileDescriptorSupplier() {}
  }

  private static final class SnapMethodDescriptorSupplier
      extends SnapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SnapMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SnapGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SnapFileDescriptorSupplier())
              .addMethod(getListSnapshotMethod())
              .addMethod(getGetSnapshotTotalCntMethod())
              .addMethod(getCreateSnapshotMethod())
              .addMethod(getDeleteSnapshotMethod())
              .addMethod(getRevertSnapshotMethod())
              .addMethod(getChangeSnapshotNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
