
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.GetVariableStatsAsyncResult;

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
 *         &lt;element name="GetVariableStatsAsyncResult" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}GetVariableStatsAsyncResult" minOccurs="0"/>
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
    "getVariableStatsAsyncResult"
})
@XmlRootElement(name = "GetVariableStatsAsyncResponse")
public class GetVariableStatsAsyncResponse {

    @XmlElement(name = "GetVariableStatsAsyncResult")
    protected GetVariableStatsAsyncResult getVariableStatsAsyncResult;

    /**
     * Gets the value of the getVariableStatsAsyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetVariableStatsAsyncResult }
     *     
     */
    public GetVariableStatsAsyncResult getGetVariableStatsAsyncResult() {
        return getVariableStatsAsyncResult;
    }

    /**
     * Sets the value of the getVariableStatsAsyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVariableStatsAsyncResult }
     *     
     */
    public void setGetVariableStatsAsyncResult(GetVariableStatsAsyncResult value) {
        this.getVariableStatsAsyncResult = value;
    }

}
