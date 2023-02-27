
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
 *         &lt;element name="ServerAliveResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "serverAliveResult"
})
@XmlRootElement(name = "ServerAliveResponse")
public class ServerAliveResponse {

    @XmlElement(name = "ServerAliveResult")
    protected Boolean serverAliveResult;

    /**
     * Gets the value of the serverAliveResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServerAliveResult() {
        return serverAliveResult;
    }

    /**
     * Sets the value of the serverAliveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServerAliveResult(Boolean value) {
        this.serverAliveResult = value;
    }

}
