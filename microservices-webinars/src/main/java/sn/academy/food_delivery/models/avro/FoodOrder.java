/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package sn.academy.food_delivery.models.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class FoodOrder extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5852153619797477541L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FoodOrder\",\"namespace\":\"sn.academy.food_delivery.models.avro\",\"fields\":[{\"name\":\"meta\",\"type\":{\"type\":\"record\",\"name\":\"FoodOrderMeta\",\"fields\":[{\"name\":\"order_id\",\"type\":\"int\"},{\"name\":\"customer_id\",\"type\":\"int\"},{\"name\":\"time_placed\",\"type\":\"string\"},{\"name\":\"order_status\",\"type\":{\"type\":\"enum\",\"name\":\"OrderStatus\",\"symbols\":[\"NEW\",\"ACCEPTED\",\"READY\",\"DISPATCHED\",\"DELIVERED\"]}}]}},{\"name\":\"restaurant_id\",\"type\":\"int\"},{\"name\":\"details\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrderDetail\",\"fields\":[{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"total\",\"type\":\"float\"},{\"name\":\"food_item\",\"type\":{\"type\":\"record\",\"name\":\"MenuItem\",\"fields\":[{\"name\":\"item_id\",\"type\":\"int\"},{\"name\":\"item_name\",\"type\":\"string\"},{\"name\":\"item_description\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"float\"}]}}]}}},{\"name\":\"delivery_location\",\"type\":{\"type\":\"record\",\"name\":\"Address\",\"fields\":[{\"name\":\"street\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"zip\",\"type\":\"string\"}]}},{\"name\":\"payment_method\",\"type\":{\"type\":\"record\",\"name\":\"CreditCard\",\"fields\":[{\"name\":\"card_type\",\"type\":{\"type\":\"enum\",\"name\":\"CardType\",\"symbols\":[\"MASTERCARD\",\"AMEX\",\"VISA\",\"DISCOVER\"]}},{\"name\":\"account_number\",\"type\":\"string\"},{\"name\":\"billing_zip\",\"type\":\"string\"},{\"name\":\"ccv\",\"type\":\"string\"}]}},{\"name\":\"total\",\"type\":\"float\",\"default\":0.0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FoodOrder> ENCODER =
      new BinaryMessageEncoder<FoodOrder>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FoodOrder> DECODER =
      new BinaryMessageDecoder<FoodOrder>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<FoodOrder> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<FoodOrder> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<FoodOrder> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FoodOrder>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this FoodOrder to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a FoodOrder from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a FoodOrder instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static FoodOrder fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public sn.academy.food_delivery.models.avro.FoodOrderMeta meta;
  @Deprecated public int restaurant_id;
  @Deprecated public java.util.List<sn.academy.food_delivery.models.avro.OrderDetail> details;
  @Deprecated public sn.academy.food_delivery.models.avro.Address delivery_location;
  @Deprecated public sn.academy.food_delivery.models.avro.CreditCard payment_method;
  @Deprecated public float total;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FoodOrder() {}

  /**
   * All-args constructor.
   * @param meta The new value for meta
   * @param restaurant_id The new value for restaurant_id
   * @param details The new value for details
   * @param delivery_location The new value for delivery_location
   * @param payment_method The new value for payment_method
   * @param total The new value for total
   */
  public FoodOrder(sn.academy.food_delivery.models.avro.FoodOrderMeta meta, java.lang.Integer restaurant_id, java.util.List<sn.academy.food_delivery.models.avro.OrderDetail> details, sn.academy.food_delivery.models.avro.Address delivery_location, sn.academy.food_delivery.models.avro.CreditCard payment_method, java.lang.Float total) {
    this.meta = meta;
    this.restaurant_id = restaurant_id;
    this.details = details;
    this.delivery_location = delivery_location;
    this.payment_method = payment_method;
    this.total = total;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return meta;
    case 1: return restaurant_id;
    case 2: return details;
    case 3: return delivery_location;
    case 4: return payment_method;
    case 5: return total;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: meta = (sn.academy.food_delivery.models.avro.FoodOrderMeta)value$; break;
    case 1: restaurant_id = (java.lang.Integer)value$; break;
    case 2: details = (java.util.List<sn.academy.food_delivery.models.avro.OrderDetail>)value$; break;
    case 3: delivery_location = (sn.academy.food_delivery.models.avro.Address)value$; break;
    case 4: payment_method = (sn.academy.food_delivery.models.avro.CreditCard)value$; break;
    case 5: total = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'meta' field.
   * @return The value of the 'meta' field.
   */
  public sn.academy.food_delivery.models.avro.FoodOrderMeta getMeta() {
    return meta;
  }


  /**
   * Sets the value of the 'meta' field.
   * @param value the value to set.
   */
  public void setMeta(sn.academy.food_delivery.models.avro.FoodOrderMeta value) {
    this.meta = value;
  }

  /**
   * Gets the value of the 'restaurant_id' field.
   * @return The value of the 'restaurant_id' field.
   */
  public int getRestaurantId() {
    return restaurant_id;
  }


  /**
   * Sets the value of the 'restaurant_id' field.
   * @param value the value to set.
   */
  public void setRestaurantId(int value) {
    this.restaurant_id = value;
  }

  /**
   * Gets the value of the 'details' field.
   * @return The value of the 'details' field.
   */
  public java.util.List<sn.academy.food_delivery.models.avro.OrderDetail> getDetails() {
    return details;
  }


  /**
   * Sets the value of the 'details' field.
   * @param value the value to set.
   */
  public void setDetails(java.util.List<sn.academy.food_delivery.models.avro.OrderDetail> value) {
    this.details = value;
  }

  /**
   * Gets the value of the 'delivery_location' field.
   * @return The value of the 'delivery_location' field.
   */
  public sn.academy.food_delivery.models.avro.Address getDeliveryLocation() {
    return delivery_location;
  }


  /**
   * Sets the value of the 'delivery_location' field.
   * @param value the value to set.
   */
  public void setDeliveryLocation(sn.academy.food_delivery.models.avro.Address value) {
    this.delivery_location = value;
  }

  /**
   * Gets the value of the 'payment_method' field.
   * @return The value of the 'payment_method' field.
   */
  public sn.academy.food_delivery.models.avro.CreditCard getPaymentMethod() {
    return payment_method;
  }


  /**
   * Sets the value of the 'payment_method' field.
   * @param value the value to set.
   */
  public void setPaymentMethod(sn.academy.food_delivery.models.avro.CreditCard value) {
    this.payment_method = value;
  }

  /**
   * Gets the value of the 'total' field.
   * @return The value of the 'total' field.
   */
  public float getTotal() {
    return total;
  }


  /**
   * Sets the value of the 'total' field.
   * @param value the value to set.
   */
  public void setTotal(float value) {
    this.total = value;
  }

  /**
   * Creates a new FoodOrder RecordBuilder.
   * @return A new FoodOrder RecordBuilder
   */
  public static sn.academy.food_delivery.models.avro.FoodOrder.Builder newBuilder() {
    return new sn.academy.food_delivery.models.avro.FoodOrder.Builder();
  }

  /**
   * Creates a new FoodOrder RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FoodOrder RecordBuilder
   */
  public static sn.academy.food_delivery.models.avro.FoodOrder.Builder newBuilder(sn.academy.food_delivery.models.avro.FoodOrder.Builder other) {
    if (other == null) {
      return new sn.academy.food_delivery.models.avro.FoodOrder.Builder();
    } else {
      return new sn.academy.food_delivery.models.avro.FoodOrder.Builder(other);
    }
  }

  /**
   * Creates a new FoodOrder RecordBuilder by copying an existing FoodOrder instance.
   * @param other The existing instance to copy.
   * @return A new FoodOrder RecordBuilder
   */
  public static sn.academy.food_delivery.models.avro.FoodOrder.Builder newBuilder(sn.academy.food_delivery.models.avro.FoodOrder other) {
    if (other == null) {
      return new sn.academy.food_delivery.models.avro.FoodOrder.Builder();
    } else {
      return new sn.academy.food_delivery.models.avro.FoodOrder.Builder(other);
    }
  }

  /**
   * RecordBuilder for FoodOrder instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FoodOrder>
    implements org.apache.avro.data.RecordBuilder<FoodOrder> {

    private sn.academy.food_delivery.models.avro.FoodOrderMeta meta;
    private sn.academy.food_delivery.models.avro.FoodOrderMeta.Builder metaBuilder;
    private int restaurant_id;
    private java.util.List<sn.academy.food_delivery.models.avro.OrderDetail> details;
    private sn.academy.food_delivery.models.avro.Address delivery_location;
    private sn.academy.food_delivery.models.avro.Address.Builder delivery_locationBuilder;
    private sn.academy.food_delivery.models.avro.CreditCard payment_method;
    private sn.academy.food_delivery.models.avro.CreditCard.Builder payment_methodBuilder;
    private float total;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(sn.academy.food_delivery.models.avro.FoodOrder.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.meta)) {
        this.meta = data().deepCopy(fields()[0].schema(), other.meta);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasMetaBuilder()) {
        this.metaBuilder = sn.academy.food_delivery.models.avro.FoodOrderMeta.newBuilder(other.getMetaBuilder());
      }
      if (isValidValue(fields()[1], other.restaurant_id)) {
        this.restaurant_id = data().deepCopy(fields()[1].schema(), other.restaurant_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.details)) {
        this.details = data().deepCopy(fields()[2].schema(), other.details);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.delivery_location)) {
        this.delivery_location = data().deepCopy(fields()[3].schema(), other.delivery_location);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasDeliveryLocationBuilder()) {
        this.delivery_locationBuilder = sn.academy.food_delivery.models.avro.Address.newBuilder(other.getDeliveryLocationBuilder());
      }
      if (isValidValue(fields()[4], other.payment_method)) {
        this.payment_method = data().deepCopy(fields()[4].schema(), other.payment_method);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasPaymentMethodBuilder()) {
        this.payment_methodBuilder = sn.academy.food_delivery.models.avro.CreditCard.newBuilder(other.getPaymentMethodBuilder());
      }
      if (isValidValue(fields()[5], other.total)) {
        this.total = data().deepCopy(fields()[5].schema(), other.total);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing FoodOrder instance
     * @param other The existing instance to copy.
     */
    private Builder(sn.academy.food_delivery.models.avro.FoodOrder other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.meta)) {
        this.meta = data().deepCopy(fields()[0].schema(), other.meta);
        fieldSetFlags()[0] = true;
      }
      this.metaBuilder = null;
      if (isValidValue(fields()[1], other.restaurant_id)) {
        this.restaurant_id = data().deepCopy(fields()[1].schema(), other.restaurant_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.details)) {
        this.details = data().deepCopy(fields()[2].schema(), other.details);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.delivery_location)) {
        this.delivery_location = data().deepCopy(fields()[3].schema(), other.delivery_location);
        fieldSetFlags()[3] = true;
      }
      this.delivery_locationBuilder = null;
      if (isValidValue(fields()[4], other.payment_method)) {
        this.payment_method = data().deepCopy(fields()[4].schema(), other.payment_method);
        fieldSetFlags()[4] = true;
      }
      this.payment_methodBuilder = null;
      if (isValidValue(fields()[5], other.total)) {
        this.total = data().deepCopy(fields()[5].schema(), other.total);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'meta' field.
      * @return The value.
      */
    public sn.academy.food_delivery.models.avro.FoodOrderMeta getMeta() {
      return meta;
    }


    /**
      * Sets the value of the 'meta' field.
      * @param value The value of 'meta'.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder setMeta(sn.academy.food_delivery.models.avro.FoodOrderMeta value) {
      validate(fields()[0], value);
      this.metaBuilder = null;
      this.meta = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'meta' field has been set.
      * @return True if the 'meta' field has been set, false otherwise.
      */
    public boolean hasMeta() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'meta' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public sn.academy.food_delivery.models.avro.FoodOrderMeta.Builder getMetaBuilder() {
      if (metaBuilder == null) {
        if (hasMeta()) {
          setMetaBuilder(sn.academy.food_delivery.models.avro.FoodOrderMeta.newBuilder(meta));
        } else {
          setMetaBuilder(sn.academy.food_delivery.models.avro.FoodOrderMeta.newBuilder());
        }
      }
      return metaBuilder;
    }

    /**
     * Sets the Builder instance for the 'meta' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder setMetaBuilder(sn.academy.food_delivery.models.avro.FoodOrderMeta.Builder value) {
      clearMeta();
      metaBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'meta' field has an active Builder instance
     * @return True if the 'meta' field has an active Builder instance
     */
    public boolean hasMetaBuilder() {
      return metaBuilder != null;
    }

    /**
      * Clears the value of the 'meta' field.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder clearMeta() {
      meta = null;
      metaBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'restaurant_id' field.
      * @return The value.
      */
    public int getRestaurantId() {
      return restaurant_id;
    }


    /**
      * Sets the value of the 'restaurant_id' field.
      * @param value The value of 'restaurant_id'.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder setRestaurantId(int value) {
      validate(fields()[1], value);
      this.restaurant_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'restaurant_id' field has been set.
      * @return True if the 'restaurant_id' field has been set, false otherwise.
      */
    public boolean hasRestaurantId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'restaurant_id' field.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder clearRestaurantId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'details' field.
      * @return The value.
      */
    public java.util.List<sn.academy.food_delivery.models.avro.OrderDetail> getDetails() {
      return details;
    }


    /**
      * Sets the value of the 'details' field.
      * @param value The value of 'details'.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder setDetails(java.util.List<sn.academy.food_delivery.models.avro.OrderDetail> value) {
      validate(fields()[2], value);
      this.details = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'details' field has been set.
      * @return True if the 'details' field has been set, false otherwise.
      */
    public boolean hasDetails() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'details' field.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder clearDetails() {
      details = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'delivery_location' field.
      * @return The value.
      */
    public sn.academy.food_delivery.models.avro.Address getDeliveryLocation() {
      return delivery_location;
    }


    /**
      * Sets the value of the 'delivery_location' field.
      * @param value The value of 'delivery_location'.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder setDeliveryLocation(sn.academy.food_delivery.models.avro.Address value) {
      validate(fields()[3], value);
      this.delivery_locationBuilder = null;
      this.delivery_location = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'delivery_location' field has been set.
      * @return True if the 'delivery_location' field has been set, false otherwise.
      */
    public boolean hasDeliveryLocation() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'delivery_location' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public sn.academy.food_delivery.models.avro.Address.Builder getDeliveryLocationBuilder() {
      if (delivery_locationBuilder == null) {
        if (hasDeliveryLocation()) {
          setDeliveryLocationBuilder(sn.academy.food_delivery.models.avro.Address.newBuilder(delivery_location));
        } else {
          setDeliveryLocationBuilder(sn.academy.food_delivery.models.avro.Address.newBuilder());
        }
      }
      return delivery_locationBuilder;
    }

    /**
     * Sets the Builder instance for the 'delivery_location' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder setDeliveryLocationBuilder(sn.academy.food_delivery.models.avro.Address.Builder value) {
      clearDeliveryLocation();
      delivery_locationBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'delivery_location' field has an active Builder instance
     * @return True if the 'delivery_location' field has an active Builder instance
     */
    public boolean hasDeliveryLocationBuilder() {
      return delivery_locationBuilder != null;
    }

    /**
      * Clears the value of the 'delivery_location' field.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder clearDeliveryLocation() {
      delivery_location = null;
      delivery_locationBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'payment_method' field.
      * @return The value.
      */
    public sn.academy.food_delivery.models.avro.CreditCard getPaymentMethod() {
      return payment_method;
    }


    /**
      * Sets the value of the 'payment_method' field.
      * @param value The value of 'payment_method'.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder setPaymentMethod(sn.academy.food_delivery.models.avro.CreditCard value) {
      validate(fields()[4], value);
      this.payment_methodBuilder = null;
      this.payment_method = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'payment_method' field has been set.
      * @return True if the 'payment_method' field has been set, false otherwise.
      */
    public boolean hasPaymentMethod() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'payment_method' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public sn.academy.food_delivery.models.avro.CreditCard.Builder getPaymentMethodBuilder() {
      if (payment_methodBuilder == null) {
        if (hasPaymentMethod()) {
          setPaymentMethodBuilder(sn.academy.food_delivery.models.avro.CreditCard.newBuilder(payment_method));
        } else {
          setPaymentMethodBuilder(sn.academy.food_delivery.models.avro.CreditCard.newBuilder());
        }
      }
      return payment_methodBuilder;
    }

    /**
     * Sets the Builder instance for the 'payment_method' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder setPaymentMethodBuilder(sn.academy.food_delivery.models.avro.CreditCard.Builder value) {
      clearPaymentMethod();
      payment_methodBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'payment_method' field has an active Builder instance
     * @return True if the 'payment_method' field has an active Builder instance
     */
    public boolean hasPaymentMethodBuilder() {
      return payment_methodBuilder != null;
    }

    /**
      * Clears the value of the 'payment_method' field.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder clearPaymentMethod() {
      payment_method = null;
      payment_methodBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'total' field.
      * @return The value.
      */
    public float getTotal() {
      return total;
    }


    /**
      * Sets the value of the 'total' field.
      * @param value The value of 'total'.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder setTotal(float value) {
      validate(fields()[5], value);
      this.total = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'total' field has been set.
      * @return True if the 'total' field has been set, false otherwise.
      */
    public boolean hasTotal() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'total' field.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.FoodOrder.Builder clearTotal() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FoodOrder build() {
      try {
        FoodOrder record = new FoodOrder();
        if (metaBuilder != null) {
          try {
            record.meta = this.metaBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("meta"));
            throw e;
          }
        } else {
          record.meta = fieldSetFlags()[0] ? this.meta : (sn.academy.food_delivery.models.avro.FoodOrderMeta) defaultValue(fields()[0]);
        }
        record.restaurant_id = fieldSetFlags()[1] ? this.restaurant_id : (java.lang.Integer) defaultValue(fields()[1]);
        record.details = fieldSetFlags()[2] ? this.details : (java.util.List<sn.academy.food_delivery.models.avro.OrderDetail>) defaultValue(fields()[2]);
        if (delivery_locationBuilder != null) {
          try {
            record.delivery_location = this.delivery_locationBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("delivery_location"));
            throw e;
          }
        } else {
          record.delivery_location = fieldSetFlags()[3] ? this.delivery_location : (sn.academy.food_delivery.models.avro.Address) defaultValue(fields()[3]);
        }
        if (payment_methodBuilder != null) {
          try {
            record.payment_method = this.payment_methodBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("payment_method"));
            throw e;
          }
        } else {
          record.payment_method = fieldSetFlags()[4] ? this.payment_method : (sn.academy.food_delivery.models.avro.CreditCard) defaultValue(fields()[4]);
        }
        record.total = fieldSetFlags()[5] ? this.total : (java.lang.Float) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FoodOrder>
    WRITER$ = (org.apache.avro.io.DatumWriter<FoodOrder>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FoodOrder>
    READER$ = (org.apache.avro.io.DatumReader<FoodOrder>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.meta.customEncode(out);

    out.writeInt(this.restaurant_id);

    long size0 = this.details.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (sn.academy.food_delivery.models.avro.OrderDetail e0: this.details) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    this.delivery_location.customEncode(out);

    this.payment_method.customEncode(out);

    out.writeFloat(this.total);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.meta == null) {
        this.meta = new sn.academy.food_delivery.models.avro.FoodOrderMeta();
      }
      this.meta.customDecode(in);

      this.restaurant_id = in.readInt();

      long size0 = in.readArrayStart();
      java.util.List<sn.academy.food_delivery.models.avro.OrderDetail> a0 = this.details;
      if (a0 == null) {
        a0 = new SpecificData.Array<sn.academy.food_delivery.models.avro.OrderDetail>((int)size0, SCHEMA$.getField("details").schema());
        this.details = a0;
      } else a0.clear();
      SpecificData.Array<sn.academy.food_delivery.models.avro.OrderDetail> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<sn.academy.food_delivery.models.avro.OrderDetail>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          sn.academy.food_delivery.models.avro.OrderDetail e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new sn.academy.food_delivery.models.avro.OrderDetail();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

      if (this.delivery_location == null) {
        this.delivery_location = new sn.academy.food_delivery.models.avro.Address();
      }
      this.delivery_location.customDecode(in);

      if (this.payment_method == null) {
        this.payment_method = new sn.academy.food_delivery.models.avro.CreditCard();
      }
      this.payment_method.customDecode(in);

      this.total = in.readFloat();

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.meta == null) {
            this.meta = new sn.academy.food_delivery.models.avro.FoodOrderMeta();
          }
          this.meta.customDecode(in);
          break;

        case 1:
          this.restaurant_id = in.readInt();
          break;

        case 2:
          long size0 = in.readArrayStart();
          java.util.List<sn.academy.food_delivery.models.avro.OrderDetail> a0 = this.details;
          if (a0 == null) {
            a0 = new SpecificData.Array<sn.academy.food_delivery.models.avro.OrderDetail>((int)size0, SCHEMA$.getField("details").schema());
            this.details = a0;
          } else a0.clear();
          SpecificData.Array<sn.academy.food_delivery.models.avro.OrderDetail> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<sn.academy.food_delivery.models.avro.OrderDetail>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              sn.academy.food_delivery.models.avro.OrderDetail e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new sn.academy.food_delivery.models.avro.OrderDetail();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        case 3:
          if (this.delivery_location == null) {
            this.delivery_location = new sn.academy.food_delivery.models.avro.Address();
          }
          this.delivery_location.customDecode(in);
          break;

        case 4:
          if (this.payment_method == null) {
            this.payment_method = new sn.academy.food_delivery.models.avro.CreditCard();
          }
          this.payment_method.customDecode(in);
          break;

        case 5:
          this.total = in.readFloat();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










