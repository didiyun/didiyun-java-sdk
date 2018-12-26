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
    comments = "Source: compute/v1/sg.proto")
public final class SgGrpc {

  private SgGrpc() {}

  public static final String SERVICE_NAME = "didi.cloud.compute.v1.Sg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSgRequest,
      com.didiyun.compute.v1.ListSgResponse> getListSgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSg",
      requestType = com.didiyun.compute.v1.ListSgRequest.class,
      responseType = com.didiyun.compute.v1.ListSgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSgRequest,
      com.didiyun.compute.v1.ListSgResponse> getListSgMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSgRequest, com.didiyun.compute.v1.ListSgResponse> getListSgMethod;
    if ((getListSgMethod = SgGrpc.getListSgMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getListSgMethod = SgGrpc.getListSgMethod) == null) {
          SgGrpc.getListSgMethod = getListSgMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListSgRequest, com.didiyun.compute.v1.ListSgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "ListSg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSgResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("ListSg"))
                  .build();
          }
        }
     }
     return getListSgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSgTotalCntRequest,
      com.didiyun.compute.v1.GetSgTotalCntResponse> getGetSgTotalCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSgTotalCnt",
      requestType = com.didiyun.compute.v1.GetSgTotalCntRequest.class,
      responseType = com.didiyun.compute.v1.GetSgTotalCntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSgTotalCntRequest,
      com.didiyun.compute.v1.GetSgTotalCntResponse> getGetSgTotalCntMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSgTotalCntRequest, com.didiyun.compute.v1.GetSgTotalCntResponse> getGetSgTotalCntMethod;
    if ((getGetSgTotalCntMethod = SgGrpc.getGetSgTotalCntMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getGetSgTotalCntMethod = SgGrpc.getGetSgTotalCntMethod) == null) {
          SgGrpc.getGetSgTotalCntMethod = getGetSgTotalCntMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetSgTotalCntRequest, com.didiyun.compute.v1.GetSgTotalCntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "GetSgTotalCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSgTotalCntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSgTotalCntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("GetSgTotalCnt"))
                  .build();
          }
        }
     }
     return getGetSgTotalCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSgRequest,
      com.didiyun.compute.v1.CreateSgResponse> getCreateSgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSg",
      requestType = com.didiyun.compute.v1.CreateSgRequest.class,
      responseType = com.didiyun.compute.v1.CreateSgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSgRequest,
      com.didiyun.compute.v1.CreateSgResponse> getCreateSgMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSgRequest, com.didiyun.compute.v1.CreateSgResponse> getCreateSgMethod;
    if ((getCreateSgMethod = SgGrpc.getCreateSgMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getCreateSgMethod = SgGrpc.getCreateSgMethod) == null) {
          SgGrpc.getCreateSgMethod = getCreateSgMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateSgRequest, com.didiyun.compute.v1.CreateSgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "CreateSg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSgResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("CreateSg"))
                  .build();
          }
        }
     }
     return getCreateSgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSgRequest,
      com.didiyun.compute.v1.DeleteSgResponse> getDeleteSgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSg",
      requestType = com.didiyun.compute.v1.DeleteSgRequest.class,
      responseType = com.didiyun.compute.v1.DeleteSgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSgRequest,
      com.didiyun.compute.v1.DeleteSgResponse> getDeleteSgMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSgRequest, com.didiyun.compute.v1.DeleteSgResponse> getDeleteSgMethod;
    if ((getDeleteSgMethod = SgGrpc.getDeleteSgMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getDeleteSgMethod = SgGrpc.getDeleteSgMethod) == null) {
          SgGrpc.getDeleteSgMethod = getDeleteSgMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DeleteSgRequest, com.didiyun.compute.v1.DeleteSgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "DeleteSg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSgResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("DeleteSg"))
                  .build();
          }
        }
     }
     return getDeleteSgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.AttachDc2ToSgRequest,
      com.didiyun.compute.v1.AttachDc2ToSgResponse> getAttachDc2ToSgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttachDc2ToSg",
      requestType = com.didiyun.compute.v1.AttachDc2ToSgRequest.class,
      responseType = com.didiyun.compute.v1.AttachDc2ToSgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.AttachDc2ToSgRequest,
      com.didiyun.compute.v1.AttachDc2ToSgResponse> getAttachDc2ToSgMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.AttachDc2ToSgRequest, com.didiyun.compute.v1.AttachDc2ToSgResponse> getAttachDc2ToSgMethod;
    if ((getAttachDc2ToSgMethod = SgGrpc.getAttachDc2ToSgMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getAttachDc2ToSgMethod = SgGrpc.getAttachDc2ToSgMethod) == null) {
          SgGrpc.getAttachDc2ToSgMethod = getAttachDc2ToSgMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.AttachDc2ToSgRequest, com.didiyun.compute.v1.AttachDc2ToSgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "AttachDc2ToSg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.AttachDc2ToSgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.AttachDc2ToSgResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("AttachDc2ToSg"))
                  .build();
          }
        }
     }
     return getAttachDc2ToSgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DetachDc2FromSgRequest,
      com.didiyun.compute.v1.DetachDc2FromSgResponse> getDetachDc2FromSgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetachDc2FromSg",
      requestType = com.didiyun.compute.v1.DetachDc2FromSgRequest.class,
      responseType = com.didiyun.compute.v1.DetachDc2FromSgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DetachDc2FromSgRequest,
      com.didiyun.compute.v1.DetachDc2FromSgResponse> getDetachDc2FromSgMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DetachDc2FromSgRequest, com.didiyun.compute.v1.DetachDc2FromSgResponse> getDetachDc2FromSgMethod;
    if ((getDetachDc2FromSgMethod = SgGrpc.getDetachDc2FromSgMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getDetachDc2FromSgMethod = SgGrpc.getDetachDc2FromSgMethod) == null) {
          SgGrpc.getDetachDc2FromSgMethod = getDetachDc2FromSgMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DetachDc2FromSgRequest, com.didiyun.compute.v1.DetachDc2FromSgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "DetachDc2FromSg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DetachDc2FromSgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DetachDc2FromSgResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("DetachDc2FromSg"))
                  .build();
          }
        }
     }
     return getDetachDc2FromSgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeSgNameRequest,
      com.didiyun.compute.v1.ChangeSgNameResponse> getChangeSgNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeSgName",
      requestType = com.didiyun.compute.v1.ChangeSgNameRequest.class,
      responseType = com.didiyun.compute.v1.ChangeSgNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeSgNameRequest,
      com.didiyun.compute.v1.ChangeSgNameResponse> getChangeSgNameMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeSgNameRequest, com.didiyun.compute.v1.ChangeSgNameResponse> getChangeSgNameMethod;
    if ((getChangeSgNameMethod = SgGrpc.getChangeSgNameMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getChangeSgNameMethod = SgGrpc.getChangeSgNameMethod) == null) {
          SgGrpc.getChangeSgNameMethod = getChangeSgNameMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeSgNameRequest, com.didiyun.compute.v1.ChangeSgNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "ChangeSgName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeSgNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeSgNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("ChangeSgName"))
                  .build();
          }
        }
     }
     return getChangeSgNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSgRuleRequest,
      com.didiyun.compute.v1.ListSgRuleResponse> getListSgRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSgRule",
      requestType = com.didiyun.compute.v1.ListSgRuleRequest.class,
      responseType = com.didiyun.compute.v1.ListSgRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSgRuleRequest,
      com.didiyun.compute.v1.ListSgRuleResponse> getListSgRuleMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSgRuleRequest, com.didiyun.compute.v1.ListSgRuleResponse> getListSgRuleMethod;
    if ((getListSgRuleMethod = SgGrpc.getListSgRuleMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getListSgRuleMethod = SgGrpc.getListSgRuleMethod) == null) {
          SgGrpc.getListSgRuleMethod = getListSgRuleMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListSgRuleRequest, com.didiyun.compute.v1.ListSgRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "ListSgRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSgRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSgRuleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("ListSgRule"))
                  .build();
          }
        }
     }
     return getListSgRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSgRuleTotalCntRequest,
      com.didiyun.compute.v1.GetSgRuleTotalCntResponse> getGetSgRuleTotalCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSgRuleTotalCnt",
      requestType = com.didiyun.compute.v1.GetSgRuleTotalCntRequest.class,
      responseType = com.didiyun.compute.v1.GetSgRuleTotalCntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSgRuleTotalCntRequest,
      com.didiyun.compute.v1.GetSgRuleTotalCntResponse> getGetSgRuleTotalCntMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSgRuleTotalCntRequest, com.didiyun.compute.v1.GetSgRuleTotalCntResponse> getGetSgRuleTotalCntMethod;
    if ((getGetSgRuleTotalCntMethod = SgGrpc.getGetSgRuleTotalCntMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getGetSgRuleTotalCntMethod = SgGrpc.getGetSgRuleTotalCntMethod) == null) {
          SgGrpc.getGetSgRuleTotalCntMethod = getGetSgRuleTotalCntMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetSgRuleTotalCntRequest, com.didiyun.compute.v1.GetSgRuleTotalCntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "GetSgRuleTotalCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSgRuleTotalCntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSgRuleTotalCntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("GetSgRuleTotalCnt"))
                  .build();
          }
        }
     }
     return getGetSgRuleTotalCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSgRuleRequest,
      com.didiyun.compute.v1.CreateSgRuleResponse> getCreateSgRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSgRule",
      requestType = com.didiyun.compute.v1.CreateSgRuleRequest.class,
      responseType = com.didiyun.compute.v1.CreateSgRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSgRuleRequest,
      com.didiyun.compute.v1.CreateSgRuleResponse> getCreateSgRuleMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSgRuleRequest, com.didiyun.compute.v1.CreateSgRuleResponse> getCreateSgRuleMethod;
    if ((getCreateSgRuleMethod = SgGrpc.getCreateSgRuleMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getCreateSgRuleMethod = SgGrpc.getCreateSgRuleMethod) == null) {
          SgGrpc.getCreateSgRuleMethod = getCreateSgRuleMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateSgRuleRequest, com.didiyun.compute.v1.CreateSgRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "CreateSgRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSgRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSgRuleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("CreateSgRule"))
                  .build();
          }
        }
     }
     return getCreateSgRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSgRuleRequest,
      com.didiyun.compute.v1.DeleteSgRuleResponse> getDeleteSgRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSgRule",
      requestType = com.didiyun.compute.v1.DeleteSgRuleRequest.class,
      responseType = com.didiyun.compute.v1.DeleteSgRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSgRuleRequest,
      com.didiyun.compute.v1.DeleteSgRuleResponse> getDeleteSgRuleMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSgRuleRequest, com.didiyun.compute.v1.DeleteSgRuleResponse> getDeleteSgRuleMethod;
    if ((getDeleteSgRuleMethod = SgGrpc.getDeleteSgRuleMethod) == null) {
      synchronized (SgGrpc.class) {
        if ((getDeleteSgRuleMethod = SgGrpc.getDeleteSgRuleMethod) == null) {
          SgGrpc.getDeleteSgRuleMethod = getDeleteSgRuleMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DeleteSgRuleRequest, com.didiyun.compute.v1.DeleteSgRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Sg", "DeleteSgRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSgRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSgRuleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SgMethodDescriptorSupplier("DeleteSgRule"))
                  .build();
          }
        }
     }
     return getDeleteSgRuleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SgStub newStub(io.grpc.Channel channel) {
    return new SgStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SgBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SgFutureStub(channel);
  }

  /**
   */
  public static abstract class SgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取SG列表
     * </pre>
     */
    public void listSg(com.didiyun.compute.v1.ListSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSgResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取SG总量
     * </pre>
     */
    public void getSgTotalCnt(com.didiyun.compute.v1.GetSgTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSgTotalCntResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSgTotalCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建SG
     * </pre>
     */
    public void createSg(com.didiyun.compute.v1.CreateSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSgResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除SG
     * </pre>
     */
    public void deleteSg(com.didiyun.compute.v1.DeleteSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSgResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 绑定DC2到SG
     * </pre>
     */
    public void attachDc2ToSg(com.didiyun.compute.v1.AttachDc2ToSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.AttachDc2ToSgResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAttachDc2ToSgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 从SG解绑DC2
     * </pre>
     */
    public void detachDc2FromSg(com.didiyun.compute.v1.DetachDc2FromSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DetachDc2FromSgResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDetachDc2FromSgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更改SG名称
     * </pre>
     */
    public void changeSgName(com.didiyun.compute.v1.ChangeSgNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeSgNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeSgNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取SGRule列表
     * </pre>
     */
    public void listSgRule(com.didiyun.compute.v1.ListSgRuleRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSgRuleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSgRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取SGRule总量
     * </pre>
     */
    public void getSgRuleTotalCnt(com.didiyun.compute.v1.GetSgRuleTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSgRuleTotalCntResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSgRuleTotalCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建SGRule
     * </pre>
     */
    public void createSgRule(com.didiyun.compute.v1.CreateSgRuleRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSgRuleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSgRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除SGRule
     * </pre>
     */
    public void deleteSgRule(com.didiyun.compute.v1.DeleteSgRuleRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSgRuleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSgRuleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListSgMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListSgRequest,
                com.didiyun.compute.v1.ListSgResponse>(
                  this, METHODID_LIST_SG)))
          .addMethod(
            getGetSgTotalCntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetSgTotalCntRequest,
                com.didiyun.compute.v1.GetSgTotalCntResponse>(
                  this, METHODID_GET_SG_TOTAL_CNT)))
          .addMethod(
            getCreateSgMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateSgRequest,
                com.didiyun.compute.v1.CreateSgResponse>(
                  this, METHODID_CREATE_SG)))
          .addMethod(
            getDeleteSgMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DeleteSgRequest,
                com.didiyun.compute.v1.DeleteSgResponse>(
                  this, METHODID_DELETE_SG)))
          .addMethod(
            getAttachDc2ToSgMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.AttachDc2ToSgRequest,
                com.didiyun.compute.v1.AttachDc2ToSgResponse>(
                  this, METHODID_ATTACH_DC2TO_SG)))
          .addMethod(
            getDetachDc2FromSgMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DetachDc2FromSgRequest,
                com.didiyun.compute.v1.DetachDc2FromSgResponse>(
                  this, METHODID_DETACH_DC2FROM_SG)))
          .addMethod(
            getChangeSgNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeSgNameRequest,
                com.didiyun.compute.v1.ChangeSgNameResponse>(
                  this, METHODID_CHANGE_SG_NAME)))
          .addMethod(
            getListSgRuleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListSgRuleRequest,
                com.didiyun.compute.v1.ListSgRuleResponse>(
                  this, METHODID_LIST_SG_RULE)))
          .addMethod(
            getGetSgRuleTotalCntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetSgRuleTotalCntRequest,
                com.didiyun.compute.v1.GetSgRuleTotalCntResponse>(
                  this, METHODID_GET_SG_RULE_TOTAL_CNT)))
          .addMethod(
            getCreateSgRuleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateSgRuleRequest,
                com.didiyun.compute.v1.CreateSgRuleResponse>(
                  this, METHODID_CREATE_SG_RULE)))
          .addMethod(
            getDeleteSgRuleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DeleteSgRuleRequest,
                com.didiyun.compute.v1.DeleteSgRuleResponse>(
                  this, METHODID_DELETE_SG_RULE)))
          .build();
    }
  }

  /**
   */
  public static final class SgStub extends io.grpc.stub.AbstractStub<SgStub> {
    private SgStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SgStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SgStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SgStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取SG列表
     * </pre>
     */
    public void listSg(com.didiyun.compute.v1.ListSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSgResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取SG总量
     * </pre>
     */
    public void getSgTotalCnt(com.didiyun.compute.v1.GetSgTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSgTotalCntResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSgTotalCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建SG
     * </pre>
     */
    public void createSg(com.didiyun.compute.v1.CreateSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSgResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除SG
     * </pre>
     */
    public void deleteSg(com.didiyun.compute.v1.DeleteSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSgResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 绑定DC2到SG
     * </pre>
     */
    public void attachDc2ToSg(com.didiyun.compute.v1.AttachDc2ToSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.AttachDc2ToSgResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAttachDc2ToSgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 从SG解绑DC2
     * </pre>
     */
    public void detachDc2FromSg(com.didiyun.compute.v1.DetachDc2FromSgRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DetachDc2FromSgResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetachDc2FromSgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更改SG名称
     * </pre>
     */
    public void changeSgName(com.didiyun.compute.v1.ChangeSgNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeSgNameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeSgNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取SGRule列表
     * </pre>
     */
    public void listSgRule(com.didiyun.compute.v1.ListSgRuleRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSgRuleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSgRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取SGRule总量
     * </pre>
     */
    public void getSgRuleTotalCnt(com.didiyun.compute.v1.GetSgRuleTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSgRuleTotalCntResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSgRuleTotalCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建SGRule
     * </pre>
     */
    public void createSgRule(com.didiyun.compute.v1.CreateSgRuleRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSgRuleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSgRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除SGRule
     * </pre>
     */
    public void deleteSgRule(com.didiyun.compute.v1.DeleteSgRuleRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSgRuleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSgRuleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SgBlockingStub extends io.grpc.stub.AbstractStub<SgBlockingStub> {
    private SgBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SgBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SgBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取SG列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListSgResponse listSg(com.didiyun.compute.v1.ListSgRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取SG总量
     * </pre>
     */
    public com.didiyun.compute.v1.GetSgTotalCntResponse getSgTotalCnt(com.didiyun.compute.v1.GetSgTotalCntRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSgTotalCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建SG
     * </pre>
     */
    public com.didiyun.compute.v1.CreateSgResponse createSg(com.didiyun.compute.v1.CreateSgRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除SG
     * </pre>
     */
    public com.didiyun.compute.v1.DeleteSgResponse deleteSg(com.didiyun.compute.v1.DeleteSgRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 绑定DC2到SG
     * </pre>
     */
    public com.didiyun.compute.v1.AttachDc2ToSgResponse attachDc2ToSg(com.didiyun.compute.v1.AttachDc2ToSgRequest request) {
      return blockingUnaryCall(
          getChannel(), getAttachDc2ToSgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 从SG解绑DC2
     * </pre>
     */
    public com.didiyun.compute.v1.DetachDc2FromSgResponse detachDc2FromSg(com.didiyun.compute.v1.DetachDc2FromSgRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetachDc2FromSgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更改SG名称
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeSgNameResponse changeSgName(com.didiyun.compute.v1.ChangeSgNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeSgNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取SGRule列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListSgRuleResponse listSgRule(com.didiyun.compute.v1.ListSgRuleRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSgRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取SGRule总量
     * </pre>
     */
    public com.didiyun.compute.v1.GetSgRuleTotalCntResponse getSgRuleTotalCnt(com.didiyun.compute.v1.GetSgRuleTotalCntRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSgRuleTotalCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建SGRule
     * </pre>
     */
    public com.didiyun.compute.v1.CreateSgRuleResponse createSgRule(com.didiyun.compute.v1.CreateSgRuleRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSgRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除SGRule
     * </pre>
     */
    public com.didiyun.compute.v1.DeleteSgRuleResponse deleteSgRule(com.didiyun.compute.v1.DeleteSgRuleRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSgRuleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SgFutureStub extends io.grpc.stub.AbstractStub<SgFutureStub> {
    private SgFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SgFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SgFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取SG列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListSgResponse> listSg(
        com.didiyun.compute.v1.ListSgRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取SG总量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetSgTotalCntResponse> getSgTotalCnt(
        com.didiyun.compute.v1.GetSgTotalCntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSgTotalCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建SG
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateSgResponse> createSg(
        com.didiyun.compute.v1.CreateSgRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除SG
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DeleteSgResponse> deleteSg(
        com.didiyun.compute.v1.DeleteSgRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 绑定DC2到SG
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.AttachDc2ToSgResponse> attachDc2ToSg(
        com.didiyun.compute.v1.AttachDc2ToSgRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAttachDc2ToSgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 从SG解绑DC2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DetachDc2FromSgResponse> detachDc2FromSg(
        com.didiyun.compute.v1.DetachDc2FromSgRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetachDc2FromSgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更改SG名称
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeSgNameResponse> changeSgName(
        com.didiyun.compute.v1.ChangeSgNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeSgNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取SGRule列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListSgRuleResponse> listSgRule(
        com.didiyun.compute.v1.ListSgRuleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSgRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取SGRule总量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetSgRuleTotalCntResponse> getSgRuleTotalCnt(
        com.didiyun.compute.v1.GetSgRuleTotalCntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSgRuleTotalCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建SGRule
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateSgRuleResponse> createSgRule(
        com.didiyun.compute.v1.CreateSgRuleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSgRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除SGRule
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DeleteSgRuleResponse> deleteSgRule(
        com.didiyun.compute.v1.DeleteSgRuleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSgRuleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SG = 0;
  private static final int METHODID_GET_SG_TOTAL_CNT = 1;
  private static final int METHODID_CREATE_SG = 2;
  private static final int METHODID_DELETE_SG = 3;
  private static final int METHODID_ATTACH_DC2TO_SG = 4;
  private static final int METHODID_DETACH_DC2FROM_SG = 5;
  private static final int METHODID_CHANGE_SG_NAME = 6;
  private static final int METHODID_LIST_SG_RULE = 7;
  private static final int METHODID_GET_SG_RULE_TOTAL_CNT = 8;
  private static final int METHODID_CREATE_SG_RULE = 9;
  private static final int METHODID_DELETE_SG_RULE = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SgImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SgImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SG:
          serviceImpl.listSg((com.didiyun.compute.v1.ListSgRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSgResponse>) responseObserver);
          break;
        case METHODID_GET_SG_TOTAL_CNT:
          serviceImpl.getSgTotalCnt((com.didiyun.compute.v1.GetSgTotalCntRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSgTotalCntResponse>) responseObserver);
          break;
        case METHODID_CREATE_SG:
          serviceImpl.createSg((com.didiyun.compute.v1.CreateSgRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSgResponse>) responseObserver);
          break;
        case METHODID_DELETE_SG:
          serviceImpl.deleteSg((com.didiyun.compute.v1.DeleteSgRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSgResponse>) responseObserver);
          break;
        case METHODID_ATTACH_DC2TO_SG:
          serviceImpl.attachDc2ToSg((com.didiyun.compute.v1.AttachDc2ToSgRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.AttachDc2ToSgResponse>) responseObserver);
          break;
        case METHODID_DETACH_DC2FROM_SG:
          serviceImpl.detachDc2FromSg((com.didiyun.compute.v1.DetachDc2FromSgRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DetachDc2FromSgResponse>) responseObserver);
          break;
        case METHODID_CHANGE_SG_NAME:
          serviceImpl.changeSgName((com.didiyun.compute.v1.ChangeSgNameRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeSgNameResponse>) responseObserver);
          break;
        case METHODID_LIST_SG_RULE:
          serviceImpl.listSgRule((com.didiyun.compute.v1.ListSgRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSgRuleResponse>) responseObserver);
          break;
        case METHODID_GET_SG_RULE_TOTAL_CNT:
          serviceImpl.getSgRuleTotalCnt((com.didiyun.compute.v1.GetSgRuleTotalCntRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSgRuleTotalCntResponse>) responseObserver);
          break;
        case METHODID_CREATE_SG_RULE:
          serviceImpl.createSgRule((com.didiyun.compute.v1.CreateSgRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSgRuleResponse>) responseObserver);
          break;
        case METHODID_DELETE_SG_RULE:
          serviceImpl.deleteSgRule((com.didiyun.compute.v1.DeleteSgRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSgRuleResponse>) responseObserver);
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

  private static abstract class SgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.compute.v1.SgOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sg");
    }
  }

  private static final class SgFileDescriptorSupplier
      extends SgBaseDescriptorSupplier {
    SgFileDescriptorSupplier() {}
  }

  private static final class SgMethodDescriptorSupplier
      extends SgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SgMethodDescriptorSupplier(String methodName) {
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
      synchronized (SgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SgFileDescriptorSupplier())
              .addMethod(getListSgMethod())
              .addMethod(getGetSgTotalCntMethod())
              .addMethod(getCreateSgMethod())
              .addMethod(getDeleteSgMethod())
              .addMethod(getAttachDc2ToSgMethod())
              .addMethod(getDetachDc2FromSgMethod())
              .addMethod(getChangeSgNameMethod())
              .addMethod(getListSgRuleMethod())
              .addMethod(getGetSgRuleTotalCntMethod())
              .addMethod(getCreateSgRuleMethod())
              .addMethod(getDeleteSgRuleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
