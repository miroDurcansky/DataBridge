
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.ArrayOfVariableDescription;

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
 *         &lt;element name="GetAllVariablesResult" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfVariableDescription" minOccurs="0"/>
 *         &lt;element name="moreDataAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "getAllVariablesResult",
    "moreDataAvailable"
})
@XmlRootElement(name = "GetAllVariablesResponse")
public class GetAllVariablesResponse {

    @XmlElementRef(name = "GetAllVariablesResult", namespace = "http://dev.rcware.eu/esgdb", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVariableDescription> getAllVariablesResult;
    protected Boolean moreDataAvailable;

    /**
     * Gets the value of the getAllVariablesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVariableDescription }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVariableDescription> getGetAllVariablesResult() {
        return getAllVariablesResult;
    }

    /**
     * Sets the value of the getAllVariablesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVariableDescription }{@code >}
     *     
     */
    public void setGetAllVariablesResult(JAXBElement<ArrayOfVariableDescription> value) {
        this.getAllVariablesResult = value;
    }

    /**
     * Gets the value of the moreDataAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreDataAvailable() {
        return moreDataAvailable;
    }

    /**
     * Sets the value of the moreDataAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreDataAvailable(Boolean value) {
        this.moreDataAvailable = value;
    }

}
