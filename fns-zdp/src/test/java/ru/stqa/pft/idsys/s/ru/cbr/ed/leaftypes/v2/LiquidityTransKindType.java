
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiquidityTransKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiquidityTransKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCL"/>
 *     &lt;enumeration value="DECL"/>
 *     &lt;enumeration value="INCP"/>
 *     &lt;enumeration value="DECP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiquidityTransKindType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum LiquidityTransKindType {


    /**
     * Распоряжение на увеличение суммы средств в СБП.
     * 
     */
    INCL,

    /**
     * Распоряжение на уменьшение суммы средств в СБП.
     * 
     */
    DECL,

    /**
     * Увеличение суммы средств, используемых в СБП, по причине выполнения программных процедур ПС БР.
     * 
     */
    INCP,

    /**
     * Уменьшение суммы средств, используемых в СБП, по причине выполнения программных процедур ПС БР.
     * 
     */
    DECP;

    public String value() {
        return name();
    }

    public static LiquidityTransKindType fromValue(String v) {
        return valueOf(v);
    }

}
