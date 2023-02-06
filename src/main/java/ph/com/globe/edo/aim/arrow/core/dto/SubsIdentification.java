/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ph.com.globe.edo.aim.arrow.core.dto;

import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.data.RecordBuilder;
import org.apache.avro.generic.GenericArray;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.ResolvingDecoder;
import org.apache.avro.specific.*;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.ByteBuffer;

@AvroGenerated
public class SubsIdentification extends SpecificRecordBase implements SpecificRecord {
  private static final long serialVersionUID = 2530875954698692536L;
  public static final Schema SCHEMA$ = new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SubsIdentification\",\"namespace\":\"ph.com.globe.edo.aim.arrow.core.dto\",\"fields\":[{\"name\":\"msisdn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"imsi\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"subs_id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"brand\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"f_name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"l_name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"last_city\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"balance\",\"type\":[\"null\",\"long\"],\"default\":null}]}");
  private Object errCode;

  public static Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SubsIdentification> ENCODER =
      new BinaryMessageEncoder<SubsIdentification>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SubsIdentification> DECODER =
      new BinaryMessageDecoder<SubsIdentification>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SubsIdentification> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SubsIdentification> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SubsIdentification> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SubsIdentification>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SubsIdentification to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws IOException if this instance could not be serialized
   */
  public ByteBuffer toByteBuffer() throws IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SubsIdentification from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SubsIdentification instance decoded from the given buffer
   * @throws IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SubsIdentification fromByteBuffer(
      ByteBuffer b) throws IOException {
    return DECODER.decode(b);
  }

   private CharSequence msisdn;
   private CharSequence imsi;
   private CharSequence subs_id;
   private CharSequence brand;
   private CharSequence f_name;
   private CharSequence l_name;
   private CharSequence last_city;
   private Long balance;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SubsIdentification() {}

  /**
   * All-args constructor.
   * @param msisdn The new value for msisdn
   * @param imsi The new value for imsi
   * @param subs_id The new value for subs_id
   * @param brand The new value for brand
   * @param f_name The new value for f_name
   * @param l_name The new value for l_name
   * @param last_city The new value for last_city
   * @param balance The new value for balance
   */
  public SubsIdentification(CharSequence msisdn, CharSequence imsi, CharSequence subs_id, CharSequence brand, CharSequence f_name, CharSequence l_name, CharSequence last_city, Long balance) {
    this.msisdn = msisdn;
    this.imsi = imsi;
    this.subs_id = subs_id;
    this.brand = brand;
    this.f_name = f_name;
    this.l_name = l_name;
    this.last_city = last_city;
    this.balance = balance;
  }

  public SpecificData getSpecificData() { return MODEL$; }
  public Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return msisdn;
    case 1: return imsi;
    case 2: return subs_id;
    case 3: return brand;
    case 4: return f_name;
    case 5: return l_name;
    case 6: return last_city;
    case 7: return balance;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: msisdn = (CharSequence)value$; break;
    case 1: imsi = (CharSequence)value$; break;
    case 2: subs_id = (CharSequence)value$; break;
    case 3: brand = (CharSequence)value$; break;
    case 4: f_name = (CharSequence)value$; break;
    case 5: l_name = (CharSequence)value$; break;
    case 6: last_city = (CharSequence)value$; break;
    case 7: balance = (Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'msisdn' field.
   * @return The value of the 'msisdn' field.
   */
  public CharSequence getMsisdn() {
    return msisdn;
  }


  /**
   * Sets the value of the 'msisdn' field.
   * @param value the value to set.
   */
  public void setMsisdn(CharSequence value) {
    this.msisdn = value;
  }

  /**
   * Gets the value of the 'imsi' field.
   * @return The value of the 'imsi' field.
   */
  public CharSequence getImsi() {
    return imsi;
  }


  /**
   * Sets the value of the 'imsi' field.
   * @param value the value to set.
   */
  public void setImsi(CharSequence value) {
    this.imsi = value;
  }

  /**
   * Gets the value of the 'subs_id' field.
   * @return The value of the 'subs_id' field.
   */
  public CharSequence getSubsId() {
    return subs_id;
  }


  /**
   * Sets the value of the 'subs_id' field.
   * @param value the value to set.
   */
  public void setSubsId(CharSequence value) {
    this.subs_id = value;
  }

  /**
   * Gets the value of the 'brand' field.
   * @return The value of the 'brand' field.
   */
  public CharSequence getBrand() {
    return brand;
  }


  /**
   * Sets the value of the 'brand' field.
   * @param value the value to set.
   */
  public void setBrand(CharSequence value) {
    this.brand = value;
  }

  /**
   * Gets the value of the 'f_name' field.
   * @return The value of the 'f_name' field.
   */
  public CharSequence getFName() {
    return f_name;
  }


  /**
   * Sets the value of the 'f_name' field.
   * @param value the value to set.
   */
  public void setFName(CharSequence value) {
    this.f_name = value;
  }

  /**
   * Gets the value of the 'l_name' field.
   * @return The value of the 'l_name' field.
   */
  public CharSequence getLName() {
    return l_name;
  }


  /**
   * Sets the value of the 'l_name' field.
   * @param value the value to set.
   */
  public void setLName(CharSequence value) {
    this.l_name = value;
  }

  /**
   * Gets the value of the 'last_city' field.
   * @return The value of the 'last_city' field.
   */
  public CharSequence getLastCity() {
    return last_city;
  }


  /**
   * Sets the value of the 'last_city' field.
   * @param value the value to set.
   */
  public void setLastCity(CharSequence value) {
    this.last_city = value;
  }

  /**
   * Gets the value of the 'balance' field.
   * @return The value of the 'balance' field.
   */
  public Long getBalance() {
    return balance;
  }


  /**
   * Sets the value of the 'balance' field.
   * @param value the value to set.
   */
  public void setBalance(Long value) {
    this.balance = value;
  }

  /**
   * Creates a new SubsIdentification RecordBuilder.
   * @return A new SubsIdentification RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new SubsIdentification RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SubsIdentification RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  /**
   * Creates a new SubsIdentification RecordBuilder by copying an existing SubsIdentification instance.
   * @param other The existing instance to copy.
   * @return A new SubsIdentification RecordBuilder
   */
  public static Builder newBuilder(SubsIdentification other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  public Object getErrCode() {
    return errCode;
  }

  public void setErrCode(Object errCode) {
    this.errCode = errCode;
  }

  /**
   * RecordBuilder for SubsIdentification instances.
   */
  @AvroGenerated
  public static class Builder extends SpecificRecordBuilderBase<SubsIdentification>
    implements RecordBuilder<SubsIdentification> {

    private CharSequence msisdn;
    private CharSequence imsi;
    private CharSequence subs_id;
    private CharSequence brand;
    private CharSequence f_name;
    private CharSequence l_name;
    private CharSequence last_city;
    private Long balance;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.msisdn)) {
        this.msisdn = data().deepCopy(fields()[0].schema(), other.msisdn);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.imsi)) {
        this.imsi = data().deepCopy(fields()[1].schema(), other.imsi);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.subs_id)) {
        this.subs_id = data().deepCopy(fields()[2].schema(), other.subs_id);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.brand)) {
        this.brand = data().deepCopy(fields()[3].schema(), other.brand);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.f_name)) {
        this.f_name = data().deepCopy(fields()[4].schema(), other.f_name);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.l_name)) {
        this.l_name = data().deepCopy(fields()[5].schema(), other.l_name);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.last_city)) {
        this.last_city = data().deepCopy(fields()[6].schema(), other.last_city);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.balance)) {
        this.balance = data().deepCopy(fields()[7].schema(), other.balance);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing SubsIdentification instance
     * @param other The existing instance to copy.
     */
    private Builder(SubsIdentification other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.msisdn)) {
        this.msisdn = data().deepCopy(fields()[0].schema(), other.msisdn);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.imsi)) {
        this.imsi = data().deepCopy(fields()[1].schema(), other.imsi);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.subs_id)) {
        this.subs_id = data().deepCopy(fields()[2].schema(), other.subs_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.brand)) {
        this.brand = data().deepCopy(fields()[3].schema(), other.brand);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.f_name)) {
        this.f_name = data().deepCopy(fields()[4].schema(), other.f_name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.l_name)) {
        this.l_name = data().deepCopy(fields()[5].schema(), other.l_name);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.last_city)) {
        this.last_city = data().deepCopy(fields()[6].schema(), other.last_city);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.balance)) {
        this.balance = data().deepCopy(fields()[7].schema(), other.balance);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'msisdn' field.
      * @return The value.
      */
    public CharSequence getMsisdn() {
      return msisdn;
    }


    /**
      * Sets the value of the 'msisdn' field.
      * @param value The value of 'msisdn'.
      * @return This builder.
      */
    public Builder setMsisdn(CharSequence value) {
      validate(fields()[0], value);
      this.msisdn = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'msisdn' field has been set.
      * @return True if the 'msisdn' field has been set, false otherwise.
      */
    public boolean hasMsisdn() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'msisdn' field.
      * @return This builder.
      */
    public Builder clearMsisdn() {
      msisdn = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'imsi' field.
      * @return The value.
      */
    public CharSequence getImsi() {
      return imsi;
    }


    /**
      * Sets the value of the 'imsi' field.
      * @param value The value of 'imsi'.
      * @return This builder.
      */
    public Builder setImsi(CharSequence value) {
      validate(fields()[1], value);
      this.imsi = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'imsi' field has been set.
      * @return True if the 'imsi' field has been set, false otherwise.
      */
    public boolean hasImsi() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'imsi' field.
      * @return This builder.
      */
    public Builder clearImsi() {
      imsi = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'subs_id' field.
      * @return The value.
      */
    public CharSequence getSubsId() {
      return subs_id;
    }


    /**
      * Sets the value of the 'subs_id' field.
      * @param value The value of 'subs_id'.
      * @return This builder.
      */
    public Builder setSubsId(CharSequence value) {
      validate(fields()[2], value);
      this.subs_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'subs_id' field has been set.
      * @return True if the 'subs_id' field has been set, false otherwise.
      */
    public boolean hasSubsId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'subs_id' field.
      * @return This builder.
      */
    public Builder clearSubsId() {
      subs_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'brand' field.
      * @return The value.
      */
    public CharSequence getBrand() {
      return brand;
    }


    /**
      * Sets the value of the 'brand' field.
      * @param value The value of 'brand'.
      * @return This builder.
      */
    public Builder setBrand(CharSequence value) {
      validate(fields()[3], value);
      this.brand = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'brand' field has been set.
      * @return True if the 'brand' field has been set, false otherwise.
      */
    public boolean hasBrand() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'brand' field.
      * @return This builder.
      */
    public Builder clearBrand() {
      brand = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'f_name' field.
      * @return The value.
      */
    public CharSequence getFName() {
      return f_name;
    }


    /**
      * Sets the value of the 'f_name' field.
      * @param value The value of 'f_name'.
      * @return This builder.
      */
    public Builder setFName(CharSequence value) {
      validate(fields()[4], value);
      this.f_name = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'f_name' field has been set.
      * @return True if the 'f_name' field has been set, false otherwise.
      */
    public boolean hasFName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'f_name' field.
      * @return This builder.
      */
    public Builder clearFName() {
      f_name = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'l_name' field.
      * @return The value.
      */
    public CharSequence getLName() {
      return l_name;
    }


    /**
      * Sets the value of the 'l_name' field.
      * @param value The value of 'l_name'.
      * @return This builder.
      */
    public Builder setLName(CharSequence value) {
      validate(fields()[5], value);
      this.l_name = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'l_name' field has been set.
      * @return True if the 'l_name' field has been set, false otherwise.
      */
    public boolean hasLName() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'l_name' field.
      * @return This builder.
      */
    public Builder clearLName() {
      l_name = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_city' field.
      * @return The value.
      */
    public CharSequence getLastCity() {
      return last_city;
    }


    /**
      * Sets the value of the 'last_city' field.
      * @param value The value of 'last_city'.
      * @return This builder.
      */
    public Builder setLastCity(CharSequence value) {
      validate(fields()[6], value);
      this.last_city = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'last_city' field has been set.
      * @return True if the 'last_city' field has been set, false otherwise.
      */
    public boolean hasLastCity() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'last_city' field.
      * @return This builder.
      */
    public Builder clearLastCity() {
      last_city = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'balance' field.
      * @return The value.
      */
    public Long getBalance() {
      return balance;
    }


    /**
      * Sets the value of the 'balance' field.
      * @param value The value of 'balance'.
      * @return This builder.
      */
    public Builder setBalance(Long value) {
      validate(fields()[7], value);
      this.balance = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'balance' field has been set.
      * @return True if the 'balance' field has been set, false otherwise.
      */
    public boolean hasBalance() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'balance' field.
      * @return This builder.
      */
    public Builder clearBalance() {
      balance = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SubsIdentification build() {
      try {
        SubsIdentification record = new SubsIdentification();
        record.msisdn = fieldSetFlags()[0] ? this.msisdn : (CharSequence) defaultValue(fields()[0]);
        record.imsi = fieldSetFlags()[1] ? this.imsi : (CharSequence) defaultValue(fields()[1]);
        record.subs_id = fieldSetFlags()[2] ? this.subs_id : (CharSequence) defaultValue(fields()[2]);
        record.brand = fieldSetFlags()[3] ? this.brand : (CharSequence) defaultValue(fields()[3]);
        record.f_name = fieldSetFlags()[4] ? this.f_name : (CharSequence) defaultValue(fields()[4]);
        record.l_name = fieldSetFlags()[5] ? this.l_name : (CharSequence) defaultValue(fields()[5]);
        record.last_city = fieldSetFlags()[6] ? this.last_city : (CharSequence) defaultValue(fields()[6]);
        record.balance = fieldSetFlags()[7] ? this.balance : (Long) defaultValue(fields()[7]);
        return record;
      } catch (AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final DatumWriter<SubsIdentification>
    WRITER$ = (DatumWriter<SubsIdentification>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(ObjectOutput out)
    throws IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final DatumReader<SubsIdentification>
    READER$ = (DatumReader<SubsIdentification>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(ObjectInput in)
    throws IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(Encoder out)
    throws IOException
  {
    if (this.msisdn == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.msisdn);
    }

    if (this.imsi == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.imsi);
    }

    if (this.subs_id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.subs_id);
    }

    if (this.brand == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.brand);
    }

    if (this.f_name == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.f_name);
    }

    if (this.l_name == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.l_name);
    }

    if (this.last_city == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.last_city);
    }

    if (this.balance == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.balance);
    }

  }

  @Override public void customDecode(ResolvingDecoder in)
    throws IOException
  {
    Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.msisdn = null;
      } else {
        this.msisdn = in.readString(this.msisdn instanceof Utf8 ? (Utf8)this.msisdn : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.imsi = null;
      } else {
        this.imsi = in.readString(this.imsi instanceof Utf8 ? (Utf8)this.imsi : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.subs_id = null;
      } else {
        this.subs_id = in.readString(this.subs_id instanceof Utf8 ? (Utf8)this.subs_id : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.brand = null;
      } else {
        this.brand = in.readString(this.brand instanceof Utf8 ? (Utf8)this.brand : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.f_name = null;
      } else {
        this.f_name = in.readString(this.f_name instanceof Utf8 ? (Utf8)this.f_name : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.l_name = null;
      } else {
        this.l_name = in.readString(this.l_name instanceof Utf8 ? (Utf8)this.l_name : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.last_city = null;
      } else {
        this.last_city = in.readString(this.last_city instanceof Utf8 ? (Utf8)this.last_city : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.balance = null;
      } else {
        this.balance = in.readLong();
      }

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.msisdn = null;
          } else {
            this.msisdn = in.readString(this.msisdn instanceof Utf8 ? (Utf8)this.msisdn : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.imsi = null;
          } else {
            this.imsi = in.readString(this.imsi instanceof Utf8 ? (Utf8)this.imsi : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.subs_id = null;
          } else {
            this.subs_id = in.readString(this.subs_id instanceof Utf8 ? (Utf8)this.subs_id : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.brand = null;
          } else {
            this.brand = in.readString(this.brand instanceof Utf8 ? (Utf8)this.brand : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.f_name = null;
          } else {
            this.f_name = in.readString(this.f_name instanceof Utf8 ? (Utf8)this.f_name : null);
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.l_name = null;
          } else {
            this.l_name = in.readString(this.l_name instanceof Utf8 ? (Utf8)this.l_name : null);
          }
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.last_city = null;
          } else {
            this.last_city = in.readString(this.last_city instanceof Utf8 ? (Utf8)this.last_city : null);
          }
          break;

        case 7:
          if (in.readIndex() != 1) {
            in.readNull();
            this.balance = null;
          } else {
            this.balance = in.readLong();
          }
          break;

        default:
          throw new IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









