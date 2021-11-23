package com.kisan.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GrpcStreamServiceGrpc {

  private GrpcStreamServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.GrpcStreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kisan.proto.LoginRequest,
      com.kisan.proto.LoginResponse> getGetLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLogin",
      requestType = com.kisan.proto.LoginRequest.class,
      responseType = com.kisan.proto.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.kisan.proto.LoginRequest,
      com.kisan.proto.LoginResponse> getGetLoginMethod() {
    io.grpc.MethodDescriptor<com.kisan.proto.LoginRequest, com.kisan.proto.LoginResponse> getGetLoginMethod;
    if ((getGetLoginMethod = GrpcStreamServiceGrpc.getGetLoginMethod) == null) {
      synchronized (GrpcStreamServiceGrpc.class) {
        if ((getGetLoginMethod = GrpcStreamServiceGrpc.getGetLoginMethod) == null) {
          GrpcStreamServiceGrpc.getGetLoginMethod = getGetLoginMethod =
              io.grpc.MethodDescriptor.<com.kisan.proto.LoginRequest, com.kisan.proto.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kisan.proto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kisan.proto.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcStreamServiceMethodDescriptorSupplier("GetLogin"))
              .build();
        }
      }
    }
    return getGetLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcStreamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcStreamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcStreamServiceStub>() {
        @java.lang.Override
        public GrpcStreamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcStreamServiceStub(channel, callOptions);
        }
      };
    return GrpcStreamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcStreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcStreamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcStreamServiceBlockingStub>() {
        @java.lang.Override
        public GrpcStreamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcStreamServiceBlockingStub(channel, callOptions);
        }
      };
    return GrpcStreamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcStreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcStreamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcStreamServiceFutureStub>() {
        @java.lang.Override
        public GrpcStreamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcStreamServiceFutureStub(channel, callOptions);
        }
      };
    return GrpcStreamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GrpcStreamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLogin(com.kisan.proto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.kisan.proto.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLoginMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.kisan.proto.LoginRequest,
                com.kisan.proto.LoginResponse>(
                  this, METHODID_GET_LOGIN)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcStreamServiceStub extends io.grpc.stub.AbstractAsyncStub<GrpcStreamServiceStub> {
    private GrpcStreamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcStreamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcStreamServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLogin(com.kisan.proto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.kisan.proto.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcStreamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcStreamServiceBlockingStub> {
    private GrpcStreamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcStreamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcStreamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.kisan.proto.LoginResponse> getLogin(
        com.kisan.proto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcStreamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcStreamServiceFutureStub> {
    private GrpcStreamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcStreamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcStreamServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcStreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcStreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOGIN:
          serviceImpl.getLogin((com.kisan.proto.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.kisan.proto.LoginResponse>) responseObserver);
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

  private static abstract class GrpcStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcStreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kisan.proto.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcStreamService");
    }
  }

  private static final class GrpcStreamServiceFileDescriptorSupplier
      extends GrpcStreamServiceBaseDescriptorSupplier {
    GrpcStreamServiceFileDescriptorSupplier() {}
  }

  private static final class GrpcStreamServiceMethodDescriptorSupplier
      extends GrpcStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcStreamServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrpcStreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcStreamServiceFileDescriptorSupplier())
              .addMethod(getGetLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
