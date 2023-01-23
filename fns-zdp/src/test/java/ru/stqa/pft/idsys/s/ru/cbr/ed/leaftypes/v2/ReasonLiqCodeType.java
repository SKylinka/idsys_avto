
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReasonLiqCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReasonLiqCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RQST"/>
 *     &lt;enumeration value="NDFP"/>
 *     &lt;enumeration value="NDPS"/>
 *     &lt;enumeration value="CHNL"/>
 *     &lt;enumeration value="LOWL"/>
 *     &lt;enumeration value="LVLL"/>
 *     &lt;enumeration value="ICLS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReasonLiqCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ReasonLiqCodeType {

    RQST,
    NDFP,
    NDPS,
    CHNL,
    LOWL,
    LVLL,
    ICLS;

    public String value() {
        return name();
    }

    public static ReasonLiqCodeType fromValue(String v) {
        return valueOf(v);
    }

}
