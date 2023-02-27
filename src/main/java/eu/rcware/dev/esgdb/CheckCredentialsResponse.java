
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
 *         &lt;element name="CheckCredentialsResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "checkCredentialsResult"
})
@XmlRootElement(name = "CheckCredentialsResponse")
public class CheckCredentialsResponse {

    @XmlElement(name = "CheckCredentialsResult")
    protected Boolean checkCredentialsResult;

    /**
     * Gets the value of the checkCredentialsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckCredentialsResult() {
        return checkCredentialsResult;
    }

    /**
     * Sets the value of the checkCredentialsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckCredentialsResult(Boolean value) {
        this.checkCredentialsResult = value;
    }

}
