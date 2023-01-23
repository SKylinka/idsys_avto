
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerfomanceSchemaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerfomanceSchemaType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="AONS"/>
 *     &lt;enumeration value="INDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerfomanceSchemaType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum PerfomanceSchemaType {

    AONS,
    INDS;

    public String value() {
        return name();
    }

    public static PerfomanceSchemaType fromValue(String v) {
        return valueOf(v);
    }

}
