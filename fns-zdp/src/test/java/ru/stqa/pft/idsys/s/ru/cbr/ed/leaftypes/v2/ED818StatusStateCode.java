
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED818StatusStateCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ED818StatusStateCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PSSD"/>
 *     &lt;enumeration value="RJCT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ED818StatusStateCode", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ED818StatusStateCode {

    PSSD,
    RJCT;

    public String value() {
        return name();
    }

    public static ED818StatusStateCode fromValue(String v) {
        return valueOf(v);
    }

}
