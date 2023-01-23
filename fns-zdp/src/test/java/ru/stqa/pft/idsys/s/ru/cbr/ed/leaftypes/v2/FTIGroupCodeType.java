
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FTIGroupCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FTIGroupCodeType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="CND1"/>
 *     &lt;enumeration value="CND2"/>
 *     &lt;enumeration value="INTR"/>
 *     &lt;enumeration value="QWRH"/>
 *     &lt;enumeration value="QWAP"/>
 *     &lt;enumeration value="QSPC"/>
 *     &lt;enumeration value="QWCH"/>
 *     &lt;enumeration value="QWEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FTIGroupCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum FTIGroupCodeType {

    @XmlEnumValue("CND1")
    CND_1("CND1"),
    @XmlEnumValue("CND2")
    CND_2("CND2"),
    INTR("INTR"),
    QWRH("QWRH"),
    QWAP("QWAP"),
    QSPC("QSPC"),
    QWCH("QWCH"),
    QWEC("QWEC");
    private final String value;

    FTIGroupCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FTIGroupCodeType fromValue(String v) {
        for (FTIGroupCodeType c: FTIGroupCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
