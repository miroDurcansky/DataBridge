
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticularDataSpecification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticularDataSpecification">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MinTimestamp"/>
 *     &lt;enumeration value="MaxTimestamp"/>
 *     &lt;enumeration value="FirstLessThanReferenceDateTime"/>
 *     &lt;enumeration value="FirstLessThanOrEqualThanReferenceTime"/>
 *     &lt;enumeration value="FirstGreaterThanReferenceDateTime"/>
 *     &lt;enumeration value="FirstGreaterThanOrEqualThanReferenceTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticularDataSpecification")
@XmlEnum
public enum ParticularDataSpecification {

    @XmlEnumValue("MinTimestamp")
    MIN_TIMESTAMP("MinTimestamp"),
    @XmlEnumValue("MaxTimestamp")
    MAX_TIMESTAMP("MaxTimestamp"),
    @XmlEnumValue("FirstLessThanReferenceDateTime")
    FIRST_LESS_THAN_REFERENCE_DATE_TIME("FirstLessThanReferenceDateTime"),
    @XmlEnumValue("FirstLessThanOrEqualThanReferenceTime")
    FIRST_LESS_THAN_OR_EQUAL_THAN_REFERENCE_TIME("FirstLessThanOrEqualThanReferenceTime"),
    @XmlEnumValue("FirstGreaterThanReferenceDateTime")
    FIRST_GREATER_THAN_REFERENCE_DATE_TIME("FirstGreaterThanReferenceDateTime"),
    @XmlEnumValue("FirstGreaterThanOrEqualThanReferenceTime")
    FIRST_GREATER_THAN_OR_EQUAL_THAN_REFERENCE_TIME("FirstGreaterThanOrEqualThanReferenceTime");
    private final String value;

    ParticularDataSpecification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParticularDataSpecification fromValue(String v) {
        for (ParticularDataSpecification c: ParticularDataSpecification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
