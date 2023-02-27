
package eu.rcware.dev.esgdb;

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
 *         &lt;element name="variableKeys" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfArrayOfKeyValuePair" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "offset",
    "count"
})
@XmlRootElement(name = "GetVariableStatsAsync")
public class GetVariableStatsAsync {

    protected Credentials credentials;
    @XmlElementRef(name = "variableKeys", namespace = "http://dev.rcware.eu/esgdb", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfArrayOfKeyValuePair> variableKeys;
    protected Integer offset;
    protected Integer count;

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
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

}
