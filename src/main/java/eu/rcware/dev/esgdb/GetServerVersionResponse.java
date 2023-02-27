
package eu.rcware.dev.esgdb;

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
 *         &lt;element name="GetServerVersionResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "getServerVersionResult"
})
@XmlRootElement(name = "GetServerVersionResponse")
public class GetServerVersionResponse {

    @XmlElement(name = "GetServerVersionResult")
    protected Integer getServerVersionResult;

    /**
     * Gets the value of the getServerVersionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetServerVersionResult() {
        return getServerVersionResult;
    }

    /**
     * Sets the value of the getServerVersionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetServerVersionResult(Integer value) {
        this.getServerVersionResult = value;
    }

}
