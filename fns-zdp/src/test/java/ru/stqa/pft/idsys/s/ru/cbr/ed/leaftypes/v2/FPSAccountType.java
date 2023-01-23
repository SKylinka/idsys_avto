
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FPSAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FPSAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BBAN"/>
 *     &lt;enumeration value="EPID"/>
 *     &lt;enumeration value="ORID"/>
 *     &lt;enumeration value="TRSA"/>
 *     &lt;enumeration value="OTHA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FPSAccountType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum FPSAccountType {

    BBAN,
    EPID,
    ORID,
    TRSA,
    OTHA;

    public String value() {
        return name();
    }

    public static FPSAccountType fromValue(String v) {
        return valueOf(v);
    }

}
