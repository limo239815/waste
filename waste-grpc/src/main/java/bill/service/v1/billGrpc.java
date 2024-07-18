package bill.service.v1;

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
    comments = "Source: bill.proto")
public final class billGrpc {

  private billGrpc() {}

  public static final String SERVICE_NAME = "bill.service.v1.bill";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCommonSaveBillV2Method()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.SaveBillReq,
      bill.service.v1.SaveBillResp> METHOD_COMMON_SAVE_BILL_V2 = getCommonSaveBillV2MethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.SaveBillReq,
      bill.service.v1.SaveBillResp> getCommonSaveBillV2Method;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.SaveBillReq,
      bill.service.v1.SaveBillResp> getCommonSaveBillV2Method() {
    return getCommonSaveBillV2MethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.SaveBillReq,
      bill.service.v1.SaveBillResp> getCommonSaveBillV2MethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.SaveBillReq, bill.service.v1.SaveBillResp> getCommonSaveBillV2Method;
    if ((getCommonSaveBillV2Method = billGrpc.getCommonSaveBillV2Method) == null) {
      synchronized (billGrpc.class) {
        if ((getCommonSaveBillV2Method = billGrpc.getCommonSaveBillV2Method) == null) {
          billGrpc.getCommonSaveBillV2Method = getCommonSaveBillV2Method = 
              io.grpc.MethodDescriptor.<bill.service.v1.SaveBillReq, bill.service.v1.SaveBillResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "commonSaveBillV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.SaveBillReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.SaveBillResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("commonSaveBillV2"))
                  .build();
          }
        }
     }
     return getCommonSaveBillV2Method;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCommonDeleteBillV2Method()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.DeleteBillReq,
      bill.service.v1.DeleteBillResp> METHOD_COMMON_DELETE_BILL_V2 = getCommonDeleteBillV2MethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.DeleteBillReq,
      bill.service.v1.DeleteBillResp> getCommonDeleteBillV2Method;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.DeleteBillReq,
      bill.service.v1.DeleteBillResp> getCommonDeleteBillV2Method() {
    return getCommonDeleteBillV2MethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.DeleteBillReq,
      bill.service.v1.DeleteBillResp> getCommonDeleteBillV2MethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.DeleteBillReq, bill.service.v1.DeleteBillResp> getCommonDeleteBillV2Method;
    if ((getCommonDeleteBillV2Method = billGrpc.getCommonDeleteBillV2Method) == null) {
      synchronized (billGrpc.class) {
        if ((getCommonDeleteBillV2Method = billGrpc.getCommonDeleteBillV2Method) == null) {
          billGrpc.getCommonDeleteBillV2Method = getCommonDeleteBillV2Method = 
              io.grpc.MethodDescriptor.<bill.service.v1.DeleteBillReq, bill.service.v1.DeleteBillResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "commonDeleteBillV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.DeleteBillReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.DeleteBillResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("commonDeleteBillV2"))
                  .build();
          }
        }
     }
     return getCommonDeleteBillV2Method;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBatchEditMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.BatchEditReq,
      bill.service.v1.BatchEditResp> METHOD_BATCH_EDIT = getBatchEditMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.BatchEditReq,
      bill.service.v1.BatchEditResp> getBatchEditMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.BatchEditReq,
      bill.service.v1.BatchEditResp> getBatchEditMethod() {
    return getBatchEditMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.BatchEditReq,
      bill.service.v1.BatchEditResp> getBatchEditMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.BatchEditReq, bill.service.v1.BatchEditResp> getBatchEditMethod;
    if ((getBatchEditMethod = billGrpc.getBatchEditMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getBatchEditMethod = billGrpc.getBatchEditMethod) == null) {
          billGrpc.getBatchEditMethod = getBatchEditMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.BatchEditReq, bill.service.v1.BatchEditResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "BatchEdit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BatchEditReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BatchEditResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("BatchEdit"))
                  .build();
          }
        }
     }
     return getBatchEditMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCommonSaveStatusMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.StatusTrackReq,
      bill.service.v1.StatusTrackResp> METHOD_COMMON_SAVE_STATUS = getCommonSaveStatusMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.StatusTrackReq,
      bill.service.v1.StatusTrackResp> getCommonSaveStatusMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.StatusTrackReq,
      bill.service.v1.StatusTrackResp> getCommonSaveStatusMethod() {
    return getCommonSaveStatusMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.StatusTrackReq,
      bill.service.v1.StatusTrackResp> getCommonSaveStatusMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.StatusTrackReq, bill.service.v1.StatusTrackResp> getCommonSaveStatusMethod;
    if ((getCommonSaveStatusMethod = billGrpc.getCommonSaveStatusMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getCommonSaveStatusMethod = billGrpc.getCommonSaveStatusMethod) == null) {
          billGrpc.getCommonSaveStatusMethod = getCommonSaveStatusMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.StatusTrackReq, bill.service.v1.StatusTrackResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "commonSaveStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.StatusTrackReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.StatusTrackResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("commonSaveStatus"))
                  .build();
          }
        }
     }
     return getCommonSaveStatusMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCommonCreateBillByBillMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.CommonCreateReq,
      bill.service.v1.CommonCreateResp> METHOD_COMMON_CREATE_BILL_BY_BILL = getCommonCreateBillByBillMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.CommonCreateReq,
      bill.service.v1.CommonCreateResp> getCommonCreateBillByBillMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.CommonCreateReq,
      bill.service.v1.CommonCreateResp> getCommonCreateBillByBillMethod() {
    return getCommonCreateBillByBillMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.CommonCreateReq,
      bill.service.v1.CommonCreateResp> getCommonCreateBillByBillMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.CommonCreateReq, bill.service.v1.CommonCreateResp> getCommonCreateBillByBillMethod;
    if ((getCommonCreateBillByBillMethod = billGrpc.getCommonCreateBillByBillMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getCommonCreateBillByBillMethod = billGrpc.getCommonCreateBillByBillMethod) == null) {
          billGrpc.getCommonCreateBillByBillMethod = getCommonCreateBillByBillMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.CommonCreateReq, bill.service.v1.CommonCreateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "commonCreateBillByBill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CommonCreateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CommonCreateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("commonCreateBillByBill"))
                  .build();
          }
        }
     }
     return getCommonCreateBillByBillMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCommonEditBillByBillMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.CommonEditReq,
      bill.service.v1.CommonEditResp> METHOD_COMMON_EDIT_BILL_BY_BILL = getCommonEditBillByBillMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.CommonEditReq,
      bill.service.v1.CommonEditResp> getCommonEditBillByBillMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.CommonEditReq,
      bill.service.v1.CommonEditResp> getCommonEditBillByBillMethod() {
    return getCommonEditBillByBillMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.CommonEditReq,
      bill.service.v1.CommonEditResp> getCommonEditBillByBillMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.CommonEditReq, bill.service.v1.CommonEditResp> getCommonEditBillByBillMethod;
    if ((getCommonEditBillByBillMethod = billGrpc.getCommonEditBillByBillMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getCommonEditBillByBillMethod = billGrpc.getCommonEditBillByBillMethod) == null) {
          billGrpc.getCommonEditBillByBillMethod = getCommonEditBillByBillMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.CommonEditReq, bill.service.v1.CommonEditResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "commonEditBillByBill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CommonEditReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CommonEditResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("commonEditBillByBill"))
                  .build();
          }
        }
     }
     return getCommonEditBillByBillMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEntityEditMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.EntityEditReq,
      bill.service.v1.EntityEditResp> METHOD_ENTITY_EDIT = getEntityEditMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.EntityEditReq,
      bill.service.v1.EntityEditResp> getEntityEditMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.EntityEditReq,
      bill.service.v1.EntityEditResp> getEntityEditMethod() {
    return getEntityEditMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.EntityEditReq,
      bill.service.v1.EntityEditResp> getEntityEditMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.EntityEditReq, bill.service.v1.EntityEditResp> getEntityEditMethod;
    if ((getEntityEditMethod = billGrpc.getEntityEditMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getEntityEditMethod = billGrpc.getEntityEditMethod) == null) {
          billGrpc.getEntityEditMethod = getEntityEditMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.EntityEditReq, bill.service.v1.EntityEditResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "entityEdit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntityEditReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntityEditResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("entityEdit"))
                  .build();
          }
        }
     }
     return getEntityEditMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEntityCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.EntityCreateReq,
      bill.service.v1.EntityCreateResp> METHOD_ENTITY_CREATE = getEntityCreateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.EntityCreateReq,
      bill.service.v1.EntityCreateResp> getEntityCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.EntityCreateReq,
      bill.service.v1.EntityCreateResp> getEntityCreateMethod() {
    return getEntityCreateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.EntityCreateReq,
      bill.service.v1.EntityCreateResp> getEntityCreateMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.EntityCreateReq, bill.service.v1.EntityCreateResp> getEntityCreateMethod;
    if ((getEntityCreateMethod = billGrpc.getEntityCreateMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getEntityCreateMethod = billGrpc.getEntityCreateMethod) == null) {
          billGrpc.getEntityCreateMethod = getEntityCreateMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.EntityCreateReq, bill.service.v1.EntityCreateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "entityCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntityCreateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntityCreateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("entityCreate"))
                  .build();
          }
        }
     }
     return getEntityCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEntityDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.EntityDeleteReq,
      bill.service.v1.EntityDeleteResp> METHOD_ENTITY_DELETE = getEntityDeleteMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.EntityDeleteReq,
      bill.service.v1.EntityDeleteResp> getEntityDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.EntityDeleteReq,
      bill.service.v1.EntityDeleteResp> getEntityDeleteMethod() {
    return getEntityDeleteMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.EntityDeleteReq,
      bill.service.v1.EntityDeleteResp> getEntityDeleteMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.EntityDeleteReq, bill.service.v1.EntityDeleteResp> getEntityDeleteMethod;
    if ((getEntityDeleteMethod = billGrpc.getEntityDeleteMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getEntityDeleteMethod = billGrpc.getEntityDeleteMethod) == null) {
          billGrpc.getEntityDeleteMethod = getEntityDeleteMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.EntityDeleteReq, bill.service.v1.EntityDeleteResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "entityDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntityDeleteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntityDeleteResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("entityDelete"))
                  .build();
          }
        }
     }
     return getEntityDeleteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCommitOperateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.CommitOperateReq,
      bill.service.v1.CommitOperateResp> METHOD_COMMIT_OPERATE = getCommitOperateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.CommitOperateReq,
      bill.service.v1.CommitOperateResp> getCommitOperateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.CommitOperateReq,
      bill.service.v1.CommitOperateResp> getCommitOperateMethod() {
    return getCommitOperateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.CommitOperateReq,
      bill.service.v1.CommitOperateResp> getCommitOperateMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.CommitOperateReq, bill.service.v1.CommitOperateResp> getCommitOperateMethod;
    if ((getCommitOperateMethod = billGrpc.getCommitOperateMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getCommitOperateMethod = billGrpc.getCommitOperateMethod) == null) {
          billGrpc.getCommitOperateMethod = getCommitOperateMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.CommitOperateReq, bill.service.v1.CommitOperateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "commitOperate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CommitOperateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CommitOperateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("commitOperate"))
                  .build();
          }
        }
     }
     return getCommitOperateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCompareConditionsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.CompareConditionsReq,
      bill.service.v1.CompareConditionsResp> METHOD_COMPARE_CONDITIONS = getCompareConditionsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.CompareConditionsReq,
      bill.service.v1.CompareConditionsResp> getCompareConditionsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.CompareConditionsReq,
      bill.service.v1.CompareConditionsResp> getCompareConditionsMethod() {
    return getCompareConditionsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.CompareConditionsReq,
      bill.service.v1.CompareConditionsResp> getCompareConditionsMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.CompareConditionsReq, bill.service.v1.CompareConditionsResp> getCompareConditionsMethod;
    if ((getCompareConditionsMethod = billGrpc.getCompareConditionsMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getCompareConditionsMethod = billGrpc.getCompareConditionsMethod) == null) {
          billGrpc.getCompareConditionsMethod = getCompareConditionsMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.CompareConditionsReq, bill.service.v1.CompareConditionsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "compareConditions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CompareConditionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CompareConditionsResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("compareConditions"))
                  .build();
          }
        }
     }
     return getCompareConditionsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBillChangeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.BillChangeReq,
      bill.service.v1.BillChangeResp> METHOD_BILL_CHANGE = getBillChangeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.BillChangeReq,
      bill.service.v1.BillChangeResp> getBillChangeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.BillChangeReq,
      bill.service.v1.BillChangeResp> getBillChangeMethod() {
    return getBillChangeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.BillChangeReq,
      bill.service.v1.BillChangeResp> getBillChangeMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.BillChangeReq, bill.service.v1.BillChangeResp> getBillChangeMethod;
    if ((getBillChangeMethod = billGrpc.getBillChangeMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getBillChangeMethod = billGrpc.getBillChangeMethod) == null) {
          billGrpc.getBillChangeMethod = getBillChangeMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.BillChangeReq, bill.service.v1.BillChangeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "billChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BillChangeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BillChangeResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("billChange"))
                  .build();
          }
        }
     }
     return getBillChangeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBillQueryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.BillQueryReq,
      bill.service.v1.BillQueryResp> METHOD_BILL_QUERY = getBillQueryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.BillQueryReq,
      bill.service.v1.BillQueryResp> getBillQueryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.BillQueryReq,
      bill.service.v1.BillQueryResp> getBillQueryMethod() {
    return getBillQueryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.BillQueryReq,
      bill.service.v1.BillQueryResp> getBillQueryMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.BillQueryReq, bill.service.v1.BillQueryResp> getBillQueryMethod;
    if ((getBillQueryMethod = billGrpc.getBillQueryMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getBillQueryMethod = billGrpc.getBillQueryMethod) == null) {
          billGrpc.getBillQueryMethod = getBillQueryMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.BillQueryReq, bill.service.v1.BillQueryResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "billQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BillQueryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BillQueryResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("billQuery"))
                  .build();
          }
        }
     }
     return getBillQueryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEntitySqlQueryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.EntitySqlQueryReq,
      bill.service.v1.EntitySqlQueryResp> METHOD_ENTITY_SQL_QUERY = getEntitySqlQueryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.EntitySqlQueryReq,
      bill.service.v1.EntitySqlQueryResp> getEntitySqlQueryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.EntitySqlQueryReq,
      bill.service.v1.EntitySqlQueryResp> getEntitySqlQueryMethod() {
    return getEntitySqlQueryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.EntitySqlQueryReq,
      bill.service.v1.EntitySqlQueryResp> getEntitySqlQueryMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.EntitySqlQueryReq, bill.service.v1.EntitySqlQueryResp> getEntitySqlQueryMethod;
    if ((getEntitySqlQueryMethod = billGrpc.getEntitySqlQueryMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getEntitySqlQueryMethod = billGrpc.getEntitySqlQueryMethod) == null) {
          billGrpc.getEntitySqlQueryMethod = getEntitySqlQueryMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.EntitySqlQueryReq, bill.service.v1.EntitySqlQueryResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "entitySqlQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntitySqlQueryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntitySqlQueryResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("entitySqlQuery"))
                  .build();
          }
        }
     }
     return getEntitySqlQueryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBatchArrivalBillAutoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.BatchArrivalBillAutoReq,
      bill.service.v1.BatchArrivalBillAutoResp> METHOD_BATCH_ARRIVAL_BILL_AUTO = getBatchArrivalBillAutoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.BatchArrivalBillAutoReq,
      bill.service.v1.BatchArrivalBillAutoResp> getBatchArrivalBillAutoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.BatchArrivalBillAutoReq,
      bill.service.v1.BatchArrivalBillAutoResp> getBatchArrivalBillAutoMethod() {
    return getBatchArrivalBillAutoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.BatchArrivalBillAutoReq,
      bill.service.v1.BatchArrivalBillAutoResp> getBatchArrivalBillAutoMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.BatchArrivalBillAutoReq, bill.service.v1.BatchArrivalBillAutoResp> getBatchArrivalBillAutoMethod;
    if ((getBatchArrivalBillAutoMethod = billGrpc.getBatchArrivalBillAutoMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getBatchArrivalBillAutoMethod = billGrpc.getBatchArrivalBillAutoMethod) == null) {
          billGrpc.getBatchArrivalBillAutoMethod = getBatchArrivalBillAutoMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.BatchArrivalBillAutoReq, bill.service.v1.BatchArrivalBillAutoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "batchArrivalBillAuto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BatchArrivalBillAutoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BatchArrivalBillAutoResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("batchArrivalBillAuto"))
                  .build();
          }
        }
     }
     return getBatchArrivalBillAutoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFlowTempTableOperateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.FlowTempTableOperateReq,
      bill.service.v1.FlowTempTableOperateResp> METHOD_FLOW_TEMP_TABLE_OPERATE = getFlowTempTableOperateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.FlowTempTableOperateReq,
      bill.service.v1.FlowTempTableOperateResp> getFlowTempTableOperateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.FlowTempTableOperateReq,
      bill.service.v1.FlowTempTableOperateResp> getFlowTempTableOperateMethod() {
    return getFlowTempTableOperateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.FlowTempTableOperateReq,
      bill.service.v1.FlowTempTableOperateResp> getFlowTempTableOperateMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.FlowTempTableOperateReq, bill.service.v1.FlowTempTableOperateResp> getFlowTempTableOperateMethod;
    if ((getFlowTempTableOperateMethod = billGrpc.getFlowTempTableOperateMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getFlowTempTableOperateMethod = billGrpc.getFlowTempTableOperateMethod) == null) {
          billGrpc.getFlowTempTableOperateMethod = getFlowTempTableOperateMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.FlowTempTableOperateReq, bill.service.v1.FlowTempTableOperateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "flowTempTableOperate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.FlowTempTableOperateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.FlowTempTableOperateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("flowTempTableOperate"))
                  .build();
          }
        }
     }
     return getFlowTempTableOperateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListBillIdsGroupMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.ListBillIdsGroupReq,
      bill.service.v1.ListBillIdsGroupResp> METHOD_LIST_BILL_IDS_GROUP = getListBillIdsGroupMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.ListBillIdsGroupReq,
      bill.service.v1.ListBillIdsGroupResp> getListBillIdsGroupMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.ListBillIdsGroupReq,
      bill.service.v1.ListBillIdsGroupResp> getListBillIdsGroupMethod() {
    return getListBillIdsGroupMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.ListBillIdsGroupReq,
      bill.service.v1.ListBillIdsGroupResp> getListBillIdsGroupMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.ListBillIdsGroupReq, bill.service.v1.ListBillIdsGroupResp> getListBillIdsGroupMethod;
    if ((getListBillIdsGroupMethod = billGrpc.getListBillIdsGroupMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getListBillIdsGroupMethod = billGrpc.getListBillIdsGroupMethod) == null) {
          billGrpc.getListBillIdsGroupMethod = getListBillIdsGroupMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.ListBillIdsGroupReq, bill.service.v1.ListBillIdsGroupResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "listBillIdsGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.ListBillIdsGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.ListBillIdsGroupResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("listBillIdsGroup"))
                  .build();
          }
        }
     }
     return getListBillIdsGroupMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBillQueryUpdateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.BillQueryUpdateReq,
      bill.service.v1.BillQueryUpdateResp> METHOD_BILL_QUERY_UPDATE = getBillQueryUpdateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.BillQueryUpdateReq,
      bill.service.v1.BillQueryUpdateResp> getBillQueryUpdateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.BillQueryUpdateReq,
      bill.service.v1.BillQueryUpdateResp> getBillQueryUpdateMethod() {
    return getBillQueryUpdateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.BillQueryUpdateReq,
      bill.service.v1.BillQueryUpdateResp> getBillQueryUpdateMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.BillQueryUpdateReq, bill.service.v1.BillQueryUpdateResp> getBillQueryUpdateMethod;
    if ((getBillQueryUpdateMethod = billGrpc.getBillQueryUpdateMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getBillQueryUpdateMethod = billGrpc.getBillQueryUpdateMethod) == null) {
          billGrpc.getBillQueryUpdateMethod = getBillQueryUpdateMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.BillQueryUpdateReq, bill.service.v1.BillQueryUpdateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "billQueryUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BillQueryUpdateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BillQueryUpdateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("billQueryUpdate"))
                  .build();
          }
        }
     }
     return getBillQueryUpdateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBillSerialNumberCheckMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.BillSerialNumberCheckReq,
      bill.service.v1.BillSerialNumberCheckResp> METHOD_BILL_SERIAL_NUMBER_CHECK = getBillSerialNumberCheckMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.BillSerialNumberCheckReq,
      bill.service.v1.BillSerialNumberCheckResp> getBillSerialNumberCheckMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.BillSerialNumberCheckReq,
      bill.service.v1.BillSerialNumberCheckResp> getBillSerialNumberCheckMethod() {
    return getBillSerialNumberCheckMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.BillSerialNumberCheckReq,
      bill.service.v1.BillSerialNumberCheckResp> getBillSerialNumberCheckMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.BillSerialNumberCheckReq, bill.service.v1.BillSerialNumberCheckResp> getBillSerialNumberCheckMethod;
    if ((getBillSerialNumberCheckMethod = billGrpc.getBillSerialNumberCheckMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getBillSerialNumberCheckMethod = billGrpc.getBillSerialNumberCheckMethod) == null) {
          billGrpc.getBillSerialNumberCheckMethod = getBillSerialNumberCheckMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.BillSerialNumberCheckReq, bill.service.v1.BillSerialNumberCheckResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "billSerialNumberCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BillSerialNumberCheckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.BillSerialNumberCheckResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("billSerialNumberCheck"))
                  .build();
          }
        }
     }
     return getBillSerialNumberCheckMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMethordExecMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.MethordExecReq,
      bill.service.v1.MethordExecResp> METHOD_METHORD_EXEC = getMethordExecMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.MethordExecReq,
      bill.service.v1.MethordExecResp> getMethordExecMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.MethordExecReq,
      bill.service.v1.MethordExecResp> getMethordExecMethod() {
    return getMethordExecMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.MethordExecReq,
      bill.service.v1.MethordExecResp> getMethordExecMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.MethordExecReq, bill.service.v1.MethordExecResp> getMethordExecMethod;
    if ((getMethordExecMethod = billGrpc.getMethordExecMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getMethordExecMethod = billGrpc.getMethordExecMethod) == null) {
          billGrpc.getMethordExecMethod = getMethordExecMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.MethordExecReq, bill.service.v1.MethordExecResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "methordExec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.MethordExecReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.MethordExecResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("methordExec"))
                  .build();
          }
        }
     }
     return getMethordExecMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEntityCommonQueryFlowMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.EntityCommonQueryFlowReq,
      bill.service.v1.EntityCommonQueryFlowResp> METHOD_ENTITY_COMMON_QUERY_FLOW = getEntityCommonQueryFlowMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.EntityCommonQueryFlowReq,
      bill.service.v1.EntityCommonQueryFlowResp> getEntityCommonQueryFlowMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.EntityCommonQueryFlowReq,
      bill.service.v1.EntityCommonQueryFlowResp> getEntityCommonQueryFlowMethod() {
    return getEntityCommonQueryFlowMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.EntityCommonQueryFlowReq,
      bill.service.v1.EntityCommonQueryFlowResp> getEntityCommonQueryFlowMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.EntityCommonQueryFlowReq, bill.service.v1.EntityCommonQueryFlowResp> getEntityCommonQueryFlowMethod;
    if ((getEntityCommonQueryFlowMethod = billGrpc.getEntityCommonQueryFlowMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getEntityCommonQueryFlowMethod = billGrpc.getEntityCommonQueryFlowMethod) == null) {
          billGrpc.getEntityCommonQueryFlowMethod = getEntityCommonQueryFlowMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.EntityCommonQueryFlowReq, bill.service.v1.EntityCommonQueryFlowResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "entityCommonQueryFlow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntityCommonQueryFlowReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.EntityCommonQueryFlowResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("entityCommonQueryFlow"))
                  .build();
          }
        }
     }
     return getEntityCommonQueryFlowMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCommitOperateExeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<bill.service.v1.CommitOperateExeReq,
      bill.service.v1.CommitOperateExeResp> METHOD_COMMIT_OPERATE_EXE = getCommitOperateExeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<bill.service.v1.CommitOperateExeReq,
      bill.service.v1.CommitOperateExeResp> getCommitOperateExeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<bill.service.v1.CommitOperateExeReq,
      bill.service.v1.CommitOperateExeResp> getCommitOperateExeMethod() {
    return getCommitOperateExeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<bill.service.v1.CommitOperateExeReq,
      bill.service.v1.CommitOperateExeResp> getCommitOperateExeMethodHelper() {
    io.grpc.MethodDescriptor<bill.service.v1.CommitOperateExeReq, bill.service.v1.CommitOperateExeResp> getCommitOperateExeMethod;
    if ((getCommitOperateExeMethod = billGrpc.getCommitOperateExeMethod) == null) {
      synchronized (billGrpc.class) {
        if ((getCommitOperateExeMethod = billGrpc.getCommitOperateExeMethod) == null) {
          billGrpc.getCommitOperateExeMethod = getCommitOperateExeMethod = 
              io.grpc.MethodDescriptor.<bill.service.v1.CommitOperateExeReq, bill.service.v1.CommitOperateExeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bill.service.v1.bill", "commitOperateExe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CommitOperateExeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bill.service.v1.CommitOperateExeResp.getDefaultInstance()))
                  .setSchemaDescriptor(new billMethodDescriptorSupplier("commitOperateExe"))
                  .build();
          }
        }
     }
     return getCommitOperateExeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static billStub newStub(io.grpc.Channel channel) {
    return new billStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static billBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new billBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static billFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new billFutureStub(channel);
  }

  /**
   */
  public static abstract class billImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *基本服务
     *单据保存
     * </pre>
     */
    public void commonSaveBillV2(bill.service.v1.SaveBillReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.SaveBillResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCommonSaveBillV2MethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *单据删除
     * </pre>
     */
    public void commonDeleteBillV2(bill.service.v1.DeleteBillReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.DeleteBillResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCommonDeleteBillV2MethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *批量修改
     * </pre>
     */
    public void batchEdit(bill.service.v1.BatchEditReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BatchEditResp> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchEditMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *单据服务
     *状态跟踪
     * </pre>
     */
    public void commonSaveStatus(bill.service.v1.StatusTrackReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.StatusTrackResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCommonSaveStatusMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *单据生成
     * </pre>
     */
    public void commonCreateBillByBill(bill.service.v1.CommonCreateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CommonCreateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCommonCreateBillByBillMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *单据修改
     * </pre>
     */
    public void commonEditBillByBill(bill.service.v1.CommonEditReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CommonEditResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCommonEditBillByBillMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *实体修改
     * </pre>
     */
    public void entityEdit(bill.service.v1.EntityEditReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntityEditResp> responseObserver) {
      asyncUnimplementedUnaryCall(getEntityEditMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *实体生成
     * </pre>
     */
    public void entityCreate(bill.service.v1.EntityCreateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntityCreateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getEntityCreateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *实体删除
     * </pre>
     */
    public void entityDelete(bill.service.v1.EntityDeleteReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntityDeleteResp> responseObserver) {
      asyncUnimplementedUnaryCall(getEntityDeleteMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *整体提交
     * </pre>
     */
    public void commitOperate(bill.service.v1.CommitOperateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CommitOperateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitOperateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *比较条件
     * </pre>
     */
    public void compareConditions(bill.service.v1.CompareConditionsReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CompareConditionsResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCompareConditionsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *切换单据(待补)
     * </pre>
     */
    public void billChange(bill.service.v1.BillChangeReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BillChangeResp> responseObserver) {
      asyncUnimplementedUnaryCall(getBillChangeMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *单据查询
     * </pre>
     */
    public void billQuery(bill.service.v1.BillQueryReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BillQueryResp> responseObserver) {
      asyncUnimplementedUnaryCall(getBillQueryMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *实体查询（SQL)
     * </pre>
     */
    public void entitySqlQuery(bill.service.v1.EntitySqlQueryReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntitySqlQueryResp> responseObserver) {
      asyncUnimplementedUnaryCall(getEntitySqlQueryMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *批量生成单据
     * </pre>
     */
    public void batchArrivalBillAuto(bill.service.v1.BatchArrivalBillAutoReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BatchArrivalBillAutoResp> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchArrivalBillAutoMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *查询临时表数据
     * </pre>
     */
    public void flowTempTableOperate(bill.service.v1.FlowTempTableOperateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.FlowTempTableOperateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFlowTempTableOperateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *来源单据编号根据条件分组
     * </pre>
     */
    public void listBillIdsGroup(bill.service.v1.ListBillIdsGroupReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.ListBillIdsGroupResp> responseObserver) {
      asyncUnimplementedUnaryCall(getListBillIdsGroupMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *单据查询修改
     * </pre>
     */
    public void billQueryUpdate(bill.service.v1.BillQueryUpdateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BillQueryUpdateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getBillQueryUpdateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *判断订单明细中的商品是否全部进行序列号录入
     * </pre>
     */
    public void billSerialNumberCheck(bill.service.v1.BillSerialNumberCheckReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BillSerialNumberCheckResp> responseObserver) {
      asyncUnimplementedUnaryCall(getBillSerialNumberCheckMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *方法执行
     * </pre>
     */
    public void methordExec(bill.service.v1.MethordExecReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.MethordExecResp> responseObserver) {
      asyncUnimplementedUnaryCall(getMethordExecMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *通用查询
     * </pre>
     */
    public void entityCommonQueryFlow(bill.service.v1.EntityCommonQueryFlowReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntityCommonQueryFlowResp> responseObserver) {
      asyncUnimplementedUnaryCall(getEntityCommonQueryFlowMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *立即提交
     * </pre>
     */
    public void commitOperateExe(bill.service.v1.CommitOperateExeReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CommitOperateExeResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitOperateExeMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommonSaveBillV2MethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.SaveBillReq,
                bill.service.v1.SaveBillResp>(
                  this, METHODID_COMMON_SAVE_BILL_V2)))
          .addMethod(
            getCommonDeleteBillV2MethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.DeleteBillReq,
                bill.service.v1.DeleteBillResp>(
                  this, METHODID_COMMON_DELETE_BILL_V2)))
          .addMethod(
            getBatchEditMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.BatchEditReq,
                bill.service.v1.BatchEditResp>(
                  this, METHODID_BATCH_EDIT)))
          .addMethod(
            getCommonSaveStatusMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.StatusTrackReq,
                bill.service.v1.StatusTrackResp>(
                  this, METHODID_COMMON_SAVE_STATUS)))
          .addMethod(
            getCommonCreateBillByBillMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.CommonCreateReq,
                bill.service.v1.CommonCreateResp>(
                  this, METHODID_COMMON_CREATE_BILL_BY_BILL)))
          .addMethod(
            getCommonEditBillByBillMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.CommonEditReq,
                bill.service.v1.CommonEditResp>(
                  this, METHODID_COMMON_EDIT_BILL_BY_BILL)))
          .addMethod(
            getEntityEditMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.EntityEditReq,
                bill.service.v1.EntityEditResp>(
                  this, METHODID_ENTITY_EDIT)))
          .addMethod(
            getEntityCreateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.EntityCreateReq,
                bill.service.v1.EntityCreateResp>(
                  this, METHODID_ENTITY_CREATE)))
          .addMethod(
            getEntityDeleteMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.EntityDeleteReq,
                bill.service.v1.EntityDeleteResp>(
                  this, METHODID_ENTITY_DELETE)))
          .addMethod(
            getCommitOperateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.CommitOperateReq,
                bill.service.v1.CommitOperateResp>(
                  this, METHODID_COMMIT_OPERATE)))
          .addMethod(
            getCompareConditionsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.CompareConditionsReq,
                bill.service.v1.CompareConditionsResp>(
                  this, METHODID_COMPARE_CONDITIONS)))
          .addMethod(
            getBillChangeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.BillChangeReq,
                bill.service.v1.BillChangeResp>(
                  this, METHODID_BILL_CHANGE)))
          .addMethod(
            getBillQueryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.BillQueryReq,
                bill.service.v1.BillQueryResp>(
                  this, METHODID_BILL_QUERY)))
          .addMethod(
            getEntitySqlQueryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.EntitySqlQueryReq,
                bill.service.v1.EntitySqlQueryResp>(
                  this, METHODID_ENTITY_SQL_QUERY)))
          .addMethod(
            getBatchArrivalBillAutoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.BatchArrivalBillAutoReq,
                bill.service.v1.BatchArrivalBillAutoResp>(
                  this, METHODID_BATCH_ARRIVAL_BILL_AUTO)))
          .addMethod(
            getFlowTempTableOperateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.FlowTempTableOperateReq,
                bill.service.v1.FlowTempTableOperateResp>(
                  this, METHODID_FLOW_TEMP_TABLE_OPERATE)))
          .addMethod(
            getListBillIdsGroupMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.ListBillIdsGroupReq,
                bill.service.v1.ListBillIdsGroupResp>(
                  this, METHODID_LIST_BILL_IDS_GROUP)))
          .addMethod(
            getBillQueryUpdateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.BillQueryUpdateReq,
                bill.service.v1.BillQueryUpdateResp>(
                  this, METHODID_BILL_QUERY_UPDATE)))
          .addMethod(
            getBillSerialNumberCheckMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.BillSerialNumberCheckReq,
                bill.service.v1.BillSerialNumberCheckResp>(
                  this, METHODID_BILL_SERIAL_NUMBER_CHECK)))
          .addMethod(
            getMethordExecMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.MethordExecReq,
                bill.service.v1.MethordExecResp>(
                  this, METHODID_METHORD_EXEC)))
          .addMethod(
            getEntityCommonQueryFlowMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.EntityCommonQueryFlowReq,
                bill.service.v1.EntityCommonQueryFlowResp>(
                  this, METHODID_ENTITY_COMMON_QUERY_FLOW)))
          .addMethod(
            getCommitOperateExeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                bill.service.v1.CommitOperateExeReq,
                bill.service.v1.CommitOperateExeResp>(
                  this, METHODID_COMMIT_OPERATE_EXE)))
          .build();
    }
  }

  /**
   */
  public static final class billStub extends io.grpc.stub.AbstractStub<billStub> {
    private billStub(io.grpc.Channel channel) {
      super(channel);
    }

    private billStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected billStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new billStub(channel, callOptions);
    }

    /**
     * <pre>
     *基本服务
     *单据保存
     * </pre>
     */
    public void commonSaveBillV2(bill.service.v1.SaveBillReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.SaveBillResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommonSaveBillV2MethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *单据删除
     * </pre>
     */
    public void commonDeleteBillV2(bill.service.v1.DeleteBillReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.DeleteBillResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommonDeleteBillV2MethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量修改
     * </pre>
     */
    public void batchEdit(bill.service.v1.BatchEditReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BatchEditResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchEditMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *单据服务
     *状态跟踪
     * </pre>
     */
    public void commonSaveStatus(bill.service.v1.StatusTrackReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.StatusTrackResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommonSaveStatusMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *单据生成
     * </pre>
     */
    public void commonCreateBillByBill(bill.service.v1.CommonCreateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CommonCreateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommonCreateBillByBillMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *单据修改
     * </pre>
     */
    public void commonEditBillByBill(bill.service.v1.CommonEditReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CommonEditResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommonEditBillByBillMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *实体修改
     * </pre>
     */
    public void entityEdit(bill.service.v1.EntityEditReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntityEditResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEntityEditMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *实体生成
     * </pre>
     */
    public void entityCreate(bill.service.v1.EntityCreateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntityCreateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEntityCreateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *实体删除
     * </pre>
     */
    public void entityDelete(bill.service.v1.EntityDeleteReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntityDeleteResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEntityDeleteMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *整体提交
     * </pre>
     */
    public void commitOperate(bill.service.v1.CommitOperateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CommitOperateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitOperateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *比较条件
     * </pre>
     */
    public void compareConditions(bill.service.v1.CompareConditionsReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CompareConditionsResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompareConditionsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *切换单据(待补)
     * </pre>
     */
    public void billChange(bill.service.v1.BillChangeReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BillChangeResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBillChangeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *单据查询
     * </pre>
     */
    public void billQuery(bill.service.v1.BillQueryReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BillQueryResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBillQueryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *实体查询（SQL)
     * </pre>
     */
    public void entitySqlQuery(bill.service.v1.EntitySqlQueryReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntitySqlQueryResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEntitySqlQueryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量生成单据
     * </pre>
     */
    public void batchArrivalBillAuto(bill.service.v1.BatchArrivalBillAutoReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BatchArrivalBillAutoResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchArrivalBillAutoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询临时表数据
     * </pre>
     */
    public void flowTempTableOperate(bill.service.v1.FlowTempTableOperateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.FlowTempTableOperateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFlowTempTableOperateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *来源单据编号根据条件分组
     * </pre>
     */
    public void listBillIdsGroup(bill.service.v1.ListBillIdsGroupReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.ListBillIdsGroupResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListBillIdsGroupMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *单据查询修改
     * </pre>
     */
    public void billQueryUpdate(bill.service.v1.BillQueryUpdateReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BillQueryUpdateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBillQueryUpdateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *判断订单明细中的商品是否全部进行序列号录入
     * </pre>
     */
    public void billSerialNumberCheck(bill.service.v1.BillSerialNumberCheckReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.BillSerialNumberCheckResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBillSerialNumberCheckMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *方法执行
     * </pre>
     */
    public void methordExec(bill.service.v1.MethordExecReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.MethordExecResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMethordExecMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通用查询
     * </pre>
     */
    public void entityCommonQueryFlow(bill.service.v1.EntityCommonQueryFlowReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.EntityCommonQueryFlowResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEntityCommonQueryFlowMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *立即提交
     * </pre>
     */
    public void commitOperateExe(bill.service.v1.CommitOperateExeReq request,
        io.grpc.stub.StreamObserver<bill.service.v1.CommitOperateExeResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitOperateExeMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class billBlockingStub extends io.grpc.stub.AbstractStub<billBlockingStub> {
    private billBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private billBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected billBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new billBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *基本服务
     *单据保存
     * </pre>
     */
    public bill.service.v1.SaveBillResp commonSaveBillV2(bill.service.v1.SaveBillReq request) {
      return blockingUnaryCall(
          getChannel(), getCommonSaveBillV2MethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *单据删除
     * </pre>
     */
    public bill.service.v1.DeleteBillResp commonDeleteBillV2(bill.service.v1.DeleteBillReq request) {
      return blockingUnaryCall(
          getChannel(), getCommonDeleteBillV2MethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *批量修改
     * </pre>
     */
    public bill.service.v1.BatchEditResp batchEdit(bill.service.v1.BatchEditReq request) {
      return blockingUnaryCall(
          getChannel(), getBatchEditMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *单据服务
     *状态跟踪
     * </pre>
     */
    public bill.service.v1.StatusTrackResp commonSaveStatus(bill.service.v1.StatusTrackReq request) {
      return blockingUnaryCall(
          getChannel(), getCommonSaveStatusMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *单据生成
     * </pre>
     */
    public bill.service.v1.CommonCreateResp commonCreateBillByBill(bill.service.v1.CommonCreateReq request) {
      return blockingUnaryCall(
          getChannel(), getCommonCreateBillByBillMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *单据修改
     * </pre>
     */
    public bill.service.v1.CommonEditResp commonEditBillByBill(bill.service.v1.CommonEditReq request) {
      return blockingUnaryCall(
          getChannel(), getCommonEditBillByBillMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *实体修改
     * </pre>
     */
    public bill.service.v1.EntityEditResp entityEdit(bill.service.v1.EntityEditReq request) {
      return blockingUnaryCall(
          getChannel(), getEntityEditMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *实体生成
     * </pre>
     */
    public bill.service.v1.EntityCreateResp entityCreate(bill.service.v1.EntityCreateReq request) {
      return blockingUnaryCall(
          getChannel(), getEntityCreateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *实体删除
     * </pre>
     */
    public bill.service.v1.EntityDeleteResp entityDelete(bill.service.v1.EntityDeleteReq request) {
      return blockingUnaryCall(
          getChannel(), getEntityDeleteMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *整体提交
     * </pre>
     */
    public bill.service.v1.CommitOperateResp commitOperate(bill.service.v1.CommitOperateReq request) {
      return blockingUnaryCall(
          getChannel(), getCommitOperateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *比较条件
     * </pre>
     */
    public bill.service.v1.CompareConditionsResp compareConditions(bill.service.v1.CompareConditionsReq request) {
      return blockingUnaryCall(
          getChannel(), getCompareConditionsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *切换单据(待补)
     * </pre>
     */
    public bill.service.v1.BillChangeResp billChange(bill.service.v1.BillChangeReq request) {
      return blockingUnaryCall(
          getChannel(), getBillChangeMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *单据查询
     * </pre>
     */
    public bill.service.v1.BillQueryResp billQuery(bill.service.v1.BillQueryReq request) {
      return blockingUnaryCall(
          getChannel(), getBillQueryMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *实体查询（SQL)
     * </pre>
     */
    public bill.service.v1.EntitySqlQueryResp entitySqlQuery(bill.service.v1.EntitySqlQueryReq request) {
      return blockingUnaryCall(
          getChannel(), getEntitySqlQueryMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *批量生成单据
     * </pre>
     */
    public bill.service.v1.BatchArrivalBillAutoResp batchArrivalBillAuto(bill.service.v1.BatchArrivalBillAutoReq request) {
      return blockingUnaryCall(
          getChannel(), getBatchArrivalBillAutoMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询临时表数据
     * </pre>
     */
    public bill.service.v1.FlowTempTableOperateResp flowTempTableOperate(bill.service.v1.FlowTempTableOperateReq request) {
      return blockingUnaryCall(
          getChannel(), getFlowTempTableOperateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *来源单据编号根据条件分组
     * </pre>
     */
    public bill.service.v1.ListBillIdsGroupResp listBillIdsGroup(bill.service.v1.ListBillIdsGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getListBillIdsGroupMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *单据查询修改
     * </pre>
     */
    public bill.service.v1.BillQueryUpdateResp billQueryUpdate(bill.service.v1.BillQueryUpdateReq request) {
      return blockingUnaryCall(
          getChannel(), getBillQueryUpdateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *判断订单明细中的商品是否全部进行序列号录入
     * </pre>
     */
    public bill.service.v1.BillSerialNumberCheckResp billSerialNumberCheck(bill.service.v1.BillSerialNumberCheckReq request) {
      return blockingUnaryCall(
          getChannel(), getBillSerialNumberCheckMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *方法执行
     * </pre>
     */
    public bill.service.v1.MethordExecResp methordExec(bill.service.v1.MethordExecReq request) {
      return blockingUnaryCall(
          getChannel(), getMethordExecMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通用查询
     * </pre>
     */
    public bill.service.v1.EntityCommonQueryFlowResp entityCommonQueryFlow(bill.service.v1.EntityCommonQueryFlowReq request) {
      return blockingUnaryCall(
          getChannel(), getEntityCommonQueryFlowMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *立即提交
     * </pre>
     */
    public bill.service.v1.CommitOperateExeResp commitOperateExe(bill.service.v1.CommitOperateExeReq request) {
      return blockingUnaryCall(
          getChannel(), getCommitOperateExeMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class billFutureStub extends io.grpc.stub.AbstractStub<billFutureStub> {
    private billFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private billFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected billFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new billFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *基本服务
     *单据保存
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.SaveBillResp> commonSaveBillV2(
        bill.service.v1.SaveBillReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCommonSaveBillV2MethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *单据删除
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.DeleteBillResp> commonDeleteBillV2(
        bill.service.v1.DeleteBillReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCommonDeleteBillV2MethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *批量修改
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.BatchEditResp> batchEdit(
        bill.service.v1.BatchEditReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchEditMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *单据服务
     *状态跟踪
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.StatusTrackResp> commonSaveStatus(
        bill.service.v1.StatusTrackReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCommonSaveStatusMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *单据生成
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.CommonCreateResp> commonCreateBillByBill(
        bill.service.v1.CommonCreateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCommonCreateBillByBillMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *单据修改
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.CommonEditResp> commonEditBillByBill(
        bill.service.v1.CommonEditReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCommonEditBillByBillMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *实体修改
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.EntityEditResp> entityEdit(
        bill.service.v1.EntityEditReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEntityEditMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *实体生成
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.EntityCreateResp> entityCreate(
        bill.service.v1.EntityCreateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEntityCreateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *实体删除
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.EntityDeleteResp> entityDelete(
        bill.service.v1.EntityDeleteReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEntityDeleteMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *整体提交
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.CommitOperateResp> commitOperate(
        bill.service.v1.CommitOperateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitOperateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *比较条件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.CompareConditionsResp> compareConditions(
        bill.service.v1.CompareConditionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCompareConditionsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *切换单据(待补)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.BillChangeResp> billChange(
        bill.service.v1.BillChangeReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBillChangeMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *单据查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.BillQueryResp> billQuery(
        bill.service.v1.BillQueryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBillQueryMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *实体查询（SQL)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.EntitySqlQueryResp> entitySqlQuery(
        bill.service.v1.EntitySqlQueryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEntitySqlQueryMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *批量生成单据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.BatchArrivalBillAutoResp> batchArrivalBillAuto(
        bill.service.v1.BatchArrivalBillAutoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchArrivalBillAutoMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询临时表数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.FlowTempTableOperateResp> flowTempTableOperate(
        bill.service.v1.FlowTempTableOperateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFlowTempTableOperateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *来源单据编号根据条件分组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.ListBillIdsGroupResp> listBillIdsGroup(
        bill.service.v1.ListBillIdsGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListBillIdsGroupMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *单据查询修改
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.BillQueryUpdateResp> billQueryUpdate(
        bill.service.v1.BillQueryUpdateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBillQueryUpdateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *判断订单明细中的商品是否全部进行序列号录入
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.BillSerialNumberCheckResp> billSerialNumberCheck(
        bill.service.v1.BillSerialNumberCheckReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBillSerialNumberCheckMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *方法执行
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.MethordExecResp> methordExec(
        bill.service.v1.MethordExecReq request) {
      return futureUnaryCall(
          getChannel().newCall(getMethordExecMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通用查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.EntityCommonQueryFlowResp> entityCommonQueryFlow(
        bill.service.v1.EntityCommonQueryFlowReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEntityCommonQueryFlowMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *立即提交
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bill.service.v1.CommitOperateExeResp> commitOperateExe(
        bill.service.v1.CommitOperateExeReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitOperateExeMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMON_SAVE_BILL_V2 = 0;
  private static final int METHODID_COMMON_DELETE_BILL_V2 = 1;
  private static final int METHODID_BATCH_EDIT = 2;
  private static final int METHODID_COMMON_SAVE_STATUS = 3;
  private static final int METHODID_COMMON_CREATE_BILL_BY_BILL = 4;
  private static final int METHODID_COMMON_EDIT_BILL_BY_BILL = 5;
  private static final int METHODID_ENTITY_EDIT = 6;
  private static final int METHODID_ENTITY_CREATE = 7;
  private static final int METHODID_ENTITY_DELETE = 8;
  private static final int METHODID_COMMIT_OPERATE = 9;
  private static final int METHODID_COMPARE_CONDITIONS = 10;
  private static final int METHODID_BILL_CHANGE = 11;
  private static final int METHODID_BILL_QUERY = 12;
  private static final int METHODID_ENTITY_SQL_QUERY = 13;
  private static final int METHODID_BATCH_ARRIVAL_BILL_AUTO = 14;
  private static final int METHODID_FLOW_TEMP_TABLE_OPERATE = 15;
  private static final int METHODID_LIST_BILL_IDS_GROUP = 16;
  private static final int METHODID_BILL_QUERY_UPDATE = 17;
  private static final int METHODID_BILL_SERIAL_NUMBER_CHECK = 18;
  private static final int METHODID_METHORD_EXEC = 19;
  private static final int METHODID_ENTITY_COMMON_QUERY_FLOW = 20;
  private static final int METHODID_COMMIT_OPERATE_EXE = 21;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final billImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(billImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMON_SAVE_BILL_V2:
          serviceImpl.commonSaveBillV2((bill.service.v1.SaveBillReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.SaveBillResp>) responseObserver);
          break;
        case METHODID_COMMON_DELETE_BILL_V2:
          serviceImpl.commonDeleteBillV2((bill.service.v1.DeleteBillReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.DeleteBillResp>) responseObserver);
          break;
        case METHODID_BATCH_EDIT:
          serviceImpl.batchEdit((bill.service.v1.BatchEditReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.BatchEditResp>) responseObserver);
          break;
        case METHODID_COMMON_SAVE_STATUS:
          serviceImpl.commonSaveStatus((bill.service.v1.StatusTrackReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.StatusTrackResp>) responseObserver);
          break;
        case METHODID_COMMON_CREATE_BILL_BY_BILL:
          serviceImpl.commonCreateBillByBill((bill.service.v1.CommonCreateReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.CommonCreateResp>) responseObserver);
          break;
        case METHODID_COMMON_EDIT_BILL_BY_BILL:
          serviceImpl.commonEditBillByBill((bill.service.v1.CommonEditReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.CommonEditResp>) responseObserver);
          break;
        case METHODID_ENTITY_EDIT:
          serviceImpl.entityEdit((bill.service.v1.EntityEditReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.EntityEditResp>) responseObserver);
          break;
        case METHODID_ENTITY_CREATE:
          serviceImpl.entityCreate((bill.service.v1.EntityCreateReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.EntityCreateResp>) responseObserver);
          break;
        case METHODID_ENTITY_DELETE:
          serviceImpl.entityDelete((bill.service.v1.EntityDeleteReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.EntityDeleteResp>) responseObserver);
          break;
        case METHODID_COMMIT_OPERATE:
          serviceImpl.commitOperate((bill.service.v1.CommitOperateReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.CommitOperateResp>) responseObserver);
          break;
        case METHODID_COMPARE_CONDITIONS:
          serviceImpl.compareConditions((bill.service.v1.CompareConditionsReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.CompareConditionsResp>) responseObserver);
          break;
        case METHODID_BILL_CHANGE:
          serviceImpl.billChange((bill.service.v1.BillChangeReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.BillChangeResp>) responseObserver);
          break;
        case METHODID_BILL_QUERY:
          serviceImpl.billQuery((bill.service.v1.BillQueryReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.BillQueryResp>) responseObserver);
          break;
        case METHODID_ENTITY_SQL_QUERY:
          serviceImpl.entitySqlQuery((bill.service.v1.EntitySqlQueryReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.EntitySqlQueryResp>) responseObserver);
          break;
        case METHODID_BATCH_ARRIVAL_BILL_AUTO:
          serviceImpl.batchArrivalBillAuto((bill.service.v1.BatchArrivalBillAutoReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.BatchArrivalBillAutoResp>) responseObserver);
          break;
        case METHODID_FLOW_TEMP_TABLE_OPERATE:
          serviceImpl.flowTempTableOperate((bill.service.v1.FlowTempTableOperateReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.FlowTempTableOperateResp>) responseObserver);
          break;
        case METHODID_LIST_BILL_IDS_GROUP:
          serviceImpl.listBillIdsGroup((bill.service.v1.ListBillIdsGroupReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.ListBillIdsGroupResp>) responseObserver);
          break;
        case METHODID_BILL_QUERY_UPDATE:
          serviceImpl.billQueryUpdate((bill.service.v1.BillQueryUpdateReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.BillQueryUpdateResp>) responseObserver);
          break;
        case METHODID_BILL_SERIAL_NUMBER_CHECK:
          serviceImpl.billSerialNumberCheck((bill.service.v1.BillSerialNumberCheckReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.BillSerialNumberCheckResp>) responseObserver);
          break;
        case METHODID_METHORD_EXEC:
          serviceImpl.methordExec((bill.service.v1.MethordExecReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.MethordExecResp>) responseObserver);
          break;
        case METHODID_ENTITY_COMMON_QUERY_FLOW:
          serviceImpl.entityCommonQueryFlow((bill.service.v1.EntityCommonQueryFlowReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.EntityCommonQueryFlowResp>) responseObserver);
          break;
        case METHODID_COMMIT_OPERATE_EXE:
          serviceImpl.commitOperateExe((bill.service.v1.CommitOperateExeReq) request,
              (io.grpc.stub.StreamObserver<bill.service.v1.CommitOperateExeResp>) responseObserver);
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

  private static abstract class billBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    billBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bill.service.v1.Bill.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("bill");
    }
  }

  private static final class billFileDescriptorSupplier
      extends billBaseDescriptorSupplier {
    billFileDescriptorSupplier() {}
  }

  private static final class billMethodDescriptorSupplier
      extends billBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    billMethodDescriptorSupplier(String methodName) {
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
      synchronized (billGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new billFileDescriptorSupplier())
              .addMethod(getCommonSaveBillV2MethodHelper())
              .addMethod(getCommonDeleteBillV2MethodHelper())
              .addMethod(getBatchEditMethodHelper())
              .addMethod(getCommonSaveStatusMethodHelper())
              .addMethod(getCommonCreateBillByBillMethodHelper())
              .addMethod(getCommonEditBillByBillMethodHelper())
              .addMethod(getEntityEditMethodHelper())
              .addMethod(getEntityCreateMethodHelper())
              .addMethod(getEntityDeleteMethodHelper())
              .addMethod(getCommitOperateMethodHelper())
              .addMethod(getCompareConditionsMethodHelper())
              .addMethod(getBillChangeMethodHelper())
              .addMethod(getBillQueryMethodHelper())
              .addMethod(getEntitySqlQueryMethodHelper())
              .addMethod(getBatchArrivalBillAutoMethodHelper())
              .addMethod(getFlowTempTableOperateMethodHelper())
              .addMethod(getListBillIdsGroupMethodHelper())
              .addMethod(getBillQueryUpdateMethodHelper())
              .addMethod(getBillSerialNumberCheckMethodHelper())
              .addMethod(getMethordExecMethodHelper())
              .addMethod(getEntityCommonQueryFlowMethodHelper())
              .addMethod(getCommitOperateExeMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
