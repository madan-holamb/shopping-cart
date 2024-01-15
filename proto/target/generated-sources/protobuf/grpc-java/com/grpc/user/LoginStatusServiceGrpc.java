package com.grpc.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: login-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LoginStatusServiceGrpc {

  private LoginStatusServiceGrpc() {}

  public static final String SERVICE_NAME = "LoginStatusService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.user.LoginRequest,
      com.grpc.user.LoginResponse> getFindIsUserLogedInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findIsUserLogedIn",
      requestType = com.grpc.user.LoginRequest.class,
      responseType = com.grpc.user.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.user.LoginRequest,
      com.grpc.user.LoginResponse> getFindIsUserLogedInMethod() {
    io.grpc.MethodDescriptor<com.grpc.user.LoginRequest, com.grpc.user.LoginResponse> getFindIsUserLogedInMethod;
    if ((getFindIsUserLogedInMethod = LoginStatusServiceGrpc.getFindIsUserLogedInMethod) == null) {
      synchronized (LoginStatusServiceGrpc.class) {
        if ((getFindIsUserLogedInMethod = LoginStatusServiceGrpc.getFindIsUserLogedInMethod) == null) {
          LoginStatusServiceGrpc.getFindIsUserLogedInMethod = getFindIsUserLogedInMethod =
              io.grpc.MethodDescriptor.<com.grpc.user.LoginRequest, com.grpc.user.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findIsUserLogedIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.user.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginStatusServiceMethodDescriptorSupplier("findIsUserLogedIn"))
              .build();
        }
      }
    }
    return getFindIsUserLogedInMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoginStatusServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginStatusServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginStatusServiceStub>() {
        @java.lang.Override
        public LoginStatusServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginStatusServiceStub(channel, callOptions);
        }
      };
    return LoginStatusServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoginStatusServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginStatusServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginStatusServiceBlockingStub>() {
        @java.lang.Override
        public LoginStatusServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginStatusServiceBlockingStub(channel, callOptions);
        }
      };
    return LoginStatusServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoginStatusServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginStatusServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginStatusServiceFutureStub>() {
        @java.lang.Override
        public LoginStatusServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginStatusServiceFutureStub(channel, callOptions);
        }
      };
    return LoginStatusServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findIsUserLogedIn(com.grpc.user.LoginRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindIsUserLogedInMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LoginStatusService.
   */
  public static abstract class LoginStatusServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LoginStatusServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LoginStatusService.
   */
  public static final class LoginStatusServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LoginStatusServiceStub> {
    private LoginStatusServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginStatusServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginStatusServiceStub(channel, callOptions);
    }

    /**
     */
    public void findIsUserLogedIn(com.grpc.user.LoginRequest request,
        io.grpc.stub.StreamObserver<com.grpc.user.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindIsUserLogedInMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LoginStatusService.
   */
  public static final class LoginStatusServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LoginStatusServiceBlockingStub> {
    private LoginStatusServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginStatusServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginStatusServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.user.LoginResponse findIsUserLogedIn(com.grpc.user.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindIsUserLogedInMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LoginStatusService.
   */
  public static final class LoginStatusServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LoginStatusServiceFutureStub> {
    private LoginStatusServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginStatusServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginStatusServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.user.LoginResponse> findIsUserLogedIn(
        com.grpc.user.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindIsUserLogedInMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_IS_USER_LOGED_IN = 0;

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
        case METHODID_FIND_IS_USER_LOGED_IN:
          serviceImpl.findIsUserLogedIn((com.grpc.user.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.user.LoginResponse>) responseObserver);
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
          getFindIsUserLogedInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.user.LoginRequest,
              com.grpc.user.LoginResponse>(
                service, METHODID_FIND_IS_USER_LOGED_IN)))
        .build();
  }

  private static abstract class LoginStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoginStatusServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.user.LoginService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoginStatusService");
    }
  }

  private static final class LoginStatusServiceFileDescriptorSupplier
      extends LoginStatusServiceBaseDescriptorSupplier {
    LoginStatusServiceFileDescriptorSupplier() {}
  }

  private static final class LoginStatusServiceMethodDescriptorSupplier
      extends LoginStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoginStatusServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LoginStatusServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoginStatusServiceFileDescriptorSupplier())
              .addMethod(getFindIsUserLogedInMethod())
              .build();
        }
      }
    }
    return result;
  }
}
