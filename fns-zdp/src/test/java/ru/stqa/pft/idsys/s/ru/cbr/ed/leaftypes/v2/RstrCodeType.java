
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RstrCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RstrCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="URRS"/>
 *     &lt;enumeration value="LWRS"/>
 *     &lt;enumeration value="PSRS"/>
 *     &lt;enumeration value="ESRS"/>
 *     &lt;enumeration value="PDRS"/>
 *     &lt;enumeration value="MRTR"/>
 *     &lt;enumeration value="FPIP"/>
 *     &lt;enumeration value="RSIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RstrCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum RstrCodeType {

    URRS,
    LWRS,
    PSRS,
    ESRS,
    PDRS,
    MRTR,
    FPIP,
    RSIP;

    public String value() {
        return name();
    }

    public static RstrCodeType fromValue(String v) {
        return valueOf(v);
    }

}
