
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENLL"/>
 *     &lt;enumeration value="OFFS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum DirectionType {

    ENLL,
    OFFS;

    public String value() {
        return name();
    }

    public static DirectionType fromValue(String v) {
        return valueOf(v);
    }

}
