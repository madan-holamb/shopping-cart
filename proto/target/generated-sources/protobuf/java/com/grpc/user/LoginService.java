// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: login-service.proto

package com.grpc.user;

public final class LoginService {
  private LoginService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023login-service.proto\".\n\014LoginRequest\022\016\n" +
      "\006userId\030\001 \001(\t\022\016\n\006device\030\002 \001(\t\"$\n\rLoginRe" +
      "sponse\022\023\n\013isUserLogin\030\001 \001(\0102H\n\022LoginStat" +
      "usService\0222\n\021findIsUserLogedIn\022\r.LoginRe" +
      "quest\032\016.LoginResponseB\021\n\rcom.grpc.userP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginRequest_descriptor,
        new java.lang.String[] { "UserId", "Device", });
    internal_static_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginResponse_descriptor,
        new java.lang.String[] { "IsUserLogin", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
