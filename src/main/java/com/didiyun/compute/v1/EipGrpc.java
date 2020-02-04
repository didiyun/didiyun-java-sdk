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
    comments = "Source: compute/v1/eip.proto")
public final class EipGrpc {

  private EipGrpc() {}

  public static final String SERVICE_NAME = "didi.cloud.compute.v1.Eip";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListEipRequest,
      com.didiyun.compute.v1.ListEipResponse> getListEipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEip",
      requestType = com.didiyun.compute.v1.ListEipRequest.class,
      responseType = com.didiyun.compute.v1.ListEipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListEipRequest,
      com.didiyun.compute.v1.ListEipResponse> getListEipMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListEipRequest, com.didiyun.compute.v1.ListEipResponse> getListEipMethod;
    if ((getListEipMethod = EipGrpc.getListEipMethod) == null) {
      synchronized (EipGrpc.class) {
        if ((getListEipMethod = EipGrpc.getListEipMethod) == null) {
          EipGrpc.getListEipMethod = getListEipMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListEipRequest, com.didiyun.compute.v1.ListEipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Eip", "ListEip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListEipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListEipResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EipMethodDescriptorSupplier("ListEip"))
                  .build();
          }
        }
     }
     return getListEipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEipTotalCntRequest,
      com.didiyun.compute.v1.GetEipTotalCntResponse> getGetEipTotalCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEipTotalCnt",
      requestType = com.didiyun.compute.v1.GetEipTotalCntRequest.class,
      responseType = com.didiyun.compute.v1.GetEipTotalCntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEipTotalCntRequest,
      com.didiyun.compute.v1.GetEipTotalCntResponse> getGetEipTotalCntMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEipTotalCntRequest, com.didiyun.compute.v1.GetEipTotalCntResponse> getGetEipTotalCntMethod;
    if ((getGetEipTotalCntMethod = EipGrpc.getGetEipTotalCntMethod) == null) {
      synchronized (EipGrpc.class) {
        if ((getGetEipTotalCntMethod = EipGrpc.getGetEipTotalCntMethod) == null) {
          EipGrpc.getGetEipTotalCntMethod = getGetEipTotalCntMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetEipTotalCntRequest, com.didiyun.compute.v1.GetEipTotalCntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Eip", "GetEipTotalCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetEipTotalCntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetEipTotalCntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EipMethodDescriptorSupplier("GetEipTotalCnt"))
                  .build();
          }
        }
     }
     return getGetEipTotalCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEipByUuidRequest,
      com.didiyun.compute.v1.GetEipByUuidResponse> getGetEipByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEipByUuid",
      requestType = com.didiyun.compute.v1.GetEipByUuidRequest.class,
      responseType = com.didiyun.compute.v1.GetEipByUuidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEipByUuidRequest,
      com.didiyun.compute.v1.GetEipByUuidResponse> getGetEipByUuidMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEipByUuidRequest, com.didiyun.compute.v1.GetEipByUuidResponse> getGetEipByUuidMethod;
    if ((getGetEipByUuidMethod = EipGrpc.getGetEipByUuidMethod) == null) {
      synchronized (EipGrpc.class) {
        if ((getGetEipByUuidMethod = EipGrpc.getGetEipByUuidMethod) == null) {
          EipGrpc.getGetEipByUuidMethod = getGetEipByUuidMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetEipByUuidRequest, com.didiyun.compute.v1.GetEipByUuidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Eip", "GetEipByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetEipByUuidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetEipByUuidResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EipMethodDescriptorSupplier("GetEipByUuid"))
                  .build();
          }
        }
     }
     return getGetEipByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateEipRequest,
      com.didiyun.compute.v1.CreateEipResponse> getCreateEipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEip",
      requestType = com.didiyun.compute.v1.CreateEipRequest.class,
      responseType = com.didiyun.compute.v1.CreateEipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateEipRequest,
      com.didiyun.compute.v1.CreateEipResponse> getCreateEipMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateEipRequest, com.didiyun.compute.v1.CreateEipResponse> getCreateEipMethod;
    if ((getCreateEipMethod = EipGrpc.getCreateEipMethod) == null) {
      synchronized (EipGrpc.class) {
        if ((getCreateEipMethod = EipGrpc.getCreateEipMethod) == null) {
          EipGrpc.getCreateEipMethod = getCreateEipMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateEipRequest, com.didiyun.compute.v1.CreateEipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Eip", "CreateEip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateEipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateEipResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EipMethodDescriptorSupplier("CreateEip"))
                  .build();
          }
        }
     }
     return getCreateEipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeEipBandwidthRequest,
      com.didiyun.compute.v1.ChangeEipBandwidthResponse> getChangeEipBandwidthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeEipBandwidth",
      requestType = com.didiyun.compute.v1.ChangeEipBandwidthRequest.class,
      responseType = com.didiyun.compute.v1.ChangeEipBandwidthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeEipBandwidthRequest,
      com.didiyun.compute.v1.ChangeEipBandwidthResponse> getChangeEipBandwidthMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeEipBandwidthRequest, com.didiyun.compute.v1.ChangeEipBandwidthResponse> getChangeEipBandwidthMethod;
    if ((getChangeEipBandwidthMethod = EipGrpc.getChangeEipBandwidthMethod) == null) {
      synchronized (EipGrpc.class) {
        if ((getChangeEipBandwidthMethod = EipGrpc.getChangeEipBandwidthMethod) == null) {
          EipGrpc.getChangeEipBandwidthMethod = getChangeEipBandwidthMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeEipBandwidthRequest, com.didiyun.compute.v1.ChangeEipBandwidthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Eip", "ChangeEipBandwidth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeEipBandwidthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeEipBandwidthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EipMethodDescriptorSupplier("ChangeEipBandwidth"))
                  .build();
          }
        }
     }
     return getChangeEipBandwidthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteEipRequest,
      com.didiyun.compute.v1.DeleteEipResponse> getDeleteEipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEip",
      requestType = com.didiyun.compute.v1.DeleteEipRequest.class,
      responseType = com.didiyun.compute.v1.DeleteEipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteEipRequest,
      com.didiyun.compute.v1.DeleteEipResponse> getDeleteEipMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteEipRequest, com.didiyun.compute.v1.DeleteEipResponse> getDeleteEipMethod;
    if ((getDeleteEipMethod = EipGrpc.getDeleteEipMethod) == null) {
      synchronized (EipGrpc.class) {
        if ((getDeleteEipMethod = EipGrpc.getDeleteEipMethod) == null) {
          EipGrpc.getDeleteEipMethod = getDeleteEipMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DeleteEipRequest, com.didiyun.compute.v1.DeleteEipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Eip", "DeleteEip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteEipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteEipResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EipMethodDescriptorSupplier("DeleteEip"))
                  .build();
          }
        }
     }
     return getDeleteEipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ExpungeEipRequest,
      com.didiyun.compute.v1.ExpungeEipResponse> getExpungeEipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExpungeEip",
      requestType = com.didiyun.compute.v1.ExpungeEipRequest.class,
      responseType = com.didiyun.compute.v1.ExpungeEipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ExpungeEipRequest,
      com.didiyun.compute.v1.ExpungeEipResponse> getExpungeEipMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ExpungeEipRequest, com.didiyun.compute.v1.ExpungeEipResponse> getExpungeEipMethod;
    if ((getExpungeEipMethod = EipGrpc.getExpungeEipMethod) == null) {
      synchronized (EipGrpc.class) {
        if ((getExpungeEipMethod = EipGrpc.getExpungeEipMethod) == null) {
          EipGrpc.getExpungeEipMethod = getExpungeEipMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ExpungeEipRequest, com.didiyun.compute.v1.ExpungeEipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Eip", "ExpungeEip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ExpungeEipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ExpungeEipResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EipMethodDescriptorSupplier("ExpungeEip"))
                  .build();
          }
        }
     }
     return getExpungeEipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.AttachEipToDc2Request,
      com.didiyun.compute.v1.AttachEipToDc2Response> getAttachEipToDc2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttachEipToDc2",
      requestType = com.didiyun.compute.v1.AttachEipToDc2Request.class,
      responseType = com.didiyun.compute.v1.AttachEipToDc2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.AttachEipToDc2Request,
      com.didiyun.compute.v1.AttachEipToDc2Response> getAttachEipToDc2Method() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.AttachEipToDc2Request, com.didiyun.compute.v1.AttachEipToDc2Response> getAttachEipToDc2Method;
    if ((getAttachEipToDc2Method = EipGrpc.getAttachEipToDc2Method) == null) {
      synchronized (EipGrpc.class) {
        if ((getAttachEipToDc2Method = EipGrpc.getAttachEipToDc2Method) == null) {
          EipGrpc.getAttachEipToDc2Method = getAttachEipToDc2Method = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.AttachEipToDc2Request, com.didiyun.compute.v1.AttachEipToDc2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Eip", "AttachEipToDc2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.AttachEipToDc2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.AttachEipToDc2Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EipMethodDescriptorSupplier("AttachEipToDc2"))
                  .build();
          }
        }
     }
     return getAttachEipToDc2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DetachEipFromDc2Request,
      com.didiyun.compute.v1.DetachEipFromDc2Response> getDetachEipFromDc2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetachEipFromDc2",
      requestType = com.didiyun.compute.v1.DetachEipFromDc2Request.class,
      responseType = com.didiyun.compute.v1.DetachEipFromDc2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DetachEipFromDc2Request,
      com.didiyun.compute.v1.DetachEipFromDc2Response> getDetachEipFromDc2Method() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DetachEipFromDc2Request, com.didiyun.compute.v1.DetachEipFromDc2Response> getDetachEipFromDc2Method;
    if ((getDetachEipFromDc2Method = EipGrpc.getDetachEipFromDc2Method) == null) {
      synchronized (EipGrpc.class) {
        if ((getDetachEipFromDc2Method = EipGrpc.getDetachEipFromDc2Method) == null) {
          EipGrpc.getDetachEipFromDc2Method = getDetachEipFromDc2Method = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DetachEipFromDc2Request, com.didiyun.compute.v1.DetachEipFromDc2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Eip", "DetachEipFromDc2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DetachEipFromDc2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DetachEipFromDc2Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EipMethodDescriptorSupplier("DetachEipFromDc2"))
                  .build();
          }
        }
     }
     return getDetachEipFromDc2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EipStub newStub(io.grpc.Channel channel) {
    return new EipStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EipBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EipBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EipFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EipFutureStub(channel);
  }

  /**
   */
  public static abstract class EipImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取eip列表
     * </pre>
     */
    public void listEip(com.didiyun.compute.v1.ListEipRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListEipResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListEipMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取eip数量
     * </pre>
     */
    public void getEipTotalCnt(com.didiyun.compute.v1.GetEipTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEipTotalCntResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEipTotalCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取eip
     * </pre>
     */
    public void getEipByUuid(com.didiyun.compute.v1.GetEipByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEipByUuidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEipByUuidMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建eip
     * </pre>
     */
    public void createEip(com.didiyun.compute.v1.CreateEipRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateEipResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEipMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更改eip带宽
     * </pre>
     */
    public void changeEipBandwidth(com.didiyun.compute.v1.ChangeEipBandwidthRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeEipBandwidthResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeEipBandwidthMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除eip
     * </pre>
     */
    public void deleteEip(com.didiyun.compute.v1.DeleteEipRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteEipResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEipMethod(), responseObserver);
    }

    /**
     * <pre>
     * 销毁eip
     * </pre>
     */
    public void expungeEip(com.didiyun.compute.v1.ExpungeEipRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ExpungeEipResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExpungeEipMethod(), responseObserver);
    }

    /**
     * <pre>
     * 绑定eip到dc2
     * </pre>
     */
    public void attachEipToDc2(com.didiyun.compute.v1.AttachEipToDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.AttachEipToDc2Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAttachEipToDc2Method(), responseObserver);
    }

    /**
     * <pre>
     * 从dc2解绑eip
     * </pre>
     */
    public void detachEipFromDc2(com.didiyun.compute.v1.DetachEipFromDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DetachEipFromDc2Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDetachEipFromDc2Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListEipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListEipRequest,
                com.didiyun.compute.v1.ListEipResponse>(
                  this, METHODID_LIST_EIP)))
          .addMethod(
            getGetEipTotalCntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetEipTotalCntRequest,
                com.didiyun.compute.v1.GetEipTotalCntResponse>(
                  this, METHODID_GET_EIP_TOTAL_CNT)))
          .addMethod(
            getGetEipByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetEipByUuidRequest,
                com.didiyun.compute.v1.GetEipByUuidResponse>(
                  this, METHODID_GET_EIP_BY_UUID)))
          .addMethod(
            getCreateEipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateEipRequest,
                com.didiyun.compute.v1.CreateEipResponse>(
                  this, METHODID_CREATE_EIP)))
          .addMethod(
            getChangeEipBandwidthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeEipBandwidthRequest,
                com.didiyun.compute.v1.ChangeEipBandwidthResponse>(
                  this, METHODID_CHANGE_EIP_BANDWIDTH)))
          .addMethod(
            getDeleteEipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DeleteEipRequest,
                com.didiyun.compute.v1.DeleteEipResponse>(
                  this, METHODID_DELETE_EIP)))
          .addMethod(
            getExpungeEipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ExpungeEipRequest,
                com.didiyun.compute.v1.ExpungeEipResponse>(
                  this, METHODID_EXPUNGE_EIP)))
          .addMethod(
            getAttachEipToDc2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.AttachEipToDc2Request,
                com.didiyun.compute.v1.AttachEipToDc2Response>(
                  this, METHODID_ATTACH_EIP_TO_DC2)))
          .addMethod(
            getDetachEipFromDc2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DetachEipFromDc2Request,
                com.didiyun.compute.v1.DetachEipFromDc2Response>(
                  this, METHODID_DETACH_EIP_FROM_DC2)))
          .build();
    }
  }

  /**
   */
  public static final class EipStub extends io.grpc.stub.AbstractStub<EipStub> {
    private EipStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EipStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EipStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EipStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取eip列表
     * </pre>
     */
    public void listEip(com.didiyun.compute.v1.ListEipRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListEipResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListEipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取eip数量
     * </pre>
     */
    public void getEipTotalCnt(com.didiyun.compute.v1.GetEipTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEipTotalCntResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEipTotalCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取eip
     * </pre>
     */
    public void getEipByUuid(com.didiyun.compute.v1.GetEipByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEipByUuidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEipByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建eip
     * </pre>
     */
    public void createEip(com.didiyun.compute.v1.CreateEipRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateEipResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更改eip带宽
     * </pre>
     */
    public void changeEipBandwidth(com.didiyun.compute.v1.ChangeEipBandwidthRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeEipBandwidthResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeEipBandwidthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除eip
     * </pre>
     */
    public void deleteEip(com.didiyun.compute.v1.DeleteEipRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteEipResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 销毁eip
     * </pre>
     */
    public void expungeEip(com.didiyun.compute.v1.ExpungeEipRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ExpungeEipResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExpungeEipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 绑定eip到dc2
     * </pre>
     */
    public void attachEipToDc2(com.didiyun.compute.v1.AttachEipToDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.AttachEipToDc2Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAttachEipToDc2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 从dc2解绑eip
     * </pre>
     */
    public void detachEipFromDc2(com.didiyun.compute.v1.DetachEipFromDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DetachEipFromDc2Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetachEipFromDc2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EipBlockingStub extends io.grpc.stub.AbstractStub<EipBlockingStub> {
    private EipBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EipBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EipBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EipBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取eip列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListEipResponse listEip(com.didiyun.compute.v1.ListEipRequest request) {
      return blockingUnaryCall(
          getChannel(), getListEipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取eip数量
     * </pre>
     */
    public com.didiyun.compute.v1.GetEipTotalCntResponse getEipTotalCnt(com.didiyun.compute.v1.GetEipTotalCntRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEipTotalCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据uuid获取eip
     * </pre>
     */
    public com.didiyun.compute.v1.GetEipByUuidResponse getEipByUuid(com.didiyun.compute.v1.GetEipByUuidRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEipByUuidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建eip
     * </pre>
     */
    public com.didiyun.compute.v1.CreateEipResponse createEip(com.didiyun.compute.v1.CreateEipRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更改eip带宽
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeEipBandwidthResponse changeEipBandwidth(com.didiyun.compute.v1.ChangeEipBandwidthRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeEipBandwidthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除eip
     * </pre>
     */
    public com.didiyun.compute.v1.DeleteEipResponse deleteEip(com.didiyun.compute.v1.DeleteEipRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 销毁eip
     * </pre>
     */
    public com.didiyun.compute.v1.ExpungeEipResponse expungeEip(com.didiyun.compute.v1.ExpungeEipRequest request) {
      return blockingUnaryCall(
          getChannel(), getExpungeEipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 绑定eip到dc2
     * </pre>
     */
    public com.didiyun.compute.v1.AttachEipToDc2Response attachEipToDc2(com.didiyun.compute.v1.AttachEipToDc2Request request) {
      return blockingUnaryCall(
          getChannel(), getAttachEipToDc2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 从dc2解绑eip
     * </pre>
     */
    public com.didiyun.compute.v1.DetachEipFromDc2Response detachEipFromDc2(com.didiyun.compute.v1.DetachEipFromDc2Request request) {
      return blockingUnaryCall(
          getChannel(), getDetachEipFromDc2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EipFutureStub extends io.grpc.stub.AbstractStub<EipFutureStub> {
    private EipFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EipFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EipFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EipFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取eip列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListEipResponse> listEip(
        com.didiyun.compute.v1.ListEipRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListEipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取eip数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetEipTotalCntResponse> getEipTotalCnt(
        com.didiyun.compute.v1.GetEipTotalCntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEipTotalCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据uuid获取eip
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetEipByUuidResponse> getEipByUuid(
        com.didiyun.compute.v1.GetEipByUuidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEipByUuidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建eip
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateEipResponse> createEip(
        com.didiyun.compute.v1.CreateEipRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更改eip带宽
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeEipBandwidthResponse> changeEipBandwidth(
        com.didiyun.compute.v1.ChangeEipBandwidthRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeEipBandwidthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除eip
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DeleteEipResponse> deleteEip(
        com.didiyun.compute.v1.DeleteEipRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 销毁eip
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ExpungeEipResponse> expungeEip(
        com.didiyun.compute.v1.ExpungeEipRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExpungeEipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 绑定eip到dc2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.AttachEipToDc2Response> attachEipToDc2(
        com.didiyun.compute.v1.AttachEipToDc2Request request) {
      return futureUnaryCall(
          getChannel().newCall(getAttachEipToDc2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 从dc2解绑eip
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DetachEipFromDc2Response> detachEipFromDc2(
        com.didiyun.compute.v1.DetachEipFromDc2Request request) {
      return futureUnaryCall(
          getChannel().newCall(getDetachEipFromDc2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_EIP = 0;
  private static final int METHODID_GET_EIP_TOTAL_CNT = 1;
  private static final int METHODID_GET_EIP_BY_UUID = 2;
  private static final int METHODID_CREATE_EIP = 3;
  private static final int METHODID_CHANGE_EIP_BANDWIDTH = 4;
  private static final int METHODID_DELETE_EIP = 5;
  private static final int METHODID_EXPUNGE_EIP = 6;
  private static final int METHODID_ATTACH_EIP_TO_DC2 = 7;
  private static final int METHODID_DETACH_EIP_FROM_DC2 = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EipImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EipImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_EIP:
          serviceImpl.listEip((com.didiyun.compute.v1.ListEipRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListEipResponse>) responseObserver);
          break;
        case METHODID_GET_EIP_TOTAL_CNT:
          serviceImpl.getEipTotalCnt((com.didiyun.compute.v1.GetEipTotalCntRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEipTotalCntResponse>) responseObserver);
          break;
        case METHODID_GET_EIP_BY_UUID:
          serviceImpl.getEipByUuid((com.didiyun.compute.v1.GetEipByUuidRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEipByUuidResponse>) responseObserver);
          break;
        case METHODID_CREATE_EIP:
          serviceImpl.createEip((com.didiyun.compute.v1.CreateEipRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateEipResponse>) responseObserver);
          break;
        case METHODID_CHANGE_EIP_BANDWIDTH:
          serviceImpl.changeEipBandwidth((com.didiyun.compute.v1.ChangeEipBandwidthRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeEipBandwidthResponse>) responseObserver);
          break;
        case METHODID_DELETE_EIP:
          serviceImpl.deleteEip((com.didiyun.compute.v1.DeleteEipRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteEipResponse>) responseObserver);
          break;
        case METHODID_EXPUNGE_EIP:
          serviceImpl.expungeEip((com.didiyun.compute.v1.ExpungeEipRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ExpungeEipResponse>) responseObserver);
          break;
        case METHODID_ATTACH_EIP_TO_DC2:
          serviceImpl.attachEipToDc2((com.didiyun.compute.v1.AttachEipToDc2Request) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.AttachEipToDc2Response>) responseObserver);
          break;
        case METHODID_DETACH_EIP_FROM_DC2:
          serviceImpl.detachEipFromDc2((com.didiyun.compute.v1.DetachEipFromDc2Request) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DetachEipFromDc2Response>) responseObserver);
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

  private static abstract class EipBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EipBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.compute.v1.EipOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Eip");
    }
  }

  private static final class EipFileDescriptorSupplier
      extends EipBaseDescriptorSupplier {
    EipFileDescriptorSupplier() {}
  }

  private static final class EipMethodDescriptorSupplier
      extends EipBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EipMethodDescriptorSupplier(String methodName) {
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
      synchronized (EipGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EipFileDescriptorSupplier())
              .addMethod(getListEipMethod())
              .addMethod(getGetEipTotalCntMethod())
              .addMethod(getGetEipByUuidMethod())
              .addMethod(getCreateEipMethod())
              .addMethod(getChangeEipBandwidthMethod())
              .addMethod(getDeleteEipMethod())
              .addMethod(getExpungeEipMethod())
              .addMethod(getAttachEipToDc2Method())
              .addMethod(getDetachEipFromDc2Method())
              .build();
        }
      }
    }
    return result;
  }
}
