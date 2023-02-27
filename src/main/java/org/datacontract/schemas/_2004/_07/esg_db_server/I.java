
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BinV" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Bv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Dtv" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Dv" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Gt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Hvt" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}HistoryValueType" minOccurs="0"/>
 *         &lt;element name="Iv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Ivl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ts" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I", propOrder = {
    "binV",
    "bv",
    "dtv",
    "dv",
    "gt",
    "hvt",
    "iv",
    "ivl",
    "sv",
    "ts"
})
public class I {

    @XmlElementRef(name = "BinV", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> binV;
    @XmlElementRef(name = "Bv", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bv;
    @XmlElementRef(name = "Dtv", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dtv;
    @XmlElementRef(name = "Dv", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dv;
    @XmlElement(name = "Gt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gt;
    @XmlElement(name = "Hvt")
    @XmlSchemaType(name = "string")
    protected HistoryValueType hvt;
    @XmlElementRef(name = "Iv", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> iv;
    @XmlElement(name = "Ivl")
    protected Double ivl;
    @XmlElementRef(name = "Sv", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sv;
    @XmlElement(name = "Ts")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ts;

    /**
     * Gets the value of the binV property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBinV() {
        return binV;
    }

    /**
     * Sets the value of the binV property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBinV(JAXBElement<byte[]> value) {
        this.binV = value;
    }

    /**
     * Gets the value of the bv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBv() {
        return bv;
    }

    /**
     * Sets the value of the bv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBv(JAXBElement<Boolean> value) {
        this.bv = value;
    }

    /**
     * Gets the value of the dtv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDtv() {
        return dtv;
    }

    /**
     * Sets the value of the dtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDtv(JAXBElement<XMLGregorianCalendar> value) {
        this.dtv = value;
    }

    /**
     * Gets the value of the dv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDv() {
        return dv;
    }

    /**
     * Sets the value of the dv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDv(JAXBElement<Double> value) {
        this.dv = value;
    }

    /**
     * Gets the value of the gt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGt() {
        return gt;
    }

    /**
     * Sets the value of the gt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGt(XMLGregorianCalendar value) {
        this.gt = value;
    }

    /**
     * Gets the value of the hvt property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryValueType }
     *     
     */
    public HistoryValueType getHvt() {
        return hvt;
    }

    /**
     * Sets the value of the hvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryValueType }
     *     
     */
    public void setHvt(HistoryValueType value) {
        this.hvt = value;
    }

    /**
     * Gets the value of the iv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIv() {
        return iv;
    }

    /**
     * Sets the value of the iv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIv(JAXBElement<Long> value) {
        this.iv = value;
    }

    /**
     * Gets the value of the ivl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIvl() {
        return ivl;
    }

    /**
     * Sets the value of the ivl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIvl(Double value) {
        this.ivl = value;
    }

    /**
     * Gets the value of the sv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSv() {
        return sv;
    }

    /**
     * Sets the value of the sv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSv(JAXBElement<String> value) {
        this.sv = value;
    }

    /**
     * Gets the value of the ts property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTs() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTs(XMLGregorianCalendar value) {
        this.ts = value;
    }

}
