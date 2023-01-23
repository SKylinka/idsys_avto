
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreateReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARRS"/>
 *     &lt;enumeration value="FNRS"/>
 *     &lt;enumeration value="FNLN"/>
 *     &lt;enumeration value="FNGP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreateReasonCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum CreateReasonCodeType {

    ARRS,
    FNRS,
    FNLN,
    FNGP;

    public String value() {
        return name();
    }

    public static CreateReasonCodeType fromValue(String v) {
        return valueOf(v);
    }

}
