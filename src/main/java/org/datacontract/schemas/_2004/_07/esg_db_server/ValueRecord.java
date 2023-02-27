
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ValueRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlobValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="BooleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DateTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DoubleValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ForceSave" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GoodThrough" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HistoryValueType" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}HistoryValueType" minOccurs="0"/>
 *         &lt;element name="Int64Value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Keys" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfKeyValuePair" minOccurs="0"/>
 *         &lt;element name="StringValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtcTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueRecord", propOrder = {
    "blobValue",
    "booleanValue",
    "dateTimeValue",
    "doubleValue",
    "forceSave",
    "goodThrough",
    "historyValueType",
    "int64Value",
    "interval",
    "keys",
    "stringValue",
    "utcTimeStamp"
})
public class ValueRecord {

    @XmlElementRef(name = "BlobValue", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> blobValue;
    @XmlElement(name = "BooleanValue")
    protected Boolean booleanValue;
    @XmlElement(name = "DateTimeValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeValue;
    @XmlElement(name = "DoubleValue")
    protected Double doubleValue;
    @XmlElement(name = "ForceSave")
    protected Boolean forceSave;
    @XmlElement(name = "GoodThrough")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar goodThrough;
    @XmlElement(name = "HistoryValueType")
    @XmlSchemaType(name = "string")
    protected HistoryValueType historyValueType;
    @XmlElement(name = "Int64Value")
    protected Long int64Value;
    @XmlElement(name = "Interval")
    protected Double interval;
    @XmlElementRef(name = "Keys", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePair> keys;
    @XmlElementRef(name = "StringValue", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stringValue;
    @XmlElement(name = "UtcTimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcTimeStamp;

    /**
     * Gets the value of the blobValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBlobValue() {
        return blobValue;
    }

    /**
     * Sets the value of the blobValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBlobValue(JAXBElement<byte[]> value) {
        this.blobValue = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Gets the value of the dateTimeValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeValue() {
        return dateTimeValue;
    }

    /**
     * Sets the value of the dateTimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeValue(XMLGregorianCalendar value) {
        this.dateTimeValue = value;
    }

    /**
     * Gets the value of the doubleValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * Sets the value of the doubleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoubleValue(Double value) {
        this.doubleValue = value;
    }

    /**
     * Gets the value of the forceSave property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceSave() {
        return forceSave;
    }

    /**
     * Sets the value of the forceSave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceSave(Boolean value) {
        this.forceSave = value;
    }

    /**
     * Gets the value of the goodThrough property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGoodThrough() {
        return goodThrough;
    }

    /**
     * Sets the value of the goodThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGoodThrough(XMLGregorianCalendar value) {
        this.goodThrough = value;
    }

    /**
     * Gets the value of the historyValueType property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryValueType }
     *     
     */
    public HistoryValueType getHistoryValueType() {
        return historyValueType;
    }

    /**
     * Sets the value of the historyValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryValueType }
     *     
     */
    public void setHistoryValueType(HistoryValueType value) {
        this.historyValueType = value;
    }

    /**
     * Gets the value of the int64Value property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInt64Value() {
        return int64Value;
    }

    /**
     * Sets the value of the int64Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInt64Value(Long value) {
        this.int64Value = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInterval(Double value) {
        this.interval = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePair }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePair> getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePair }{@code >}
     *     
     */
    public void setKeys(JAXBElement<ArrayOfKeyValuePair> value) {
        this.keys = value;
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStringValue(JAXBElement<String> value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the utcTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcTimeStamp() {
        return utcTimeStamp;
    }

    /**
     * Sets the value of the utcTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcTimeStamp(XMLGregorianCalendar value) {
        this.utcTimeStamp = value;
    }

}
