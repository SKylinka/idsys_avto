
package ru.stqa.pft.idsys.s.ru.roskazna.xsd.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeCard_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeCard_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="Amex"/>
 *     &lt;enumeration value="Switch"/>
 *     &lt;enumeration value="Solo"/>
 *     &lt;enumeration value="Maestro"/>
 *     &lt;enumeration value="EWallet"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeCard_Type")
@XmlEnum
public enum TypeCardType {

    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("Amex")
    AMEX("Amex"),
    @XmlEnumValue("Switch")
    SWITCH("Switch"),
    @XmlEnumValue("Solo")
    SOLO("Solo"),
    @XmlEnumValue("Maestro")
    MAESTRO("Maestro"),
    @XmlEnumValue("EWallet")
    E_WALLET("EWallet"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCardType fromValue(String v) {
        for (TypeCardType c: TypeCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
