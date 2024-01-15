package com.grpc.user.cart;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: cart-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class addToCartServiceGrpc {

  private addToCartServiceGrpc() {}

  public static final String SERVICE_NAME = "addToCartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user.cart.addToCartRequest,
      com.grpc.user.cart.addToCartResponse> getAddProductToCartServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProductToCartService",
      requestType = com.grpc.user.cart.addToCartRequest.class,
      responseType = com.grpc.user.cart.addToCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.user.cart.addToCartRequest,
      com.grpc.user.cart.addToCartResponse> getAddProductToCartServiceMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.cart.addToCartRequest, com.grpc.user.cart.addToCartResponse> getAddProductToCartServiceMethod;
    if ((getAddProductToCartServiceMethod = addToCartServiceGrpc.getAddProductToCartServiceMethod) == null) {
      synchronized (addToCartServiceGrpc.class) {
        if ((getAddProductToCartServiceMethod = addToCartServiceGrpc.getAddProductToCartServiceMethod) == null) {
          addToCartServiceGrpc.getAddProductToCartServiceMethod = getAddProductToCartServiceMethod =
              io.grpc.MethodDescriptor.<com.grpc.user.cart.addToCartRequest, com.grpc.user.cart.addToCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addProductToCartService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.cart.addToCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.cart.addToCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new addToCartServiceMethodDescriptorSupplier("addProductToCartService"))
              .build();
        }
      }
    }
    return getAddProductToCartServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static addToCartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<addToCartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<addToCartServiceStub>() {
        @java.lang.Override
        public addToCartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new addToCartServiceStub(channel, callOptions);
        }
      };
    return addToCartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static addToCartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<addToCartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<addToCartServiceBlockingStub>() {
        @java.lang.Override
        public addToCartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new addToCartServiceBlockingStub(channel, callOptions);
        }
      };
    return addToCartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static addToCartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<addToCartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<addToCartServiceFutureStub>() {
        @java.lang.Override
        public addToCartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new addToCartServiceFutureStub(channel, callOptions);
        }
      };
    return addToCartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addProductToCartService(com.grpc.user.cart.addToCartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.cart.addToCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProductToCartServiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service addToCartService.
   */
  public static abstract class addToCartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return addToCartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service addToCartService.
   */
  public static final class addToCartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<addToCartServiceStub> {
    private addToCartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected addToCartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new addToCartServiceStub(channel, callOptions);
    }

    /**
     */
    public void addProductToCartService(com.grpc.user.cart.addToCartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.cart.addToCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProductToCartServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service addToCartService.
   */
  public static final class addToCartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<addToCartServiceBlockingStub> {
    private addToCartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected addToCartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new addToCartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user.cart.addToCartResponse addProductToCartService(com.grpc.user.cart.addToCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductToCartServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service addToCartService.
   */
  public static final class addToCartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<addToCartServiceFutureStub> {
    private addToCartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected addToCartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new addToCartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.cart.addToCartResponse> addProductToCartService(
        com.grpc.user.cart.addToCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProductToCartServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PRODUCT_TO_CART_SERVICE = 0;

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
        case METHODID_ADD_PRODUCT_TO_CART_SERVICE:
          serviceImpl.addProductToCartService((com.grpc.user.cart.addToCartRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.cart.addToCartResponse>) responseObserver);
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
          getAddProductToCartServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.user.cart.addToCartRequest,
              com.grpc.user.cart.addToCartResponse>(
                service, METHODID_ADD_PRODUCT_TO_CART_SERVICE)))
        .build();
  }

  private static abstract class addToCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    addToCartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user.cart.CartService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("addToCartService");
    }
  }

  private static final class addToCartServiceFileDescriptorSupplier
      extends addToCartServiceBaseDescriptorSupplier {
    addToCartServiceFileDescriptorSupplier() {}
  }

  private static final class addToCartServiceMethodDescriptorSupplier
      extends addToCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    addToCartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (addToCartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new addToCartServiceFileDescriptorSupplier())
              .addMethod(getAddProductToCartServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
