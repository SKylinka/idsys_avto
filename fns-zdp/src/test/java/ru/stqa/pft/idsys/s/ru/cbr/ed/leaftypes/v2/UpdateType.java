
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCT"/>
 *     &lt;enumeration value="DECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum UpdateType {

    INCT,
    DECT;

    public String value() {
        return name();
    }

    public static UpdateType fromValue(String v) {
        return valueOf(v);
    }

}
