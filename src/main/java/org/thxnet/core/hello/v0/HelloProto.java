// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/service.proto
// Protobuf Java Version: 4.26.1

package org.thxnet.core.hello.v0;

public final class HelloProto {
  private HelloProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      HelloProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_thxnet_core_hello_v0_Hello1Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_thxnet_core_hello_v0_Hello1Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_thxnet_core_hello_v0_Hello1Resposne_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_thxnet_core_hello_v0_Hello1Resposne_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034src/main/proto/service.proto\022\024thxnet.c" +
      "ore.hello.v0\"C\n\rHello1Request\022\014\n\004name\030\001 " +
      "\001(\t\022\026\n\tnick_name\030\002 \001(\tH\000\210\001\001B\014\n\n_nick_nam" +
      "e\"M\n\016Hello1Resposne\022\017\n\007message\030\001 \001(\t\022\031\n\014" +
      "more_message\030\002 \001(\tH\000\210\001\001B\017\n\r_more_message" +
      "2`\n\005Hello\022W\n\nMyHelloOne\022#.thxnet.core.he" +
      "llo.v0.Hello1Request\032$.thxnet.core.hello" +
      ".v0.Hello1ResposneB*\n\030org.thxnet.core.he" +
      "llo.v0B\nHelloProtoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_thxnet_core_hello_v0_Hello1Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_thxnet_core_hello_v0_Hello1Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_thxnet_core_hello_v0_Hello1Request_descriptor,
        new java.lang.String[] { "Name", "NickName", });
    internal_static_thxnet_core_hello_v0_Hello1Resposne_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_thxnet_core_hello_v0_Hello1Resposne_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_thxnet_core_hello_v0_Hello1Resposne_descriptor,
        new java.lang.String[] { "Message", "MoreMessage", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
