
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.GetTransformedDataAsyncResult;

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
 *         &lt;element name="GetTransformedDataAsyncResult" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}GetTransformedDataAsyncResult" minOccurs="0"/>
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
    "getTransformedDataAsyncResult"
})
@XmlRootElement(name = "GetTransformedDataAsyncResponse")
public class GetTransformedDataAsyncResponse {

    @XmlElement(name = "GetTransformedDataAsyncResult")
    protected GetTransformedDataAsyncResult getTransformedDataAsyncResult;

    /**
     * Gets the value of the getTransformedDataAsyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransformedDataAsyncResult }
     *     
     */
    public GetTransformedDataAsyncResult getGetTransformedDataAsyncResult() {
        return getTransformedDataAsyncResult;
    }

    /**
     * Sets the value of the getTransformedDataAsyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransformedDataAsyncResult }
     *     
     */
    public void setGetTransformedDataAsyncResult(GetTransformedDataAsyncResult value) {
        this.getTransformedDataAsyncResult = value;
    }

}
