package com.common.query.grpc;

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
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: ofbizCommon.proto")
public final class OfbizCommonGrpc {

  private OfbizCommonGrpc() {}

  public static final String SERVICE_NAME = "OfbizCommon";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPublicExecMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.common.query.grpc.OfbizCommonRequest,
      com.common.query.grpc.OfbizCommonResponse> METHOD_PUBLIC_EXEC = getPublicExecMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.common.query.grpc.OfbizCommonRequest,
      com.common.query.grpc.OfbizCommonResponse> getPublicExecMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.common.query.grpc.OfbizCommonRequest,
      com.common.query.grpc.OfbizCommonResponse> getPublicExecMethod() {
    return getPublicExecMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.common.query.grpc.OfbizCommonRequest,
      com.common.query.grpc.OfbizCommonResponse> getPublicExecMethodHelper() {
    io.grpc.MethodDescriptor<com.common.query.grpc.OfbizCommonRequest, com.common.query.grpc.OfbizCommonResponse> getPublicExecMethod;
    if ((getPublicExecMethod = OfbizCommonGrpc.getPublicExecMethod) == null) {
      synchronized (OfbizCommonGrpc.class) {
        if ((getPublicExecMethod = OfbizCommonGrpc.getPublicExecMethod) == null) {
          OfbizCommonGrpc.getPublicExecMethod = getPublicExecMethod = 
              io.grpc.MethodDescriptor.<com.common.query.grpc.OfbizCommonRequest, com.common.query.grpc.OfbizCommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OfbizCommon", "PublicExec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.common.query.grpc.OfbizCommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.common.query.grpc.OfbizCommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OfbizCommonMethodDescriptorSupplier("PublicExec"))
                  .build();
          }
        }
     }
     return getPublicExecMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OfbizCommonStub newStub(io.grpc.Channel channel) {
    return new OfbizCommonStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OfbizCommonBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OfbizCommonBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OfbizCommonFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OfbizCommonFutureStub(channel);
  }

  /**
   */
  public static abstract class OfbizCommonImplBase implements io.grpc.BindableService {

    /**
     */
    public void publicExec(com.common.query.grpc.OfbizCommonRequest request,
        io.grpc.stub.StreamObserver<com.common.query.grpc.OfbizCommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPublicExecMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPublicExecMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.common.query.grpc.OfbizCommonRequest,
                com.common.query.grpc.OfbizCommonResponse>(
                  this, METHODID_PUBLIC_EXEC)))
          .build();
    }
  }

  /**
   */
  public static final class OfbizCommonStub extends io.grpc.stub.AbstractStub<OfbizCommonStub> {
    private OfbizCommonStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OfbizCommonStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfbizCommonStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OfbizCommonStub(channel, callOptions);
    }

    /**
     */
    public void publicExec(com.common.query.grpc.OfbizCommonRequest request,
        io.grpc.stub.StreamObserver<com.common.query.grpc.OfbizCommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublicExecMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OfbizCommonBlockingStub extends io.grpc.stub.AbstractStub<OfbizCommonBlockingStub> {
    private OfbizCommonBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OfbizCommonBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfbizCommonBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OfbizCommonBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.common.query.grpc.OfbizCommonResponse publicExec(com.common.query.grpc.OfbizCommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getPublicExecMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OfbizCommonFutureStub extends io.grpc.stub.AbstractStub<OfbizCommonFutureStub> {
    private OfbizCommonFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OfbizCommonFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfbizCommonFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OfbizCommonFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.common.query.grpc.OfbizCommonResponse> publicExec(
        com.common.query.grpc.OfbizCommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPublicExecMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLIC_EXEC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OfbizCommonImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OfbizCommonImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLIC_EXEC:
          serviceImpl.publicExec((com.common.query.grpc.OfbizCommonRequest) request,
              (io.grpc.stub.StreamObserver<com.common.query.grpc.OfbizCommonResponse>) responseObserver);
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

  private static abstract class OfbizCommonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OfbizCommonBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.common.query.grpc.OfbizCommonOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OfbizCommon");
    }
  }

  private static final class OfbizCommonFileDescriptorSupplier
      extends OfbizCommonBaseDescriptorSupplier {
    OfbizCommonFileDescriptorSupplier() {}
  }

  private static final class OfbizCommonMethodDescriptorSupplier
      extends OfbizCommonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OfbizCommonMethodDescriptorSupplier(String methodName) {
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
      synchronized (OfbizCommonGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OfbizCommonFileDescriptorSupplier())
              .addMethod(getPublicExecMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
