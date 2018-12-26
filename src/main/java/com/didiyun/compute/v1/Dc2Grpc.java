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
    comments = "Source: compute/v1/dc2.proto")
public final class Dc2Grpc {

  private Dc2Grpc() {}

  public static final String SERVICE_NAME = "didi.cloud.compute.v1.Dc2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListDc2Request,
      com.didiyun.compute.v1.ListDc2Response> getListDc2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDc2",
      requestType = com.didiyun.compute.v1.ListDc2Request.class,
      responseType = com.didiyun.compute.v1.ListDc2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListDc2Request,
      com.didiyun.compute.v1.ListDc2Response> getListDc2Method() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListDc2Request, com.didiyun.compute.v1.ListDc2Response> getListDc2Method;
    if ((getListDc2Method = Dc2Grpc.getListDc2Method) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getListDc2Method = Dc2Grpc.getListDc2Method) == null) {
          Dc2Grpc.getListDc2Method = getListDc2Method = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListDc2Request, com.didiyun.compute.v1.ListDc2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "ListDc2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListDc2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListDc2Response.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("ListDc2"))
                  .build();
          }
        }
     }
     return getListDc2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetDc2TotalCntRequest,
      com.didiyun.compute.v1.GetDc2TotalCntResponse> getGetDc2TotalCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDc2TotalCnt",
      requestType = com.didiyun.compute.v1.GetDc2TotalCntRequest.class,
      responseType = com.didiyun.compute.v1.GetDc2TotalCntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetDc2TotalCntRequest,
      com.didiyun.compute.v1.GetDc2TotalCntResponse> getGetDc2TotalCntMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetDc2TotalCntRequest, com.didiyun.compute.v1.GetDc2TotalCntResponse> getGetDc2TotalCntMethod;
    if ((getGetDc2TotalCntMethod = Dc2Grpc.getGetDc2TotalCntMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getGetDc2TotalCntMethod = Dc2Grpc.getGetDc2TotalCntMethod) == null) {
          Dc2Grpc.getGetDc2TotalCntMethod = getGetDc2TotalCntMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetDc2TotalCntRequest, com.didiyun.compute.v1.GetDc2TotalCntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "GetDc2TotalCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetDc2TotalCntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetDc2TotalCntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("GetDc2TotalCnt"))
                  .build();
          }
        }
     }
     return getGetDc2TotalCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetDc2ByUuidRequest,
      com.didiyun.compute.v1.GetDc2ByUuidResponse> getGetDc2ByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDc2ByUuid",
      requestType = com.didiyun.compute.v1.GetDc2ByUuidRequest.class,
      responseType = com.didiyun.compute.v1.GetDc2ByUuidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetDc2ByUuidRequest,
      com.didiyun.compute.v1.GetDc2ByUuidResponse> getGetDc2ByUuidMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetDc2ByUuidRequest, com.didiyun.compute.v1.GetDc2ByUuidResponse> getGetDc2ByUuidMethod;
    if ((getGetDc2ByUuidMethod = Dc2Grpc.getGetDc2ByUuidMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getGetDc2ByUuidMethod = Dc2Grpc.getGetDc2ByUuidMethod) == null) {
          Dc2Grpc.getGetDc2ByUuidMethod = getGetDc2ByUuidMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetDc2ByUuidRequest, com.didiyun.compute.v1.GetDc2ByUuidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "GetDc2ByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetDc2ByUuidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetDc2ByUuidResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("GetDc2ByUuid"))
                  .build();
          }
        }
     }
     return getGetDc2ByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.StartDc2Request,
      com.didiyun.compute.v1.StartDc2Response> getStartDc2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartDc2",
      requestType = com.didiyun.compute.v1.StartDc2Request.class,
      responseType = com.didiyun.compute.v1.StartDc2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.StartDc2Request,
      com.didiyun.compute.v1.StartDc2Response> getStartDc2Method() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.StartDc2Request, com.didiyun.compute.v1.StartDc2Response> getStartDc2Method;
    if ((getStartDc2Method = Dc2Grpc.getStartDc2Method) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getStartDc2Method = Dc2Grpc.getStartDc2Method) == null) {
          Dc2Grpc.getStartDc2Method = getStartDc2Method = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.StartDc2Request, com.didiyun.compute.v1.StartDc2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "StartDc2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.StartDc2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.StartDc2Response.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("StartDc2"))
                  .build();
          }
        }
     }
     return getStartDc2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.StopDc2Request,
      com.didiyun.compute.v1.StopDc2Response> getStopDc2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopDc2",
      requestType = com.didiyun.compute.v1.StopDc2Request.class,
      responseType = com.didiyun.compute.v1.StopDc2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.StopDc2Request,
      com.didiyun.compute.v1.StopDc2Response> getStopDc2Method() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.StopDc2Request, com.didiyun.compute.v1.StopDc2Response> getStopDc2Method;
    if ((getStopDc2Method = Dc2Grpc.getStopDc2Method) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getStopDc2Method = Dc2Grpc.getStopDc2Method) == null) {
          Dc2Grpc.getStopDc2Method = getStopDc2Method = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.StopDc2Request, com.didiyun.compute.v1.StopDc2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "StopDc2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.StopDc2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.StopDc2Response.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("StopDc2"))
                  .build();
          }
        }
     }
     return getStopDc2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.RebootDc2Request,
      com.didiyun.compute.v1.RebootDc2Response> getRebootDc2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RebootDc2",
      requestType = com.didiyun.compute.v1.RebootDc2Request.class,
      responseType = com.didiyun.compute.v1.RebootDc2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.RebootDc2Request,
      com.didiyun.compute.v1.RebootDc2Response> getRebootDc2Method() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.RebootDc2Request, com.didiyun.compute.v1.RebootDc2Response> getRebootDc2Method;
    if ((getRebootDc2Method = Dc2Grpc.getRebootDc2Method) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getRebootDc2Method = Dc2Grpc.getRebootDc2Method) == null) {
          Dc2Grpc.getRebootDc2Method = getRebootDc2Method = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.RebootDc2Request, com.didiyun.compute.v1.RebootDc2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "RebootDc2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.RebootDc2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.RebootDc2Response.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("RebootDc2"))
                  .build();
          }
        }
     }
     return getRebootDc2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DestroyDc2Request,
      com.didiyun.compute.v1.DestroyDc2Response> getDestroyDc2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyDc2",
      requestType = com.didiyun.compute.v1.DestroyDc2Request.class,
      responseType = com.didiyun.compute.v1.DestroyDc2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DestroyDc2Request,
      com.didiyun.compute.v1.DestroyDc2Response> getDestroyDc2Method() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DestroyDc2Request, com.didiyun.compute.v1.DestroyDc2Response> getDestroyDc2Method;
    if ((getDestroyDc2Method = Dc2Grpc.getDestroyDc2Method) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getDestroyDc2Method = Dc2Grpc.getDestroyDc2Method) == null) {
          Dc2Grpc.getDestroyDc2Method = getDestroyDc2Method = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DestroyDc2Request, com.didiyun.compute.v1.DestroyDc2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "DestroyDc2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DestroyDc2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DestroyDc2Response.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("DestroyDc2"))
                  .build();
          }
        }
     }
     return getDestroyDc2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeDc2NameRequest,
      com.didiyun.compute.v1.ChangeDc2NameResponse> getChangeDc2NameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeDc2Name",
      requestType = com.didiyun.compute.v1.ChangeDc2NameRequest.class,
      responseType = com.didiyun.compute.v1.ChangeDc2NameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeDc2NameRequest,
      com.didiyun.compute.v1.ChangeDc2NameResponse> getChangeDc2NameMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeDc2NameRequest, com.didiyun.compute.v1.ChangeDc2NameResponse> getChangeDc2NameMethod;
    if ((getChangeDc2NameMethod = Dc2Grpc.getChangeDc2NameMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getChangeDc2NameMethod = Dc2Grpc.getChangeDc2NameMethod) == null) {
          Dc2Grpc.getChangeDc2NameMethod = getChangeDc2NameMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeDc2NameRequest, com.didiyun.compute.v1.ChangeDc2NameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "ChangeDc2Name"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeDc2NameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeDc2NameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("ChangeDc2Name"))
                  .build();
          }
        }
     }
     return getChangeDc2NameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeDc2PasswordRequest,
      com.didiyun.compute.v1.ChangeDc2PasswordResponse> getChangeDc2PasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeDc2Password",
      requestType = com.didiyun.compute.v1.ChangeDc2PasswordRequest.class,
      responseType = com.didiyun.compute.v1.ChangeDc2PasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeDc2PasswordRequest,
      com.didiyun.compute.v1.ChangeDc2PasswordResponse> getChangeDc2PasswordMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeDc2PasswordRequest, com.didiyun.compute.v1.ChangeDc2PasswordResponse> getChangeDc2PasswordMethod;
    if ((getChangeDc2PasswordMethod = Dc2Grpc.getChangeDc2PasswordMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getChangeDc2PasswordMethod = Dc2Grpc.getChangeDc2PasswordMethod) == null) {
          Dc2Grpc.getChangeDc2PasswordMethod = getChangeDc2PasswordMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeDc2PasswordRequest, com.didiyun.compute.v1.ChangeDc2PasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "ChangeDc2Password"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeDc2PasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeDc2PasswordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("ChangeDc2Password"))
                  .build();
          }
        }
     }
     return getChangeDc2PasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ReinstallDc2SystemRequest,
      com.didiyun.compute.v1.ReinstallDc2SystemResponse> getReinstallDc2SystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReinstallDc2System",
      requestType = com.didiyun.compute.v1.ReinstallDc2SystemRequest.class,
      responseType = com.didiyun.compute.v1.ReinstallDc2SystemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ReinstallDc2SystemRequest,
      com.didiyun.compute.v1.ReinstallDc2SystemResponse> getReinstallDc2SystemMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ReinstallDc2SystemRequest, com.didiyun.compute.v1.ReinstallDc2SystemResponse> getReinstallDc2SystemMethod;
    if ((getReinstallDc2SystemMethod = Dc2Grpc.getReinstallDc2SystemMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getReinstallDc2SystemMethod = Dc2Grpc.getReinstallDc2SystemMethod) == null) {
          Dc2Grpc.getReinstallDc2SystemMethod = getReinstallDc2SystemMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ReinstallDc2SystemRequest, com.didiyun.compute.v1.ReinstallDc2SystemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "ReinstallDc2System"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ReinstallDc2SystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ReinstallDc2SystemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("ReinstallDc2System"))
                  .build();
          }
        }
     }
     return getReinstallDc2SystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateDc2Request,
      com.didiyun.compute.v1.CreateDc2Response> getCreateDc2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDc2",
      requestType = com.didiyun.compute.v1.CreateDc2Request.class,
      responseType = com.didiyun.compute.v1.CreateDc2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateDc2Request,
      com.didiyun.compute.v1.CreateDc2Response> getCreateDc2Method() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateDc2Request, com.didiyun.compute.v1.CreateDc2Response> getCreateDc2Method;
    if ((getCreateDc2Method = Dc2Grpc.getCreateDc2Method) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getCreateDc2Method = Dc2Grpc.getCreateDc2Method) == null) {
          Dc2Grpc.getCreateDc2Method = getCreateDc2Method = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateDc2Request, com.didiyun.compute.v1.CreateDc2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "CreateDc2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateDc2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateDc2Response.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("CreateDc2"))
                  .build();
          }
        }
     }
     return getCreateDc2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeDc2SpecRequest,
      com.didiyun.compute.v1.ChangeDc2SpecResponse> getChangeDc2SpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeDc2Spec",
      requestType = com.didiyun.compute.v1.ChangeDc2SpecRequest.class,
      responseType = com.didiyun.compute.v1.ChangeDc2SpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeDc2SpecRequest,
      com.didiyun.compute.v1.ChangeDc2SpecResponse> getChangeDc2SpecMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeDc2SpecRequest, com.didiyun.compute.v1.ChangeDc2SpecResponse> getChangeDc2SpecMethod;
    if ((getChangeDc2SpecMethod = Dc2Grpc.getChangeDc2SpecMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getChangeDc2SpecMethod = Dc2Grpc.getChangeDc2SpecMethod) == null) {
          Dc2Grpc.getChangeDc2SpecMethod = getChangeDc2SpecMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeDc2SpecRequest, com.didiyun.compute.v1.ChangeDc2SpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "ChangeDc2Spec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeDc2SpecRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeDc2SpecResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("ChangeDc2Spec"))
                  .build();
          }
        }
     }
     return getChangeDc2SpecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListImageRequest,
      com.didiyun.compute.v1.ListImageResponse> getListImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListImage",
      requestType = com.didiyun.compute.v1.ListImageRequest.class,
      responseType = com.didiyun.compute.v1.ListImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListImageRequest,
      com.didiyun.compute.v1.ListImageResponse> getListImageMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListImageRequest, com.didiyun.compute.v1.ListImageResponse> getListImageMethod;
    if ((getListImageMethod = Dc2Grpc.getListImageMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getListImageMethod = Dc2Grpc.getListImageMethod) == null) {
          Dc2Grpc.getListImageMethod = getListImageMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListImageRequest, com.didiyun.compute.v1.ListImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "ListImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("ListImage"))
                  .build();
          }
        }
     }
     return getListImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSshKeyRequest,
      com.didiyun.compute.v1.ListSshKeyResponse> getListSshKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSshKey",
      requestType = com.didiyun.compute.v1.ListSshKeyRequest.class,
      responseType = com.didiyun.compute.v1.ListSshKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSshKeyRequest,
      com.didiyun.compute.v1.ListSshKeyResponse> getListSshKeyMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSshKeyRequest, com.didiyun.compute.v1.ListSshKeyResponse> getListSshKeyMethod;
    if ((getListSshKeyMethod = Dc2Grpc.getListSshKeyMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getListSshKeyMethod = Dc2Grpc.getListSshKeyMethod) == null) {
          Dc2Grpc.getListSshKeyMethod = getListSshKeyMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListSshKeyRequest, com.didiyun.compute.v1.ListSshKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "ListSshKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSshKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSshKeyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("ListSshKey"))
                  .build();
          }
        }
     }
     return getListSshKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSshKeyRequest,
      com.didiyun.compute.v1.CreateSshKeyResponse> getCreateSshKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSshKey",
      requestType = com.didiyun.compute.v1.CreateSshKeyRequest.class,
      responseType = com.didiyun.compute.v1.CreateSshKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSshKeyRequest,
      com.didiyun.compute.v1.CreateSshKeyResponse> getCreateSshKeyMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSshKeyRequest, com.didiyun.compute.v1.CreateSshKeyResponse> getCreateSshKeyMethod;
    if ((getCreateSshKeyMethod = Dc2Grpc.getCreateSshKeyMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getCreateSshKeyMethod = Dc2Grpc.getCreateSshKeyMethod) == null) {
          Dc2Grpc.getCreateSshKeyMethod = getCreateSshKeyMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateSshKeyRequest, com.didiyun.compute.v1.CreateSshKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "CreateSshKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSshKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSshKeyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("CreateSshKey"))
                  .build();
          }
        }
     }
     return getCreateSshKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSshKeyRequest,
      com.didiyun.compute.v1.DeleteSshKeyResponse> getDeleteSshKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSshKey",
      requestType = com.didiyun.compute.v1.DeleteSshKeyRequest.class,
      responseType = com.didiyun.compute.v1.DeleteSshKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSshKeyRequest,
      com.didiyun.compute.v1.DeleteSshKeyResponse> getDeleteSshKeyMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSshKeyRequest, com.didiyun.compute.v1.DeleteSshKeyResponse> getDeleteSshKeyMethod;
    if ((getDeleteSshKeyMethod = Dc2Grpc.getDeleteSshKeyMethod) == null) {
      synchronized (Dc2Grpc.class) {
        if ((getDeleteSshKeyMethod = Dc2Grpc.getDeleteSshKeyMethod) == null) {
          Dc2Grpc.getDeleteSshKeyMethod = getDeleteSshKeyMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DeleteSshKeyRequest, com.didiyun.compute.v1.DeleteSshKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Dc2", "DeleteSshKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSshKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSshKeyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Dc2MethodDescriptorSupplier("DeleteSshKey"))
                  .build();
          }
        }
     }
     return getDeleteSshKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Dc2Stub newStub(io.grpc.Channel channel) {
    return new Dc2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Dc2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Dc2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Dc2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Dc2FutureStub(channel);
  }

  /**
   */
  public static abstract class Dc2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取dc2列表
     * </pre>
     */
    public void listDc2(com.didiyun.compute.v1.ListDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListDc2Response> responseObserver) {
      asyncUnimplementedUnaryCall(getListDc2Method(), responseObserver);
    }

    /**
     * <pre>
     * 获取dc2数量
     * </pre>
     */
    public void getDc2TotalCnt(com.didiyun.compute.v1.GetDc2TotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetDc2TotalCntResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDc2TotalCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取dc2
     * </pre>
     */
    public void getDc2ByUuid(com.didiyun.compute.v1.GetDc2ByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetDc2ByUuidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDc2ByUuidMethod(), responseObserver);
    }

    /**
     * <pre>
     * dc2开机
     * </pre>
     */
    public void startDc2(com.didiyun.compute.v1.StartDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.StartDc2Response> responseObserver) {
      asyncUnimplementedUnaryCall(getStartDc2Method(), responseObserver);
    }

    /**
     * <pre>
     * dc2关机
     * </pre>
     */
    public void stopDc2(com.didiyun.compute.v1.StopDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.StopDc2Response> responseObserver) {
      asyncUnimplementedUnaryCall(getStopDc2Method(), responseObserver);
    }

    /**
     * <pre>
     * dc2重启
     * </pre>
     */
    public void rebootDc2(com.didiyun.compute.v1.RebootDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.RebootDc2Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRebootDc2Method(), responseObserver);
    }

    /**
     * <pre>
     * 删除dc2
     * </pre>
     */
    public void destroyDc2(com.didiyun.compute.v1.DestroyDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DestroyDc2Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyDc2Method(), responseObserver);
    }

    /**
     * <pre>
     * 更改dc2名称
     * </pre>
     */
    public void changeDc2Name(com.didiyun.compute.v1.ChangeDc2NameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeDc2NameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDc2NameMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更改dc2密码
     * </pre>
     */
    public void changeDc2Password(com.didiyun.compute.v1.ChangeDc2PasswordRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeDc2PasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDc2PasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * 重装dc2系统
     * </pre>
     */
    public void reinstallDc2System(com.didiyun.compute.v1.ReinstallDc2SystemRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ReinstallDc2SystemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReinstallDc2SystemMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建dc2
     * </pre>
     */
    public void createDc2(com.didiyun.compute.v1.CreateDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateDc2Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDc2Method(), responseObserver);
    }

    /**
     * <pre>
     * 更改dc2配置
     * </pre>
     */
    public void changeDc2Spec(com.didiyun.compute.v1.ChangeDc2SpecRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeDc2SpecResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDc2SpecMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取image列表
     * </pre>
     */
    public void listImage(com.didiyun.compute.v1.ListImageRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取sshkey列表
     * </pre>
     */
    public void listSshKey(com.didiyun.compute.v1.ListSshKeyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSshKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSshKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建sshkey
     * </pre>
     */
    public void createSshKey(com.didiyun.compute.v1.CreateSshKeyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSshKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSshKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除sshkey
     * </pre>
     */
    public void deleteSshKey(com.didiyun.compute.v1.DeleteSshKeyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSshKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSshKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListDc2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListDc2Request,
                com.didiyun.compute.v1.ListDc2Response>(
                  this, METHODID_LIST_DC2)))
          .addMethod(
            getGetDc2TotalCntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetDc2TotalCntRequest,
                com.didiyun.compute.v1.GetDc2TotalCntResponse>(
                  this, METHODID_GET_DC2TOTAL_CNT)))
          .addMethod(
            getGetDc2ByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetDc2ByUuidRequest,
                com.didiyun.compute.v1.GetDc2ByUuidResponse>(
                  this, METHODID_GET_DC2BY_UUID)))
          .addMethod(
            getStartDc2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.StartDc2Request,
                com.didiyun.compute.v1.StartDc2Response>(
                  this, METHODID_START_DC2)))
          .addMethod(
            getStopDc2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.StopDc2Request,
                com.didiyun.compute.v1.StopDc2Response>(
                  this, METHODID_STOP_DC2)))
          .addMethod(
            getRebootDc2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.RebootDc2Request,
                com.didiyun.compute.v1.RebootDc2Response>(
                  this, METHODID_REBOOT_DC2)))
          .addMethod(
            getDestroyDc2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DestroyDc2Request,
                com.didiyun.compute.v1.DestroyDc2Response>(
                  this, METHODID_DESTROY_DC2)))
          .addMethod(
            getChangeDc2NameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeDc2NameRequest,
                com.didiyun.compute.v1.ChangeDc2NameResponse>(
                  this, METHODID_CHANGE_DC2NAME)))
          .addMethod(
            getChangeDc2PasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeDc2PasswordRequest,
                com.didiyun.compute.v1.ChangeDc2PasswordResponse>(
                  this, METHODID_CHANGE_DC2PASSWORD)))
          .addMethod(
            getReinstallDc2SystemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ReinstallDc2SystemRequest,
                com.didiyun.compute.v1.ReinstallDc2SystemResponse>(
                  this, METHODID_REINSTALL_DC2SYSTEM)))
          .addMethod(
            getCreateDc2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateDc2Request,
                com.didiyun.compute.v1.CreateDc2Response>(
                  this, METHODID_CREATE_DC2)))
          .addMethod(
            getChangeDc2SpecMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeDc2SpecRequest,
                com.didiyun.compute.v1.ChangeDc2SpecResponse>(
                  this, METHODID_CHANGE_DC2SPEC)))
          .addMethod(
            getListImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListImageRequest,
                com.didiyun.compute.v1.ListImageResponse>(
                  this, METHODID_LIST_IMAGE)))
          .addMethod(
            getListSshKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListSshKeyRequest,
                com.didiyun.compute.v1.ListSshKeyResponse>(
                  this, METHODID_LIST_SSH_KEY)))
          .addMethod(
            getCreateSshKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateSshKeyRequest,
                com.didiyun.compute.v1.CreateSshKeyResponse>(
                  this, METHODID_CREATE_SSH_KEY)))
          .addMethod(
            getDeleteSshKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DeleteSshKeyRequest,
                com.didiyun.compute.v1.DeleteSshKeyResponse>(
                  this, METHODID_DELETE_SSH_KEY)))
          .build();
    }
  }

  /**
   */
  public static final class Dc2Stub extends io.grpc.stub.AbstractStub<Dc2Stub> {
    private Dc2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Dc2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Dc2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Dc2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取dc2列表
     * </pre>
     */
    public void listDc2(com.didiyun.compute.v1.ListDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListDc2Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDc2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取dc2数量
     * </pre>
     */
    public void getDc2TotalCnt(com.didiyun.compute.v1.GetDc2TotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetDc2TotalCntResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDc2TotalCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取dc2
     * </pre>
     */
    public void getDc2ByUuid(com.didiyun.compute.v1.GetDc2ByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetDc2ByUuidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDc2ByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * dc2开机
     * </pre>
     */
    public void startDc2(com.didiyun.compute.v1.StartDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.StartDc2Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartDc2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * dc2关机
     * </pre>
     */
    public void stopDc2(com.didiyun.compute.v1.StopDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.StopDc2Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopDc2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * dc2重启
     * </pre>
     */
    public void rebootDc2(com.didiyun.compute.v1.RebootDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.RebootDc2Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRebootDc2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除dc2
     * </pre>
     */
    public void destroyDc2(com.didiyun.compute.v1.DestroyDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DestroyDc2Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyDc2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更改dc2名称
     * </pre>
     */
    public void changeDc2Name(com.didiyun.compute.v1.ChangeDc2NameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeDc2NameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeDc2NameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更改dc2密码
     * </pre>
     */
    public void changeDc2Password(com.didiyun.compute.v1.ChangeDc2PasswordRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeDc2PasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeDc2PasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 重装dc2系统
     * </pre>
     */
    public void reinstallDc2System(com.didiyun.compute.v1.ReinstallDc2SystemRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ReinstallDc2SystemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReinstallDc2SystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建dc2
     * </pre>
     */
    public void createDc2(com.didiyun.compute.v1.CreateDc2Request request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateDc2Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDc2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更改dc2配置
     * </pre>
     */
    public void changeDc2Spec(com.didiyun.compute.v1.ChangeDc2SpecRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeDc2SpecResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeDc2SpecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取image列表
     * </pre>
     */
    public void listImage(com.didiyun.compute.v1.ListImageRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取sshkey列表
     * </pre>
     */
    public void listSshKey(com.didiyun.compute.v1.ListSshKeyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSshKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSshKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建sshkey
     * </pre>
     */
    public void createSshKey(com.didiyun.compute.v1.CreateSshKeyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSshKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSshKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除sshkey
     * </pre>
     */
    public void deleteSshKey(com.didiyun.compute.v1.DeleteSshKeyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSshKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSshKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Dc2BlockingStub extends io.grpc.stub.AbstractStub<Dc2BlockingStub> {
    private Dc2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Dc2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Dc2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Dc2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取dc2列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListDc2Response listDc2(com.didiyun.compute.v1.ListDc2Request request) {
      return blockingUnaryCall(
          getChannel(), getListDc2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取dc2数量
     * </pre>
     */
    public com.didiyun.compute.v1.GetDc2TotalCntResponse getDc2TotalCnt(com.didiyun.compute.v1.GetDc2TotalCntRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDc2TotalCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据uuid获取dc2
     * </pre>
     */
    public com.didiyun.compute.v1.GetDc2ByUuidResponse getDc2ByUuid(com.didiyun.compute.v1.GetDc2ByUuidRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDc2ByUuidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * dc2开机
     * </pre>
     */
    public com.didiyun.compute.v1.StartDc2Response startDc2(com.didiyun.compute.v1.StartDc2Request request) {
      return blockingUnaryCall(
          getChannel(), getStartDc2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * dc2关机
     * </pre>
     */
    public com.didiyun.compute.v1.StopDc2Response stopDc2(com.didiyun.compute.v1.StopDc2Request request) {
      return blockingUnaryCall(
          getChannel(), getStopDc2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * dc2重启
     * </pre>
     */
    public com.didiyun.compute.v1.RebootDc2Response rebootDc2(com.didiyun.compute.v1.RebootDc2Request request) {
      return blockingUnaryCall(
          getChannel(), getRebootDc2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除dc2
     * </pre>
     */
    public com.didiyun.compute.v1.DestroyDc2Response destroyDc2(com.didiyun.compute.v1.DestroyDc2Request request) {
      return blockingUnaryCall(
          getChannel(), getDestroyDc2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更改dc2名称
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeDc2NameResponse changeDc2Name(com.didiyun.compute.v1.ChangeDc2NameRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeDc2NameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更改dc2密码
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeDc2PasswordResponse changeDc2Password(com.didiyun.compute.v1.ChangeDc2PasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeDc2PasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 重装dc2系统
     * </pre>
     */
    public com.didiyun.compute.v1.ReinstallDc2SystemResponse reinstallDc2System(com.didiyun.compute.v1.ReinstallDc2SystemRequest request) {
      return blockingUnaryCall(
          getChannel(), getReinstallDc2SystemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建dc2
     * </pre>
     */
    public com.didiyun.compute.v1.CreateDc2Response createDc2(com.didiyun.compute.v1.CreateDc2Request request) {
      return blockingUnaryCall(
          getChannel(), getCreateDc2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更改dc2配置
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeDc2SpecResponse changeDc2Spec(com.didiyun.compute.v1.ChangeDc2SpecRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeDc2SpecMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取image列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListImageResponse listImage(com.didiyun.compute.v1.ListImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getListImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取sshkey列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListSshKeyResponse listSshKey(com.didiyun.compute.v1.ListSshKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSshKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建sshkey
     * </pre>
     */
    public com.didiyun.compute.v1.CreateSshKeyResponse createSshKey(com.didiyun.compute.v1.CreateSshKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSshKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除sshkey
     * </pre>
     */
    public com.didiyun.compute.v1.DeleteSshKeyResponse deleteSshKey(com.didiyun.compute.v1.DeleteSshKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSshKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Dc2FutureStub extends io.grpc.stub.AbstractStub<Dc2FutureStub> {
    private Dc2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Dc2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Dc2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Dc2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取dc2列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListDc2Response> listDc2(
        com.didiyun.compute.v1.ListDc2Request request) {
      return futureUnaryCall(
          getChannel().newCall(getListDc2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取dc2数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetDc2TotalCntResponse> getDc2TotalCnt(
        com.didiyun.compute.v1.GetDc2TotalCntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDc2TotalCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据uuid获取dc2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetDc2ByUuidResponse> getDc2ByUuid(
        com.didiyun.compute.v1.GetDc2ByUuidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDc2ByUuidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * dc2开机
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.StartDc2Response> startDc2(
        com.didiyun.compute.v1.StartDc2Request request) {
      return futureUnaryCall(
          getChannel().newCall(getStartDc2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * dc2关机
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.StopDc2Response> stopDc2(
        com.didiyun.compute.v1.StopDc2Request request) {
      return futureUnaryCall(
          getChannel().newCall(getStopDc2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * dc2重启
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.RebootDc2Response> rebootDc2(
        com.didiyun.compute.v1.RebootDc2Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRebootDc2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除dc2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DestroyDc2Response> destroyDc2(
        com.didiyun.compute.v1.DestroyDc2Request request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyDc2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更改dc2名称
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeDc2NameResponse> changeDc2Name(
        com.didiyun.compute.v1.ChangeDc2NameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeDc2NameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更改dc2密码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeDc2PasswordResponse> changeDc2Password(
        com.didiyun.compute.v1.ChangeDc2PasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeDc2PasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 重装dc2系统
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ReinstallDc2SystemResponse> reinstallDc2System(
        com.didiyun.compute.v1.ReinstallDc2SystemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReinstallDc2SystemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建dc2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateDc2Response> createDc2(
        com.didiyun.compute.v1.CreateDc2Request request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDc2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更改dc2配置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeDc2SpecResponse> changeDc2Spec(
        com.didiyun.compute.v1.ChangeDc2SpecRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeDc2SpecMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取image列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListImageResponse> listImage(
        com.didiyun.compute.v1.ListImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取sshkey列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListSshKeyResponse> listSshKey(
        com.didiyun.compute.v1.ListSshKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSshKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建sshkey
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateSshKeyResponse> createSshKey(
        com.didiyun.compute.v1.CreateSshKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSshKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除sshkey
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DeleteSshKeyResponse> deleteSshKey(
        com.didiyun.compute.v1.DeleteSshKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSshKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DC2 = 0;
  private static final int METHODID_GET_DC2TOTAL_CNT = 1;
  private static final int METHODID_GET_DC2BY_UUID = 2;
  private static final int METHODID_START_DC2 = 3;
  private static final int METHODID_STOP_DC2 = 4;
  private static final int METHODID_REBOOT_DC2 = 5;
  private static final int METHODID_DESTROY_DC2 = 6;
  private static final int METHODID_CHANGE_DC2NAME = 7;
  private static final int METHODID_CHANGE_DC2PASSWORD = 8;
  private static final int METHODID_REINSTALL_DC2SYSTEM = 9;
  private static final int METHODID_CREATE_DC2 = 10;
  private static final int METHODID_CHANGE_DC2SPEC = 11;
  private static final int METHODID_LIST_IMAGE = 12;
  private static final int METHODID_LIST_SSH_KEY = 13;
  private static final int METHODID_CREATE_SSH_KEY = 14;
  private static final int METHODID_DELETE_SSH_KEY = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Dc2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Dc2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DC2:
          serviceImpl.listDc2((com.didiyun.compute.v1.ListDc2Request) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListDc2Response>) responseObserver);
          break;
        case METHODID_GET_DC2TOTAL_CNT:
          serviceImpl.getDc2TotalCnt((com.didiyun.compute.v1.GetDc2TotalCntRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetDc2TotalCntResponse>) responseObserver);
          break;
        case METHODID_GET_DC2BY_UUID:
          serviceImpl.getDc2ByUuid((com.didiyun.compute.v1.GetDc2ByUuidRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetDc2ByUuidResponse>) responseObserver);
          break;
        case METHODID_START_DC2:
          serviceImpl.startDc2((com.didiyun.compute.v1.StartDc2Request) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.StartDc2Response>) responseObserver);
          break;
        case METHODID_STOP_DC2:
          serviceImpl.stopDc2((com.didiyun.compute.v1.StopDc2Request) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.StopDc2Response>) responseObserver);
          break;
        case METHODID_REBOOT_DC2:
          serviceImpl.rebootDc2((com.didiyun.compute.v1.RebootDc2Request) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.RebootDc2Response>) responseObserver);
          break;
        case METHODID_DESTROY_DC2:
          serviceImpl.destroyDc2((com.didiyun.compute.v1.DestroyDc2Request) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DestroyDc2Response>) responseObserver);
          break;
        case METHODID_CHANGE_DC2NAME:
          serviceImpl.changeDc2Name((com.didiyun.compute.v1.ChangeDc2NameRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeDc2NameResponse>) responseObserver);
          break;
        case METHODID_CHANGE_DC2PASSWORD:
          serviceImpl.changeDc2Password((com.didiyun.compute.v1.ChangeDc2PasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeDc2PasswordResponse>) responseObserver);
          break;
        case METHODID_REINSTALL_DC2SYSTEM:
          serviceImpl.reinstallDc2System((com.didiyun.compute.v1.ReinstallDc2SystemRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ReinstallDc2SystemResponse>) responseObserver);
          break;
        case METHODID_CREATE_DC2:
          serviceImpl.createDc2((com.didiyun.compute.v1.CreateDc2Request) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateDc2Response>) responseObserver);
          break;
        case METHODID_CHANGE_DC2SPEC:
          serviceImpl.changeDc2Spec((com.didiyun.compute.v1.ChangeDc2SpecRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeDc2SpecResponse>) responseObserver);
          break;
        case METHODID_LIST_IMAGE:
          serviceImpl.listImage((com.didiyun.compute.v1.ListImageRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListImageResponse>) responseObserver);
          break;
        case METHODID_LIST_SSH_KEY:
          serviceImpl.listSshKey((com.didiyun.compute.v1.ListSshKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSshKeyResponse>) responseObserver);
          break;
        case METHODID_CREATE_SSH_KEY:
          serviceImpl.createSshKey((com.didiyun.compute.v1.CreateSshKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSshKeyResponse>) responseObserver);
          break;
        case METHODID_DELETE_SSH_KEY:
          serviceImpl.deleteSshKey((com.didiyun.compute.v1.DeleteSshKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSshKeyResponse>) responseObserver);
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

  private static abstract class Dc2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Dc2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.compute.v1.Dc2OuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Dc2");
    }
  }

  private static final class Dc2FileDescriptorSupplier
      extends Dc2BaseDescriptorSupplier {
    Dc2FileDescriptorSupplier() {}
  }

  private static final class Dc2MethodDescriptorSupplier
      extends Dc2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Dc2MethodDescriptorSupplier(String methodName) {
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
      synchronized (Dc2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Dc2FileDescriptorSupplier())
              .addMethod(getListDc2Method())
              .addMethod(getGetDc2TotalCntMethod())
              .addMethod(getGetDc2ByUuidMethod())
              .addMethod(getStartDc2Method())
              .addMethod(getStopDc2Method())
              .addMethod(getRebootDc2Method())
              .addMethod(getDestroyDc2Method())
              .addMethod(getChangeDc2NameMethod())
              .addMethod(getChangeDc2PasswordMethod())
              .addMethod(getReinstallDc2SystemMethod())
              .addMethod(getCreateDc2Method())
              .addMethod(getChangeDc2SpecMethod())
              .addMethod(getListImageMethod())
              .addMethod(getListSshKeyMethod())
              .addMethod(getCreateSshKeyMethod())
              .addMethod(getDeleteSshKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
