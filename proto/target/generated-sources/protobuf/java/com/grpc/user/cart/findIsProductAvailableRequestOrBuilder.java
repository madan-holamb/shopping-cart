// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart-service.proto

package com.grpc.user.cart;

public interface findIsProductAvailableRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:findIsProductAvailableRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string userId = 1;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string userId = 1;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string prodId = 2;</code>
   * @return The prodId.
   */
  java.lang.String getProdId();
  /**
   * <code>string prodId = 2;</code>
   * @return The bytes for prodId.
   */
  com.google.protobuf.ByteString
      getProdIdBytes();

  /**
   * <code>string cacheOperation = 3;</code>
   * @return The cacheOperation.
   */
  java.lang.String getCacheOperation();
  /**
   * <code>string cacheOperation = 3;</code>
   * @return The bytes for cacheOperation.
   */
  com.google.protobuf.ByteString
      getCacheOperationBytes();
}
