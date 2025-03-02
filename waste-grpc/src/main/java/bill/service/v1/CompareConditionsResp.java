// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill.proto

package bill.service.v1;

/**
 * Protobuf type {@code bill.service.v1.CompareConditionsResp}
 */
public  final class CompareConditionsResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bill.service.v1.CompareConditionsResp)
    CompareConditionsRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompareConditionsResp.newBuilder() to construct.
  private CompareConditionsResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompareConditionsResp() {
    resultOk_ = "";
    resultErrorMsg_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompareConditionsResp(
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

            resultOk_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            resultErrorMsg_ = s;
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
    return bill.service.v1.Bill.internal_static_bill_service_v1_CompareConditionsResp_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bill.service.v1.Bill.internal_static_bill_service_v1_CompareConditionsResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bill.service.v1.CompareConditionsResp.class, bill.service.v1.CompareConditionsResp.Builder.class);
  }

  public static final int RESULTOK_FIELD_NUMBER = 1;
  private volatile java.lang.Object resultOk_;
  /**
   * <code>string resultOk = 1;</code>
   */
  public java.lang.String getResultOk() {
    java.lang.Object ref = resultOk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultOk_ = s;
      return s;
    }
  }
  /**
   * <code>string resultOk = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResultOkBytes() {
    java.lang.Object ref = resultOk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultOk_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULTERRORMSG_FIELD_NUMBER = 2;
  private volatile java.lang.Object resultErrorMsg_;
  /**
   * <code>string resultErrorMsg = 2;</code>
   */
  public java.lang.String getResultErrorMsg() {
    java.lang.Object ref = resultErrorMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultErrorMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string resultErrorMsg = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResultErrorMsgBytes() {
    java.lang.Object ref = resultErrorMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultErrorMsg_ = b;
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
    if (!getResultOkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resultOk_);
    }
    if (!getResultErrorMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resultErrorMsg_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResultOkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resultOk_);
    }
    if (!getResultErrorMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resultErrorMsg_);
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
    if (!(obj instanceof bill.service.v1.CompareConditionsResp)) {
      return super.equals(obj);
    }
    bill.service.v1.CompareConditionsResp other = (bill.service.v1.CompareConditionsResp) obj;

    boolean result = true;
    result = result && getResultOk()
        .equals(other.getResultOk());
    result = result && getResultErrorMsg()
        .equals(other.getResultErrorMsg());
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
    hash = (37 * hash) + RESULTOK_FIELD_NUMBER;
    hash = (53 * hash) + getResultOk().hashCode();
    hash = (37 * hash) + RESULTERRORMSG_FIELD_NUMBER;
    hash = (53 * hash) + getResultErrorMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bill.service.v1.CompareConditionsResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.CompareConditionsResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.CompareConditionsResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.CompareConditionsResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.CompareConditionsResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.CompareConditionsResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.CompareConditionsResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bill.service.v1.CompareConditionsResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bill.service.v1.CompareConditionsResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bill.service.v1.CompareConditionsResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bill.service.v1.CompareConditionsResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bill.service.v1.CompareConditionsResp parseFrom(
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
  public static Builder newBuilder(bill.service.v1.CompareConditionsResp prototype) {
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
   * Protobuf type {@code bill.service.v1.CompareConditionsResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bill.service.v1.CompareConditionsResp)
      bill.service.v1.CompareConditionsRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_CompareConditionsResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_CompareConditionsResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bill.service.v1.CompareConditionsResp.class, bill.service.v1.CompareConditionsResp.Builder.class);
    }

    // Construct using bill.service.v1.CompareConditionsResp.newBuilder()
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
      resultOk_ = "";

      resultErrorMsg_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_CompareConditionsResp_descriptor;
    }

    public bill.service.v1.CompareConditionsResp getDefaultInstanceForType() {
      return bill.service.v1.CompareConditionsResp.getDefaultInstance();
    }

    public bill.service.v1.CompareConditionsResp build() {
      bill.service.v1.CompareConditionsResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public bill.service.v1.CompareConditionsResp buildPartial() {
      bill.service.v1.CompareConditionsResp result = new bill.service.v1.CompareConditionsResp(this);
      result.resultOk_ = resultOk_;
      result.resultErrorMsg_ = resultErrorMsg_;
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
      if (other instanceof bill.service.v1.CompareConditionsResp) {
        return mergeFrom((bill.service.v1.CompareConditionsResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bill.service.v1.CompareConditionsResp other) {
      if (other == bill.service.v1.CompareConditionsResp.getDefaultInstance()) return this;
      if (!other.getResultOk().isEmpty()) {
        resultOk_ = other.resultOk_;
        onChanged();
      }
      if (!other.getResultErrorMsg().isEmpty()) {
        resultErrorMsg_ = other.resultErrorMsg_;
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
      bill.service.v1.CompareConditionsResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bill.service.v1.CompareConditionsResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resultOk_ = "";
    /**
     * <code>string resultOk = 1;</code>
     */
    public java.lang.String getResultOk() {
      java.lang.Object ref = resultOk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultOk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resultOk = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResultOkBytes() {
      java.lang.Object ref = resultOk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultOk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resultOk = 1;</code>
     */
    public Builder setResultOk(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resultOk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string resultOk = 1;</code>
     */
    public Builder clearResultOk() {
      
      resultOk_ = getDefaultInstance().getResultOk();
      onChanged();
      return this;
    }
    /**
     * <code>string resultOk = 1;</code>
     */
    public Builder setResultOkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resultOk_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resultErrorMsg_ = "";
    /**
     * <code>string resultErrorMsg = 2;</code>
     */
    public java.lang.String getResultErrorMsg() {
      java.lang.Object ref = resultErrorMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultErrorMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resultErrorMsg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResultErrorMsgBytes() {
      java.lang.Object ref = resultErrorMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultErrorMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resultErrorMsg = 2;</code>
     */
    public Builder setResultErrorMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resultErrorMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string resultErrorMsg = 2;</code>
     */
    public Builder clearResultErrorMsg() {
      
      resultErrorMsg_ = getDefaultInstance().getResultErrorMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string resultErrorMsg = 2;</code>
     */
    public Builder setResultErrorMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resultErrorMsg_ = value;
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


    // @@protoc_insertion_point(builder_scope:bill.service.v1.CompareConditionsResp)
  }

  // @@protoc_insertion_point(class_scope:bill.service.v1.CompareConditionsResp)
  private static final bill.service.v1.CompareConditionsResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bill.service.v1.CompareConditionsResp();
  }

  public static bill.service.v1.CompareConditionsResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompareConditionsResp>
      PARSER = new com.google.protobuf.AbstractParser<CompareConditionsResp>() {
    public CompareConditionsResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompareConditionsResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompareConditionsResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompareConditionsResp> getParserForType() {
    return PARSER;
  }

  public bill.service.v1.CompareConditionsResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

