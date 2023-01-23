
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemittedAmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemittedAmountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCM"/>
 *     &lt;enumeration value="WRTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemittedAmountType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum RemittedAmountType {

    INCM,
    WRTO;

    public String value() {
        return name();
    }

    public static RemittedAmountType fromValue(String v) {
        return valueOf(v);
    }

}
