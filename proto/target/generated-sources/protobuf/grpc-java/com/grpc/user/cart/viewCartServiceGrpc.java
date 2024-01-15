package com.grpc.user.cart;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: view-cart.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class viewCartServiceGrpc {

  private viewCartServiceGrpc() {}

  public static final String SERVICE_NAME = "viewCartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user.cart.viewCartRequest,
      com.grpc.user.cart.viewCartResponse> getViewAllCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewAllCart",
      requestType = com.grpc.user.cart.viewCartRequest.class,
      responseType = com.grpc.user.cart.viewCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.user.cart.viewCartRequest,
      com.grpc.user.cart.viewCartResponse> getViewAllCartMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.cart.viewCartRequest, com.grpc.user.cart.viewCartResponse> getViewAllCartMethod;
    if ((getViewAllCartMethod = viewCartServiceGrpc.getViewAllCartMethod) == null) {
      synchronized (viewCartServiceGrpc.class) {
        if ((getViewAllCartMethod = viewCartServiceGrpc.getViewAllCartMethod) == null) {
          viewCartServiceGrpc.getViewAllCartMethod = getViewAllCartMethod =
              io.grpc.MethodDescriptor.<com.grpc.user.cart.viewCartRequest, com.grpc.user.cart.viewCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "viewAllCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.cart.viewCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.cart.viewCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new viewCartServiceMethodDescriptorSupplier("viewAllCart"))
              .build();
        }
      }
    }
    return getViewAllCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static viewCartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<viewCartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<viewCartServiceStub>() {
        @java.lang.Override
        public viewCartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new viewCartServiceStub(channel, callOptions);
        }
      };
    return viewCartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static viewCartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<viewCartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<viewCartServiceBlockingStub>() {
        @java.lang.Override
        public viewCartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new viewCartServiceBlockingStub(channel, callOptions);
        }
      };
    return viewCartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static viewCartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<viewCartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<viewCartServiceFutureStub>() {
        @java.lang.Override
        public viewCartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new viewCartServiceFutureStub(channel, callOptions);
        }
      };
    return viewCartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void viewAllCart(com.grpc.user.cart.viewCartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.cart.viewCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllCartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service viewCartService.
   */
  public static abstract class viewCartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return viewCartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service viewCartService.
   */
  public static final class viewCartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<viewCartServiceStub> {
    private viewCartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected viewCartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new viewCartServiceStub(channel, callOptions);
    }

    /**
     */
    public void viewAllCart(com.grpc.user.cart.viewCartRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.cart.viewCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service viewCartService.
   */
  public static final class viewCartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<viewCartServiceBlockingStub> {
    private viewCartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected viewCartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new viewCartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user.cart.viewCartResponse viewAllCart(com.grpc.user.cart.viewCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllCartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service viewCartService.
   */
  public static final class viewCartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<viewCartServiceFutureStub> {
    private viewCartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected viewCartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new viewCartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.cart.viewCartResponse> viewAllCart(
        com.grpc.user.cart.viewCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VIEW_ALL_CART = 0;

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
        case METHODID_VIEW_ALL_CART:
          serviceImpl.viewAllCart((com.grpc.user.cart.viewCartRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.cart.viewCartResponse>) responseObserver);
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
          getViewAllCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.user.cart.viewCartRequest,
              com.grpc.user.cart.viewCartResponse>(
                service, METHODID_VIEW_ALL_CART)))
        .build();
  }

  private static abstract class viewCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    viewCartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user.cart.ViewCart.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("viewCartService");
    }
  }

  private static final class viewCartServiceFileDescriptorSupplier
      extends viewCartServiceBaseDescriptorSupplier {
    viewCartServiceFileDescriptorSupplier() {}
  }

  private static final class viewCartServiceMethodDescriptorSupplier
      extends viewCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    viewCartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (viewCartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new viewCartServiceFileDescriptorSupplier())
              .addMethod(getViewAllCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
