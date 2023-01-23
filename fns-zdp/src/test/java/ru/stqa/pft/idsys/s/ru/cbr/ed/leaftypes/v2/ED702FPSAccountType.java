
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED702FPSAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ED702FPSAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BBAN"/>
 *     &lt;enumeration value="ORID"/>
 *     &lt;enumeration value="IBAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ED702FPSAccountType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ED702FPSAccountType {

    BBAN,
    ORID,
    IBAN;

    public String value() {
        return name();
    }

    public static ED702FPSAccountType fromValue(String v) {
        return valueOf(v);
    }

}
