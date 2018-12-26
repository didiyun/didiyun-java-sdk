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
    comments = "Source: compute/v1/vpc.proto")
public final class VpcGrpc {

  private VpcGrpc() {}

  public static final String SERVICE_NAME = "didi.cloud.compute.v1.Vpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListVpcRequest,
      com.didiyun.compute.v1.ListVpcResponse> getListVpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVpc",
      requestType = com.didiyun.compute.v1.ListVpcRequest.class,
      responseType = com.didiyun.compute.v1.ListVpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListVpcRequest,
      com.didiyun.compute.v1.ListVpcResponse> getListVpcMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListVpcRequest, com.didiyun.compute.v1.ListVpcResponse> getListVpcMethod;
    if ((getListVpcMethod = VpcGrpc.getListVpcMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getListVpcMethod = VpcGrpc.getListVpcMethod) == null) {
          VpcGrpc.getListVpcMethod = getListVpcMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListVpcRequest, com.didiyun.compute.v1.ListVpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "ListVpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListVpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListVpcResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("ListVpc"))
                  .build();
          }
        }
     }
     return getListVpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetVpcByUuidRequest,
      com.didiyun.compute.v1.GetVpcByUuidResponse> getGetVpcByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVpcByUuid",
      requestType = com.didiyun.compute.v1.GetVpcByUuidRequest.class,
      responseType = com.didiyun.compute.v1.GetVpcByUuidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetVpcByUuidRequest,
      com.didiyun.compute.v1.GetVpcByUuidResponse> getGetVpcByUuidMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetVpcByUuidRequest, com.didiyun.compute.v1.GetVpcByUuidResponse> getGetVpcByUuidMethod;
    if ((getGetVpcByUuidMethod = VpcGrpc.getGetVpcByUuidMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getGetVpcByUuidMethod = VpcGrpc.getGetVpcByUuidMethod) == null) {
          VpcGrpc.getGetVpcByUuidMethod = getGetVpcByUuidMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetVpcByUuidRequest, com.didiyun.compute.v1.GetVpcByUuidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "GetVpcByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetVpcByUuidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetVpcByUuidResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("GetVpcByUuid"))
                  .build();
          }
        }
     }
     return getGetVpcByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetVpcTotalCntRequest,
      com.didiyun.compute.v1.GetVpcTotalCntResponse> getGetVpcTotalCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVpcTotalCnt",
      requestType = com.didiyun.compute.v1.GetVpcTotalCntRequest.class,
      responseType = com.didiyun.compute.v1.GetVpcTotalCntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetVpcTotalCntRequest,
      com.didiyun.compute.v1.GetVpcTotalCntResponse> getGetVpcTotalCntMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetVpcTotalCntRequest, com.didiyun.compute.v1.GetVpcTotalCntResponse> getGetVpcTotalCntMethod;
    if ((getGetVpcTotalCntMethod = VpcGrpc.getGetVpcTotalCntMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getGetVpcTotalCntMethod = VpcGrpc.getGetVpcTotalCntMethod) == null) {
          VpcGrpc.getGetVpcTotalCntMethod = getGetVpcTotalCntMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetVpcTotalCntRequest, com.didiyun.compute.v1.GetVpcTotalCntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "GetVpcTotalCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetVpcTotalCntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetVpcTotalCntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("GetVpcTotalCnt"))
                  .build();
          }
        }
     }
     return getGetVpcTotalCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateVpcRequest,
      com.didiyun.compute.v1.CreateVpcResponse> getCreateVpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVpc",
      requestType = com.didiyun.compute.v1.CreateVpcRequest.class,
      responseType = com.didiyun.compute.v1.CreateVpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateVpcRequest,
      com.didiyun.compute.v1.CreateVpcResponse> getCreateVpcMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateVpcRequest, com.didiyun.compute.v1.CreateVpcResponse> getCreateVpcMethod;
    if ((getCreateVpcMethod = VpcGrpc.getCreateVpcMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getCreateVpcMethod = VpcGrpc.getCreateVpcMethod) == null) {
          VpcGrpc.getCreateVpcMethod = getCreateVpcMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateVpcRequest, com.didiyun.compute.v1.CreateVpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "CreateVpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateVpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateVpcResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("CreateVpc"))
                  .build();
          }
        }
     }
     return getCreateVpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteVpcRequest,
      com.didiyun.compute.v1.DeleteVpcResponse> getDeleteVpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVpc",
      requestType = com.didiyun.compute.v1.DeleteVpcRequest.class,
      responseType = com.didiyun.compute.v1.DeleteVpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteVpcRequest,
      com.didiyun.compute.v1.DeleteVpcResponse> getDeleteVpcMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteVpcRequest, com.didiyun.compute.v1.DeleteVpcResponse> getDeleteVpcMethod;
    if ((getDeleteVpcMethod = VpcGrpc.getDeleteVpcMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getDeleteVpcMethod = VpcGrpc.getDeleteVpcMethod) == null) {
          VpcGrpc.getDeleteVpcMethod = getDeleteVpcMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DeleteVpcRequest, com.didiyun.compute.v1.DeleteVpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "DeleteVpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteVpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteVpcResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("DeleteVpc"))
                  .build();
          }
        }
     }
     return getDeleteVpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeVpcNameRequest,
      com.didiyun.compute.v1.ChangeVpcNameResponse> getChangeVpcNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeVpcName",
      requestType = com.didiyun.compute.v1.ChangeVpcNameRequest.class,
      responseType = com.didiyun.compute.v1.ChangeVpcNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeVpcNameRequest,
      com.didiyun.compute.v1.ChangeVpcNameResponse> getChangeVpcNameMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeVpcNameRequest, com.didiyun.compute.v1.ChangeVpcNameResponse> getChangeVpcNameMethod;
    if ((getChangeVpcNameMethod = VpcGrpc.getChangeVpcNameMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getChangeVpcNameMethod = VpcGrpc.getChangeVpcNameMethod) == null) {
          VpcGrpc.getChangeVpcNameMethod = getChangeVpcNameMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeVpcNameRequest, com.didiyun.compute.v1.ChangeVpcNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "ChangeVpcName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeVpcNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeVpcNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("ChangeVpcName"))
                  .build();
          }
        }
     }
     return getChangeVpcNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListVpcAvailableCidrRequest,
      com.didiyun.compute.v1.ListVpcAvailableCidrResponse> getListVpcAvailableCidrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVpcAvailableCidr",
      requestType = com.didiyun.compute.v1.ListVpcAvailableCidrRequest.class,
      responseType = com.didiyun.compute.v1.ListVpcAvailableCidrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListVpcAvailableCidrRequest,
      com.didiyun.compute.v1.ListVpcAvailableCidrResponse> getListVpcAvailableCidrMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListVpcAvailableCidrRequest, com.didiyun.compute.v1.ListVpcAvailableCidrResponse> getListVpcAvailableCidrMethod;
    if ((getListVpcAvailableCidrMethod = VpcGrpc.getListVpcAvailableCidrMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getListVpcAvailableCidrMethod = VpcGrpc.getListVpcAvailableCidrMethod) == null) {
          VpcGrpc.getListVpcAvailableCidrMethod = getListVpcAvailableCidrMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListVpcAvailableCidrRequest, com.didiyun.compute.v1.ListVpcAvailableCidrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "ListVpcAvailableCidr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListVpcAvailableCidrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListVpcAvailableCidrResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("ListVpcAvailableCidr"))
                  .build();
          }
        }
     }
     return getListVpcAvailableCidrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSubnetRequest,
      com.didiyun.compute.v1.ListSubnetResponse> getListSubnetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubnet",
      requestType = com.didiyun.compute.v1.ListSubnetRequest.class,
      responseType = com.didiyun.compute.v1.ListSubnetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSubnetRequest,
      com.didiyun.compute.v1.ListSubnetResponse> getListSubnetMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ListSubnetRequest, com.didiyun.compute.v1.ListSubnetResponse> getListSubnetMethod;
    if ((getListSubnetMethod = VpcGrpc.getListSubnetMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getListSubnetMethod = VpcGrpc.getListSubnetMethod) == null) {
          VpcGrpc.getListSubnetMethod = getListSubnetMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ListSubnetRequest, com.didiyun.compute.v1.ListSubnetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "ListSubnet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ListSubnetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("ListSubnet"))
                  .build();
          }
        }
     }
     return getListSubnetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSubnetByUuidRequest,
      com.didiyun.compute.v1.GetSubnetByUuidResponse> getGetSubnetByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubnetByUuid",
      requestType = com.didiyun.compute.v1.GetSubnetByUuidRequest.class,
      responseType = com.didiyun.compute.v1.GetSubnetByUuidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSubnetByUuidRequest,
      com.didiyun.compute.v1.GetSubnetByUuidResponse> getGetSubnetByUuidMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSubnetByUuidRequest, com.didiyun.compute.v1.GetSubnetByUuidResponse> getGetSubnetByUuidMethod;
    if ((getGetSubnetByUuidMethod = VpcGrpc.getGetSubnetByUuidMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getGetSubnetByUuidMethod = VpcGrpc.getGetSubnetByUuidMethod) == null) {
          VpcGrpc.getGetSubnetByUuidMethod = getGetSubnetByUuidMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetSubnetByUuidRequest, com.didiyun.compute.v1.GetSubnetByUuidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "GetSubnetByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSubnetByUuidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSubnetByUuidResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("GetSubnetByUuid"))
                  .build();
          }
        }
     }
     return getGetSubnetByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSubnetTotalCntRequest,
      com.didiyun.compute.v1.GetSubnetTotalCntResponse> getGetSubnetTotalCntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubnetTotalCnt",
      requestType = com.didiyun.compute.v1.GetSubnetTotalCntRequest.class,
      responseType = com.didiyun.compute.v1.GetSubnetTotalCntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSubnetTotalCntRequest,
      com.didiyun.compute.v1.GetSubnetTotalCntResponse> getGetSubnetTotalCntMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.GetSubnetTotalCntRequest, com.didiyun.compute.v1.GetSubnetTotalCntResponse> getGetSubnetTotalCntMethod;
    if ((getGetSubnetTotalCntMethod = VpcGrpc.getGetSubnetTotalCntMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getGetSubnetTotalCntMethod = VpcGrpc.getGetSubnetTotalCntMethod) == null) {
          VpcGrpc.getGetSubnetTotalCntMethod = getGetSubnetTotalCntMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.GetSubnetTotalCntRequest, com.didiyun.compute.v1.GetSubnetTotalCntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "GetSubnetTotalCnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSubnetTotalCntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.GetSubnetTotalCntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("GetSubnetTotalCnt"))
                  .build();
          }
        }
     }
     return getGetSubnetTotalCntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSubnetRequest,
      com.didiyun.compute.v1.CreateSubnetResponse> getCreateSubnetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSubnet",
      requestType = com.didiyun.compute.v1.CreateSubnetRequest.class,
      responseType = com.didiyun.compute.v1.CreateSubnetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSubnetRequest,
      com.didiyun.compute.v1.CreateSubnetResponse> getCreateSubnetMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CreateSubnetRequest, com.didiyun.compute.v1.CreateSubnetResponse> getCreateSubnetMethod;
    if ((getCreateSubnetMethod = VpcGrpc.getCreateSubnetMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getCreateSubnetMethod = VpcGrpc.getCreateSubnetMethod) == null) {
          VpcGrpc.getCreateSubnetMethod = getCreateSubnetMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CreateSubnetRequest, com.didiyun.compute.v1.CreateSubnetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "CreateSubnet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CreateSubnetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("CreateSubnet"))
                  .build();
          }
        }
     }
     return getCreateSubnetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSubnetRequest,
      com.didiyun.compute.v1.DeleteSubnetResponse> getDeleteSubnetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSubnet",
      requestType = com.didiyun.compute.v1.DeleteSubnetRequest.class,
      responseType = com.didiyun.compute.v1.DeleteSubnetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSubnetRequest,
      com.didiyun.compute.v1.DeleteSubnetResponse> getDeleteSubnetMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.DeleteSubnetRequest, com.didiyun.compute.v1.DeleteSubnetResponse> getDeleteSubnetMethod;
    if ((getDeleteSubnetMethod = VpcGrpc.getDeleteSubnetMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getDeleteSubnetMethod = VpcGrpc.getDeleteSubnetMethod) == null) {
          VpcGrpc.getDeleteSubnetMethod = getDeleteSubnetMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.DeleteSubnetRequest, com.didiyun.compute.v1.DeleteSubnetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "DeleteSubnet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.DeleteSubnetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("DeleteSubnet"))
                  .build();
          }
        }
     }
     return getDeleteSubnetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeSubnetNameRequest,
      com.didiyun.compute.v1.ChangeSubnetNameResponse> getChangeSubnetNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeSubnetName",
      requestType = com.didiyun.compute.v1.ChangeSubnetNameRequest.class,
      responseType = com.didiyun.compute.v1.ChangeSubnetNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeSubnetNameRequest,
      com.didiyun.compute.v1.ChangeSubnetNameResponse> getChangeSubnetNameMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.ChangeSubnetNameRequest, com.didiyun.compute.v1.ChangeSubnetNameResponse> getChangeSubnetNameMethod;
    if ((getChangeSubnetNameMethod = VpcGrpc.getChangeSubnetNameMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getChangeSubnetNameMethod = VpcGrpc.getChangeSubnetNameMethod) == null) {
          VpcGrpc.getChangeSubnetNameMethod = getChangeSubnetNameMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.ChangeSubnetNameRequest, com.didiyun.compute.v1.ChangeSubnetNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "ChangeSubnetName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeSubnetNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.ChangeSubnetNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("ChangeSubnetName"))
                  .build();
          }
        }
     }
     return getChangeSubnetNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest,
      com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse> getCheckSubnetCidrOverlapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckSubnetCidrOverlap",
      requestType = com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest.class,
      responseType = com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest,
      com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse> getCheckSubnetCidrOverlapMethod() {
    io.grpc.MethodDescriptor<com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest, com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse> getCheckSubnetCidrOverlapMethod;
    if ((getCheckSubnetCidrOverlapMethod = VpcGrpc.getCheckSubnetCidrOverlapMethod) == null) {
      synchronized (VpcGrpc.class) {
        if ((getCheckSubnetCidrOverlapMethod = VpcGrpc.getCheckSubnetCidrOverlapMethod) == null) {
          VpcGrpc.getCheckSubnetCidrOverlapMethod = getCheckSubnetCidrOverlapMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest, com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.compute.v1.Vpc", "CheckSubnetCidrOverlap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VpcMethodDescriptorSupplier("CheckSubnetCidrOverlap"))
                  .build();
          }
        }
     }
     return getCheckSubnetCidrOverlapMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VpcStub newStub(io.grpc.Channel channel) {
    return new VpcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VpcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VpcFutureStub(channel);
  }

  /**
   */
  public static abstract class VpcImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取vpc列表
     * </pre>
     */
    public void listVpc(com.didiyun.compute.v1.ListVpcRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListVpcResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVpcMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取vpc
     * </pre>
     */
    public void getVpcByUuid(com.didiyun.compute.v1.GetVpcByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetVpcByUuidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVpcByUuidMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取vpc数量
     * </pre>
     */
    public void getVpcTotalCnt(com.didiyun.compute.v1.GetVpcTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetVpcTotalCntResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVpcTotalCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建vpc
     * </pre>
     */
    public void createVpc(com.didiyun.compute.v1.CreateVpcRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateVpcResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVpcMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除vpc
     * </pre>
     */
    public void deleteVpc(com.didiyun.compute.v1.DeleteVpcRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteVpcResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVpcMethod(), responseObserver);
    }

    /**
     * <pre>
     * 改名vpc
     * </pre>
     */
    public void changeVpcName(com.didiyun.compute.v1.ChangeVpcNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeVpcNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeVpcNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取可用网段
     * </pre>
     */
    public void listVpcAvailableCidr(com.didiyun.compute.v1.ListVpcAvailableCidrRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListVpcAvailableCidrResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVpcAvailableCidrMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取subnet列表
     * </pre>
     */
    public void listSubnet(com.didiyun.compute.v1.ListSubnetRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSubnetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSubnetMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取subnet
     * </pre>
     */
    public void getSubnetByUuid(com.didiyun.compute.v1.GetSubnetByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSubnetByUuidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSubnetByUuidMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取subnet数量
     * </pre>
     */
    public void getSubnetTotalCnt(com.didiyun.compute.v1.GetSubnetTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSubnetTotalCntResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSubnetTotalCntMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建subnet
     * </pre>
     */
    public void createSubnet(com.didiyun.compute.v1.CreateSubnetRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSubnetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSubnetMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除subnet
     * </pre>
     */
    public void deleteSubnet(com.didiyun.compute.v1.DeleteSubnetRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSubnetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSubnetMethod(), responseObserver);
    }

    /**
     * <pre>
     * 改名subnet
     * </pre>
     */
    public void changeSubnetName(com.didiyun.compute.v1.ChangeSubnetNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeSubnetNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeSubnetNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * 检查subnet所在vpc内子网网段是否有重叠
     * </pre>
     */
    public void checkSubnetCidrOverlap(com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckSubnetCidrOverlapMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListVpcMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListVpcRequest,
                com.didiyun.compute.v1.ListVpcResponse>(
                  this, METHODID_LIST_VPC)))
          .addMethod(
            getGetVpcByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetVpcByUuidRequest,
                com.didiyun.compute.v1.GetVpcByUuidResponse>(
                  this, METHODID_GET_VPC_BY_UUID)))
          .addMethod(
            getGetVpcTotalCntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetVpcTotalCntRequest,
                com.didiyun.compute.v1.GetVpcTotalCntResponse>(
                  this, METHODID_GET_VPC_TOTAL_CNT)))
          .addMethod(
            getCreateVpcMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateVpcRequest,
                com.didiyun.compute.v1.CreateVpcResponse>(
                  this, METHODID_CREATE_VPC)))
          .addMethod(
            getDeleteVpcMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DeleteVpcRequest,
                com.didiyun.compute.v1.DeleteVpcResponse>(
                  this, METHODID_DELETE_VPC)))
          .addMethod(
            getChangeVpcNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeVpcNameRequest,
                com.didiyun.compute.v1.ChangeVpcNameResponse>(
                  this, METHODID_CHANGE_VPC_NAME)))
          .addMethod(
            getListVpcAvailableCidrMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListVpcAvailableCidrRequest,
                com.didiyun.compute.v1.ListVpcAvailableCidrResponse>(
                  this, METHODID_LIST_VPC_AVAILABLE_CIDR)))
          .addMethod(
            getListSubnetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ListSubnetRequest,
                com.didiyun.compute.v1.ListSubnetResponse>(
                  this, METHODID_LIST_SUBNET)))
          .addMethod(
            getGetSubnetByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetSubnetByUuidRequest,
                com.didiyun.compute.v1.GetSubnetByUuidResponse>(
                  this, METHODID_GET_SUBNET_BY_UUID)))
          .addMethod(
            getGetSubnetTotalCntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.GetSubnetTotalCntRequest,
                com.didiyun.compute.v1.GetSubnetTotalCntResponse>(
                  this, METHODID_GET_SUBNET_TOTAL_CNT)))
          .addMethod(
            getCreateSubnetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CreateSubnetRequest,
                com.didiyun.compute.v1.CreateSubnetResponse>(
                  this, METHODID_CREATE_SUBNET)))
          .addMethod(
            getDeleteSubnetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.DeleteSubnetRequest,
                com.didiyun.compute.v1.DeleteSubnetResponse>(
                  this, METHODID_DELETE_SUBNET)))
          .addMethod(
            getChangeSubnetNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.ChangeSubnetNameRequest,
                com.didiyun.compute.v1.ChangeSubnetNameResponse>(
                  this, METHODID_CHANGE_SUBNET_NAME)))
          .addMethod(
            getCheckSubnetCidrOverlapMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest,
                com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse>(
                  this, METHODID_CHECK_SUBNET_CIDR_OVERLAP)))
          .build();
    }
  }

  /**
   */
  public static final class VpcStub extends io.grpc.stub.AbstractStub<VpcStub> {
    private VpcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VpcStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VpcStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VpcStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取vpc列表
     * </pre>
     */
    public void listVpc(com.didiyun.compute.v1.ListVpcRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListVpcResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取vpc
     * </pre>
     */
    public void getVpcByUuid(com.didiyun.compute.v1.GetVpcByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetVpcByUuidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVpcByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取vpc数量
     * </pre>
     */
    public void getVpcTotalCnt(com.didiyun.compute.v1.GetVpcTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetVpcTotalCntResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVpcTotalCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建vpc
     * </pre>
     */
    public void createVpc(com.didiyun.compute.v1.CreateVpcRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateVpcResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除vpc
     * </pre>
     */
    public void deleteVpc(com.didiyun.compute.v1.DeleteVpcRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteVpcResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 改名vpc
     * </pre>
     */
    public void changeVpcName(com.didiyun.compute.v1.ChangeVpcNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeVpcNameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeVpcNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取可用网段
     * </pre>
     */
    public void listVpcAvailableCidr(com.didiyun.compute.v1.ListVpcAvailableCidrRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListVpcAvailableCidrResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVpcAvailableCidrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取subnet列表
     * </pre>
     */
    public void listSubnet(com.didiyun.compute.v1.ListSubnetRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSubnetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSubnetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据uuid获取subnet
     * </pre>
     */
    public void getSubnetByUuid(com.didiyun.compute.v1.GetSubnetByUuidRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSubnetByUuidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSubnetByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取subnet数量
     * </pre>
     */
    public void getSubnetTotalCnt(com.didiyun.compute.v1.GetSubnetTotalCntRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSubnetTotalCntResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSubnetTotalCntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建subnet
     * </pre>
     */
    public void createSubnet(com.didiyun.compute.v1.CreateSubnetRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSubnetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSubnetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除subnet
     * </pre>
     */
    public void deleteSubnet(com.didiyun.compute.v1.DeleteSubnetRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSubnetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSubnetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 改名subnet
     * </pre>
     */
    public void changeSubnetName(com.didiyun.compute.v1.ChangeSubnetNameRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeSubnetNameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeSubnetNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 检查subnet所在vpc内子网网段是否有重叠
     * </pre>
     */
    public void checkSubnetCidrOverlap(com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckSubnetCidrOverlapMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VpcBlockingStub extends io.grpc.stub.AbstractStub<VpcBlockingStub> {
    private VpcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VpcBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VpcBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VpcBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取vpc列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListVpcResponse listVpc(com.didiyun.compute.v1.ListVpcRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVpcMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据uuid获取vpc
     * </pre>
     */
    public com.didiyun.compute.v1.GetVpcByUuidResponse getVpcByUuid(com.didiyun.compute.v1.GetVpcByUuidRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVpcByUuidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取vpc数量
     * </pre>
     */
    public com.didiyun.compute.v1.GetVpcTotalCntResponse getVpcTotalCnt(com.didiyun.compute.v1.GetVpcTotalCntRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVpcTotalCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建vpc
     * </pre>
     */
    public com.didiyun.compute.v1.CreateVpcResponse createVpc(com.didiyun.compute.v1.CreateVpcRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVpcMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除vpc
     * </pre>
     */
    public com.didiyun.compute.v1.DeleteVpcResponse deleteVpc(com.didiyun.compute.v1.DeleteVpcRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVpcMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 改名vpc
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeVpcNameResponse changeVpcName(com.didiyun.compute.v1.ChangeVpcNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeVpcNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取可用网段
     * </pre>
     */
    public com.didiyun.compute.v1.ListVpcAvailableCidrResponse listVpcAvailableCidr(com.didiyun.compute.v1.ListVpcAvailableCidrRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVpcAvailableCidrMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取subnet列表
     * </pre>
     */
    public com.didiyun.compute.v1.ListSubnetResponse listSubnet(com.didiyun.compute.v1.ListSubnetRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSubnetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据uuid获取subnet
     * </pre>
     */
    public com.didiyun.compute.v1.GetSubnetByUuidResponse getSubnetByUuid(com.didiyun.compute.v1.GetSubnetByUuidRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSubnetByUuidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取subnet数量
     * </pre>
     */
    public com.didiyun.compute.v1.GetSubnetTotalCntResponse getSubnetTotalCnt(com.didiyun.compute.v1.GetSubnetTotalCntRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSubnetTotalCntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建subnet
     * </pre>
     */
    public com.didiyun.compute.v1.CreateSubnetResponse createSubnet(com.didiyun.compute.v1.CreateSubnetRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSubnetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除subnet
     * </pre>
     */
    public com.didiyun.compute.v1.DeleteSubnetResponse deleteSubnet(com.didiyun.compute.v1.DeleteSubnetRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSubnetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 改名subnet
     * </pre>
     */
    public com.didiyun.compute.v1.ChangeSubnetNameResponse changeSubnetName(com.didiyun.compute.v1.ChangeSubnetNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeSubnetNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 检查subnet所在vpc内子网网段是否有重叠
     * </pre>
     */
    public com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse checkSubnetCidrOverlap(com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckSubnetCidrOverlapMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VpcFutureStub extends io.grpc.stub.AbstractStub<VpcFutureStub> {
    private VpcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VpcFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VpcFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VpcFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取vpc列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListVpcResponse> listVpc(
        com.didiyun.compute.v1.ListVpcRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVpcMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据uuid获取vpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetVpcByUuidResponse> getVpcByUuid(
        com.didiyun.compute.v1.GetVpcByUuidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVpcByUuidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取vpc数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetVpcTotalCntResponse> getVpcTotalCnt(
        com.didiyun.compute.v1.GetVpcTotalCntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVpcTotalCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建vpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateVpcResponse> createVpc(
        com.didiyun.compute.v1.CreateVpcRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVpcMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除vpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DeleteVpcResponse> deleteVpc(
        com.didiyun.compute.v1.DeleteVpcRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVpcMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 改名vpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeVpcNameResponse> changeVpcName(
        com.didiyun.compute.v1.ChangeVpcNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeVpcNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取可用网段
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListVpcAvailableCidrResponse> listVpcAvailableCidr(
        com.didiyun.compute.v1.ListVpcAvailableCidrRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVpcAvailableCidrMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取subnet列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ListSubnetResponse> listSubnet(
        com.didiyun.compute.v1.ListSubnetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSubnetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据uuid获取subnet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetSubnetByUuidResponse> getSubnetByUuid(
        com.didiyun.compute.v1.GetSubnetByUuidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSubnetByUuidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取subnet数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.GetSubnetTotalCntResponse> getSubnetTotalCnt(
        com.didiyun.compute.v1.GetSubnetTotalCntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSubnetTotalCntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建subnet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CreateSubnetResponse> createSubnet(
        com.didiyun.compute.v1.CreateSubnetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSubnetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除subnet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.DeleteSubnetResponse> deleteSubnet(
        com.didiyun.compute.v1.DeleteSubnetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSubnetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 改名subnet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.ChangeSubnetNameResponse> changeSubnetName(
        com.didiyun.compute.v1.ChangeSubnetNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeSubnetNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 检查subnet所在vpc内子网网段是否有重叠
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse> checkSubnetCidrOverlap(
        com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckSubnetCidrOverlapMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_VPC = 0;
  private static final int METHODID_GET_VPC_BY_UUID = 1;
  private static final int METHODID_GET_VPC_TOTAL_CNT = 2;
  private static final int METHODID_CREATE_VPC = 3;
  private static final int METHODID_DELETE_VPC = 4;
  private static final int METHODID_CHANGE_VPC_NAME = 5;
  private static final int METHODID_LIST_VPC_AVAILABLE_CIDR = 6;
  private static final int METHODID_LIST_SUBNET = 7;
  private static final int METHODID_GET_SUBNET_BY_UUID = 8;
  private static final int METHODID_GET_SUBNET_TOTAL_CNT = 9;
  private static final int METHODID_CREATE_SUBNET = 10;
  private static final int METHODID_DELETE_SUBNET = 11;
  private static final int METHODID_CHANGE_SUBNET_NAME = 12;
  private static final int METHODID_CHECK_SUBNET_CIDR_OVERLAP = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_VPC:
          serviceImpl.listVpc((com.didiyun.compute.v1.ListVpcRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListVpcResponse>) responseObserver);
          break;
        case METHODID_GET_VPC_BY_UUID:
          serviceImpl.getVpcByUuid((com.didiyun.compute.v1.GetVpcByUuidRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetVpcByUuidResponse>) responseObserver);
          break;
        case METHODID_GET_VPC_TOTAL_CNT:
          serviceImpl.getVpcTotalCnt((com.didiyun.compute.v1.GetVpcTotalCntRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetVpcTotalCntResponse>) responseObserver);
          break;
        case METHODID_CREATE_VPC:
          serviceImpl.createVpc((com.didiyun.compute.v1.CreateVpcRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateVpcResponse>) responseObserver);
          break;
        case METHODID_DELETE_VPC:
          serviceImpl.deleteVpc((com.didiyun.compute.v1.DeleteVpcRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteVpcResponse>) responseObserver);
          break;
        case METHODID_CHANGE_VPC_NAME:
          serviceImpl.changeVpcName((com.didiyun.compute.v1.ChangeVpcNameRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeVpcNameResponse>) responseObserver);
          break;
        case METHODID_LIST_VPC_AVAILABLE_CIDR:
          serviceImpl.listVpcAvailableCidr((com.didiyun.compute.v1.ListVpcAvailableCidrRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListVpcAvailableCidrResponse>) responseObserver);
          break;
        case METHODID_LIST_SUBNET:
          serviceImpl.listSubnet((com.didiyun.compute.v1.ListSubnetRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ListSubnetResponse>) responseObserver);
          break;
        case METHODID_GET_SUBNET_BY_UUID:
          serviceImpl.getSubnetByUuid((com.didiyun.compute.v1.GetSubnetByUuidRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSubnetByUuidResponse>) responseObserver);
          break;
        case METHODID_GET_SUBNET_TOTAL_CNT:
          serviceImpl.getSubnetTotalCnt((com.didiyun.compute.v1.GetSubnetTotalCntRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.GetSubnetTotalCntResponse>) responseObserver);
          break;
        case METHODID_CREATE_SUBNET:
          serviceImpl.createSubnet((com.didiyun.compute.v1.CreateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CreateSubnetResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUBNET:
          serviceImpl.deleteSubnet((com.didiyun.compute.v1.DeleteSubnetRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.DeleteSubnetResponse>) responseObserver);
          break;
        case METHODID_CHANGE_SUBNET_NAME:
          serviceImpl.changeSubnetName((com.didiyun.compute.v1.ChangeSubnetNameRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.ChangeSubnetNameResponse>) responseObserver);
          break;
        case METHODID_CHECK_SUBNET_CIDR_OVERLAP:
          serviceImpl.checkSubnetCidrOverlap((com.didiyun.compute.v1.CheckSubnetCidrOverlapRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.compute.v1.CheckSubnetCidrOverlapResponse>) responseObserver);
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

  private static abstract class VpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.compute.v1.VpcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Vpc");
    }
  }

  private static final class VpcFileDescriptorSupplier
      extends VpcBaseDescriptorSupplier {
    VpcFileDescriptorSupplier() {}
  }

  private static final class VpcMethodDescriptorSupplier
      extends VpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (VpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VpcFileDescriptorSupplier())
              .addMethod(getListVpcMethod())
              .addMethod(getGetVpcByUuidMethod())
              .addMethod(getGetVpcTotalCntMethod())
              .addMethod(getCreateVpcMethod())
              .addMethod(getDeleteVpcMethod())
              .addMethod(getChangeVpcNameMethod())
              .addMethod(getListVpcAvailableCidrMethod())
              .addMethod(getListSubnetMethod())
              .addMethod(getGetSubnetByUuidMethod())
              .addMethod(getGetSubnetTotalCntMethod())
              .addMethod(getCreateSubnetMethod())
              .addMethod(getDeleteSubnetMethod())
              .addMethod(getChangeSubnetNameMethod())
              .addMethod(getCheckSubnetCidrOverlapMethod())
              .build();
        }
      }
    }
    return result;
  }
}
