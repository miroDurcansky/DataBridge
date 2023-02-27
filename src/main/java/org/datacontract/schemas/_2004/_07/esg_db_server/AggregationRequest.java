
package org.datacontract.schemas._2004._07.esg_db_server;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AggregationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Interpolation" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}InterpolationType" minOccurs="0"/>
 *         &lt;element name="IsoPattern" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="MaxNeighborDistance" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Types" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfAggregationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregationRequest", propOrder = {
    "defaultValue",
    "from",
    "interpolation",
    "isoPattern",
    "maxNeighborDistance",
    "timeZone",
    "to",
    "types"
})
public class AggregationRequest {

    @XmlElement(name = "DefaultValue")
    protected Double defaultValue;
    @XmlElement(name = "From")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar from;
    @XmlElement(name = "Interpolation")
    @XmlSchemaType(name = "string")
    protected InterpolationType interpolation;
    @XmlElementRef(name = "IsoPattern", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> isoPattern;
    @XmlElement(name = "MaxNeighborDistance")
    protected Duration maxNeighborDistance;
    @XmlElementRef(name = "TimeZone", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeZone;
    @XmlElement(name = "To")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar to;
    @XmlElementRef(name = "Types", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAggregationType> types;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultValue(Double value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrom(XMLGregorianCalendar value) {
        this.from = value;
    }

    /**
     * Gets the value of the interpolation property.
     * 
     * @return
     *     possible object is
     *     {@link InterpolationType }
     *     
     */
    public InterpolationType getInterpolation() {
        return interpolation;
    }

    /**
     * Sets the value of the interpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterpolationType }
     *     
     */
    public void setInterpolation(InterpolationType value) {
        this.interpolation = value;
    }

    /**
     * Gets the value of the isoPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getIsoPattern() {
        return isoPattern;
    }

    /**
     * Sets the value of the isoPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setIsoPattern(JAXBElement<ArrayOfstring> value) {
        this.isoPattern = value;
    }

    /**
     * Gets the value of the maxNeighborDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxNeighborDistance() {
        return maxNeighborDistance;
    }

    /**
     * Sets the value of the maxNeighborDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxNeighborDistance(Duration value) {
        this.maxNeighborDistance = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeZone(JAXBElement<String> value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTo(XMLGregorianCalendar value) {
        this.to = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAggregationType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAggregationType> getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAggregationType }{@code >}
     *     
     */
    public void setTypes(JAXBElement<ArrayOfAggregationType> value) {
        this.types = value;
    }

}
