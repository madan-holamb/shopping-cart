package com.grpc.user.product;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: product-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class storeAllDataInCaheServiceGrpc {

  private storeAllDataInCaheServiceGrpc() {}

  public static final String SERVICE_NAME = "storeAllDataInCaheService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user.product.storeAllDataInCaheRequest,
      com.grpc.user.product.storeAllDataInCaheResponse> getStoreProductListServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "storeProductListService",
      requestType = com.grpc.user.product.storeAllDataInCaheRequest.class,
      responseType = com.grpc.user.product.storeAllDataInCaheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.user.product.storeAllDataInCaheRequest,
      com.grpc.user.product.storeAllDataInCaheResponse> getStoreProductListServiceMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.product.storeAllDataInCaheRequest, com.grpc.user.product.storeAllDataInCaheResponse> getStoreProductListServiceMethod;
    if ((getStoreProductListServiceMethod = storeAllDataInCaheServiceGrpc.getStoreProductListServiceMethod) == null) {
      synchronized (storeAllDataInCaheServiceGrpc.class) {
        if ((getStoreProductListServiceMethod = storeAllDataInCaheServiceGrpc.getStoreProductListServiceMethod) == null) {
          storeAllDataInCaheServiceGrpc.getStoreProductListServiceMethod = getStoreProductListServiceMethod =
              io.grpc.MethodDescriptor.<com.grpc.user.product.storeAllDataInCaheRequest, com.grpc.user.product.storeAllDataInCaheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "storeProductListService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.product.storeAllDataInCaheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.product.storeAllDataInCaheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new storeAllDataInCaheServiceMethodDescriptorSupplier("storeProductListService"))
              .build();
        }
      }
    }
    return getStoreProductListServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static storeAllDataInCaheServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<storeAllDataInCaheServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<storeAllDataInCaheServiceStub>() {
        @java.lang.Override
        public storeAllDataInCaheServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new storeAllDataInCaheServiceStub(channel, callOptions);
        }
      };
    return storeAllDataInCaheServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static storeAllDataInCaheServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<storeAllDataInCaheServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<storeAllDataInCaheServiceBlockingStub>() {
        @java.lang.Override
        public storeAllDataInCaheServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new storeAllDataInCaheServiceBlockingStub(channel, callOptions);
        }
      };
    return storeAllDataInCaheServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static storeAllDataInCaheServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<storeAllDataInCaheServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<storeAllDataInCaheServiceFutureStub>() {
        @java.lang.Override
        public storeAllDataInCaheServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new storeAllDataInCaheServiceFutureStub(channel, callOptions);
        }
      };
    return storeAllDataInCaheServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void storeProductListService(com.grpc.user.product.storeAllDataInCaheRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.product.storeAllDataInCaheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreProductListServiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service storeAllDataInCaheService.
   */
  public static abstract class storeAllDataInCaheServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return storeAllDataInCaheServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service storeAllDataInCaheService.
   */
  public static final class storeAllDataInCaheServiceStub
      extends io.grpc.stub.AbstractAsyncStub<storeAllDataInCaheServiceStub> {
    private storeAllDataInCaheServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected storeAllDataInCaheServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new storeAllDataInCaheServiceStub(channel, callOptions);
    }

    /**
     */
    public void storeProductListService(com.grpc.user.product.storeAllDataInCaheRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.product.storeAllDataInCaheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreProductListServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service storeAllDataInCaheService.
   */
  public static final class storeAllDataInCaheServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<storeAllDataInCaheServiceBlockingStub> {
    private storeAllDataInCaheServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected storeAllDataInCaheServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new storeAllDataInCaheServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user.product.storeAllDataInCaheResponse storeProductListService(com.grpc.user.product.storeAllDataInCaheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreProductListServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service storeAllDataInCaheService.
   */
  public static final class storeAllDataInCaheServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<storeAllDataInCaheServiceFutureStub> {
    private storeAllDataInCaheServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected storeAllDataInCaheServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new storeAllDataInCaheServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.product.storeAllDataInCaheResponse> storeProductListService(
        com.grpc.user.product.storeAllDataInCaheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreProductListServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_PRODUCT_LIST_SERVICE = 0;

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
        case METHODID_STORE_PRODUCT_LIST_SERVICE:
          serviceImpl.storeProductListService((com.grpc.user.product.storeAllDataInCaheRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.product.storeAllDataInCaheResponse>) responseObserver);
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
          getStoreProductListServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.user.product.storeAllDataInCaheRequest,
              com.grpc.user.product.storeAllDataInCaheResponse>(
                service, METHODID_STORE_PRODUCT_LIST_SERVICE)))
        .build();
  }

  private static abstract class storeAllDataInCaheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    storeAllDataInCaheServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user.product.ProductService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("storeAllDataInCaheService");
    }
  }

  private static final class storeAllDataInCaheServiceFileDescriptorSupplier
      extends storeAllDataInCaheServiceBaseDescriptorSupplier {
    storeAllDataInCaheServiceFileDescriptorSupplier() {}
  }

  private static final class storeAllDataInCaheServiceMethodDescriptorSupplier
      extends storeAllDataInCaheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    storeAllDataInCaheServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (storeAllDataInCaheServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new storeAllDataInCaheServiceFileDescriptorSupplier())
              .addMethod(getStoreProductListServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
