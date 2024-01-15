package com.grpc.user.product;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: product-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class findByIdServiceGrpc {

  private findByIdServiceGrpc() {}

  public static final String SERVICE_NAME = "findByIdService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user.product.FindByProductIdRequest,
      com.grpc.user.product.FindByProductIdResponse> getFindByProductIdServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByProductIdService",
      requestType = com.grpc.user.product.FindByProductIdRequest.class,
      responseType = com.grpc.user.product.FindByProductIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.user.product.FindByProductIdRequest,
      com.grpc.user.product.FindByProductIdResponse> getFindByProductIdServiceMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.product.FindByProductIdRequest, com.grpc.user.product.FindByProductIdResponse> getFindByProductIdServiceMethod;
    if ((getFindByProductIdServiceMethod = findByIdServiceGrpc.getFindByProductIdServiceMethod) == null) {
      synchronized (findByIdServiceGrpc.class) {
        if ((getFindByProductIdServiceMethod = findByIdServiceGrpc.getFindByProductIdServiceMethod) == null) {
          findByIdServiceGrpc.getFindByProductIdServiceMethod = getFindByProductIdServiceMethod =
              io.grpc.MethodDescriptor.<com.grpc.user.product.FindByProductIdRequest, com.grpc.user.product.FindByProductIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByProductIdService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.product.FindByProductIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.product.FindByProductIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new findByIdServiceMethodDescriptorSupplier("findByProductIdService"))
              .build();
        }
      }
    }
    return getFindByProductIdServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static findByIdServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<findByIdServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<findByIdServiceStub>() {
        @java.lang.Override
        public findByIdServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new findByIdServiceStub(channel, callOptions);
        }
      };
    return findByIdServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static findByIdServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<findByIdServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<findByIdServiceBlockingStub>() {
        @java.lang.Override
        public findByIdServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new findByIdServiceBlockingStub(channel, callOptions);
        }
      };
    return findByIdServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static findByIdServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<findByIdServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<findByIdServiceFutureStub>() {
        @java.lang.Override
        public findByIdServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new findByIdServiceFutureStub(channel, callOptions);
        }
      };
    return findByIdServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findByProductIdService(com.grpc.user.product.FindByProductIdRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.product.FindByProductIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByProductIdServiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service findByIdService.
   */
  public static abstract class findByIdServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return findByIdServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service findByIdService.
   */
  public static final class findByIdServiceStub
      extends io.grpc.stub.AbstractAsyncStub<findByIdServiceStub> {
    private findByIdServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected findByIdServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new findByIdServiceStub(channel, callOptions);
    }

    /**
     */
    public void findByProductIdService(com.grpc.user.product.FindByProductIdRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.product.FindByProductIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByProductIdServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service findByIdService.
   */
  public static final class findByIdServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<findByIdServiceBlockingStub> {
    private findByIdServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected findByIdServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new findByIdServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user.product.FindByProductIdResponse findByProductIdService(com.grpc.user.product.FindByProductIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByProductIdServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service findByIdService.
   */
  public static final class findByIdServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<findByIdServiceFutureStub> {
    private findByIdServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected findByIdServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new findByIdServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.product.FindByProductIdResponse> findByProductIdService(
        com.grpc.user.product.FindByProductIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByProductIdServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_PRODUCT_ID_SERVICE = 0;

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
        case METHODID_FIND_BY_PRODUCT_ID_SERVICE:
          serviceImpl.findByProductIdService((com.grpc.user.product.FindByProductIdRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.product.FindByProductIdResponse>) responseObserver);
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
          getFindByProductIdServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.user.product.FindByProductIdRequest,
              com.grpc.user.product.FindByProductIdResponse>(
                service, METHODID_FIND_BY_PRODUCT_ID_SERVICE)))
        .build();
  }

  private static abstract class findByIdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    findByIdServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user.product.ProductService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("findByIdService");
    }
  }

  private static final class findByIdServiceFileDescriptorSupplier
      extends findByIdServiceBaseDescriptorSupplier {
    findByIdServiceFileDescriptorSupplier() {}
  }

  private static final class findByIdServiceMethodDescriptorSupplier
      extends findByIdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    findByIdServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (findByIdServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new findByIdServiceFileDescriptorSupplier())
              .addMethod(getFindByProductIdServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
