// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ofbizCommon.proto

package com.common.query.grpc;

public final class OfbizCommonOuterClass {
  private OfbizCommonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OfbizCommonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OfbizCommonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OfbizCommonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OfbizCommonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ofbizCommon.proto\"(\n\022OfbizCommonReques" +
      "t\022\022\n\ncommonData\030\001 \001(\t\")\n\023OfbizCommonResp" +
      "onse\022\022\n\nreturnData\030\001 \001(\t2F\n\013OfbizCommon\022" +
      "7\n\nPublicExec\022\023.OfbizCommonRequest\032\024.Ofb" +
      "izCommonResponseB\031\n\025com.common.query.grp" +
      "cP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_OfbizCommonRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OfbizCommonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OfbizCommonRequest_descriptor,
        new java.lang.String[] { "CommonData", });
    internal_static_OfbizCommonResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_OfbizCommonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OfbizCommonResponse_descriptor,
        new java.lang.String[] { "ReturnData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
