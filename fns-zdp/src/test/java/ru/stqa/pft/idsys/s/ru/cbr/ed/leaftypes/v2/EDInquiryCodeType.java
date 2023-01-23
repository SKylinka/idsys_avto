
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDInquiryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EDInquiryCodeType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="RSTS"/>
 *     &lt;enumeration value="RCPY"/>
 *     &lt;enumeration value="RSPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EDInquiryCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum EDInquiryCodeType {

    RSTS,
    RCPY,
    RSPC;

    public String value() {
        return name();
    }

    public static EDInquiryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
