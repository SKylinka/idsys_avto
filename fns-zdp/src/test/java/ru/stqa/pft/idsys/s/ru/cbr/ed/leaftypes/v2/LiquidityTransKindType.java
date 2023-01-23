
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
     * ������������ �� ���������� ����� ������� � ���.
     * 
     */
    INCL,

    /**
     * ������������ �� ���������� ����� ������� � ���.
     * 
     */
    DECL,

    /**
     * ���������� ����� �������, ������������ � ���, �� ������� ���������� ����������� �������� �� ��.
     * 
     */
    INCP,

    /**
     * ���������� ����� �������, ������������ � ���, �� ������� ���������� ����������� �������� �� ��.
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