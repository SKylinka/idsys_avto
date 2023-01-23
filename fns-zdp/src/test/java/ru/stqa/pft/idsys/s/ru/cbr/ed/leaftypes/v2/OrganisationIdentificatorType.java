
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationIdentificatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationIdentificatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TXID"/>
 *     &lt;enumeration value="RGRC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganisationIdentificatorType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum OrganisationIdentificatorType {

    TXID,
    RGRC;

    public String value() {
        return name();
    }

    public static OrganisationIdentificatorType fromValue(String v) {
        return valueOf(v);
    }

}
