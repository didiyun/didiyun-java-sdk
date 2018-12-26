package com.didiyun.bill.v1;

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
    comments = "Source: bill/v1/bill.proto")
public final class BillGrpc {

  private BillGrpc() {}

  public static final String SERVICE_NAME = "didi.cloud.bill.v1.Bill";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.ContinueListRequest,
      com.didiyun.bill.v1.ContinueListResponse> getContinueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContinueList",
      requestType = com.didiyun.bill.v1.ContinueListRequest.class,
      responseType = com.didiyun.bill.v1.ContinueListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.ContinueListRequest,
      com.didiyun.bill.v1.ContinueListResponse> getContinueListMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.ContinueListRequest, com.didiyun.bill.v1.ContinueListResponse> getContinueListMethod;
    if ((getContinueListMethod = BillGrpc.getContinueListMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getContinueListMethod = BillGrpc.getContinueListMethod) == null) {
          BillGrpc.getContinueListMethod = getContinueListMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.ContinueListRequest, com.didiyun.bill.v1.ContinueListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "ContinueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.ContinueListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.ContinueListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("ContinueList"))
                  .build();
          }
        }
     }
     return getContinueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.ContinueMonthlyRequest,
      com.didiyun.bill.v1.ContinueMonthlyResponse> getContinueMonthlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContinueMonthly",
      requestType = com.didiyun.bill.v1.ContinueMonthlyRequest.class,
      responseType = com.didiyun.bill.v1.ContinueMonthlyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.ContinueMonthlyRequest,
      com.didiyun.bill.v1.ContinueMonthlyResponse> getContinueMonthlyMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.ContinueMonthlyRequest, com.didiyun.bill.v1.ContinueMonthlyResponse> getContinueMonthlyMethod;
    if ((getContinueMonthlyMethod = BillGrpc.getContinueMonthlyMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getContinueMonthlyMethod = BillGrpc.getContinueMonthlyMethod) == null) {
          BillGrpc.getContinueMonthlyMethod = getContinueMonthlyMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.ContinueMonthlyRequest, com.didiyun.bill.v1.ContinueMonthlyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "ContinueMonthly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.ContinueMonthlyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.ContinueMonthlyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("ContinueMonthly"))
                  .build();
          }
        }
     }
     return getContinueMonthlyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.ChangeToMonthlyRequest,
      com.didiyun.bill.v1.ChangeToMonthlyResponse> getChangeToMonthlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeToMonthly",
      requestType = com.didiyun.bill.v1.ChangeToMonthlyRequest.class,
      responseType = com.didiyun.bill.v1.ChangeToMonthlyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.ChangeToMonthlyRequest,
      com.didiyun.bill.v1.ChangeToMonthlyResponse> getChangeToMonthlyMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.ChangeToMonthlyRequest, com.didiyun.bill.v1.ChangeToMonthlyResponse> getChangeToMonthlyMethod;
    if ((getChangeToMonthlyMethod = BillGrpc.getChangeToMonthlyMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getChangeToMonthlyMethod = BillGrpc.getChangeToMonthlyMethod) == null) {
          BillGrpc.getChangeToMonthlyMethod = getChangeToMonthlyMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.ChangeToMonthlyRequest, com.didiyun.bill.v1.ChangeToMonthlyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "ChangeToMonthly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.ChangeToMonthlyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.ChangeToMonthlyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("ChangeToMonthly"))
                  .build();
          }
        }
     }
     return getChangeToMonthlyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.ChangeExpireStrategyRequest,
      com.didiyun.bill.v1.ChangeExpireStrategyResponse> getChangeExpireStrategyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeExpireStrategy",
      requestType = com.didiyun.bill.v1.ChangeExpireStrategyRequest.class,
      responseType = com.didiyun.bill.v1.ChangeExpireStrategyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.ChangeExpireStrategyRequest,
      com.didiyun.bill.v1.ChangeExpireStrategyResponse> getChangeExpireStrategyMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.ChangeExpireStrategyRequest, com.didiyun.bill.v1.ChangeExpireStrategyResponse> getChangeExpireStrategyMethod;
    if ((getChangeExpireStrategyMethod = BillGrpc.getChangeExpireStrategyMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getChangeExpireStrategyMethod = BillGrpc.getChangeExpireStrategyMethod) == null) {
          BillGrpc.getChangeExpireStrategyMethod = getChangeExpireStrategyMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.ChangeExpireStrategyRequest, com.didiyun.bill.v1.ChangeExpireStrategyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "ChangeExpireStrategy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.ChangeExpireStrategyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.ChangeExpireStrategyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("ChangeExpireStrategy"))
                  .build();
          }
        }
     }
     return getChangeExpireStrategyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.CheckDc2PriceRequest,
      com.didiyun.bill.v1.CheckPriceResponse> getCheckDc2PriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckDc2Price",
      requestType = com.didiyun.bill.v1.CheckDc2PriceRequest.class,
      responseType = com.didiyun.bill.v1.CheckPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.CheckDc2PriceRequest,
      com.didiyun.bill.v1.CheckPriceResponse> getCheckDc2PriceMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.CheckDc2PriceRequest, com.didiyun.bill.v1.CheckPriceResponse> getCheckDc2PriceMethod;
    if ((getCheckDc2PriceMethod = BillGrpc.getCheckDc2PriceMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getCheckDc2PriceMethod = BillGrpc.getCheckDc2PriceMethod) == null) {
          BillGrpc.getCheckDc2PriceMethod = getCheckDc2PriceMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.CheckDc2PriceRequest, com.didiyun.bill.v1.CheckPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "CheckDc2Price"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.CheckDc2PriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.CheckPriceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("CheckDc2Price"))
                  .build();
          }
        }
     }
     return getCheckDc2PriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.CheckEipPriceRequest,
      com.didiyun.bill.v1.CheckPriceResponse> getCheckEipPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckEipPrice",
      requestType = com.didiyun.bill.v1.CheckEipPriceRequest.class,
      responseType = com.didiyun.bill.v1.CheckPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.CheckEipPriceRequest,
      com.didiyun.bill.v1.CheckPriceResponse> getCheckEipPriceMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.CheckEipPriceRequest, com.didiyun.bill.v1.CheckPriceResponse> getCheckEipPriceMethod;
    if ((getCheckEipPriceMethod = BillGrpc.getCheckEipPriceMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getCheckEipPriceMethod = BillGrpc.getCheckEipPriceMethod) == null) {
          BillGrpc.getCheckEipPriceMethod = getCheckEipPriceMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.CheckEipPriceRequest, com.didiyun.bill.v1.CheckPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "CheckEipPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.CheckEipPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.CheckPriceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("CheckEipPrice"))
                  .build();
          }
        }
     }
     return getCheckEipPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.CheckEbsPriceRequest,
      com.didiyun.bill.v1.CheckPriceResponse> getCheckEbsPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckEbsPrice",
      requestType = com.didiyun.bill.v1.CheckEbsPriceRequest.class,
      responseType = com.didiyun.bill.v1.CheckPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.CheckEbsPriceRequest,
      com.didiyun.bill.v1.CheckPriceResponse> getCheckEbsPriceMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.CheckEbsPriceRequest, com.didiyun.bill.v1.CheckPriceResponse> getCheckEbsPriceMethod;
    if ((getCheckEbsPriceMethod = BillGrpc.getCheckEbsPriceMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getCheckEbsPriceMethod = BillGrpc.getCheckEbsPriceMethod) == null) {
          BillGrpc.getCheckEbsPriceMethod = getCheckEbsPriceMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.CheckEbsPriceRequest, com.didiyun.bill.v1.CheckPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "CheckEbsPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.CheckEbsPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.CheckPriceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("CheckEbsPrice"))
                  .build();
          }
        }
     }
     return getCheckEbsPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest,
      com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse> getGetDc2ChargeInfoAndSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDc2ChargeInfoAndSpec",
      requestType = com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.class,
      responseType = com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest,
      com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse> getGetDc2ChargeInfoAndSpecMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest, com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse> getGetDc2ChargeInfoAndSpecMethod;
    if ((getGetDc2ChargeInfoAndSpecMethod = BillGrpc.getGetDc2ChargeInfoAndSpecMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getGetDc2ChargeInfoAndSpecMethod = BillGrpc.getGetDc2ChargeInfoAndSpecMethod) == null) {
          BillGrpc.getGetDc2ChargeInfoAndSpecMethod = getGetDc2ChargeInfoAndSpecMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest, com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "GetDc2ChargeInfoAndSpec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("GetDc2ChargeInfoAndSpec"))
                  .build();
          }
        }
     }
     return getGetDc2ChargeInfoAndSpecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest,
      com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse> getGetEipChargeInfoAndSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEipChargeInfoAndSpec",
      requestType = com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.class,
      responseType = com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest,
      com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse> getGetEipChargeInfoAndSpecMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest, com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse> getGetEipChargeInfoAndSpecMethod;
    if ((getGetEipChargeInfoAndSpecMethod = BillGrpc.getGetEipChargeInfoAndSpecMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getGetEipChargeInfoAndSpecMethod = BillGrpc.getGetEipChargeInfoAndSpecMethod) == null) {
          BillGrpc.getGetEipChargeInfoAndSpecMethod = getGetEipChargeInfoAndSpecMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest, com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "GetEipChargeInfoAndSpec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("GetEipChargeInfoAndSpec"))
                  .build();
          }
        }
     }
     return getGetEipChargeInfoAndSpecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest,
      com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse> getGetEbsChargeInfoAndSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEbsChargeInfoAndSpec",
      requestType = com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.class,
      responseType = com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest,
      com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse> getGetEbsChargeInfoAndSpecMethod() {
    io.grpc.MethodDescriptor<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest, com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse> getGetEbsChargeInfoAndSpecMethod;
    if ((getGetEbsChargeInfoAndSpecMethod = BillGrpc.getGetEbsChargeInfoAndSpecMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getGetEbsChargeInfoAndSpecMethod = BillGrpc.getGetEbsChargeInfoAndSpecMethod) == null) {
          BillGrpc.getGetEbsChargeInfoAndSpecMethod = getGetEbsChargeInfoAndSpecMethod = 
              io.grpc.MethodDescriptor.<com.didiyun.bill.v1.GetChargeInfoAndSpecRequest, com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "didi.cloud.bill.v1.Bill", "GetEbsChargeInfoAndSpec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BillMethodDescriptorSupplier("GetEbsChargeInfoAndSpec"))
                  .build();
          }
        }
     }
     return getGetEbsChargeInfoAndSpecMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillStub newStub(io.grpc.Channel channel) {
    return new BillStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BillBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BillFutureStub(channel);
  }

  /**
   */
  public static abstract class BillImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取待续费资源列表
     * </pre>
     */
    public void continueList(com.didiyun.bill.v1.ContinueListRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ContinueListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContinueListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量续费包月资源
     * </pre>
     */
    public void continueMonthly(com.didiyun.bill.v1.ContinueMonthlyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ContinueMonthlyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContinueMonthlyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量将按时长资源转为包月
     * </pre>
     */
    public void changeToMonthly(com.didiyun.bill.v1.ChangeToMonthlyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ChangeToMonthlyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeToMonthlyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更改资源到期策略
     * </pre>
     */
    public void changeExpireStrategy(com.didiyun.bill.v1.ChangeExpireStrategyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ChangeExpireStrategyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeExpireStrategyMethod(), responseObserver);
    }

    /**
     * <pre>
     * DC2询价
     * </pre>
     */
    public void checkDc2Price(com.didiyun.bill.v1.CheckDc2PriceRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.CheckPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckDc2PriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * EIP询价
     * </pre>
     */
    public void checkEipPrice(com.didiyun.bill.v1.CheckEipPriceRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.CheckPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckEipPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * EBS询价
     * </pre>
     */
    public void checkEbsPrice(com.didiyun.bill.v1.CheckEbsPriceRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.CheckPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckEbsPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DC2查询计费与规格信息
     * </pre>
     */
    public void getDc2ChargeInfoAndSpec(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDc2ChargeInfoAndSpecMethod(), responseObserver);
    }

    /**
     * <pre>
     * EIP查询计费与规格信息
     * </pre>
     */
    public void getEipChargeInfoAndSpec(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEipChargeInfoAndSpecMethod(), responseObserver);
    }

    /**
     * <pre>
     * EBS查询计费与规格信息
     * </pre>
     */
    public void getEbsChargeInfoAndSpec(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEbsChargeInfoAndSpecMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getContinueListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.ContinueListRequest,
                com.didiyun.bill.v1.ContinueListResponse>(
                  this, METHODID_CONTINUE_LIST)))
          .addMethod(
            getContinueMonthlyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.ContinueMonthlyRequest,
                com.didiyun.bill.v1.ContinueMonthlyResponse>(
                  this, METHODID_CONTINUE_MONTHLY)))
          .addMethod(
            getChangeToMonthlyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.ChangeToMonthlyRequest,
                com.didiyun.bill.v1.ChangeToMonthlyResponse>(
                  this, METHODID_CHANGE_TO_MONTHLY)))
          .addMethod(
            getChangeExpireStrategyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.ChangeExpireStrategyRequest,
                com.didiyun.bill.v1.ChangeExpireStrategyResponse>(
                  this, METHODID_CHANGE_EXPIRE_STRATEGY)))
          .addMethod(
            getCheckDc2PriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.CheckDc2PriceRequest,
                com.didiyun.bill.v1.CheckPriceResponse>(
                  this, METHODID_CHECK_DC2PRICE)))
          .addMethod(
            getCheckEipPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.CheckEipPriceRequest,
                com.didiyun.bill.v1.CheckPriceResponse>(
                  this, METHODID_CHECK_EIP_PRICE)))
          .addMethod(
            getCheckEbsPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.CheckEbsPriceRequest,
                com.didiyun.bill.v1.CheckPriceResponse>(
                  this, METHODID_CHECK_EBS_PRICE)))
          .addMethod(
            getGetDc2ChargeInfoAndSpecMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.GetChargeInfoAndSpecRequest,
                com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse>(
                  this, METHODID_GET_DC2CHARGE_INFO_AND_SPEC)))
          .addMethod(
            getGetEipChargeInfoAndSpecMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.GetChargeInfoAndSpecRequest,
                com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse>(
                  this, METHODID_GET_EIP_CHARGE_INFO_AND_SPEC)))
          .addMethod(
            getGetEbsChargeInfoAndSpecMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.didiyun.bill.v1.GetChargeInfoAndSpecRequest,
                com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse>(
                  this, METHODID_GET_EBS_CHARGE_INFO_AND_SPEC)))
          .build();
    }
  }

  /**
   */
  public static final class BillStub extends io.grpc.stub.AbstractStub<BillStub> {
    private BillStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BillStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BillStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取待续费资源列表
     * </pre>
     */
    public void continueList(com.didiyun.bill.v1.ContinueListRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ContinueListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContinueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量续费包月资源
     * </pre>
     */
    public void continueMonthly(com.didiyun.bill.v1.ContinueMonthlyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ContinueMonthlyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContinueMonthlyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量将按时长资源转为包月
     * </pre>
     */
    public void changeToMonthly(com.didiyun.bill.v1.ChangeToMonthlyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ChangeToMonthlyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeToMonthlyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更改资源到期策略
     * </pre>
     */
    public void changeExpireStrategy(com.didiyun.bill.v1.ChangeExpireStrategyRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ChangeExpireStrategyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeExpireStrategyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DC2询价
     * </pre>
     */
    public void checkDc2Price(com.didiyun.bill.v1.CheckDc2PriceRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.CheckPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckDc2PriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EIP询价
     * </pre>
     */
    public void checkEipPrice(com.didiyun.bill.v1.CheckEipPriceRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.CheckPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckEipPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EBS询价
     * </pre>
     */
    public void checkEbsPrice(com.didiyun.bill.v1.CheckEbsPriceRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.CheckPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckEbsPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DC2查询计费与规格信息
     * </pre>
     */
    public void getDc2ChargeInfoAndSpec(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDc2ChargeInfoAndSpecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EIP查询计费与规格信息
     * </pre>
     */
    public void getEipChargeInfoAndSpec(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEipChargeInfoAndSpecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EBS查询计费与规格信息
     * </pre>
     */
    public void getEbsChargeInfoAndSpec(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request,
        io.grpc.stub.StreamObserver<com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEbsChargeInfoAndSpecMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BillBlockingStub extends io.grpc.stub.AbstractStub<BillBlockingStub> {
    private BillBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BillBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BillBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取待续费资源列表
     * </pre>
     */
    public com.didiyun.bill.v1.ContinueListResponse continueList(com.didiyun.bill.v1.ContinueListRequest request) {
      return blockingUnaryCall(
          getChannel(), getContinueListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量续费包月资源
     * </pre>
     */
    public com.didiyun.bill.v1.ContinueMonthlyResponse continueMonthly(com.didiyun.bill.v1.ContinueMonthlyRequest request) {
      return blockingUnaryCall(
          getChannel(), getContinueMonthlyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量将按时长资源转为包月
     * </pre>
     */
    public com.didiyun.bill.v1.ChangeToMonthlyResponse changeToMonthly(com.didiyun.bill.v1.ChangeToMonthlyRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeToMonthlyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更改资源到期策略
     * </pre>
     */
    public com.didiyun.bill.v1.ChangeExpireStrategyResponse changeExpireStrategy(com.didiyun.bill.v1.ChangeExpireStrategyRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeExpireStrategyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DC2询价
     * </pre>
     */
    public com.didiyun.bill.v1.CheckPriceResponse checkDc2Price(com.didiyun.bill.v1.CheckDc2PriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckDc2PriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EIP询价
     * </pre>
     */
    public com.didiyun.bill.v1.CheckPriceResponse checkEipPrice(com.didiyun.bill.v1.CheckEipPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckEipPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EBS询价
     * </pre>
     */
    public com.didiyun.bill.v1.CheckPriceResponse checkEbsPrice(com.didiyun.bill.v1.CheckEbsPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckEbsPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DC2查询计费与规格信息
     * </pre>
     */
    public com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse getDc2ChargeInfoAndSpec(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDc2ChargeInfoAndSpecMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EIP查询计费与规格信息
     * </pre>
     */
    public com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse getEipChargeInfoAndSpec(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEipChargeInfoAndSpecMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EBS查询计费与规格信息
     * </pre>
     */
    public com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse getEbsChargeInfoAndSpec(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEbsChargeInfoAndSpecMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BillFutureStub extends io.grpc.stub.AbstractStub<BillFutureStub> {
    private BillFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BillFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BillFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取待续费资源列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.ContinueListResponse> continueList(
        com.didiyun.bill.v1.ContinueListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getContinueListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量续费包月资源
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.ContinueMonthlyResponse> continueMonthly(
        com.didiyun.bill.v1.ContinueMonthlyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getContinueMonthlyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量将按时长资源转为包月
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.ChangeToMonthlyResponse> changeToMonthly(
        com.didiyun.bill.v1.ChangeToMonthlyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeToMonthlyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更改资源到期策略
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.ChangeExpireStrategyResponse> changeExpireStrategy(
        com.didiyun.bill.v1.ChangeExpireStrategyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeExpireStrategyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DC2询价
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.CheckPriceResponse> checkDc2Price(
        com.didiyun.bill.v1.CheckDc2PriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckDc2PriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EIP询价
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.CheckPriceResponse> checkEipPrice(
        com.didiyun.bill.v1.CheckEipPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckEipPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EBS询价
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.CheckPriceResponse> checkEbsPrice(
        com.didiyun.bill.v1.CheckEbsPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckEbsPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DC2查询计费与规格信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse> getDc2ChargeInfoAndSpec(
        com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDc2ChargeInfoAndSpecMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EIP查询计费与规格信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse> getEipChargeInfoAndSpec(
        com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEipChargeInfoAndSpecMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EBS查询计费与规格信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse> getEbsChargeInfoAndSpec(
        com.didiyun.bill.v1.GetChargeInfoAndSpecRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEbsChargeInfoAndSpecMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTINUE_LIST = 0;
  private static final int METHODID_CONTINUE_MONTHLY = 1;
  private static final int METHODID_CHANGE_TO_MONTHLY = 2;
  private static final int METHODID_CHANGE_EXPIRE_STRATEGY = 3;
  private static final int METHODID_CHECK_DC2PRICE = 4;
  private static final int METHODID_CHECK_EIP_PRICE = 5;
  private static final int METHODID_CHECK_EBS_PRICE = 6;
  private static final int METHODID_GET_DC2CHARGE_INFO_AND_SPEC = 7;
  private static final int METHODID_GET_EIP_CHARGE_INFO_AND_SPEC = 8;
  private static final int METHODID_GET_EBS_CHARGE_INFO_AND_SPEC = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BillImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BillImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONTINUE_LIST:
          serviceImpl.continueList((com.didiyun.bill.v1.ContinueListRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ContinueListResponse>) responseObserver);
          break;
        case METHODID_CONTINUE_MONTHLY:
          serviceImpl.continueMonthly((com.didiyun.bill.v1.ContinueMonthlyRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ContinueMonthlyResponse>) responseObserver);
          break;
        case METHODID_CHANGE_TO_MONTHLY:
          serviceImpl.changeToMonthly((com.didiyun.bill.v1.ChangeToMonthlyRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ChangeToMonthlyResponse>) responseObserver);
          break;
        case METHODID_CHANGE_EXPIRE_STRATEGY:
          serviceImpl.changeExpireStrategy((com.didiyun.bill.v1.ChangeExpireStrategyRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.ChangeExpireStrategyResponse>) responseObserver);
          break;
        case METHODID_CHECK_DC2PRICE:
          serviceImpl.checkDc2Price((com.didiyun.bill.v1.CheckDc2PriceRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.CheckPriceResponse>) responseObserver);
          break;
        case METHODID_CHECK_EIP_PRICE:
          serviceImpl.checkEipPrice((com.didiyun.bill.v1.CheckEipPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.CheckPriceResponse>) responseObserver);
          break;
        case METHODID_CHECK_EBS_PRICE:
          serviceImpl.checkEbsPrice((com.didiyun.bill.v1.CheckEbsPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.CheckPriceResponse>) responseObserver);
          break;
        case METHODID_GET_DC2CHARGE_INFO_AND_SPEC:
          serviceImpl.getDc2ChargeInfoAndSpec((com.didiyun.bill.v1.GetChargeInfoAndSpecRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.GetDc2ChargeInfoAndSpecResponse>) responseObserver);
          break;
        case METHODID_GET_EIP_CHARGE_INFO_AND_SPEC:
          serviceImpl.getEipChargeInfoAndSpec((com.didiyun.bill.v1.GetChargeInfoAndSpecRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.GetEipChargeInfoAndSpecResponse>) responseObserver);
          break;
        case METHODID_GET_EBS_CHARGE_INFO_AND_SPEC:
          serviceImpl.getEbsChargeInfoAndSpec((com.didiyun.bill.v1.GetChargeInfoAndSpecRequest) request,
              (io.grpc.stub.StreamObserver<com.didiyun.bill.v1.GetEbsChargeInfoAndSpecResponse>) responseObserver);
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

  private static abstract class BillBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.didiyun.bill.v1.BillOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Bill");
    }
  }

  private static final class BillFileDescriptorSupplier
      extends BillBaseDescriptorSupplier {
    BillFileDescriptorSupplier() {}
  }

  private static final class BillMethodDescriptorSupplier
      extends BillBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BillMethodDescriptorSupplier(String methodName) {
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
      synchronized (BillGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillFileDescriptorSupplier())
              .addMethod(getContinueListMethod())
              .addMethod(getContinueMonthlyMethod())
              .addMethod(getChangeToMonthlyMethod())
              .addMethod(getChangeExpireStrategyMethod())
              .addMethod(getCheckDc2PriceMethod())
              .addMethod(getCheckEipPriceMethod())
              .addMethod(getCheckEbsPriceMethod())
              .addMethod(getGetDc2ChargeInfoAndSpecMethod())
              .addMethod(getGetEipChargeInfoAndSpecMethod())
              .addMethod(getGetEbsChargeInfoAndSpecMethod())
              .build();
        }
      }
    }
    return result;
  }
}
