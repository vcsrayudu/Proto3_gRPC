// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Stock.proto

package com.kisan.proto;

public final class Stock {
  private Stock() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StockMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StockMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float avgPrice = 1;</code>
     * @return The avgPrice.
     */
    float getAvgPrice();

    /**
     * <code>int32 quantity = 2;</code>
     * @return The quantity.
     */
    int getQuantity();

    /**
     * <code>string sector_name = 3;</code>
     * @return The sectorName.
     */
    java.lang.String getSectorName();
    /**
     * <code>string sector_name = 3;</code>
     * @return The bytes for sectorName.
     */
    com.google.protobuf.ByteString
        getSectorNameBytes();
  }
  /**
   * Protobuf type {@code StockMessage}
   */
  public static final class StockMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StockMessage)
      StockMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StockMessage.newBuilder() to construct.
    private StockMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StockMessage() {
      sectorName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StockMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StockMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 13: {

              avgPrice_ = input.readFloat();
              break;
            }
            case 16: {

              quantity_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              sectorName_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return com.kisan.proto.Stock.internal_static_StockMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kisan.proto.Stock.internal_static_StockMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kisan.proto.Stock.StockMessage.class, com.kisan.proto.Stock.StockMessage.Builder.class);
    }

    public static final int AVGPRICE_FIELD_NUMBER = 1;
    private float avgPrice_;
    /**
     * <code>float avgPrice = 1;</code>
     * @return The avgPrice.
     */
    @java.lang.Override
    public float getAvgPrice() {
      return avgPrice_;
    }

    public static final int QUANTITY_FIELD_NUMBER = 2;
    private int quantity_;
    /**
     * <code>int32 quantity = 2;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }

    public static final int SECTOR_NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object sectorName_;
    /**
     * <code>string sector_name = 3;</code>
     * @return The sectorName.
     */
    @java.lang.Override
    public java.lang.String getSectorName() {
      java.lang.Object ref = sectorName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sectorName_ = s;
        return s;
      }
    }
    /**
     * <code>string sector_name = 3;</code>
     * @return The bytes for sectorName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSectorNameBytes() {
      java.lang.Object ref = sectorName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sectorName_ = b;
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
      if (avgPrice_ != 0F) {
        output.writeFloat(1, avgPrice_);
      }
      if (quantity_ != 0) {
        output.writeInt32(2, quantity_);
      }
      if (!getSectorNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sectorName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avgPrice_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, avgPrice_);
      }
      if (quantity_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, quantity_);
      }
      if (!getSectorNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sectorName_);
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
      if (!(obj instanceof com.kisan.proto.Stock.StockMessage)) {
        return super.equals(obj);
      }
      com.kisan.proto.Stock.StockMessage other = (com.kisan.proto.Stock.StockMessage) obj;

      if (java.lang.Float.floatToIntBits(getAvgPrice())
          != java.lang.Float.floatToIntBits(
              other.getAvgPrice())) return false;
      if (getQuantity()
          != other.getQuantity()) return false;
      if (!getSectorName()
          .equals(other.getSectorName())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + AVGPRICE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAvgPrice());
      hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
      hash = (53 * hash) + getQuantity();
      hash = (37 * hash) + SECTOR_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getSectorName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.kisan.proto.Stock.StockMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kisan.proto.Stock.StockMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kisan.proto.Stock.StockMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kisan.proto.Stock.StockMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kisan.proto.Stock.StockMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kisan.proto.Stock.StockMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kisan.proto.Stock.StockMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kisan.proto.Stock.StockMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.kisan.proto.Stock.StockMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.kisan.proto.Stock.StockMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.kisan.proto.Stock.StockMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kisan.proto.Stock.StockMessage parseFrom(
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
    public static Builder newBuilder(com.kisan.proto.Stock.StockMessage prototype) {
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
     * Protobuf type {@code StockMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StockMessage)
        com.kisan.proto.Stock.StockMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kisan.proto.Stock.internal_static_StockMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kisan.proto.Stock.internal_static_StockMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kisan.proto.Stock.StockMessage.class, com.kisan.proto.Stock.StockMessage.Builder.class);
      }

      // Construct using com.kisan.proto.Stock.StockMessage.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avgPrice_ = 0F;

        quantity_ = 0;

        sectorName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kisan.proto.Stock.internal_static_StockMessage_descriptor;
      }

      @java.lang.Override
      public com.kisan.proto.Stock.StockMessage getDefaultInstanceForType() {
        return com.kisan.proto.Stock.StockMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.kisan.proto.Stock.StockMessage build() {
        com.kisan.proto.Stock.StockMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.kisan.proto.Stock.StockMessage buildPartial() {
        com.kisan.proto.Stock.StockMessage result = new com.kisan.proto.Stock.StockMessage(this);
        result.avgPrice_ = avgPrice_;
        result.quantity_ = quantity_;
        result.sectorName_ = sectorName_;
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
        if (other instanceof com.kisan.proto.Stock.StockMessage) {
          return mergeFrom((com.kisan.proto.Stock.StockMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kisan.proto.Stock.StockMessage other) {
        if (other == com.kisan.proto.Stock.StockMessage.getDefaultInstance()) return this;
        if (other.getAvgPrice() != 0F) {
          setAvgPrice(other.getAvgPrice());
        }
        if (other.getQuantity() != 0) {
          setQuantity(other.getQuantity());
        }
        if (!other.getSectorName().isEmpty()) {
          sectorName_ = other.sectorName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
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
        com.kisan.proto.Stock.StockMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.kisan.proto.Stock.StockMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float avgPrice_ ;
      /**
       * <code>float avgPrice = 1;</code>
       * @return The avgPrice.
       */
      @java.lang.Override
      public float getAvgPrice() {
        return avgPrice_;
      }
      /**
       * <code>float avgPrice = 1;</code>
       * @param value The avgPrice to set.
       * @return This builder for chaining.
       */
      public Builder setAvgPrice(float value) {
        
        avgPrice_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float avgPrice = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvgPrice() {
        
        avgPrice_ = 0F;
        onChanged();
        return this;
      }

      private int quantity_ ;
      /**
       * <code>int32 quantity = 2;</code>
       * @return The quantity.
       */
      @java.lang.Override
      public int getQuantity() {
        return quantity_;
      }
      /**
       * <code>int32 quantity = 2;</code>
       * @param value The quantity to set.
       * @return This builder for chaining.
       */
      public Builder setQuantity(int value) {
        
        quantity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 quantity = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuantity() {
        
        quantity_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object sectorName_ = "";
      /**
       * <code>string sector_name = 3;</code>
       * @return The sectorName.
       */
      public java.lang.String getSectorName() {
        java.lang.Object ref = sectorName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sectorName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string sector_name = 3;</code>
       * @return The bytes for sectorName.
       */
      public com.google.protobuf.ByteString
          getSectorNameBytes() {
        java.lang.Object ref = sectorName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sectorName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sector_name = 3;</code>
       * @param value The sectorName to set.
       * @return This builder for chaining.
       */
      public Builder setSectorName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sectorName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string sector_name = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSectorName() {
        
        sectorName_ = getDefaultInstance().getSectorName();
        onChanged();
        return this;
      }
      /**
       * <code>string sector_name = 3;</code>
       * @param value The bytes for sectorName to set.
       * @return This builder for chaining.
       */
      public Builder setSectorNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sectorName_ = value;
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


      // @@protoc_insertion_point(builder_scope:StockMessage)
    }

    // @@protoc_insertion_point(class_scope:StockMessage)
    private static final com.kisan.proto.Stock.StockMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.kisan.proto.Stock.StockMessage();
    }

    public static com.kisan.proto.Stock.StockMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StockMessage>
        PARSER = new com.google.protobuf.AbstractParser<StockMessage>() {
      @java.lang.Override
      public StockMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StockMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StockMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StockMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.kisan.proto.Stock.StockMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StockMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StockMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Stock.proto\"G\n\014StockMessage\022\020\n\010avgPric" +
      "e\030\001 \001(\002\022\020\n\010quantity\030\002 \001(\005\022\023\n\013sector_name" +
      "\030\003 \001(\tB\021\n\017com.kisan.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StockMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StockMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StockMessage_descriptor,
        new java.lang.String[] { "AvgPrice", "Quantity", "SectorName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
