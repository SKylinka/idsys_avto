
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED702PersonIdentificatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ED702PersonIdentificatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TXID"/>
 *     &lt;enumeration value="PSID"/>
 *     &lt;enumeration value="FPID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ED702PersonIdentificatorType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ED702PersonIdentificatorType {

    TXID,
    PSID,
    FPID;

    public String value() {
        return name();
    }

    public static ED702PersonIdentificatorType fromValue(String v) {
        return valueOf(v);
    }

}
