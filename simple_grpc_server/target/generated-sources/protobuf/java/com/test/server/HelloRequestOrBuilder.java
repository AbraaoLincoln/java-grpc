// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: simple_server.proto

package com.test.server;

public interface HelloRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.test.server.HelloRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string firstname = 1;</code>
   * @return The firstname.
   */
  java.lang.String getFirstname();
  /**
   * <code>string firstname = 1;</code>
   * @return The bytes for firstname.
   */
  com.google.protobuf.ByteString
      getFirstnameBytes();

  /**
   * <code>string lastname = 2;</code>
   * @return The lastname.
   */
  java.lang.String getLastname();
  /**
   * <code>string lastname = 2;</code>
   * @return The bytes for lastname.
   */
  com.google.protobuf.ByteString
      getLastnameBytes();

  /**
   * <code>string age = 3;</code>
   * @return The age.
   */
  java.lang.String getAge();
  /**
   * <code>string age = 3;</code>
   * @return The bytes for age.
   */
  com.google.protobuf.ByteString
      getAgeBytes();

  /**
   * <code>.com.test.server.Status status = 4;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.com.test.server.Status status = 4;</code>
   * @return The status.
   */
  com.test.server.Status getStatus();
}
