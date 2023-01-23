
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LimitType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="FIPL"/>
 *     &lt;enumeration value="FPML"/>
 *     &lt;enumeration value="ICLL"/>
 *     &lt;enumeration value="IOCL"/>
 *     &lt;enumeration value="IPCL"/>
 *     &lt;enumeration value="NURL"/>
 *     &lt;enumeration value="TCLL"/>
 *     &lt;enumeration value="URGL"/>
 *     &lt;enumeration value="VIPL"/>
 *     &lt;enumeration value="VPML"/>
 *     &lt;enumeration value="IPIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LimitType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum LimitType {

    FIPL,
    FPML,
    ICLL,
    IOCL,
    IPCL,
    NURL,
    TCLL,
    URGL,
    VIPL,
    VPML,
    IPIL;

    public String value() {
        return name();
    }

    public static LimitType fromValue(String v) {
        return valueOf(v);
    }

}
