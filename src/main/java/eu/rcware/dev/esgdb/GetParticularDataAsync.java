
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.ArrayOfArrayOfKeyValuePair;
import org.datacontract.schemas._2004._07.esg_db_server.Credentials;
import org.datacontract.schemas._2004._07.esg_db_server.ParticularDataSpecification;

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
 *         &lt;element name="referenceTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataSpecification" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ParticularDataSpecification" minOccurs="0"/>
 *         &lt;element name="variableOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="variableCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "referenceTime",
    "dataSpecification",
    "variableOffset",
    "variableCount"
})
@XmlRootElement(name = "GetParticularDataAsync")
public class GetParticularDataAsync {

    protected Credentials credentials;
    @XmlElementRef(name = "variableKeys", namespace = "http://dev.rcware.eu/esgdb", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfArrayOfKeyValuePair> variableKeys;
    @XmlElementRef(name = "referenceTime", namespace = "http://dev.rcware.eu/esgdb", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> referenceTime;
    @XmlSchemaType(name = "string")
    protected ParticularDataSpecification dataSpecification;
    protected Integer variableOffset;
    protected Integer variableCount;

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
     * Gets the value of the referenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReferenceTime() {
        return referenceTime;
    }

    /**
     * Sets the value of the referenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReferenceTime(JAXBElement<XMLGregorianCalendar> value) {
        this.referenceTime = value;
    }

    /**
     * Gets the value of the dataSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ParticularDataSpecification }
     *     
     */
    public ParticularDataSpecification getDataSpecification() {
        return dataSpecification;
    }

    /**
     * Sets the value of the dataSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticularDataSpecification }
     *     
     */
    public void setDataSpecification(ParticularDataSpecification value) {
        this.dataSpecification = value;
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

}
