
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTD"/>
 *     &lt;enumeration value="EXTD"/>
 *     &lt;enumeration value="RJCT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatusCode", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum OrderStatusCode {

    ACTD,
    EXTD,
    RJCT;

    public String value() {
        return name();
    }

    public static OrderStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
