// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ofbizCommon.proto

package com.common.query.grpc;

public final class OfbizCommonProto {
  private OfbizCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ofbizpublic_OfbizCommonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ofbizpublic_OfbizCommonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ofbizpublic_OfbizCommonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ofbizpublic_OfbizCommonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021ofbizCommon.proto\022\013ofbizpublic\"(\n\022Ofbi" +
      "zCommonRequest\022\022\n\ncommonData\030\001 \001(\t\")\n\023Of" +
      "bizCommonResponse\022\022\n\nreturnData\030\001 \001(\t2^\n" +
      "\013OfbizCommon\022O\n\nPublicExec\022\037.ofbizpublic" +
      ".OfbizCommonRequest\032 .ofbizpublic.OfbizC" +
      "ommonResponseB!\n\013com.dd.mainB\020OfbizCommo" +
      "nProtoP\001b\006proto3"
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
    internal_static_ofbizpublic_OfbizCommonRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ofbizpublic_OfbizCommonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ofbizpublic_OfbizCommonRequest_descriptor,
        new String[] { "CommonData", });
    internal_static_ofbizpublic_OfbizCommonResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ofbizpublic_OfbizCommonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ofbizpublic_OfbizCommonResponse_descriptor,
        new String[] { "ReturnData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
