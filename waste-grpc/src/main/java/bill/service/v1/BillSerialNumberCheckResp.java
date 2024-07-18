// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill.proto

package bill.service.v1;

/**
 * Protobuf type {@code bill.service.v1.BillSerialNumberCheckResp}
 */
public  final class BillSerialNumberCheckResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bill.service.v1.BillSerialNumberCheckResp)
    BillSerialNumberCheckRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BillSerialNumberCheckResp.newBuilder() to construct.
  private BillSerialNumberCheckResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BillSerialNumberCheckResp() {
    returnStr_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BillSerialNumberCheckResp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            returnStr_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bill.service.v1.Bill.internal_static_bill_service_v1_BillSerialNumberCheckResp_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bill.service.v1.Bill.internal_static_bill_service_v1_BillSerialNumberCheckResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bill.service.v1.BillSerialNumberCheckResp.class, bill.service.v1.BillSerialNumberCheckResp.Builder.class);
  }

  public static final int RETURNSTR_FIELD_NUMBER = 1;
  private volatile java.lang.Object returnStr_;
  /**
   * <code>string returnStr = 1;</code>
   */
  public java.lang.String getReturnStr() {
    java.lang.Object ref = returnStr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      returnStr_ = s;
      return s;
    }
  }
  /**
   * <code>string returnStr = 1;</code>
   */
  public com.google.protobuf.ByteString
      getReturnStrBytes() {
    java.lang.Object ref = returnStr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      returnStr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getReturnStrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, returnStr_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getReturnStrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, returnStr_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof bill.service.v1.BillSerialNumberCheckResp)) {
      return super.equals(obj);
    }
    bill.service.v1.BillSerialNumberCheckResp other = (bill.service.v1.BillSerialNumberCheckResp) obj;

    boolean result = true;
    result = result && getReturnStr()
        .equals(other.getReturnStr());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RETURNSTR_FIELD_NUMBER;
    hash = (53 * hash) + getReturnStr().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bill.service.v1.BillSerialNumberCheckResp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(bill.service.v1.BillSerialNumberCheckResp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code bill.service.v1.BillSerialNumberCheckResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bill.service.v1.BillSerialNumberCheckResp)
      bill.service.v1.BillSerialNumberCheckRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_BillSerialNumberCheckResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_BillSerialNumberCheckResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bill.service.v1.BillSerialNumberCheckResp.class, bill.service.v1.BillSerialNumberCheckResp.Builder.class);
    }

    // Construct using bill.service.v1.BillSerialNumberCheckResp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      returnStr_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_BillSerialNumberCheckResp_descriptor;
    }

    public bill.service.v1.BillSerialNumberCheckResp getDefaultInstanceForType() {
      return bill.service.v1.BillSerialNumberCheckResp.getDefaultInstance();
    }

    public bill.service.v1.BillSerialNumberCheckResp build() {
      bill.service.v1.BillSerialNumberCheckResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public bill.service.v1.BillSerialNumberCheckResp buildPartial() {
      bill.service.v1.BillSerialNumberCheckResp result = new bill.service.v1.BillSerialNumberCheckResp(this);
      result.returnStr_ = returnStr_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bill.service.v1.BillSerialNumberCheckResp) {
        return mergeFrom((bill.service.v1.BillSerialNumberCheckResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bill.service.v1.BillSerialNumberCheckResp other) {
      if (other == bill.service.v1.BillSerialNumberCheckResp.getDefaultInstance()) return this;
      if (!other.getReturnStr().isEmpty()) {
        returnStr_ = other.returnStr_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      bill.service.v1.BillSerialNumberCheckResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bill.service.v1.BillSerialNumberCheckResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object returnStr_ = "";
    /**
     * <code>string returnStr = 1;</code>
     */
    public java.lang.String getReturnStr() {
      java.lang.Object ref = returnStr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        returnStr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string returnStr = 1;</code>
     */
    public com.google.protobuf.ByteString
        getReturnStrBytes() {
      java.lang.Object ref = returnStr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        returnStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string returnStr = 1;</code>
     */
    public Builder setReturnStr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      returnStr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string returnStr = 1;</code>
     */
    public Builder clearReturnStr() {
      
      returnStr_ = getDefaultInstance().getReturnStr();
      onChanged();
      return this;
    }
    /**
     * <code>string returnStr = 1;</code>
     */
    public Builder setReturnStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      returnStr_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bill.service.v1.BillSerialNumberCheckResp)
  }

  // @@protoc_insertion_point(class_scope:bill.service.v1.BillSerialNumberCheckResp)
  private static final bill.service.v1.BillSerialNumberCheckResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bill.service.v1.BillSerialNumberCheckResp();
  }

  public static bill.service.v1.BillSerialNumberCheckResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BillSerialNumberCheckResp>
      PARSER = new com.google.protobuf.AbstractParser<BillSerialNumberCheckResp>() {
    public BillSerialNumberCheckResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BillSerialNumberCheckResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BillSerialNumberCheckResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BillSerialNumberCheckResp> getParserForType() {
    return PARSER;
  }

  public bill.service.v1.BillSerialNumberCheckResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
