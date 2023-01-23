
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.esia._2015._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DescType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="digits_asc"/>
 *     &lt;enumeration value="digits_desc"/>
 *     &lt;enumeration value="digits_random"/>
 *     &lt;enumeration value="text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DescType")
@XmlEnum
public enum DescType {

    @XmlEnumValue("digits_asc")
    DIGITS_ASC("digits_asc"),
    @XmlEnumValue("digits_desc")
    DIGITS_DESC("digits_desc"),
    @XmlEnumValue("digits_random")
    DIGITS_RANDOM("digits_random"),
    @XmlEnumValue("text")
    TEXT("text");
    private final String value;

    DescType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DescType fromValue(String v) {
        for (DescType c: DescType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
