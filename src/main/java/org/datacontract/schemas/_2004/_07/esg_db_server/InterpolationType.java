
package org.datacontract.schemas._2004._07.esg_db_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterpolationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterpolationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MissingBorderDefaultInnerDefault"/>
 *     &lt;enumeration value="MissingBorderDefaultInnerInterpolate"/>
 *     &lt;enumeration value="MissingBorderInterpolateInnerInterpolate"/>
 *     &lt;enumeration value="MissingBorderOmittedInnerOmitted"/>
 *     &lt;enumeration value="MissingBorderCopyInnerCopy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterpolationType")
@XmlEnum
public enum InterpolationType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("MissingBorderDefaultInnerDefault")
    MISSING_BORDER_DEFAULT_INNER_DEFAULT("MissingBorderDefaultInnerDefault"),
    @XmlEnumValue("MissingBorderDefaultInnerInterpolate")
    MISSING_BORDER_DEFAULT_INNER_INTERPOLATE("MissingBorderDefaultInnerInterpolate"),
    @XmlEnumValue("MissingBorderInterpolateInnerInterpolate")
    MISSING_BORDER_INTERPOLATE_INNER_INTERPOLATE("MissingBorderInterpolateInnerInterpolate"),
    @XmlEnumValue("MissingBorderOmittedInnerOmitted")
    MISSING_BORDER_OMITTED_INNER_OMITTED("MissingBorderOmittedInnerOmitted"),
    @XmlEnumValue("MissingBorderCopyInnerCopy")
    MISSING_BORDER_COPY_INNER_COPY("MissingBorderCopyInnerCopy");
    private final String value;

    InterpolationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterpolationType fromValue(String v) {
        for (InterpolationType c: InterpolationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
