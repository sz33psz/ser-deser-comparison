/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package pl.com.boono.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3737490188640118424L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"pl.com.boono.avro\",\"fields\":[{\"name\":\"rssi\",\"type\":[\"int\",\"null\"]},{\"name\":\"batteryLevel\",\"type\":[\"int\",\"null\"]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"EventType\",\"symbols\":[\"SCAN\",\"MONITORING\"]}},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"uniqueId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Integer rssi;
  @Deprecated public java.lang.Integer batteryLevel;
  @Deprecated public pl.com.boono.avro.EventType type;
  @Deprecated public long timestamp;
  @Deprecated public java.lang.CharSequence uniqueId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Event() {}

  /**
   * All-args constructor.
   */
  public Event(java.lang.Integer rssi, java.lang.Integer batteryLevel, pl.com.boono.avro.EventType type, java.lang.Long timestamp, java.lang.CharSequence uniqueId) {
    this.rssi = rssi;
    this.batteryLevel = batteryLevel;
    this.type = type;
    this.timestamp = timestamp;
    this.uniqueId = uniqueId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return rssi;
    case 1: return batteryLevel;
    case 2: return type;
    case 3: return timestamp;
    case 4: return uniqueId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: rssi = (java.lang.Integer)value$; break;
    case 1: batteryLevel = (java.lang.Integer)value$; break;
    case 2: type = (pl.com.boono.avro.EventType)value$; break;
    case 3: timestamp = (java.lang.Long)value$; break;
    case 4: uniqueId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'rssi' field.
   */
  public java.lang.Integer getRssi() {
    return rssi;
  }

  /**
   * Sets the value of the 'rssi' field.
   * @param value the value to set.
   */
  public void setRssi(java.lang.Integer value) {
    this.rssi = value;
  }

  /**
   * Gets the value of the 'batteryLevel' field.
   */
  public java.lang.Integer getBatteryLevel() {
    return batteryLevel;
  }

  /**
   * Sets the value of the 'batteryLevel' field.
   * @param value the value to set.
   */
  public void setBatteryLevel(java.lang.Integer value) {
    this.batteryLevel = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public pl.com.boono.avro.EventType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(pl.com.boono.avro.EventType value) {
    this.type = value;
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
   * Gets the value of the 'uniqueId' field.
   */
  public java.lang.CharSequence getUniqueId() {
    return uniqueId;
  }

  /**
   * Sets the value of the 'uniqueId' field.
   * @param value the value to set.
   */
  public void setUniqueId(java.lang.CharSequence value) {
    this.uniqueId = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static pl.com.boono.avro.Event.Builder newBuilder() {
    return new pl.com.boono.avro.Event.Builder();
  }
  
  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static pl.com.boono.avro.Event.Builder newBuilder(pl.com.boono.avro.Event.Builder other) {
    return new pl.com.boono.avro.Event.Builder(other);
  }
  
  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static pl.com.boono.avro.Event.Builder newBuilder(pl.com.boono.avro.Event other) {
    return new pl.com.boono.avro.Event.Builder(other);
  }
  
  /**
   * RecordBuilder for Event instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private java.lang.Integer rssi;
    private java.lang.Integer batteryLevel;
    private pl.com.boono.avro.EventType type;
    private long timestamp;
    private java.lang.CharSequence uniqueId;

    /** Creates a new Builder */
    private Builder() {
      super(pl.com.boono.avro.Event.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(pl.com.boono.avro.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.rssi)) {
        this.rssi = data().deepCopy(fields()[0].schema(), other.rssi);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.batteryLevel)) {
        this.batteryLevel = data().deepCopy(fields()[1].schema(), other.batteryLevel);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.uniqueId)) {
        this.uniqueId = data().deepCopy(fields()[4].schema(), other.uniqueId);
        fieldSetFlags()[4] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(pl.com.boono.avro.Event other) {
            super(pl.com.boono.avro.Event.SCHEMA$);
      if (isValidValue(fields()[0], other.rssi)) {
        this.rssi = data().deepCopy(fields()[0].schema(), other.rssi);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.batteryLevel)) {
        this.batteryLevel = data().deepCopy(fields()[1].schema(), other.batteryLevel);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.uniqueId)) {
        this.uniqueId = data().deepCopy(fields()[4].schema(), other.uniqueId);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'rssi' field.
      * @return The value.
      */
    public java.lang.Integer getRssi() {
      return rssi;
    }

    /**
      * Sets the value of the 'rssi' field.
      * @param value The value of 'rssi'.
      * @return This builder.
      */
    public pl.com.boono.avro.Event.Builder setRssi(java.lang.Integer value) {
      validate(fields()[0], value);
      this.rssi = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'rssi' field has been set.
      * @return True if the 'rssi' field has been set, false otherwise.
      */
    public boolean hasRssi() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'rssi' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Event.Builder clearRssi() {
      rssi = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'batteryLevel' field.
      * @return The value.
      */
    public java.lang.Integer getBatteryLevel() {
      return batteryLevel;
    }

    /**
      * Sets the value of the 'batteryLevel' field.
      * @param value The value of 'batteryLevel'.
      * @return This builder.
      */
    public pl.com.boono.avro.Event.Builder setBatteryLevel(java.lang.Integer value) {
      validate(fields()[1], value);
      this.batteryLevel = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'batteryLevel' field has been set.
      * @return True if the 'batteryLevel' field has been set, false otherwise.
      */
    public boolean hasBatteryLevel() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'batteryLevel' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Event.Builder clearBatteryLevel() {
      batteryLevel = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public pl.com.boono.avro.EventType getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public pl.com.boono.avro.Event.Builder setType(pl.com.boono.avro.EventType value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Event.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
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
    public pl.com.boono.avro.Event.Builder setTimestamp(long value) {
      validate(fields()[3], value);
      this.timestamp = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Event.Builder clearTimestamp() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'uniqueId' field.
      * @return The value.
      */
    public java.lang.CharSequence getUniqueId() {
      return uniqueId;
    }

    /**
      * Sets the value of the 'uniqueId' field.
      * @param value The value of 'uniqueId'.
      * @return This builder.
      */
    public pl.com.boono.avro.Event.Builder setUniqueId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.uniqueId = value;
      fieldSetFlags()[4] = true;
      return this; 
    }

    /**
      * Checks whether the 'uniqueId' field has been set.
      * @return True if the 'uniqueId' field has been set, false otherwise.
      */
    public boolean hasUniqueId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'uniqueId' field.
      * @return This builder.
      */
    public pl.com.boono.avro.Event.Builder clearUniqueId() {
      uniqueId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Event build() {
      try {
        Event record = new Event();
        record.rssi = fieldSetFlags()[0] ? this.rssi : (java.lang.Integer) defaultValue(fields()[0]);
        record.batteryLevel = fieldSetFlags()[1] ? this.batteryLevel : (java.lang.Integer) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (pl.com.boono.avro.EventType) defaultValue(fields()[2]);
        record.timestamp = fieldSetFlags()[3] ? this.timestamp : (java.lang.Long) defaultValue(fields()[3]);
        record.uniqueId = fieldSetFlags()[4] ? this.uniqueId : (java.lang.CharSequence) defaultValue(fields()[4]);
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
