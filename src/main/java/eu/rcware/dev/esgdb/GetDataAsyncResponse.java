
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.GetDataAsyncResult;

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
 *         &lt;element name="GetDataAsyncResult" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}GetDataAsyncResult" minOccurs="0"/>
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
    "getDataAsyncResult"
})
@XmlRootElement(name = "GetDataAsyncResponse")
public class GetDataAsyncResponse {

    @XmlElement(name = "GetDataAsyncResult")
    protected GetDataAsyncResult getDataAsyncResult;

    /**
     * Gets the value of the getDataAsyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDataAsyncResult }
     *     
     */
    public GetDataAsyncResult getGetDataAsyncResult() {
        return getDataAsyncResult;
    }

    /**
     * Sets the value of the getDataAsyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDataAsyncResult }
     *     
     */
    public void setGetDataAsyncResult(GetDataAsyncResult value) {
        this.getDataAsyncResult = value;
    }

}
