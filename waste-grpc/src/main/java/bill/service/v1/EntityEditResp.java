// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill.proto

package bill.service.v1;

/**
 * Protobuf type {@code bill.service.v1.EntityEditResp}
 */
public  final class EntityEditResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bill.service.v1.EntityEditResp)
    EntityEditRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityEditResp.newBuilder() to construct.
  private EntityEditResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityEditResp() {
    resultBillId_ = "";
    responseMessage_ = "";
    errorMessage_ = "";
    infoMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EntityEditResp(
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

            resultBillId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            responseMessage_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            infoMessage_ = s;
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
    return bill.service.v1.Bill.internal_static_bill_service_v1_EntityEditResp_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bill.service.v1.Bill.internal_static_bill_service_v1_EntityEditResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bill.service.v1.EntityEditResp.class, bill.service.v1.EntityEditResp.Builder.class);
  }

  public static final int RESULTBILLID_FIELD_NUMBER = 1;
  private volatile java.lang.Object resultBillId_;
  /**
   * <code>string resultBillId = 1;</code>
   */
  public java.lang.String getResultBillId() {
    java.lang.Object ref = resultBillId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultBillId_ = s;
      return s;
    }
  }
  /**
   * <code>string resultBillId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResultBillIdBytes() {
    java.lang.Object ref = resultBillId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultBillId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSEMESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object responseMessage_;
  /**
   * <code>string responseMessage = 2;</code>
   */
  public java.lang.String getResponseMessage() {
    java.lang.Object ref = responseMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string responseMessage = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResponseMessageBytes() {
    java.lang.Object ref = responseMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERRORMESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>string errorMessage = 3;</code>
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string errorMessage = 3;</code>
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFOMESSAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object infoMessage_;
  /**
   * <code>string infoMessage = 4;</code>
   */
  public java.lang.String getInfoMessage() {
    java.lang.Object ref = infoMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      infoMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string infoMessage = 4;</code>
   */
  public com.google.protobuf.ByteString
      getInfoMessageBytes() {
    java.lang.Object ref = infoMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      infoMessage_ = b;
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
    if (!getResultBillIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resultBillId_);
    }
    if (!getResponseMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, responseMessage_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorMessage_);
    }
    if (!getInfoMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, infoMessage_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResultBillIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resultBillId_);
    }
    if (!getResponseMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, responseMessage_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorMessage_);
    }
    if (!getInfoMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, infoMessage_);
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
    if (!(obj instanceof bill.service.v1.EntityEditResp)) {
      return super.equals(obj);
    }
    bill.service.v1.EntityEditResp other = (bill.service.v1.EntityEditResp) obj;

    boolean result = true;
    result = result && getResultBillId()
        .equals(other.getResultBillId());
    result = result && getResponseMessage()
        .equals(other.getResponseMessage());
    result = result && getErrorMessage()
        .equals(other.getErrorMessage());
    result = result && getInfoMessage()
        .equals(other.getInfoMessage());
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
    hash = (37 * hash) + RESULTBILLID_FIELD_NUMBER;
    hash = (53 * hash) + getResultBillId().hashCode();
    hash = (37 * hash) + RESPONSEMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseMessage().hashCode();
    hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (37 * hash) + INFOMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getInfoMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bill.service.v1.EntityEditResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.EntityEditResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.EntityEditResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.EntityEditResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.EntityEditResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.EntityEditResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.EntityEditResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bill.service.v1.EntityEditResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bill.service.v1.EntityEditResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bill.service.v1.EntityEditResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bill.service.v1.EntityEditResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bill.service.v1.EntityEditResp parseFrom(
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
  public static Builder newBuilder(bill.service.v1.EntityEditResp prototype) {
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
   * Protobuf type {@code bill.service.v1.EntityEditResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bill.service.v1.EntityEditResp)
      bill.service.v1.EntityEditRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_EntityEditResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_EntityEditResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bill.service.v1.EntityEditResp.class, bill.service.v1.EntityEditResp.Builder.class);
    }

    // Construct using bill.service.v1.EntityEditResp.newBuilder()
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
      resultBillId_ = "";

      responseMessage_ = "";

      errorMessage_ = "";

      infoMessage_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_EntityEditResp_descriptor;
    }

    public bill.service.v1.EntityEditResp getDefaultInstanceForType() {
      return bill.service.v1.EntityEditResp.getDefaultInstance();
    }

    public bill.service.v1.EntityEditResp build() {
      bill.service.v1.EntityEditResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public bill.service.v1.EntityEditResp buildPartial() {
      bill.service.v1.EntityEditResp result = new bill.service.v1.EntityEditResp(this);
      result.resultBillId_ = resultBillId_;
      result.responseMessage_ = responseMessage_;
      result.errorMessage_ = errorMessage_;
      result.infoMessage_ = infoMessage_;
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
      if (other instanceof bill.service.v1.EntityEditResp) {
        return mergeFrom((bill.service.v1.EntityEditResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bill.service.v1.EntityEditResp other) {
      if (other == bill.service.v1.EntityEditResp.getDefaultInstance()) return this;
      if (!other.getResultBillId().isEmpty()) {
        resultBillId_ = other.resultBillId_;
        onChanged();
      }
      if (!other.getResponseMessage().isEmpty()) {
        responseMessage_ = other.responseMessage_;
        onChanged();
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      if (!other.getInfoMessage().isEmpty()) {
        infoMessage_ = other.infoMessage_;
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
      bill.service.v1.EntityEditResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bill.service.v1.EntityEditResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resultBillId_ = "";
    /**
     * <code>string resultBillId = 1;</code>
     */
    public java.lang.String getResultBillId() {
      java.lang.Object ref = resultBillId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultBillId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resultBillId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResultBillIdBytes() {
      java.lang.Object ref = resultBillId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultBillId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resultBillId = 1;</code>
     */
    public Builder setResultBillId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resultBillId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string resultBillId = 1;</code>
     */
    public Builder clearResultBillId() {
      
      resultBillId_ = getDefaultInstance().getResultBillId();
      onChanged();
      return this;
    }
    /**
     * <code>string resultBillId = 1;</code>
     */
    public Builder setResultBillIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resultBillId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object responseMessage_ = "";
    /**
     * <code>string responseMessage = 2;</code>
     */
    public java.lang.String getResponseMessage() {
      java.lang.Object ref = responseMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string responseMessage = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResponseMessageBytes() {
      java.lang.Object ref = responseMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string responseMessage = 2;</code>
     */
    public Builder setResponseMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responseMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string responseMessage = 2;</code>
     */
    public Builder clearResponseMessage() {
      
      responseMessage_ = getDefaultInstance().getResponseMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string responseMessage = 2;</code>
     */
    public Builder setResponseMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      responseMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>string errorMessage = 3;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string errorMessage = 3;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string errorMessage = 3;</code>
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string errorMessage = 3;</code>
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string errorMessage = 3;</code>
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object infoMessage_ = "";
    /**
     * <code>string infoMessage = 4;</code>
     */
    public java.lang.String getInfoMessage() {
      java.lang.Object ref = infoMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        infoMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string infoMessage = 4;</code>
     */
    public com.google.protobuf.ByteString
        getInfoMessageBytes() {
      java.lang.Object ref = infoMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        infoMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string infoMessage = 4;</code>
     */
    public Builder setInfoMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      infoMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string infoMessage = 4;</code>
     */
    public Builder clearInfoMessage() {
      
      infoMessage_ = getDefaultInstance().getInfoMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string infoMessage = 4;</code>
     */
    public Builder setInfoMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      infoMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:bill.service.v1.EntityEditResp)
  }

  // @@protoc_insertion_point(class_scope:bill.service.v1.EntityEditResp)
  private static final bill.service.v1.EntityEditResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bill.service.v1.EntityEditResp();
  }

  public static bill.service.v1.EntityEditResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityEditResp>
      PARSER = new com.google.protobuf.AbstractParser<EntityEditResp>() {
    public EntityEditResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EntityEditResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EntityEditResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityEditResp> getParserForType() {
    return PARSER;
  }

  public bill.service.v1.EntityEditResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

