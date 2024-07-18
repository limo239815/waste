// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill.proto

package bill.service.v1;

/**
 * Protobuf type {@code bill.service.v1.SaveBillReq}
 */
public  final class SaveBillReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bill.service.v1.SaveBillReq)
    SaveBillReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveBillReq.newBuilder() to construct.
  private SaveBillReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveBillReq() {
    billTypeId_ = "";
    edStatus_ = "";
    billJson_ = "";
    billItemJson_ = "";
    userLogin_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaveBillReq(
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

            billTypeId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            edStatus_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            billJson_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            billItemJson_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            userLogin_ = s;
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
    return bill.service.v1.Bill.internal_static_bill_service_v1_SaveBillReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bill.service.v1.Bill.internal_static_bill_service_v1_SaveBillReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bill.service.v1.SaveBillReq.class, bill.service.v1.SaveBillReq.Builder.class);
  }

  public static final int BILLTYPEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object billTypeId_;
  /**
   * <code>string billTypeId = 1;</code>
   */
  public java.lang.String getBillTypeId() {
    java.lang.Object ref = billTypeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      billTypeId_ = s;
      return s;
    }
  }
  /**
   * <code>string billTypeId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBillTypeIdBytes() {
    java.lang.Object ref = billTypeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      billTypeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EDSTATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object edStatus_;
  /**
   * <code>string edStatus = 2;</code>
   */
  public java.lang.String getEdStatus() {
    java.lang.Object ref = edStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      edStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string edStatus = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEdStatusBytes() {
    java.lang.Object ref = edStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      edStatus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BILLJSON_FIELD_NUMBER = 3;
  private volatile java.lang.Object billJson_;
  /**
   * <code>string billJson = 3;</code>
   */
  public java.lang.String getBillJson() {
    java.lang.Object ref = billJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      billJson_ = s;
      return s;
    }
  }
  /**
   * <code>string billJson = 3;</code>
   */
  public com.google.protobuf.ByteString
      getBillJsonBytes() {
    java.lang.Object ref = billJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      billJson_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BILLITEMJSON_FIELD_NUMBER = 4;
  private volatile java.lang.Object billItemJson_;
  /**
   * <code>string billItemJson = 4;</code>
   */
  public java.lang.String getBillItemJson() {
    java.lang.Object ref = billItemJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      billItemJson_ = s;
      return s;
    }
  }
  /**
   * <code>string billItemJson = 4;</code>
   */
  public com.google.protobuf.ByteString
      getBillItemJsonBytes() {
    java.lang.Object ref = billItemJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      billItemJson_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERLOGIN_FIELD_NUMBER = 5;
  private volatile java.lang.Object userLogin_;
  /**
   * <pre>
   *默认用户登陆参数
   * </pre>
   *
   * <code>string userLogin = 5;</code>
   */
  public java.lang.String getUserLogin() {
    java.lang.Object ref = userLogin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userLogin_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *默认用户登陆参数
   * </pre>
   *
   * <code>string userLogin = 5;</code>
   */
  public com.google.protobuf.ByteString
      getUserLoginBytes() {
    java.lang.Object ref = userLogin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userLogin_ = b;
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
    if (!getBillTypeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, billTypeId_);
    }
    if (!getEdStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, edStatus_);
    }
    if (!getBillJsonBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, billJson_);
    }
    if (!getBillItemJsonBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, billItemJson_);
    }
    if (!getUserLoginBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, userLogin_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBillTypeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, billTypeId_);
    }
    if (!getEdStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, edStatus_);
    }
    if (!getBillJsonBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, billJson_);
    }
    if (!getBillItemJsonBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, billItemJson_);
    }
    if (!getUserLoginBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, userLogin_);
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
    if (!(obj instanceof bill.service.v1.SaveBillReq)) {
      return super.equals(obj);
    }
    bill.service.v1.SaveBillReq other = (bill.service.v1.SaveBillReq) obj;

    boolean result = true;
    result = result && getBillTypeId()
        .equals(other.getBillTypeId());
    result = result && getEdStatus()
        .equals(other.getEdStatus());
    result = result && getBillJson()
        .equals(other.getBillJson());
    result = result && getBillItemJson()
        .equals(other.getBillItemJson());
    result = result && getUserLogin()
        .equals(other.getUserLogin());
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
    hash = (37 * hash) + BILLTYPEID_FIELD_NUMBER;
    hash = (53 * hash) + getBillTypeId().hashCode();
    hash = (37 * hash) + EDSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getEdStatus().hashCode();
    hash = (37 * hash) + BILLJSON_FIELD_NUMBER;
    hash = (53 * hash) + getBillJson().hashCode();
    hash = (37 * hash) + BILLITEMJSON_FIELD_NUMBER;
    hash = (53 * hash) + getBillItemJson().hashCode();
    hash = (37 * hash) + USERLOGIN_FIELD_NUMBER;
    hash = (53 * hash) + getUserLogin().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bill.service.v1.SaveBillReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.SaveBillReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.SaveBillReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.SaveBillReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.SaveBillReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bill.service.v1.SaveBillReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bill.service.v1.SaveBillReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bill.service.v1.SaveBillReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bill.service.v1.SaveBillReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bill.service.v1.SaveBillReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bill.service.v1.SaveBillReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bill.service.v1.SaveBillReq parseFrom(
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
  public static Builder newBuilder(bill.service.v1.SaveBillReq prototype) {
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
   * Protobuf type {@code bill.service.v1.SaveBillReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bill.service.v1.SaveBillReq)
      bill.service.v1.SaveBillReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_SaveBillReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_SaveBillReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bill.service.v1.SaveBillReq.class, bill.service.v1.SaveBillReq.Builder.class);
    }

    // Construct using bill.service.v1.SaveBillReq.newBuilder()
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
      billTypeId_ = "";

      edStatus_ = "";

      billJson_ = "";

      billItemJson_ = "";

      userLogin_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bill.service.v1.Bill.internal_static_bill_service_v1_SaveBillReq_descriptor;
    }

    public bill.service.v1.SaveBillReq getDefaultInstanceForType() {
      return bill.service.v1.SaveBillReq.getDefaultInstance();
    }

    public bill.service.v1.SaveBillReq build() {
      bill.service.v1.SaveBillReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public bill.service.v1.SaveBillReq buildPartial() {
      bill.service.v1.SaveBillReq result = new bill.service.v1.SaveBillReq(this);
      result.billTypeId_ = billTypeId_;
      result.edStatus_ = edStatus_;
      result.billJson_ = billJson_;
      result.billItemJson_ = billItemJson_;
      result.userLogin_ = userLogin_;
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
      if (other instanceof bill.service.v1.SaveBillReq) {
        return mergeFrom((bill.service.v1.SaveBillReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bill.service.v1.SaveBillReq other) {
      if (other == bill.service.v1.SaveBillReq.getDefaultInstance()) return this;
      if (!other.getBillTypeId().isEmpty()) {
        billTypeId_ = other.billTypeId_;
        onChanged();
      }
      if (!other.getEdStatus().isEmpty()) {
        edStatus_ = other.edStatus_;
        onChanged();
      }
      if (!other.getBillJson().isEmpty()) {
        billJson_ = other.billJson_;
        onChanged();
      }
      if (!other.getBillItemJson().isEmpty()) {
        billItemJson_ = other.billItemJson_;
        onChanged();
      }
      if (!other.getUserLogin().isEmpty()) {
        userLogin_ = other.userLogin_;
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
      bill.service.v1.SaveBillReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bill.service.v1.SaveBillReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object billTypeId_ = "";
    /**
     * <code>string billTypeId = 1;</code>
     */
    public java.lang.String getBillTypeId() {
      java.lang.Object ref = billTypeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        billTypeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string billTypeId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBillTypeIdBytes() {
      java.lang.Object ref = billTypeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        billTypeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string billTypeId = 1;</code>
     */
    public Builder setBillTypeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      billTypeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string billTypeId = 1;</code>
     */
    public Builder clearBillTypeId() {
      
      billTypeId_ = getDefaultInstance().getBillTypeId();
      onChanged();
      return this;
    }
    /**
     * <code>string billTypeId = 1;</code>
     */
    public Builder setBillTypeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      billTypeId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object edStatus_ = "";
    /**
     * <code>string edStatus = 2;</code>
     */
    public java.lang.String getEdStatus() {
      java.lang.Object ref = edStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        edStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string edStatus = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEdStatusBytes() {
      java.lang.Object ref = edStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        edStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string edStatus = 2;</code>
     */
    public Builder setEdStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      edStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string edStatus = 2;</code>
     */
    public Builder clearEdStatus() {
      
      edStatus_ = getDefaultInstance().getEdStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string edStatus = 2;</code>
     */
    public Builder setEdStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      edStatus_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object billJson_ = "";
    /**
     * <code>string billJson = 3;</code>
     */
    public java.lang.String getBillJson() {
      java.lang.Object ref = billJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        billJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string billJson = 3;</code>
     */
    public com.google.protobuf.ByteString
        getBillJsonBytes() {
      java.lang.Object ref = billJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        billJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string billJson = 3;</code>
     */
    public Builder setBillJson(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      billJson_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string billJson = 3;</code>
     */
    public Builder clearBillJson() {
      
      billJson_ = getDefaultInstance().getBillJson();
      onChanged();
      return this;
    }
    /**
     * <code>string billJson = 3;</code>
     */
    public Builder setBillJsonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      billJson_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object billItemJson_ = "";
    /**
     * <code>string billItemJson = 4;</code>
     */
    public java.lang.String getBillItemJson() {
      java.lang.Object ref = billItemJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        billItemJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string billItemJson = 4;</code>
     */
    public com.google.protobuf.ByteString
        getBillItemJsonBytes() {
      java.lang.Object ref = billItemJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        billItemJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string billItemJson = 4;</code>
     */
    public Builder setBillItemJson(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      billItemJson_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string billItemJson = 4;</code>
     */
    public Builder clearBillItemJson() {
      
      billItemJson_ = getDefaultInstance().getBillItemJson();
      onChanged();
      return this;
    }
    /**
     * <code>string billItemJson = 4;</code>
     */
    public Builder setBillItemJsonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      billItemJson_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userLogin_ = "";
    /**
     * <pre>
     *默认用户登陆参数
     * </pre>
     *
     * <code>string userLogin = 5;</code>
     */
    public java.lang.String getUserLogin() {
      java.lang.Object ref = userLogin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userLogin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *默认用户登陆参数
     * </pre>
     *
     * <code>string userLogin = 5;</code>
     */
    public com.google.protobuf.ByteString
        getUserLoginBytes() {
      java.lang.Object ref = userLogin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userLogin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *默认用户登陆参数
     * </pre>
     *
     * <code>string userLogin = 5;</code>
     */
    public Builder setUserLogin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userLogin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *默认用户登陆参数
     * </pre>
     *
     * <code>string userLogin = 5;</code>
     */
    public Builder clearUserLogin() {
      
      userLogin_ = getDefaultInstance().getUserLogin();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *默认用户登陆参数
     * </pre>
     *
     * <code>string userLogin = 5;</code>
     */
    public Builder setUserLoginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userLogin_ = value;
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


    // @@protoc_insertion_point(builder_scope:bill.service.v1.SaveBillReq)
  }

  // @@protoc_insertion_point(class_scope:bill.service.v1.SaveBillReq)
  private static final bill.service.v1.SaveBillReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bill.service.v1.SaveBillReq();
  }

  public static bill.service.v1.SaveBillReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveBillReq>
      PARSER = new com.google.protobuf.AbstractParser<SaveBillReq>() {
    public SaveBillReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaveBillReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveBillReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveBillReq> getParserForType() {
    return PARSER;
  }

  public bill.service.v1.SaveBillReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

