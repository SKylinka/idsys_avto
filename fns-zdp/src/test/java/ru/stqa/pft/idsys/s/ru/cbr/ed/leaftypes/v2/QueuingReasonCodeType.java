
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueuingReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueuingReasonCodeType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="QLLQ"/>
 *     &lt;enumeration value="QWFC"/>
 *     &lt;enumeration value="QLSF"/>
 *     &lt;enumeration value="QLSV"/>
 *     &lt;enumeration value="QLIF"/>
 *     &lt;enumeration value="QLIV"/>
 *     &lt;enumeration value="QCLI"/>
 *     &lt;enumeration value="QICL"/>
 *     &lt;enumeration value="QTCL"/>
 *     &lt;enumeration value="QLRS"/>
 *     &lt;enumeration value="QLRW"/>
 *     &lt;enumeration value="QIRS"/>
 *     &lt;enumeration value="QACI"/>
 *     &lt;enumeration value="QCES"/>
 *     &lt;enumeration value="QNET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueuingReasonCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum QueuingReasonCodeType {

    QLLQ,
    QWFC,
    QLSF,
    QLSV,
    QLIF,
    QLIV,
    QCLI,
    QICL,
    QTCL,
    QLRS,
    QLRW,
    QIRS,
    QACI,
    QCES,
    QNET;

    public String value() {
        return name();
    }

    public static QueuingReasonCodeType fromValue(String v) {
        return valueOf(v);
    }

}
