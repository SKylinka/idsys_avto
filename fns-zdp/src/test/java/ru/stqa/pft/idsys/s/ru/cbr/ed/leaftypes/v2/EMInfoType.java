
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INF1"/>
 *     &lt;enumeration value="INF2"/>
 *     &lt;enumeration value="INF3"/>
 *     &lt;enumeration value="INF4"/>
 *     &lt;enumeration value="INF5"/>
 *     &lt;enumeration value="INF6"/>
 *     &lt;enumeration value="INF7"/>
 *     &lt;enumeration value="INF8"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMInfoType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum EMInfoType {

    @XmlEnumValue("INF1")
    INF_1("INF1"),
    @XmlEnumValue("INF2")
    INF_2("INF2"),
    @XmlEnumValue("INF3")
    INF_3("INF3"),
    @XmlEnumValue("INF4")
    INF_4("INF4"),
    @XmlEnumValue("INF5")
    INF_5("INF5"),
    @XmlEnumValue("INF6")
    INF_6("INF6"),
    @XmlEnumValue("INF7")
    INF_7("INF7"),
    @XmlEnumValue("INF8")
    INF_8("INF8");
    private final String value;

    EMInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EMInfoType fromValue(String v) {
        for (EMInfoType c: EMInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
