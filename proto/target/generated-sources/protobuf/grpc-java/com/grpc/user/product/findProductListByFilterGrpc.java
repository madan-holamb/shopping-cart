package com.grpc.user.product;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: product-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class findProductListByFilterGrpc {

  private findProductListByFilterGrpc() {}

  public static final String SERVICE_NAME = "findProductListByFilter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user.product.SortByFilterRequest,
      com.grpc.user.product.SortByFilterResponse> getFindListByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findListByFilter",
      requestType = com.grpc.user.product.SortByFilterRequest.class,
      responseType = com.grpc.user.product.SortByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.user.product.SortByFilterRequest,
      com.grpc.user.product.SortByFilterResponse> getFindListByFilterMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.product.SortByFilterRequest, com.grpc.user.product.SortByFilterResponse> getFindListByFilterMethod;
    if ((getFindListByFilterMethod = findProductListByFilterGrpc.getFindListByFilterMethod) == null) {
      synchronized (findProductListByFilterGrpc.class) {
        if ((getFindListByFilterMethod = findProductListByFilterGrpc.getFindListByFilterMethod) == null) {
          findProductListByFilterGrpc.getFindListByFilterMethod = getFindListByFilterMethod =
              io.grpc.MethodDescriptor.<com.grpc.user.product.SortByFilterRequest, com.grpc.user.product.SortByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findListByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.product.SortByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.product.SortByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new findProductListByFilterMethodDescriptorSupplier("findListByFilter"))
              .build();
        }
      }
    }
    return getFindListByFilterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static findProductListByFilterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<findProductListByFilterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<findProductListByFilterStub>() {
        @java.lang.Override
        public findProductListByFilterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new findProductListByFilterStub(channel, callOptions);
        }
      };
    return findProductListByFilterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static findProductListByFilterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<findProductListByFilterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<findProductListByFilterBlockingStub>() {
        @java.lang.Override
        public findProductListByFilterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new findProductListByFilterBlockingStub(channel, callOptions);
        }
      };
    return findProductListByFilterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static findProductListByFilterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<findProductListByFilterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<findProductListByFilterFutureStub>() {
        @java.lang.Override
        public findProductListByFilterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new findProductListByFilterFutureStub(channel, callOptions);
        }
      };
    return findProductListByFilterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findListByFilter(com.grpc.user.product.SortByFilterRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.product.SortByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindListByFilterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service findProductListByFilter.
   */
  public static abstract class findProductListByFilterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return findProductListByFilterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service findProductListByFilter.
   */
  public static final class findProductListByFilterStub
      extends io.grpc.stub.AbstractAsyncStub<findProductListByFilterStub> {
    private findProductListByFilterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected findProductListByFilterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new findProductListByFilterStub(channel, callOptions);
    }

    /**
     */
    public void findListByFilter(com.grpc.user.product.SortByFilterRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.product.SortByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindListByFilterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service findProductListByFilter.
   */
  public static final class findProductListByFilterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<findProductListByFilterBlockingStub> {
    private findProductListByFilterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected findProductListByFilterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new findProductListByFilterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user.product.SortByFilterResponse findListByFilter(com.grpc.user.product.SortByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindListByFilterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service findProductListByFilter.
   */
  public static final class findProductListByFilterFutureStub
      extends io.grpc.stub.AbstractFutureStub<findProductListByFilterFutureStub> {
    private findProductListByFilterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected findProductListByFilterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new findProductListByFilterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.product.SortByFilterResponse> findListByFilter(
        com.grpc.user.product.SortByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindListByFilterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_LIST_BY_FILTER = 0;

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
        case METHODID_FIND_LIST_BY_FILTER:
          serviceImpl.findListByFilter((com.grpc.user.product.SortByFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.product.SortByFilterResponse>) responseObserver);
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
          getFindListByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.user.product.SortByFilterRequest,
              com.grpc.user.product.SortByFilterResponse>(
                service, METHODID_FIND_LIST_BY_FILTER)))
        .build();
  }

  private static abstract class findProductListByFilterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    findProductListByFilterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user.product.ProductService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("findProductListByFilter");
    }
  }

  private static final class findProductListByFilterFileDescriptorSupplier
      extends findProductListByFilterBaseDescriptorSupplier {
    findProductListByFilterFileDescriptorSupplier() {}
  }

  private static final class findProductListByFilterMethodDescriptorSupplier
      extends findProductListByFilterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    findProductListByFilterMethodDescriptorSupplier(String methodName) {
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
      synchronized (findProductListByFilterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new findProductListByFilterFileDescriptorSupplier())
              .addMethod(getFindListByFilterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
