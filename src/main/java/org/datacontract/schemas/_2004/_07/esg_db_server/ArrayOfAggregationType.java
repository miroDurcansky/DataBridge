
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfAggregationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAggregationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AggregationType" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}AggregationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAggregationType", propOrder = {
    "aggregationType"
})
public class ArrayOfAggregationType {

    @XmlElement(name = "AggregationType")
    @XmlSchemaType(name = "string")
    protected List<AggregationType> aggregationType;

    /**
     * Gets the value of the aggregationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregationType }
     * 
     * 
     */
    public List<AggregationType> getAggregationType() {
        if (aggregationType == null) {
            aggregationType = new ArrayList<AggregationType>();
        }
        return this.aggregationType;
    }

}
