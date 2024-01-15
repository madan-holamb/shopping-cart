package com.grpc.user.cart;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: cart-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class cartDetailsServiceGrpc {

  private cartDetailsServiceGrpc() {}

  public static final String SERVICE_NAME = "cartDetailsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user.cart.findIsProductAvailableRequest,
      com.grpc.user.cart.findIsProductAvailableResponse> getGetCartDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCartDetails",
      requestType = com.grpc.user.cart.findIsProductAvailableRequest.class,
      responseType = com.grpc.user.cart.findIsProductAvailableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.user.cart.findIsProductAvailableRequest,
      com.grpc.user.cart.findIsProductAvailableResponse> getGetCartDetailsMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.cart.findIsProductAvailableRequest, com.grpc.user.cart.findIsProductAvailableResponse> getGetCartDetailsMethod;
    if ((getGetCartDetailsMethod = cartDetailsServiceGrpc.getGetCartDetailsMethod) == null) {
      synchronized (cartDetailsServiceGrpc.class) {
        if ((getGetCartDetailsMethod = cartDetailsServiceGrpc.getGetCartDetailsMethod) == null) {
          cartDetailsServiceGrpc.getGetCartDetailsMethod = getGetCartDetailsMethod =
              io.grpc.MethodDescriptor.<com.grpc.user.cart.findIsProductAvailableRequest, com.grpc.user.cart.findIsProductAvailableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCartDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.cart.findIsProductAvailableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.cart.findIsProductAvailableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new cartDetailsServiceMethodDescriptorSupplier("getCartDetails"))
              .build();
        }
      }
    }
    return getGetCartDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static cartDetailsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<cartDetailsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<cartDetailsServiceStub>() {
        @java.lang.Override
        public cartDetailsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new cartDetailsServiceStub(channel, callOptions);
        }
      };
    return cartDetailsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static cartDetailsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<cartDetailsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<cartDetailsServiceBlockingStub>() {
        @java.lang.Override
        public cartDetailsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new cartDetailsServiceBlockingStub(channel, callOptions);
        }
      };
    return cartDetailsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static cartDetailsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<cartDetailsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<cartDetailsServiceFutureStub>() {
        @java.lang.Override
        public cartDetailsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new cartDetailsServiceFutureStub(channel, callOptions);
        }
      };
    return cartDetailsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getCartDetails(com.grpc.user.cart.findIsProductAvailableRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.cart.findIsProductAvailableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service cartDetailsService.
   */
  public static abstract class cartDetailsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return cartDetailsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service cartDetailsService.
   */
  public static final class cartDetailsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<cartDetailsServiceStub> {
    private cartDetailsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cartDetailsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new cartDetailsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCartDetails(com.grpc.user.cart.findIsProductAvailableRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.cart.findIsProductAvailableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service cartDetailsService.
   */
  public static final class cartDetailsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<cartDetailsServiceBlockingStub> {
    private cartDetailsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cartDetailsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new cartDetailsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user.cart.findIsProductAvailableResponse getCartDetails(com.grpc.user.cart.findIsProductAvailableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service cartDetailsService.
   */
  public static final class cartDetailsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<cartDetailsServiceFutureStub> {
    private cartDetailsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cartDetailsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new cartDetailsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.cart.findIsProductAvailableResponse> getCartDetails(
        com.grpc.user.cart.findIsProductAvailableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CART_DETAILS = 0;

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
        case METHODID_GET_CART_DETAILS:
          serviceImpl.getCartDetails((com.grpc.user.cart.findIsProductAvailableRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.cart.findIsProductAvailableResponse>) responseObserver);
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
          getGetCartDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.user.cart.findIsProductAvailableRequest,
              com.grpc.user.cart.findIsProductAvailableResponse>(
                service, METHODID_GET_CART_DETAILS)))
        .build();
  }

  private static abstract class cartDetailsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    cartDetailsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user.cart.CartService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("cartDetailsService");
    }
  }

  private static final class cartDetailsServiceFileDescriptorSupplier
      extends cartDetailsServiceBaseDescriptorSupplier {
    cartDetailsServiceFileDescriptorSupplier() {}
  }

  private static final class cartDetailsServiceMethodDescriptorSupplier
      extends cartDetailsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    cartDetailsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (cartDetailsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new cartDetailsServiceFileDescriptorSupplier())
              .addMethod(getGetCartDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
