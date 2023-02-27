
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoryValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HistoryValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="Blob"/>
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Int64"/>
 *     &lt;enumeration value="NotDefined"/>
 *     &lt;enumeration value="ISODateTime"/>
 *     &lt;enumeration value="Boolean"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HistoryValueType")
@XmlEnum
public enum HistoryValueType {

    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Blob")
    BLOB("Blob"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Int64")
    INT_64("Int64"),
    @XmlEnumValue("NotDefined")
    NOT_DEFINED("NotDefined"),
    @XmlEnumValue("ISODateTime")
    ISO_DATE_TIME("ISODateTime"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean");
    private final String value;

    HistoryValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistoryValueType fromValue(String v) {
        for (HistoryValueType c: HistoryValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
