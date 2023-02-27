
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfVAg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVAg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VAg" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}VAg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAg", propOrder = {
    "vAg"
})
public class ArrayOfVAg {

    @XmlElement(name = "VAg")
    protected List<VAg> vAg;

    /**
     * Gets the value of the vAg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vAg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVAg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VAg }
     * 
     * 
     */
    public List<VAg> getVAg() {
        if (vAg == null) {
            vAg = new ArrayList<VAg>();
        }
        return this.vAg;
    }

}
