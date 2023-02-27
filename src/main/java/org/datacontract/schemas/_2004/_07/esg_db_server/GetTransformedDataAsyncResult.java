
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GetTransformedDataAsyncResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransformedDataAsyncResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfVAg" minOccurs="0"/>
 *         &lt;element name="NextIntervalOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NextVariableOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransformedDataAsyncResult", propOrder = {
    "data",
    "nextIntervalOffset",
    "nextVariableOffset",
    "returnCode"
})
public class GetTransformedDataAsyncResult {

    @XmlElementRef(name = "Data", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVAg> data;
    @XmlElement(name = "NextIntervalOffset")
    protected Integer nextIntervalOffset;
    @XmlElement(name = "NextVariableOffset")
    protected Integer nextVariableOffset;
    @XmlElementRef(name = "ReturnCode", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnCode;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVAg }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVAg> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVAg }{@code >}
     *     
     */
    public void setData(JAXBElement<ArrayOfVAg> value) {
        this.data = value;
    }

    /**
     * Gets the value of the nextIntervalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNextIntervalOffset() {
        return nextIntervalOffset;
    }

    /**
     * Sets the value of the nextIntervalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNextIntervalOffset(Integer value) {
        this.nextIntervalOffset = value;
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
