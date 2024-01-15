// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart-service.proto

package com.grpc.user.cart;

/**
 * Protobuf type {@code findIsProductAvailableRequest}
 */
public final class findIsProductAvailableRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:findIsProductAvailableRequest)
    findIsProductAvailableRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use findIsProductAvailableRequest.newBuilder() to construct.
  private findIsProductAvailableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private findIsProductAvailableRequest() {
    userId_ = "";
    prodId_ = "";
    cacheOperation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new findIsProductAvailableRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.user.cart.CartService.internal_static_findIsProductAvailableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.user.cart.CartService.internal_static_findIsProductAvailableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.user.cart.findIsProductAvailableRequest.class, com.grpc.user.cart.findIsProductAvailableRequest.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string userId = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string userId = 1;</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODID_FIELD_NUMBER = 2;
  private volatile java.lang.Object prodId_;
  /**
   * <code>string prodId = 2;</code>
   * @return The prodId.
   */
  @java.lang.Override
  public java.lang.String getProdId() {
    java.lang.Object ref = prodId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prodId_ = s;
      return s;
    }
  }
  /**
   * <code>string prodId = 2;</code>
   * @return The bytes for prodId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProdIdBytes() {
    java.lang.Object ref = prodId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prodId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CACHEOPERATION_FIELD_NUMBER = 3;
  private volatile java.lang.Object cacheOperation_;
  /**
   * <code>string cacheOperation = 3;</code>
   * @return The cacheOperation.
   */
  @java.lang.Override
  public java.lang.String getCacheOperation() {
    java.lang.Object ref = cacheOperation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cacheOperation_ = s;
      return s;
    }
  }
  /**
   * <code>string cacheOperation = 3;</code>
   * @return The bytes for cacheOperation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCacheOperationBytes() {
    java.lang.Object ref = cacheOperation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cacheOperation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prodId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, prodId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cacheOperation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cacheOperation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prodId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, prodId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cacheOperation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cacheOperation_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.user.cart.findIsProductAvailableRequest)) {
      return super.equals(obj);
    }
    com.grpc.user.cart.findIsProductAvailableRequest other = (com.grpc.user.cart.findIsProductAvailableRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getProdId()
        .equals(other.getProdId())) return false;
    if (!getCacheOperation()
        .equals(other.getCacheOperation())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + PRODID_FIELD_NUMBER;
    hash = (53 * hash) + getProdId().hashCode();
    hash = (37 * hash) + CACHEOPERATION_FIELD_NUMBER;
    hash = (53 * hash) + getCacheOperation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.user.cart.findIsProductAvailableRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.user.cart.findIsProductAvailableRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code findIsProductAvailableRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:findIsProductAvailableRequest)
      com.grpc.user.cart.findIsProductAvailableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.user.cart.CartService.internal_static_findIsProductAvailableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.user.cart.CartService.internal_static_findIsProductAvailableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.user.cart.findIsProductAvailableRequest.class, com.grpc.user.cart.findIsProductAvailableRequest.Builder.class);
    }

    // Construct using com.grpc.user.cart.findIsProductAvailableRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = "";

      prodId_ = "";

      cacheOperation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.user.cart.CartService.internal_static_findIsProductAvailableRequest_descriptor;
    }

    @java.lang.Override
    public com.grpc.user.cart.findIsProductAvailableRequest getDefaultInstanceForType() {
      return com.grpc.user.cart.findIsProductAvailableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.user.cart.findIsProductAvailableRequest build() {
      com.grpc.user.cart.findIsProductAvailableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.user.cart.findIsProductAvailableRequest buildPartial() {
      com.grpc.user.cart.findIsProductAvailableRequest result = new com.grpc.user.cart.findIsProductAvailableRequest(this);
      result.userId_ = userId_;
      result.prodId_ = prodId_;
      result.cacheOperation_ = cacheOperation_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.user.cart.findIsProductAvailableRequest) {
        return mergeFrom((com.grpc.user.cart.findIsProductAvailableRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.user.cart.findIsProductAvailableRequest other) {
      if (other == com.grpc.user.cart.findIsProductAvailableRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getProdId().isEmpty()) {
        prodId_ = other.prodId_;
        onChanged();
      }
      if (!other.getCacheOperation().isEmpty()) {
        cacheOperation_ = other.cacheOperation_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              userId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              prodId_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              cacheOperation_ = input.readStringRequireUtf8();

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string userId = 1;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userId = 1;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userId = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 1;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object prodId_ = "";
    /**
     * <code>string prodId = 2;</code>
     * @return The prodId.
     */
    public java.lang.String getProdId() {
      java.lang.Object ref = prodId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prodId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string prodId = 2;</code>
     * @return The bytes for prodId.
     */
    public com.google.protobuf.ByteString
        getProdIdBytes() {
      java.lang.Object ref = prodId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prodId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string prodId = 2;</code>
     * @param value The prodId to set.
     * @return This builder for chaining.
     */
    public Builder setProdId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      prodId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string prodId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProdId() {
      
      prodId_ = getDefaultInstance().getProdId();
      onChanged();
      return this;
    }
    /**
     * <code>string prodId = 2;</code>
     * @param value The bytes for prodId to set.
     * @return This builder for chaining.
     */
    public Builder setProdIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      prodId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cacheOperation_ = "";
    /**
     * <code>string cacheOperation = 3;</code>
     * @return The cacheOperation.
     */
    public java.lang.String getCacheOperation() {
      java.lang.Object ref = cacheOperation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cacheOperation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cacheOperation = 3;</code>
     * @return The bytes for cacheOperation.
     */
    public com.google.protobuf.ByteString
        getCacheOperationBytes() {
      java.lang.Object ref = cacheOperation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cacheOperation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cacheOperation = 3;</code>
     * @param value The cacheOperation to set.
     * @return This builder for chaining.
     */
    public Builder setCacheOperation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cacheOperation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cacheOperation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCacheOperation() {
      
      cacheOperation_ = getDefaultInstance().getCacheOperation();
      onChanged();
      return this;
    }
    /**
     * <code>string cacheOperation = 3;</code>
     * @param value The bytes for cacheOperation to set.
     * @return This builder for chaining.
     */
    public Builder setCacheOperationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cacheOperation_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:findIsProductAvailableRequest)
  }

  // @@protoc_insertion_point(class_scope:findIsProductAvailableRequest)
  private static final com.grpc.user.cart.findIsProductAvailableRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.user.cart.findIsProductAvailableRequest();
  }

  public static com.grpc.user.cart.findIsProductAvailableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<findIsProductAvailableRequest>
      PARSER = new com.google.protobuf.AbstractParser<findIsProductAvailableRequest>() {
    @java.lang.Override
    public findIsProductAvailableRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<findIsProductAvailableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<findIsProductAvailableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.user.cart.findIsProductAvailableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

