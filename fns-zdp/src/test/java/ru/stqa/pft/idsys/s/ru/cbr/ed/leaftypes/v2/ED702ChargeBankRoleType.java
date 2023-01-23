
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED702ChargeBankRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ED702ChargeBankRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CH01"/>
 *     &lt;enumeration value="CH02"/>
 *     &lt;enumeration value="CH03"/>
 *     &lt;enumeration value="CH04"/>
 *     &lt;enumeration value="CH05"/>
 *     &lt;enumeration value="CH06"/>
 *     &lt;enumeration value="CH07"/>
 *     &lt;enumeration value="CH08"/>
 *     &lt;enumeration value="CH09"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ED702ChargeBankRoleType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ED702ChargeBankRoleType {

    @XmlEnumValue("CH01")
    CH_01("CH01"),
    @XmlEnumValue("CH02")
    CH_02("CH02"),
    @XmlEnumValue("CH03")
    CH_03("CH03"),
    @XmlEnumValue("CH04")
    CH_04("CH04"),
    @XmlEnumValue("CH05")
    CH_05("CH05"),
    @XmlEnumValue("CH06")
    CH_06("CH06"),
    @XmlEnumValue("CH07")
    CH_07("CH07"),
    @XmlEnumValue("CH08")
    CH_08("CH08"),
    @XmlEnumValue("CH09")
    CH_09("CH09");
    private final String value;

    ED702ChargeBankRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ED702ChargeBankRoleType fromValue(String v) {
        for (ED702ChargeBankRoleType c: ED702ChargeBankRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
