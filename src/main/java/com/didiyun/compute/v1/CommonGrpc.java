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
    comments = "Source: compute/v1/common.proto")
public final class CommonGrpc {

  private CommonGrpc() {}

  public static final String SERVICE_NAME = "didi.cloud.compute.v1.Common";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.JobResultRequest,
      com.didiyun.compute.v1.JobResultResponse> getJobResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JobResult",
      requestType = com.didiyun.compute.v1.JobResultRequest.class,
      responseType = com.didiyun.compute.v1.JobResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.JobResultRequest,
      com.didiyun.compute.v1.JobResultResponse> getJobResultMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.JobResultRequest, com.didiyun.compute.v1.JobResultResponse> getJobResultMethod;
    if ((getJobResultMethod = CommonGrpc.getJobResultMethod) == null) {
      synchronized (CommonGrpc.class) {
        if ((getJobResultMethod = CommonGrpc.getJobResultMethod) == null) {
          CommonGrpc.getJobResultMethod = getJobResultMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.JobResultRequest, com.didiyun.compute.v1.JobResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Common", "JobResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.JobResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.JobResultResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommonMethodDescriptorSupplier("JobResult"))
                  .build();
          }
        }
     }
     return getJobResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListRegionAndZoneRequest,
      com.didiyun.compute.v1.ListRegionAndZoneResponse> getListRegionAndZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRegionAndZone",
      requestType = com.didiyun.compute.v1.ListRegionAndZoneRequest.class,
      responseType = com.didiyun.compute.v1.ListRegionAndZoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListRegionAndZoneRequest,
      com.didiyun.compute.v1.ListRegionAndZoneResponse> getListRegionAndZoneMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListRegionAndZoneRequest, com.didiyun.compute.v1.ListRegionAndZoneResponse> getListRegionAndZoneMethod;
    if ((getListRegionAndZoneMethod = CommonGrpc.getListRegionAndZoneMethod) == null) {
      synchronized (CommonGrpc.class) {
        if ((getListRegionAndZoneMethod = CommonGrpc.getListRegionAndZoneMethod) == null) {
          CommonGrpc.getListRegionAndZoneMethod = getListRegionAndZoneMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListRegionAndZoneRequest, com.didiyun.compute.v1.ListRegionAndZoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Common", "ListRegionAndZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListRegionAndZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListRegionAndZoneResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommonMethodDescriptorSupplier("ListRegionAndZone"))
                  .build();
          }
        }
     }
     return getListRegionAndZoneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommonStub newStub(io.grpc.Channel channel) {
    return new CommonStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommonBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommonBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommonFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommonFutureStub(channel);
  }

  /**
   */
  public static abstract class CommonImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取任务进度
     * </pre>
     */
    public void jobResult(com.didiyun.compute.v1.JobResultRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.JobResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getJobResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取产品可用区列表
     * </pre>
     */
    public void listRegionAndZone(com.didiyun.compute.v1.ListRegionAndZoneRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListRegionAndZoneResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRegionAndZoneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getJobResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.JobResultRequest,
                com.didiyun.compute.v1.JobResultResponse>(
                  this, METHODID_JOB_RESULT)))
          .addMethod(
            getListRegionAndZoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListRegionAndZoneRequest,
                com.didiyun.compute.v1.ListRegionAndZoneResponse>(
                  this, METHODID_LIST_REGION_AND_ZONE)))
          .build();
    }
  }

  /**
   */
  public static final class CommonStub extends io.grpc.stub.AbstractStub<CommonStub> {
    private CommonStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommonStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommonStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取任务进度
     * </pre>
     */
    public void jobResult(com.didiyun.compute.v1.JobResultRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.JobResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJobResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取产品可用区列表
     * </pre>
     */
    public void listRegionAndZone(com.didiyun.compute.v1.ListRegionAndZoneRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListRegionAndZoneResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRegionAndZoneMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommonBlockingStub extends io.grpc.stub.AbstractStub<CommonBlockingStub> {
    private CommonBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommonBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommonBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取任务进度
     * </pre>
     */
    public com.didiyun.compute.v1.JobResultResponse jobResult(com.didiyun.compute.v1.JobResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getJobResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取产品可用区列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListRegionAndZoneResponse listRegionAndZone(com.didiyun.compute.v1.ListRegionAndZoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRegionAndZoneMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommonFutureStub extends io.grpc.stub.AbstractStub<CommonFutureStub> {
    private CommonFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommonFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommonFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取任务进度
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.JobResultResponse> jobResult(
        com.didiyun.compute.v1.JobResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getJobResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取产品可用区列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListRegionAndZoneResponse> listRegionAndZone(
        com.didiyun.compute.v1.ListRegionAndZoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRegionAndZoneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_JOB_RESULT = 0;
  private static final int METHODID_LIST_REGION_AND_ZONE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommonImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommonImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOB_RESULT:
          serviceImpl.jobResult((com.didiyun.compute.v1.JobResultRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.JobResultResponse>) responseObserver);
          break;
        case METHODID_LIST_REGION_AND_ZONE:
          serviceImpl.listRegionAndZone((com.didiyun.compute.v1.ListRegionAndZoneRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListRegionAndZoneResponse>) responseObserver);
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

  private static abstract class CommonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommonBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.compute.v1.CommonOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Common");
    }
  }

  private static final class CommonFileDescriptorSupplier
      extends CommonBaseDescriptorSupplier {
    CommonFileDescriptorSupplier() {}
  }

  private static final class CommonMethodDescriptorSupplier
      extends CommonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommonMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommonGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommonFileDescriptorSupplier())
              .addMethod(getJobResultMethod())
              .addMethod(getListRegionAndZoneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
