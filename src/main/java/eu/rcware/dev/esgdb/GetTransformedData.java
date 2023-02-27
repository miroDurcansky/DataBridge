
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.AggregationRequest;
import org.datacontract.schemas._2004._07.esg_db_server.ArrayOfArrayOfKeyValuePair;
import org.datacontract.schemas._2004._07.esg_db_server.Credentials;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


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
 *         &lt;element name="request" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}AggregationRequest" minOccurs="0"/>
 *         &lt;element name="variableKeys" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfArrayOfKeyValuePair" minOccurs="0"/>
 *         &lt;element name="variableOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="variableCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intervalOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intervalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "request",
    "variableKeys",
    "variableOffset",
    "variableCount",
    "intervalOffset",
    "intervalCount"
})
@XmlRootElement(name = "GetTransformedData")
public class GetTransformedData {

    protected Credentials credentials;
    protected AggregationRequest request;
    @XmlElementRef(name = "variableKeys", namespace = "http://dev.rcware.eu/esgdb", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfArrayOfKeyValuePair> variableKeys;
    protected Integer variableOffset;
    protected Integer variableCount;
    protected Integer intervalOffset;
    protected Integer intervalCount;

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
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationRequest }
     *     
     */
    public AggregationRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationRequest }
     *     
     */
    public void setRequest(AggregationRequest value) {
        this.request = value;
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
     * Gets the value of the intervalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntervalOffset() {
        return intervalOffset;
    }

    /**
     * Sets the value of the intervalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntervalOffset(Integer value) {
        this.intervalOffset = value;
    }

    /**
     * Gets the value of the intervalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntervalCount() {
        return intervalCount;
    }

    /**
     * Sets the value of the intervalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntervalCount(Integer value) {
        this.intervalCount = value;
    }

}
