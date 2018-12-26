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
    comments = "Source: compute/v1/ebs.proto")
public final class EbsGrpc {

  private EbsGrpc() {}

  public static final String SERVICE_NAME = "didi.cloud.compute.v1.Ebs";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListEbsRequest,
      com.didiyun.compute.v1.ListEbsResponse> getListEbsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEbs",
      requestType = com.didiyun.compute.v1.ListEbsRequest.class,
      responseType = com.didiyun.compute.v1.ListEbsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListEbsRequest,
      com.didiyun.compute.v1.ListEbsResponse> getListEbsMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListEbsRequest, com.didiyun.compute.v1.ListEbsResponse> getListEbsMethod;
    if ((getListEbsMethod = EbsGrpc.getListEbsMethod) == null) {
      synchronized (EbsGrpc.class) {
        if ((getListEbsMethod = EbsGrpc.getListEbsMethod) == null) {
          EbsGrpc.getListEbsMethod = getListEbsMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListEbsRequest, com.didiyun.compute.v1.ListEbsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Ebs", "ListEbs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListEbsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListEbsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EbsMethodDescriptorSupplier("ListEbs"))
                  .build();
          }
        }
     }
     return getListEbsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEbsByUuidRequest,
      com.didiyun.compute.v1.GetEbsByUuidResponse> getGetEbsByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEbsByUuid",
      requestType = com.didiyun.compute.v1.GetEbsByUuidRequest.class,
      responseType = com.didiyun.compute.v1.GetEbsByUuidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEbsByUuidRequest,
      com.didiyun.compute.v1.GetEbsByUuidResponse> getGetEbsByUuidMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEbsByUuidRequest, com.didiyun.compute.v1.GetEbsByUuidResponse> getGetEbsByUuidMethod;
    if ((getGetEbsByUuidMethod = EbsGrpc.getGetEbsByUuidMethod) == null) {
      synchronized (EbsGrpc.class) {
        if ((getGetEbsByUuidMethod = EbsGrpc.getGetEbsByUuidMethod) == null) {
          EbsGrpc.getGetEbsByUuidMethod = getGetEbsByUuidMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetEbsByUuidRequest, com.didiyun.compute.v1.GetEbsByUuidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Ebs", "GetEbsByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetEbsByUuidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetEbsByUuidResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EbsMethodDescriptorSupplier("GetEbsByUuid"))
                  .build();
          }
        }
     }
     return getGetEbsByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEbsTotalCntRequest,
      com.didiyun.compute.v1.GetEbsTotalCntResponse> getGetEbsTotalCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEbsTotalCnt",
      requestType = com.didiyun.compute.v1.GetEbsTotalCntRequest.class,
      responseType = com.didiyun.compute.v1.GetEbsTotalCntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEbsTotalCntRequest,
      com.didiyun.compute.v1.GetEbsTotalCntResponse> getGetEbsTotalCntMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetEbsTotalCntRequest, com.didiyun.compute.v1.GetEbsTotalCntResponse> getGetEbsTotalCntMethod;
    if ((getGetEbsTotalCntMethod = EbsGrpc.getGetEbsTotalCntMethod) == null) {
      synchronized (EbsGrpc.class) {
        if ((getGetEbsTotalCntMethod = EbsGrpc.getGetEbsTotalCntMethod) == null) {
          EbsGrpc.getGetEbsTotalCntMethod = getGetEbsTotalCntMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetEbsTotalCntRequest, com.didiyun.compute.v1.GetEbsTotalCntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Ebs", "GetEbsTotalCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetEbsTotalCntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetEbsTotalCntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EbsMethodDescriptorSupplier("GetEbsTotalCnt"))
                  .build();
          }
        }
     }
     return getGetEbsTotalCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateEbsRequest,
      com.didiyun.compute.v1.CreateEbsResponse> getCreateEbsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEbs",
      requestType = com.didiyun.compute.v1.CreateEbsRequest.class,
      responseType = com.didiyun.compute.v1.CreateEbsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateEbsRequest,
      com.didiyun.compute.v1.CreateEbsResponse> getCreateEbsMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateEbsRequest, com.didiyun.compute.v1.CreateEbsResponse> getCreateEbsMethod;
    if ((getCreateEbsMethod = EbsGrpc.getCreateEbsMethod) == null) {
      synchronized (EbsGrpc.class) {
        if ((getCreateEbsMethod = EbsGrpc.getCreateEbsMethod) == null) {
          EbsGrpc.getCreateEbsMethod = getCreateEbsMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateEbsRequest, com.didiyun.compute.v1.CreateEbsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Ebs", "CreateEbs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateEbsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateEbsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EbsMethodDescriptorSupplier("CreateEbs"))
                  .build();
          }
        }
     }
     return getCreateEbsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteEbsRequest,
      com.didiyun.compute.v1.DeleteEbsResponse> getDeleteEbsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEbs",
      requestType = com.didiyun.compute.v1.DeleteEbsRequest.class,
      responseType = com.didiyun.compute.v1.DeleteEbsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteEbsRequest,
      com.didiyun.compute.v1.DeleteEbsResponse> getDeleteEbsMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteEbsRequest, com.didiyun.compute.v1.DeleteEbsResponse> getDeleteEbsMethod;
    if ((getDeleteEbsMethod = EbsGrpc.getDeleteEbsMethod) == null) {
      synchronized (EbsGrpc.class) {
        if ((getDeleteEbsMethod = EbsGrpc.getDeleteEbsMethod) == null) {
          EbsGrpc.getDeleteEbsMethod = getDeleteEbsMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DeleteEbsRequest, com.didiyun.compute.v1.DeleteEbsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Ebs", "DeleteEbs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteEbsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteEbsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EbsMethodDescriptorSupplier("DeleteEbs"))
                  .build();
          }
        }
     }
     return getDeleteEbsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.AttachEbsRequest,
      com.didiyun.compute.v1.AttachEbsResponse> getAttachEbsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttachEbs",
      requestType = com.didiyun.compute.v1.AttachEbsRequest.class,
      responseType = com.didiyun.compute.v1.AttachEbsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.AttachEbsRequest,
      com.didiyun.compute.v1.AttachEbsResponse> getAttachEbsMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.AttachEbsRequest, com.didiyun.compute.v1.AttachEbsResponse> getAttachEbsMethod;
    if ((getAttachEbsMethod = EbsGrpc.getAttachEbsMethod) == null) {
      synchronized (EbsGrpc.class) {
        if ((getAttachEbsMethod = EbsGrpc.getAttachEbsMethod) == null) {
          EbsGrpc.getAttachEbsMethod = getAttachEbsMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.AttachEbsRequest, com.didiyun.compute.v1.AttachEbsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Ebs", "AttachEbs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.AttachEbsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.AttachEbsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EbsMethodDescriptorSupplier("AttachEbs"))
                  .build();
          }
        }
     }
     return getAttachEbsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DetachEbsRequest,
      com.didiyun.compute.v1.DetachEbsResponse> getDetachEbsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetachEbs",
      requestType = com.didiyun.compute.v1.DetachEbsRequest.class,
      responseType = com.didiyun.compute.v1.DetachEbsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DetachEbsRequest,
      com.didiyun.compute.v1.DetachEbsResponse> getDetachEbsMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DetachEbsRequest, com.didiyun.compute.v1.DetachEbsResponse> getDetachEbsMethod;
    if ((getDetachEbsMethod = EbsGrpc.getDetachEbsMethod) == null) {
      synchronized (EbsGrpc.class) {
        if ((getDetachEbsMethod = EbsGrpc.getDetachEbsMethod) == null) {
          EbsGrpc.getDetachEbsMethod = getDetachEbsMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DetachEbsRequest, com.didiyun.compute.v1.DetachEbsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Ebs", "DetachEbs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DetachEbsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DetachEbsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EbsMethodDescriptorSupplier("DetachEbs"))
                  .build();
          }
        }
     }
     return getDetachEbsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeEbsSizeRequest,
      com.didiyun.compute.v1.ChangeEbsSizeResponse> getChangeEbsSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeEbsSize",
      requestType = com.didiyun.compute.v1.ChangeEbsSizeRequest.class,
      responseType = com.didiyun.compute.v1.ChangeEbsSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeEbsSizeRequest,
      com.didiyun.compute.v1.ChangeEbsSizeResponse> getChangeEbsSizeMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeEbsSizeRequest, com.didiyun.compute.v1.ChangeEbsSizeResponse> getChangeEbsSizeMethod;
    if ((getChangeEbsSizeMethod = EbsGrpc.getChangeEbsSizeMethod) == null) {
      synchronized (EbsGrpc.class) {
        if ((getChangeEbsSizeMethod = EbsGrpc.getChangeEbsSizeMethod) == null) {
          EbsGrpc.getChangeEbsSizeMethod = getChangeEbsSizeMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeEbsSizeRequest, com.didiyun.compute.v1.ChangeEbsSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Ebs", "ChangeEbsSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeEbsSizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeEbsSizeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EbsMethodDescriptorSupplier("ChangeEbsSize"))
                  .build();
          }
        }
     }
     return getChangeEbsSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeEbsNameRequest,
      com.didiyun.compute.v1.ChangeEbsNameResponse> getChangeEbsNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeEbsName",
      requestType = com.didiyun.compute.v1.ChangeEbsNameRequest.class,
      responseType = com.didiyun.compute.v1.ChangeEbsNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeEbsNameRequest,
      com.didiyun.compute.v1.ChangeEbsNameResponse> getChangeEbsNameMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeEbsNameRequest, com.didiyun.compute.v1.ChangeEbsNameResponse> getChangeEbsNameMethod;
    if ((getChangeEbsNameMethod = EbsGrpc.getChangeEbsNameMethod) == null) {
      synchronized (EbsGrpc.class) {
        if ((getChangeEbsNameMethod = EbsGrpc.getChangeEbsNameMethod) == null) {
          EbsGrpc.getChangeEbsNameMethod = getChangeEbsNameMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeEbsNameRequest, com.didiyun.compute.v1.ChangeEbsNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Ebs", "ChangeEbsName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeEbsNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeEbsNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EbsMethodDescriptorSupplier("ChangeEbsName"))
                  .build();
          }
        }
     }
     return getChangeEbsNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EbsStub newStub(io.grpc.Channel channel) {
    return new EbsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EbsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EbsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EbsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EbsFutureStub(channel);
  }

  /**
   */
  public static abstract class EbsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取EBS列表
     * </pre>
     */
    public void listEbs(com.didiyun.compute.v1.ListEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListEbsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListEbsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取EBS
     * </pre>
     */
    public void getEbsByUuid(com.didiyun.compute.v1.GetEbsByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEbsByUuidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEbsByUuidMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取EBS数量
     * </pre>
     */
    public void getEbsTotalCnt(com.didiyun.compute.v1.GetEbsTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEbsTotalCntResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEbsTotalCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建EBS
     * </pre>
     */
    public void createEbs(com.didiyun.compute.v1.CreateEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateEbsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEbsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除EBS
     * </pre>
     */
    public void deleteEbs(com.didiyun.compute.v1.DeleteEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteEbsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEbsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 绑定EBS
     * </pre>
     */
    public void attachEbs(com.didiyun.compute.v1.AttachEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.AttachEbsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAttachEbsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 解绑EBS
     * </pre>
     */
    public void detachEbs(com.didiyun.compute.v1.DetachEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DetachEbsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDetachEbsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更改EBS大小
     * </pre>
     */
    public void changeEbsSize(com.didiyun.compute.v1.ChangeEbsSizeRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeEbsSizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeEbsSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更改EBS名称
     * </pre>
     */
    public void changeEbsName(com.didiyun.compute.v1.ChangeEbsNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeEbsNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeEbsNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListEbsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListEbsRequest,
                com.didiyun.compute.v1.ListEbsResponse>(
                  this, METHODID_LIST_EBS)))
          .addMethod(
            getGetEbsByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetEbsByUuidRequest,
                com.didiyun.compute.v1.GetEbsByUuidResponse>(
                  this, METHODID_GET_EBS_BY_UUID)))
          .addMethod(
            getGetEbsTotalCntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetEbsTotalCntRequest,
                com.didiyun.compute.v1.GetEbsTotalCntResponse>(
                  this, METHODID_GET_EBS_TOTAL_CNT)))
          .addMethod(
            getCreateEbsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateEbsRequest,
                com.didiyun.compute.v1.CreateEbsResponse>(
                  this, METHODID_CREATE_EBS)))
          .addMethod(
            getDeleteEbsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DeleteEbsRequest,
                com.didiyun.compute.v1.DeleteEbsResponse>(
                  this, METHODID_DELETE_EBS)))
          .addMethod(
            getAttachEbsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.AttachEbsRequest,
                com.didiyun.compute.v1.AttachEbsResponse>(
                  this, METHODID_ATTACH_EBS)))
          .addMethod(
            getDetachEbsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DetachEbsRequest,
                com.didiyun.compute.v1.DetachEbsResponse>(
                  this, METHODID_DETACH_EBS)))
          .addMethod(
            getChangeEbsSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeEbsSizeRequest,
                com.didiyun.compute.v1.ChangeEbsSizeResponse>(
                  this, METHODID_CHANGE_EBS_SIZE)))
          .addMethod(
            getChangeEbsNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeEbsNameRequest,
                com.didiyun.compute.v1.ChangeEbsNameResponse>(
                  this, METHODID_CHANGE_EBS_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class EbsStub extends io.grpc.stub.AbstractStub<EbsStub> {
    private EbsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EbsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EbsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EbsStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取EBS列表
     * </pre>
     */
    public void listEbs(com.didiyun.compute.v1.ListEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListEbsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListEbsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取EBS
     * </pre>
     */
    public void getEbsByUuid(com.didiyun.compute.v1.GetEbsByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEbsByUuidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEbsByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取EBS数量
     * </pre>
     */
    public void getEbsTotalCnt(com.didiyun.compute.v1.GetEbsTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEbsTotalCntResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEbsTotalCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建EBS
     * </pre>
     */
    public void createEbs(com.didiyun.compute.v1.CreateEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateEbsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEbsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除EBS
     * </pre>
     */
    public void deleteEbs(com.didiyun.compute.v1.DeleteEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteEbsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEbsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 绑定EBS
     * </pre>
     */
    public void attachEbs(com.didiyun.compute.v1.AttachEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.AttachEbsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAttachEbsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 解绑EBS
     * </pre>
     */
    public void detachEbs(com.didiyun.compute.v1.DetachEbsRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DetachEbsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetachEbsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更改EBS大小
     * </pre>
     */
    public void changeEbsSize(com.didiyun.compute.v1.ChangeEbsSizeRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeEbsSizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeEbsSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更改EBS名称
     * </pre>
     */
    public void changeEbsName(com.didiyun.compute.v1.ChangeEbsNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeEbsNameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeEbsNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EbsBlockingStub extends io.grpc.stub.AbstractStub<EbsBlockingStub> {
    private EbsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EbsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EbsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EbsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取EBS列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListEbsResponse listEbs(com.didiyun.compute.v1.ListEbsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListEbsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据uuid获取EBS
     * </pre>
     */
    public com.didiyun.compute.v1.GetEbsByUuidResponse getEbsByUuid(com.didiyun.compute.v1.GetEbsByUuidRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEbsByUuidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取EBS数量
     * </pre>
     */
    public com.didiyun.compute.v1.GetEbsTotalCntResponse getEbsTotalCnt(com.didiyun.compute.v1.GetEbsTotalCntRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEbsTotalCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建EBS
     * </pre>
     */
    public com.didiyun.compute.v1.CreateEbsResponse createEbs(com.didiyun.compute.v1.CreateEbsRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEbsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除EBS
     * </pre>
     */
    public com.didiyun.compute.v1.DeleteEbsResponse deleteEbs(com.didiyun.compute.v1.DeleteEbsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEbsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 绑定EBS
     * </pre>
     */
    public com.didiyun.compute.v1.AttachEbsResponse attachEbs(com.didiyun.compute.v1.AttachEbsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAttachEbsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 解绑EBS
     * </pre>
     */
    public com.didiyun.compute.v1.DetachEbsResponse detachEbs(com.didiyun.compute.v1.DetachEbsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetachEbsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更改EBS大小
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeEbsSizeResponse changeEbsSize(com.didiyun.compute.v1.ChangeEbsSizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeEbsSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更改EBS名称
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeEbsNameResponse changeEbsName(com.didiyun.compute.v1.ChangeEbsNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeEbsNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EbsFutureStub extends io.grpc.stub.AbstractStub<EbsFutureStub> {
    private EbsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EbsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EbsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EbsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取EBS列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListEbsResponse> listEbs(
        com.didiyun.compute.v1.ListEbsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListEbsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据uuid获取EBS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetEbsByUuidResponse> getEbsByUuid(
        com.didiyun.compute.v1.GetEbsByUuidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEbsByUuidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取EBS数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetEbsTotalCntResponse> getEbsTotalCnt(
        com.didiyun.compute.v1.GetEbsTotalCntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEbsTotalCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建EBS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateEbsResponse> createEbs(
        com.didiyun.compute.v1.CreateEbsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEbsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除EBS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DeleteEbsResponse> deleteEbs(
        com.didiyun.compute.v1.DeleteEbsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEbsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 绑定EBS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.AttachEbsResponse> attachEbs(
        com.didiyun.compute.v1.AttachEbsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAttachEbsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 解绑EBS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DetachEbsResponse> detachEbs(
        com.didiyun.compute.v1.DetachEbsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetachEbsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更改EBS大小
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeEbsSizeResponse> changeEbsSize(
        com.didiyun.compute.v1.ChangeEbsSizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeEbsSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更改EBS名称
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeEbsNameResponse> changeEbsName(
        com.didiyun.compute.v1.ChangeEbsNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeEbsNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_EBS = 0;
  private static final int METHODID_GET_EBS_BY_UUID = 1;
  private static final int METHODID_GET_EBS_TOTAL_CNT = 2;
  private static final int METHODID_CREATE_EBS = 3;
  private static final int METHODID_DELETE_EBS = 4;
  private static final int METHODID_ATTACH_EBS = 5;
  private static final int METHODID_DETACH_EBS = 6;
  private static final int METHODID_CHANGE_EBS_SIZE = 7;
  private static final int METHODID_CHANGE_EBS_NAME = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EbsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EbsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_EBS:
          serviceImpl.listEbs((com.didiyun.compute.v1.ListEbsRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListEbsResponse>) responseObserver);
          break;
        case METHODID_GET_EBS_BY_UUID:
          serviceImpl.getEbsByUuid((com.didiyun.compute.v1.GetEbsByUuidRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEbsByUuidResponse>) responseObserver);
          break;
        case METHODID_GET_EBS_TOTAL_CNT:
          serviceImpl.getEbsTotalCnt((com.didiyun.compute.v1.GetEbsTotalCntRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetEbsTotalCntResponse>) responseObserver);
          break;
        case METHODID_CREATE_EBS:
          serviceImpl.createEbs((com.didiyun.compute.v1.CreateEbsRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateEbsResponse>) responseObserver);
          break;
        case METHODID_DELETE_EBS:
          serviceImpl.deleteEbs((com.didiyun.compute.v1.DeleteEbsRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteEbsResponse>) responseObserver);
          break;
        case METHODID_ATTACH_EBS:
          serviceImpl.attachEbs((com.didiyun.compute.v1.AttachEbsRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.AttachEbsResponse>) responseObserver);
          break;
        case METHODID_DETACH_EBS:
          serviceImpl.detachEbs((com.didiyun.compute.v1.DetachEbsRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DetachEbsResponse>) responseObserver);
          break;
        case METHODID_CHANGE_EBS_SIZE:
          serviceImpl.changeEbsSize((com.didiyun.compute.v1.ChangeEbsSizeRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeEbsSizeResponse>) responseObserver);
          break;
        case METHODID_CHANGE_EBS_NAME:
          serviceImpl.changeEbsName((com.didiyun.compute.v1.ChangeEbsNameRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeEbsNameResponse>) responseObserver);
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

  private static abstract class EbsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EbsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.compute.v1.EbsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Ebs");
    }
  }

  private static final class EbsFileDescriptorSupplier
      extends EbsBaseDescriptorSupplier {
    EbsFileDescriptorSupplier() {}
  }

  private static final class EbsMethodDescriptorSupplier
      extends EbsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EbsMethodDescriptorSupplier(String methodName) {
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
      synchronized (EbsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EbsFileDescriptorSupplier())
              .addMethod(getListEbsMethod())
              .addMethod(getGetEbsByUuidMethod())
              .addMethod(getGetEbsTotalCntMethod())
              .addMethod(getCreateEbsMethod())
              .addMethod(getDeleteEbsMethod())
              .addMethod(getAttachEbsMethod())
              .addMethod(getDetachEbsMethod())
              .addMethod(getChangeEbsSizeMethod())
              .addMethod(getChangeEbsNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
