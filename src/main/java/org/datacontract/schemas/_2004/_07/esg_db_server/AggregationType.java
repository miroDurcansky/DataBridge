
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AggregationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Min"/>
 *     &lt;enumeration value="Max"/>
 *     &lt;enumeration value="Sum"/>
 *     &lt;enumeration value="Avg"/>
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Last"/>
 *     &lt;enumeration value="Median"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AggregationType")
@XmlEnum
public enum AggregationType {

    @XmlEnumValue("Min")
    MIN("Min"),
    @XmlEnumValue("Max")
    MAX("Max"),
    @XmlEnumValue("Sum")
    SUM("Sum"),
    @XmlEnumValue("Avg")
    AVG("Avg"),
    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Last")
    LAST("Last"),
    @XmlEnumValue("Median")
    MEDIAN("Median");
    private final String value;

    AggregationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggregationType fromValue(String v) {
        for (AggregationType c: AggregationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
