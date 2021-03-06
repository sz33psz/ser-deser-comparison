/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package pl.com.boono.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Packet extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -634891325340915473L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Packet\",\"namespace\":\"pl.com.boono.avro\",\"fields\":[{\"name\":\"sourceType\",\"type\":{\"type\":\"enum\",\"name\":\"SourceType\",\"symbols\":[\"APPLICATION\",\"CLOUD_BEACON\"]}},{\"name\":\"sourceId\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"contextHash\",\"type\":\"int\"},{\"name\":\"appId\",\"type\":\"string\"},{\"name\":\"events\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Event\",\"fields\":[{\"name\":\"rssi\",\"type\":[\"int\",\"null\"]},{\"name\":\"batteryLevel\",\"type\":[\"int\",\"null\"]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"EventType\",\"symbols\":[\"SCAN\",\"MONITORING\"]}},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"uniqueId\",\"type\":\"string\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public pl.com.boono.avro.SourceType sourceType;
  @Deprecated public java.lang.CharSequence sourceId;
  @Deprecated public long timestamp;
  @Deprecated public int contextHash;
  @Deprecated public java.lang.CharSequence appId;
  @Deprecated public java.util.List<pl.com.boono.avro.Event> events;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Packet() {}

  /**
   * All-args constructor.
   */
  public Packet(pl.com.boono.avro.SourceType sourceType, java.lang.CharSequence sourceId, java.lang.Long timestamp, java.lang.Integer contextHash, java.lang.CharSequence appId, java.util.List<pl.com.boono.avro.Event> events) {
    this.sourceType = sourceType;
    this.sourceId = sourceId;
    this.timestamp = timestamp;
    this.contextHash = contextHash;
    this.appId = appId;
    this.events = events;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sourceType;
    case 1: return sourceId;
    case 2: return timestamp;
    case 3: return contextHash;
    case 4: return appId;
    case 5: return events;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sourceType = (pl.com.boono.avro.SourceType)value$; break;
    case 1: sourceId = (java.lang.CharSequence)value$; break;
    case 2: timestamp = (java.lang.Long)value$; break;
    case 3: contextHash = (java.lang.Integer)value$; break;
    case 4: appId = (java.lang.CharSequence)value$; break;
    case 5: events = (java.util.List<pl.com.boono.avro.Event>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'sourceType' field.
   */
  public pl.com.boono.avro.SourceType getSourceType() {
    return sourceType;
  }

  /**
   * Sets the value of the 'sourceType' field.
   * @param value the value to set.
   */
  public void setSourceType(pl.com.boono.avro.SourceType value) {
    this.sourceType = value;
  }

  /**
   * Gets the value of the 'sourceId' field.
   */
  public java.lang.CharSequence getSourceId() {
    return sourceId;
  }

  /**
   * Sets the value of the 'sourceId' field.
   * @param value the value to set.
   */
  public void setSourceId(java.lang.CharSequence value) {
    this.sourceId = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'contextHash' field.
   */
  public java.lang.Integer getContextHash() {
    return contextHash;
  }

  /**
   * Sets the value of the 'contextHash' field.
   * @param value the value to set.
   */
  public void setContextHash(java.lang.Integer value) {
    this.contextHash = value;
  }

  /**
   * Gets the value of the 'appId' field.
   */
  public java.lang.CharSequence getAppId() {
    return appId;
  }

  /**
   * Sets the value of the 'appId' field.
   * @param value the value to set.
   */
  public void setAppId(java.lang.CharSequence value) {
    this.appId = value;
  }

  /**
   * Gets the value of the 'events' field.
   */
  public java.util.List<pl.com.boono.avro.Event> getEvents() {
    return events;
  }

  /**
   * Sets the value of the 'events' field.
   * @param value the value to set.
   */
  public void setEvents(java.util.List<pl.com.boono.avro.Event> value) {
    this.events = value;
  }

  /**
   * Creates a new Packet RecordBuilder.
   * @return A new Packet RecordBuilder
   */
  public static pl.com.boono.avro.Packet.Builder newBuilder() {
    return new pl.com.boono.avro.Packet.Builder();
  }
  
  /**
   * Creates a new Packet RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Packet RecordBuilder
   */
  public static pl.com.boono.avro.Packet.Builder newBuilder(pl.com.boono.avro.Packet.Builder other) {
    return new pl.com.boono.avro.Packet.Builder(other);
  }
  
  /**
   * Creates a new Packet RecordBuilder by copying an existing Packet instance.
   * @param other The existing instance to copy.
   * @return A new Packet RecordBuilder
   */
  public static pl.com.boono.avro.Packet.Builder newBuilder(pl.com.boono.avro.Packet other) {
    return new pl.com.boono.avro.Packet.Builder(other);
  }
  
  /**
   * RecordBuilder for Packet instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Packet>
    implements org.apache.avro.data.RecordBuilder<Packet> {

    private pl.com.boono.avro.SourceType sourceType;
    private java.lang.CharSequence sourceId;
    private long timestamp;
    private int contextHash;
    private java.lang.CharSequence appId;
    private java.util.List<pl.com.boono.avro.Event> events;

    /** Creates a new Builder */
    private Builder() {
      super(pl.com.boono.avro.Packet.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(pl.com.boono.avro.Packet.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sourceType)) {
        this.sourceType = data().deepCopy(fields()[0].schema(), other.sourceType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sourceId)) {
        this.sourceId = data().deepCopy(fields()[1].schema(), other.sourceId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contextHash)) {
        this.contextHash = data().deepCopy(fields()[3].schema(), other.contextHash);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.appId)) {
        this.appId = data().deepCopy(fields()[4].schema(), other.appId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.events)) {
        this.events = data().deepCopy(fields()[5].schema(), other.events);
        fieldSetFlags()[5] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing Packet instance
     * @param other The existing instance to copy.
     */
    private Builder(pl.com.boono.avro.Packet other) {
            super(pl.com.boono.avro.Packet.SCHEMA$);
      if (isValidValue(fields()[0], other.sourceType)) {
        this.sourceType = data().deepCopy(fields()[0].schema(), other.sourceType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sourceId)) {
        this.sourceId = data().deepCopy(fields()[1].schema(), other.sourceId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contextHash)) {
        this.contextHash = data().deepCopy(fields()[3].schema(), other.contextHash);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.appId)) {
        this.appId = data().deepCopy(fields()[4].schema(), other.appId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.events)) {
        this.events = data().deepCopy(fields()[5].schema(), other.events);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'sourceType' field.
      * @return The value.
      */
    public pl.com.boono.avro.SourceType getSourceType() {
      return sourceType;
    }

    /**
      * Sets the value of the 'sourceType' field.
      * @param value The value of 'sourceType'.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder setSourceType(pl.com.boono.avro.SourceType value) {
      validate(fields()[0], value);
      this.sourceType = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'sourceType' field has been set.
      * @return True if the 'sourceType' field has been set, false otherwise.
      */
    public boolean hasSourceType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sourceType' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder clearSourceType() {
      sourceType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sourceId' field.
      * @return The value.
      */
    public java.lang.CharSequence getSourceId() {
      return sourceId;
    }

    /**
      * Sets the value of the 'sourceId' field.
      * @param value The value of 'sourceId'.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder setSourceId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.sourceId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'sourceId' field has been set.
      * @return True if the 'sourceId' field has been set, false otherwise.
      */
    public boolean hasSourceId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sourceId' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder clearSourceId() {
      sourceId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder setTimestamp(long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'contextHash' field.
      * @return The value.
      */
    public java.lang.Integer getContextHash() {
      return contextHash;
    }

    /**
      * Sets the value of the 'contextHash' field.
      * @param value The value of 'contextHash'.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder setContextHash(int value) {
      validate(fields()[3], value);
      this.contextHash = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'contextHash' field has been set.
      * @return True if the 'contextHash' field has been set, false otherwise.
      */
    public boolean hasContextHash() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'contextHash' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder clearContextHash() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'appId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAppId() {
      return appId;
    }

    /**
      * Sets the value of the 'appId' field.
      * @param value The value of 'appId'.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder setAppId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.appId = value;
      fieldSetFlags()[4] = true;
      return this; 
    }

    /**
      * Checks whether the 'appId' field has been set.
      * @return True if the 'appId' field has been set, false otherwise.
      */
    public boolean hasAppId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'appId' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder clearAppId() {
      appId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'events' field.
      * @return The value.
      */
    public java.util.List<pl.com.boono.avro.Event> getEvents() {
      return events;
    }

    /**
      * Sets the value of the 'events' field.
      * @param value The value of 'events'.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder setEvents(java.util.List<pl.com.boono.avro.Event> value) {
      validate(fields()[5], value);
      this.events = value;
      fieldSetFlags()[5] = true;
      return this; 
    }

    /**
      * Checks whether the 'events' field has been set.
      * @return True if the 'events' field has been set, false otherwise.
      */
    public boolean hasEvents() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'events' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Packet.Builder clearEvents() {
      events = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Packet build() {
      try {
        Packet record = new Packet();
        record.sourceType = fieldSetFlags()[0] ? this.sourceType : (pl.com.boono.avro.SourceType) defaultValue(fields()[0]);
        record.sourceId = fieldSetFlags()[1] ? this.sourceId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Long) defaultValue(fields()[2]);
        record.contextHash = fieldSetFlags()[3] ? this.contextHash : (java.lang.Integer) defaultValue(fields()[3]);
        record.appId = fieldSetFlags()[4] ? this.appId : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.events = fieldSetFlags()[5] ? this.events : (java.util.List<pl.com.boono.avro.Event>) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}
