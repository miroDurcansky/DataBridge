
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.ArrayOfVariableDescription;
import org.datacontract.schemas._2004._07.esg_db_server.Credentials;

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
 *         &lt;element name="credentials" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}Credentials" minOccurs="0"/>
 *         &lt;element name="variables" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}ArrayOfVariableDescription" minOccurs="0"/>
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
    "credentials",
    "variables"
})
@XmlRootElement(name = "EnsureVariables")
public class EnsureVariables {

    protected Credentials credentials;
    @XmlElementRef(name = "variables", namespace = "http://dev.rcware.eu/esgdb", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVariableDescription> variables;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVariableDescription }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVariableDescription> getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVariableDescription }{@code >}
     *     
     */
    public void setVariables(JAXBElement<ArrayOfVariableDescription> value) {
        this.variables = value;
    }

}
