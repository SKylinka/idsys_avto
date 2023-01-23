
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bankruptcy"/>
 *     &lt;enumeration value="BankruptcyMessage"/>
 *     &lt;enumeration value="BankruptcyReport"/>
 *     &lt;enumeration value="SNILS_VALIDITY"/>
 *     &lt;enumeration value="INN_MATCH"/>
 *     &lt;enumeration value="ID_VALIDITY"/>
 *     &lt;enumeration value="CHECKLIST"/>
 *     &lt;enumeration value="ESIA_ACCOUNT"/>
 *     &lt;enumeration value="FNS_GET_INN"/>
 *     &lt;enumeration value="FNS_RESTRICTION"/>
 *     &lt;enumeration value="OMS_MATCH"/>
 *     &lt;enumeration value="FNS_INN_BY_PASSPORT"/>
 *     &lt;enumeration value="FNS_RMSP"/>
 *     &lt;enumeration value="FNS_EGRZAGS"/>
 *     &lt;enumeration value="FNS_SVED_MOBFL"/>
 *     &lt;enumeration value="FNS_SVED_MOBUL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerDataType")
@XmlEnum
public enum CustomerDataType {

    @XmlEnumValue("Bankruptcy")
    BANKRUPTCY("Bankruptcy"),
    @XmlEnumValue("BankruptcyMessage")
    BANKRUPTCY_MESSAGE("BankruptcyMessage"),
    @XmlEnumValue("BankruptcyReport")
    BANKRUPTCY_REPORT("BankruptcyReport"),
    SNILS_VALIDITY("SNILS_VALIDITY"),
    INN_MATCH("INN_MATCH"),
    ID_VALIDITY("ID_VALIDITY"),
    CHECKLIST("CHECKLIST"),
    ESIA_ACCOUNT("ESIA_ACCOUNT"),
    FNS_GET_INN("FNS_GET_INN"),
    FNS_RESTRICTION("FNS_RESTRICTION"),
    OMS_MATCH("OMS_MATCH"),
    FNS_INN_BY_PASSPORT("FNS_INN_BY_PASSPORT"),
    FNS_RMSP("FNS_RMSP"),
    FNS_EGRZAGS("FNS_EGRZAGS"),
    FNS_SVED_MOBFL("FNS_SVED_MOBFL"),
    FNS_SVED_MOBUL("FNS_SVED_MOBUL");
    private final String value;

    CustomerDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerDataType fromValue(String v) {
        for (CustomerDataType c: CustomerDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
