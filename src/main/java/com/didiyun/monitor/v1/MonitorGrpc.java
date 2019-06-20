package com.didiyun.monitor.v1;

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
    comments = "Source: monitor/v1/counter.proto")
public final class MonitorGrpc {

  private MonitorGrpc() {}

  public static final String SERVICE_NAME = "didi.cloud.monitor.v1.Monitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.monitor.v1.ListCounterRequest,
      com.didiyun.monitor.v1.ListCounterResponse> getListCounterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCounter",
      requestType = com.didiyun.monitor.v1.ListCounterRequest.class,
      responseType = com.didiyun.monitor.v1.ListCounterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.monitor.v1.ListCounterRequest,
      com.didiyun.monitor.v1.ListCounterResponse> getListCounterMethod() {
    io.grpc.MethodDescriptor<com.didiyun.monitor.v1.ListCounterRequest, com.didiyun.monitor.v1.ListCounterResponse> getListCounterMethod;
    if ((getListCounterMethod = MonitorGrpc.getListCounterMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getListCounterMethod = MonitorGrpc.getListCounterMethod) == null) {
          MonitorGrpc.getListCounterMethod = getListCounterMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.monitor.v1.ListCounterRequest, com.didiyun.monitor.v1.ListCounterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.monitor.v1.Monitor", "ListCounter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.monitor.v1.ListCounterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.monitor.v1.ListCounterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("ListCounter"))
                  .build();
          }
        }
     }
     return getListCounterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.monitor.v1.ListCounterDataRequest,
      com.didiyun.monitor.v1.ListCounterDataResponse> getListCounterDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCounterData",
      requestType = com.didiyun.monitor.v1.ListCounterDataRequest.class,
      responseType = com.didiyun.monitor.v1.ListCounterDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.monitor.v1.ListCounterDataRequest,
      com.didiyun.monitor.v1.ListCounterDataResponse> getListCounterDataMethod() {
    io.grpc.MethodDescriptor<com.didiyun.monitor.v1.ListCounterDataRequest, com.didiyun.monitor.v1.ListCounterDataResponse> getListCounterDataMethod;
    if ((getListCounterDataMethod = MonitorGrpc.getListCounterDataMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getListCounterDataMethod = MonitorGrpc.getListCounterDataMethod) == null) {
          MonitorGrpc.getListCounterDataMethod = getListCounterDataMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.monitor.v1.ListCounterDataRequest, com.didiyun.monitor.v1.ListCounterDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.monitor.v1.Monitor", "ListCounterData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.monitor.v1.ListCounterDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.monitor.v1.ListCounterDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("ListCounterData"))
                  .build();
          }
        }
     }
     return getListCounterDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitorStub newStub(io.grpc.Channel channel) {
    return new MonitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MonitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MonitorFutureStub(channel);
  }

  /**
   */
  public static abstract class MonitorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取曲线列表
     * </pre>
     */
    public void listCounter(com.didiyun.monitor.v1.ListCounterRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.monitor.v1.ListCounterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCounterMethod(), responseObserver);
    }

    /**
     */
    public void listCounterData(com.didiyun.monitor.v1.ListCounterDataRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.monitor.v1.ListCounterDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCounterDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListCounterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.monitor.v1.ListCounterRequest,
                com.didiyun.monitor.v1.ListCounterResponse>(
                  this, METHODID_LIST_COUNTER)))
          .addMethod(
            getListCounterDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.monitor.v1.ListCounterDataRequest,
                com.didiyun.monitor.v1.ListCounterDataResponse>(
                  this, METHODID_LIST_COUNTER_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class MonitorStub extends io.grpc.stub.AbstractStub<MonitorStub> {
    private MonitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取曲线列表
     * </pre>
     */
    public void listCounter(com.didiyun.monitor.v1.ListCounterRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.monitor.v1.ListCounterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCounterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCounterData(com.didiyun.monitor.v1.ListCounterDataRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.monitor.v1.ListCounterDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCounterDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MonitorBlockingStub extends io.grpc.stub.AbstractStub<MonitorBlockingStub> {
    private MonitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取曲线列表
     * </pre>
     */
    public com.didiyun.monitor.v1.ListCounterResponse listCounter(com.didiyun.monitor.v1.ListCounterRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCounterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.didiyun.monitor.v1.ListCounterDataResponse listCounterData(com.didiyun.monitor.v1.ListCounterDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCounterDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MonitorFutureStub extends io.grpc.stub.AbstractStub<MonitorFutureStub> {
    private MonitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取曲线列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.monitor.v1.ListCounterResponse> listCounter(
        com.didiyun.monitor.v1.ListCounterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCounterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.monitor.v1.ListCounterDataResponse> listCounterData(
        com.didiyun.monitor.v1.ListCounterDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCounterDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_COUNTER = 0;
  private static final int METHODID_LIST_COUNTER_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MonitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MonitorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_COUNTER:
          serviceImpl.listCounter((com.didiyun.monitor.v1.ListCounterRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.monitor.v1.ListCounterResponse>) responseObserver);
          break;
        case METHODID_LIST_COUNTER_DATA:
          serviceImpl.listCounterData((com.didiyun.monitor.v1.ListCounterDataRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.monitor.v1.ListCounterDataResponse>) responseObserver);
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

  private static abstract class MonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MonitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.monitor.v1.Counter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Monitor");
    }
  }

  private static final class MonitorFileDescriptorSupplier
      extends MonitorBaseDescriptorSupplier {
    MonitorFileDescriptorSupplier() {}
  }

  private static final class MonitorMethodDescriptorSupplier
      extends MonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MonitorMethodDescriptorSupplier(String methodName) {
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
      synchronized (MonitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MonitorFileDescriptorSupplier())
              .addMethod(getListCounterMethod())
              .addMethod(getListCounterDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
