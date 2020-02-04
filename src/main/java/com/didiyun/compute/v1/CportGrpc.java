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
    comments = "Source: compute/v1/cport.proto")
public final class CportGrpc {

  private CportGrpc() {}

  public static final String SERVICE_NAME = "didi.cloud.compute.v1.Cport";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListCportRequest,
      com.didiyun.compute.v1.ListCportResponse> getListCportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCport",
      requestType = com.didiyun.compute.v1.ListCportRequest.class,
      responseType = com.didiyun.compute.v1.ListCportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListCportRequest,
      com.didiyun.compute.v1.ListCportResponse> getListCportMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListCportRequest, com.didiyun.compute.v1.ListCportResponse> getListCportMethod;
    if ((getListCportMethod = CportGrpc.getListCportMethod) == null) {
      synchronized (CportGrpc.class) {
        if ((getListCportMethod = CportGrpc.getListCportMethod) == null) {
          CportGrpc.getListCportMethod = getListCportMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListCportRequest, com.didiyun.compute.v1.ListCportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Cport", "ListCport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListCportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListCportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CportMethodDescriptorSupplier("ListCport"))
                  .build();
          }
        }
     }
     return getListCportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetCportByUuidRequest,
      com.didiyun.compute.v1.GetCportByUuidResponse> getGetCportByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCportByUuid",
      requestType = com.didiyun.compute.v1.GetCportByUuidRequest.class,
      responseType = com.didiyun.compute.v1.GetCportByUuidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetCportByUuidRequest,
      com.didiyun.compute.v1.GetCportByUuidResponse> getGetCportByUuidMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetCportByUuidRequest, com.didiyun.compute.v1.GetCportByUuidResponse> getGetCportByUuidMethod;
    if ((getGetCportByUuidMethod = CportGrpc.getGetCportByUuidMethod) == null) {
      synchronized (CportGrpc.class) {
        if ((getGetCportByUuidMethod = CportGrpc.getGetCportByUuidMethod) == null) {
          CportGrpc.getGetCportByUuidMethod = getGetCportByUuidMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetCportByUuidRequest, com.didiyun.compute.v1.GetCportByUuidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Cport", "GetCportByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetCportByUuidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetCportByUuidResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CportMethodDescriptorSupplier("GetCportByUuid"))
                  .build();
          }
        }
     }
     return getGetCportByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateCportRequest,
      com.didiyun.compute.v1.CreateCportResponse> getCreateCportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCport",
      requestType = com.didiyun.compute.v1.CreateCportRequest.class,
      responseType = com.didiyun.compute.v1.CreateCportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateCportRequest,
      com.didiyun.compute.v1.CreateCportResponse> getCreateCportMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateCportRequest, com.didiyun.compute.v1.CreateCportResponse> getCreateCportMethod;
    if ((getCreateCportMethod = CportGrpc.getCreateCportMethod) == null) {
      synchronized (CportGrpc.class) {
        if ((getCreateCportMethod = CportGrpc.getCreateCportMethod) == null) {
          CportGrpc.getCreateCportMethod = getCreateCportMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateCportRequest, com.didiyun.compute.v1.CreateCportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Cport", "CreateCport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateCportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateCportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CportMethodDescriptorSupplier("CreateCport"))
                  .build();
          }
        }
     }
     return getCreateCportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteCportRequest,
      com.didiyun.compute.v1.DeleteCportResponse> getDeleteCportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCport",
      requestType = com.didiyun.compute.v1.DeleteCportRequest.class,
      responseType = com.didiyun.compute.v1.DeleteCportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteCportRequest,
      com.didiyun.compute.v1.DeleteCportResponse> getDeleteCportMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteCportRequest, com.didiyun.compute.v1.DeleteCportResponse> getDeleteCportMethod;
    if ((getDeleteCportMethod = CportGrpc.getDeleteCportMethod) == null) {
      synchronized (CportGrpc.class) {
        if ((getDeleteCportMethod = CportGrpc.getDeleteCportMethod) == null) {
          CportGrpc.getDeleteCportMethod = getDeleteCportMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DeleteCportRequest, com.didiyun.compute.v1.DeleteCportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Cport", "DeleteCport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteCportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteCportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CportMethodDescriptorSupplier("DeleteCport"))
                  .build();
          }
        }
     }
     return getDeleteCportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CportStub newStub(io.grpc.Channel channel) {
    return new CportStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CportBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CportFutureStub(channel);
  }

  /**
   */
  public static abstract class CportImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取cport列表
     * </pre>
     */
    public void listCport(com.didiyun.compute.v1.ListCportRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListCportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCportMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据Uuid查询cport
     * </pre>
     */
    public void getCportByUuid(com.didiyun.compute.v1.GetCportByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetCportByUuidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCportByUuidMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建cport
     * </pre>
     */
    public void createCport(com.didiyun.compute.v1.CreateCportRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateCportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCportMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除cport
     * </pre>
     */
    public void deleteCport(com.didiyun.compute.v1.DeleteCportRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteCportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListCportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListCportRequest,
                com.didiyun.compute.v1.ListCportResponse>(
                  this, METHODID_LIST_CPORT)))
          .addMethod(
            getGetCportByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetCportByUuidRequest,
                com.didiyun.compute.v1.GetCportByUuidResponse>(
                  this, METHODID_GET_CPORT_BY_UUID)))
          .addMethod(
            getCreateCportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateCportRequest,
                com.didiyun.compute.v1.CreateCportResponse>(
                  this, METHODID_CREATE_CPORT)))
          .addMethod(
            getDeleteCportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DeleteCportRequest,
                com.didiyun.compute.v1.DeleteCportResponse>(
                  this, METHODID_DELETE_CPORT)))
          .build();
    }
  }

  /**
   */
  public static final class CportStub extends io.grpc.stub.AbstractStub<CportStub> {
    private CportStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CportStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CportStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CportStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取cport列表
     * </pre>
     */
    public void listCport(com.didiyun.compute.v1.ListCportRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListCportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据Uuid查询cport
     * </pre>
     */
    public void getCportByUuid(com.didiyun.compute.v1.GetCportByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetCportByUuidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCportByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建cport
     * </pre>
     */
    public void createCport(com.didiyun.compute.v1.CreateCportRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateCportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除cport
     * </pre>
     */
    public void deleteCport(com.didiyun.compute.v1.DeleteCportRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteCportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CportBlockingStub extends io.grpc.stub.AbstractStub<CportBlockingStub> {
    private CportBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CportBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CportBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CportBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取cport列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListCportResponse listCport(com.didiyun.compute.v1.ListCportRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据Uuid查询cport
     * </pre>
     */
    public com.didiyun.compute.v1.GetCportByUuidResponse getCportByUuid(com.didiyun.compute.v1.GetCportByUuidRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCportByUuidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建cport
     * </pre>
     */
    public com.didiyun.compute.v1.CreateCportResponse createCport(com.didiyun.compute.v1.CreateCportRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除cport
     * </pre>
     */
    public com.didiyun.compute.v1.DeleteCportResponse deleteCport(com.didiyun.compute.v1.DeleteCportRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCportMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CportFutureStub extends io.grpc.stub.AbstractStub<CportFutureStub> {
    private CportFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CportFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CportFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CportFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取cport列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListCportResponse> listCport(
        com.didiyun.compute.v1.ListCportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据Uuid查询cport
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetCportByUuidResponse> getCportByUuid(
        com.didiyun.compute.v1.GetCportByUuidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCportByUuidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建cport
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateCportResponse> createCport(
        com.didiyun.compute.v1.CreateCportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除cport
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DeleteCportResponse> deleteCport(
        com.didiyun.compute.v1.DeleteCportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CPORT = 0;
  private static final int METHODID_GET_CPORT_BY_UUID = 1;
  private static final int METHODID_CREATE_CPORT = 2;
  private static final int METHODID_DELETE_CPORT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CportImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CportImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_CPORT:
          serviceImpl.listCport((com.didiyun.compute.v1.ListCportRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListCportResponse>) responseObserver);
          break;
        case METHODID_GET_CPORT_BY_UUID:
          serviceImpl.getCportByUuid((com.didiyun.compute.v1.GetCportByUuidRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetCportByUuidResponse>) responseObserver);
          break;
        case METHODID_CREATE_CPORT:
          serviceImpl.createCport((com.didiyun.compute.v1.CreateCportRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateCportResponse>) responseObserver);
          break;
        case METHODID_DELETE_CPORT:
          serviceImpl.deleteCport((com.didiyun.compute.v1.DeleteCportRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteCportResponse>) responseObserver);
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

  private static abstract class CportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CportBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.compute.v1.CportOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Cport");
    }
  }

  private static final class CportFileDescriptorSupplier
      extends CportBaseDescriptorSupplier {
    CportFileDescriptorSupplier() {}
  }

  private static final class CportMethodDescriptorSupplier
      extends CportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CportMethodDescriptorSupplier(String methodName) {
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
      synchronized (CportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CportFileDescriptorSupplier())
              .addMethod(getListCportMethod())
              .addMethod(getGetCportByUuidMethod())
              .addMethod(getCreateCportMethod())
              .addMethod(getDeleteCportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
