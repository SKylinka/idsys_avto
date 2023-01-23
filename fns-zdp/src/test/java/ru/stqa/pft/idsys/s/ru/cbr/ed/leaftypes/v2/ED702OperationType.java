
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED702OperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ED702OperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CTPH"/>
 *     &lt;enumeration value="CTRB"/>
 *     &lt;enumeration value="CTRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ED702OperationType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ED702OperationType {

    CTPH,
    CTRB,
    CTRT;

    public String value() {
        return name();
    }

    public static ED702OperationType fromValue(String v) {
        return valueOf(v);
    }

}
