
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationTextType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="AAAC"/>
 *     &lt;enumeration value="APAC"/>
 *     &lt;enumeration value="CHNG"/>
 *     &lt;enumeration value="CWAC"/>
 *     &lt;enumeration value="NSRE"/>
 *     &lt;enumeration value="NSRP"/>
 *     &lt;enumeration value="FORE"/>
 *     &lt;enumeration value="OTAE"/>
 *     &lt;enumeration value="OTAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationTextType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum OperationTextType {

    AAAC,
    APAC,
    CHNG,
    CWAC,
    NSRE,
    NSRP,
    FORE,
    OTAE,
    OTAP;

    public String value() {
        return name();
    }

    public static OperationTextType fromValue(String v) {
        return valueOf(v);
    }

}
