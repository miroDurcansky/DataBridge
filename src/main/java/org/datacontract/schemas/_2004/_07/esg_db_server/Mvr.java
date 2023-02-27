
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mvr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mvr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keys" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfKeyValuePair" minOccurs="0"/>
 *         &lt;element name="Vals" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mvr", propOrder = {
    "keys",
    "vals"
})
public class Mvr {

    @XmlElementRef(name = "Keys", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePair> keys;
    @XmlElementRef(name = "Vals", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfI> vals;

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
     * Gets the value of the vals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfI }{@code >}
     *     
     */
    public JAXBElement<ArrayOfI> getVals() {
        return vals;
    }

    /**
     * Sets the value of the vals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfI }{@code >}
     *     
     */
    public void setVals(JAXBElement<ArrayOfI> value) {
        this.vals = value;
    }

}
