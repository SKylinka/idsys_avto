
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccRstrCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccRstrCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLRS"/>
 *     &lt;enumeration value="LMRS"/>
 *     &lt;enumeration value="URRS"/>
 *     &lt;enumeration value="PSRS"/>
 *     &lt;enumeration value="ESRS"/>
 *     &lt;enumeration value="SCRS"/>
 *     &lt;enumeration value="MVRS"/>
 *     &lt;enumeration value="RTRS"/>
 *     &lt;enumeration value="FPRS"/>
 *     &lt;enumeration value="LSRS"/>
 *     &lt;enumeration value="QPRS"/>
 *     &lt;enumeration value="FWRS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccRstrCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum AccRstrCodeType {

    CLRS,
    LMRS,
    URRS,
    PSRS,
    ESRS,
    SCRS,
    MVRS,
    RTRS,
    FPRS,
    LSRS,
    QPRS,
    FWRS;

    public String value() {
        return name();
    }

    public static AccRstrCodeType fromValue(String v) {
        return valueOf(v);
    }

}
