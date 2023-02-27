
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.ArrayOfMvr;

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
 *         &lt;element name="GetDataResult" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfMvr" minOccurs="0"/>
 *         &lt;element name="nextVariableOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nextValueOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDataResult",
    "nextVariableOffset",
    "nextValueOffset",
    "returnCode"
})
@XmlRootElement(name = "GetDataResponse")
public class GetDataResponse {

    @XmlElementRef(name = "GetDataResult", namespace = "http://dev.rcware.eu/esgdb", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMvr> getDataResult;
    protected Integer nextVariableOffset;
    protected Integer nextValueOffset;
    @XmlElementRef(name = "returnCode", namespace = "http://dev.rcware.eu/esgdb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnCode;

    /**
     * Gets the value of the getDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMvr }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMvr> getGetDataResult() {
        return getDataResult;
    }

    /**
     * Sets the value of the getDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMvr }{@code >}
     *     
     */
    public void setGetDataResult(JAXBElement<ArrayOfMvr> value) {
        this.getDataResult = value;
    }

    /**
     * Gets the value of the nextVariableOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNextVariableOffset() {
        return nextVariableOffset;
    }

    /**
     * Sets the value of the nextVariableOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNextVariableOffset(Integer value) {
        this.nextVariableOffset = value;
    }

    /**
     * Gets the value of the nextValueOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNextValueOffset() {
        return nextValueOffset;
    }

    /**
     * Sets the value of the nextValueOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNextValueOffset(Integer value) {
        this.nextValueOffset = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnCode(JAXBElement<String> value) {
        this.returnCode = value;
    }

}
