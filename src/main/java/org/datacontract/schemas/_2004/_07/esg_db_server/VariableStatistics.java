
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VariableStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keys" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfKeyValuePair" minOccurs="0"/>
 *         &lt;element name="MaxTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MinTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValueCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableStatistics", propOrder = {
    "keys",
    "maxTime",
    "minTime",
    "valueCount"
})
public class VariableStatistics {

    @XmlElementRef(name = "Keys", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePair> keys;
    @XmlElement(name = "MaxTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxTime;
    @XmlElement(name = "MinTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minTime;
    @XmlElement(name = "ValueCount")
    protected Long valueCount;

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
     * Gets the value of the maxTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxTime() {
        return maxTime;
    }

    /**
     * Sets the value of the maxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxTime(XMLGregorianCalendar value) {
        this.maxTime = value;
    }

    /**
     * Gets the value of the minTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinTime() {
        return minTime;
    }

    /**
     * Sets the value of the minTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinTime(XMLGregorianCalendar value) {
        this.minTime = value;
    }

    /**
     * Gets the value of the valueCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCount() {
        return valueCount;
    }

    /**
     * Sets the value of the valueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCount(Long value) {
        this.valueCount = value;
    }

}
