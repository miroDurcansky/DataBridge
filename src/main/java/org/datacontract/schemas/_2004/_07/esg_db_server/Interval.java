
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Interval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Avg" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}Tp" minOccurs="0"/>
 *         &lt;element name="B" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="E" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="First" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}Tp" minOccurs="0"/>
 *         &lt;element name="Last" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}Tp" minOccurs="0"/>
 *         &lt;element name="Max" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}Tp" minOccurs="0"/>
 *         &lt;element name="Med" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}Tp" minOccurs="0"/>
 *         &lt;element name="Min" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}Tp" minOccurs="0"/>
 *         &lt;element name="Q" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sum" type="{http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared}Tp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interval", propOrder = {
    "avg",
    "b",
    "e",
    "f",
    "first",
    "last",
    "max",
    "med",
    "min",
    "q",
    "sum"
})
public class Interval {

    @XmlElementRef(name = "Avg", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Tp> avg;
    @XmlElement(name = "B")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar b;
    @XmlElement(name = "E")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar e;
    @XmlElement(name = "F")
    protected Integer f;
    @XmlElementRef(name = "First", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Tp> first;
    @XmlElementRef(name = "Last", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Tp> last;
    @XmlElementRef(name = "Max", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Tp> max;
    @XmlElementRef(name = "Med", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Tp> med;
    @XmlElementRef(name = "Min", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Tp> min;
    @XmlElement(name = "Q")
    protected Double q;
    @XmlElementRef(name = "Sum", namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", type = JAXBElement.class, required = false)
    protected JAXBElement<Tp> sum;

    /**
     * Gets the value of the avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public JAXBElement<Tp> getAvg() {
        return avg;
    }

    /**
     * Sets the value of the avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public void setAvg(JAXBElement<Tp> value) {
        this.avg = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setB(XMLGregorianCalendar value) {
        this.b = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setE(XMLGregorianCalendar value) {
        this.e = value;
    }

    /**
     * Gets the value of the f property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setF(Integer value) {
        this.f = value;
    }

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public JAXBElement<Tp> getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public void setFirst(JAXBElement<Tp> value) {
        this.first = value;
    }

    /**
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public JAXBElement<Tp> getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public void setLast(JAXBElement<Tp> value) {
        this.last = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public JAXBElement<Tp> getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public void setMax(JAXBElement<Tp> value) {
        this.max = value;
    }

    /**
     * Gets the value of the med property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public JAXBElement<Tp> getMed() {
        return med;
    }

    /**
     * Sets the value of the med property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public void setMed(JAXBElement<Tp> value) {
        this.med = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public JAXBElement<Tp> getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public void setMin(JAXBElement<Tp> value) {
        this.min = value;
    }

    /**
     * Gets the value of the q property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQ() {
        return q;
    }

    /**
     * Sets the value of the q property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQ(Double value) {
        this.q = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public JAXBElement<Tp> getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Tp }{@code >}
     *     
     */
    public void setSum(JAXBElement<Tp> value) {
        this.sum = value;
    }

}
