package com.grpc.user.similarproduct;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: dashboard-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GetDashBoardServiceGrpc {

  private GetDashBoardServiceGrpc() {}

  public static final String SERVICE_NAME = "GetDashBoardService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user.similarproduct.FindDashBoardDataRequest,
      com.grpc.user.similarproduct.FindDashBoardDataResponse> getFindSimilarProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findSimilarProducts",
      requestType = com.grpc.user.similarproduct.FindDashBoardDataRequest.class,
      responseType = com.grpc.user.similarproduct.FindDashBoardDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.user.similarproduct.FindDashBoardDataRequest,
      com.grpc.user.similarproduct.FindDashBoardDataResponse> getFindSimilarProductsMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.similarproduct.FindDashBoardDataRequest, com.grpc.user.similarproduct.FindDashBoardDataResponse> getFindSimilarProductsMethod;
    if ((getFindSimilarProductsMethod = GetDashBoardServiceGrpc.getFindSimilarProductsMethod) == null) {
      synchronized (GetDashBoardServiceGrpc.class) {
        if ((getFindSimilarProductsMethod = GetDashBoardServiceGrpc.getFindSimilarProductsMethod) == null) {
          GetDashBoardServiceGrpc.getFindSimilarProductsMethod = getFindSimilarProductsMethod =
              io.grpc.MethodDescriptor.<com.grpc.user.similarproduct.FindDashBoardDataRequest, com.grpc.user.similarproduct.FindDashBoardDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findSimilarProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.similarproduct.FindDashBoardDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.similarproduct.FindDashBoardDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GetDashBoardServiceMethodDescriptorSupplier("findSimilarProducts"))
              .build();
        }
      }
    }
    return getFindSimilarProductsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetDashBoardServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetDashBoardServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetDashBoardServiceStub>() {
        @java.lang.Override
        public GetDashBoardServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetDashBoardServiceStub(channel, callOptions);
        }
      };
    return GetDashBoardServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetDashBoardServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetDashBoardServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetDashBoardServiceBlockingStub>() {
        @java.lang.Override
        public GetDashBoardServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetDashBoardServiceBlockingStub(channel, callOptions);
        }
      };
    return GetDashBoardServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetDashBoardServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetDashBoardServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetDashBoardServiceFutureStub>() {
        @java.lang.Override
        public GetDashBoardServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetDashBoardServiceFutureStub(channel, callOptions);
        }
      };
    return GetDashBoardServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findSimilarProducts(com.grpc.user.similarproduct.FindDashBoardDataRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.similarproduct.FindDashBoardDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindSimilarProductsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GetDashBoardService.
   */
  public static abstract class GetDashBoardServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GetDashBoardServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GetDashBoardService.
   */
  public static final class GetDashBoardServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GetDashBoardServiceStub> {
    private GetDashBoardServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetDashBoardServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetDashBoardServiceStub(channel, callOptions);
    }

    /**
     */
    public void findSimilarProducts(com.grpc.user.similarproduct.FindDashBoardDataRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.similarproduct.FindDashBoardDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindSimilarProductsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GetDashBoardService.
   */
  public static final class GetDashBoardServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GetDashBoardServiceBlockingStub> {
    private GetDashBoardServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetDashBoardServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetDashBoardServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user.similarproduct.FindDashBoardDataResponse findSimilarProducts(com.grpc.user.similarproduct.FindDashBoardDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindSimilarProductsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GetDashBoardService.
   */
  public static final class GetDashBoardServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GetDashBoardServiceFutureStub> {
    private GetDashBoardServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetDashBoardServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetDashBoardServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.similarproduct.FindDashBoardDataResponse> findSimilarProducts(
        com.grpc.user.similarproduct.FindDashBoardDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindSimilarProductsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_SIMILAR_PRODUCTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_SIMILAR_PRODUCTS:
          serviceImpl.findSimilarProducts((com.grpc.user.similarproduct.FindDashBoardDataRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.similarproduct.FindDashBoardDataResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFindSimilarProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.user.similarproduct.FindDashBoardDataRequest,
              com.grpc.user.similarproduct.FindDashBoardDataResponse>(
                service, METHODID_FIND_SIMILAR_PRODUCTS)))
        .build();
  }

  private static abstract class GetDashBoardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetDashBoardServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user.similarproduct.DashboardService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetDashBoardService");
    }
  }

  private static final class GetDashBoardServiceFileDescriptorSupplier
      extends GetDashBoardServiceBaseDescriptorSupplier {
    GetDashBoardServiceFileDescriptorSupplier() {}
  }

  private static final class GetDashBoardServiceMethodDescriptorSupplier
      extends GetDashBoardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetDashBoardServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetDashBoardServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetDashBoardServiceFileDescriptorSupplier())
              .addMethod(getFindSimilarProductsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
