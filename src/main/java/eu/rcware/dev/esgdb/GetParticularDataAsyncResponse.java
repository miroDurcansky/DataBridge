
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.GetParticularDataAsyncResult;

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
 *         &lt;element name="GetParticularDataAsyncResult" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}GetParticularDataAsyncResult" minOccurs="0"/>
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
    "getParticularDataAsyncResult"
})
@XmlRootElement(name = "GetParticularDataAsyncResponse")
public class GetParticularDataAsyncResponse {

    @XmlElement(name = "GetParticularDataAsyncResult")
    protected GetParticularDataAsyncResult getParticularDataAsyncResult;

    /**
     * Gets the value of the getParticularDataAsyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetParticularDataAsyncResult }
     *     
     */
    public GetParticularDataAsyncResult getGetParticularDataAsyncResult() {
        return getParticularDataAsyncResult;
    }

    /**
     * Sets the value of the getParticularDataAsyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetParticularDataAsyncResult }
     *     
     */
    public void setGetParticularDataAsyncResult(GetParticularDataAsyncResult value) {
        this.getParticularDataAsyncResult = value;
    }

}
