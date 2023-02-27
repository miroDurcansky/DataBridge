
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.EnsureVariablesResult;

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
 *         &lt;element name="EnsureVariablesResult" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}EnsureVariablesResult" minOccurs="0"/>
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
    "ensureVariablesResult"
})
@XmlRootElement(name = "EnsureVariablesResponse")
public class EnsureVariablesResponse {

    @XmlElement(name = "EnsureVariablesResult")
    protected EnsureVariablesResult ensureVariablesResult;

    /**
     * Gets the value of the ensureVariablesResult property.
     * 
     * @return
     *     possible object is
     *     {@link EnsureVariablesResult }
     *     
     */
    public EnsureVariablesResult getEnsureVariablesResult() {
        return ensureVariablesResult;
    }

    /**
     * Sets the value of the ensureVariablesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnsureVariablesResult }
     *     
     */
    public void setEnsureVariablesResult(EnsureVariablesResult value) {
        this.ensureVariablesResult = value;
    }

}
