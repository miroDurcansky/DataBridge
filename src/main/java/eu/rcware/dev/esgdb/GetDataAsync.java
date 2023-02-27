
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.ArrayOfArrayOfKeyValuePair;
import org.datacontract.schemas._2004._07.esg_db_server.Credentials;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credentials" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}Credentials" minOccurs="0"/>
 *         &lt;element name="variableKeys" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfArrayOfKeyValuePair" minOccurs="0"/>
 *         &lt;element name="utcFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="utcTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="variableOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="variableCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valueOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valueCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "credentials",
    "variableKeys",
    "utcFrom",
    "utcTo",
    "variableOffset",
    "variableCount",
    "valueOffset",
    "valueCount"
})
@XmlRootElement(name = "GetDataAsync")
public class GetDataAsync {

    protected Credentials credentials;
    @XmlElementRef(name = "variableKeys", namespace = "http://dev.rcware.eu/esgdb", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfArrayOfKeyValuePair> variableKeys;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcTo;
    protected Integer variableOffset;
    protected Integer variableCount;
    protected Integer valueOffset;
    protected Integer valueCount;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the variableKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}
     *     
     */
    public JAXBElement<ArrayOfArrayOfKeyValuePair> getVariableKeys() {
        return variableKeys;
    }

    /**
     * Sets the value of the variableKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}
     *     
     */
    public void setVariableKeys(JAXBElement<ArrayOfArrayOfKeyValuePair> value) {
        this.variableKeys = value;
    }

    /**
     * Gets the value of the utcFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcFrom() {
        return utcFrom;
    }

    /**
     * Sets the value of the utcFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcFrom(XMLGregorianCalendar value) {
        this.utcFrom = value;
    }

    /**
     * Gets the value of the utcTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcTo() {
        return utcTo;
    }

    /**
     * Sets the value of the utcTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcTo(XMLGregorianCalendar value) {
        this.utcTo = value;
    }

    /**
     * Gets the value of the variableOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVariableOffset() {
        return variableOffset;
    }

    /**
     * Sets the value of the variableOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVariableOffset(Integer value) {
        this.variableOffset = value;
    }

    /**
     * Gets the value of the variableCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVariableCount() {
        return variableCount;
    }

    /**
     * Sets the value of the variableCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVariableCount(Integer value) {
        this.variableCount = value;
    }

    /**
     * Gets the value of the valueOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueOffset() {
        return valueOffset;
    }

    /**
     * Sets the value of the valueOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueOffset(Integer value) {
        this.valueOffset = value;
    }

    /**
     * Gets the value of the valueCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueCount() {
        return valueCount;
    }

    /**
     * Sets the value of the valueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueCount(Integer value) {
        this.valueCount = value;
    }

}
