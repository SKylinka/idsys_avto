
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.id_sys.schemas.idbank.common._2012._0.Errors;
import ru.id_sys.schemas.idbank.common._2012._0.FioType;
import ru.id_sys.schemas.idbank.common._2012._0.Message;
import ru.id_sys.schemas.idbank.common._2012._0.ObjectStatus;


/**
 * Ответ на запрос сведений о клиентах
 * 
 * <p>Java class for LookupCustomersRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookupCustomersRs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Message">
 *       &lt;sequence>
 *         &lt;element name="CustomersData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerData" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
 *                           &lt;sequence>
 *                             &lt;element name="BankruptcyLookupResults" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
 *                                     &lt;sequence>
 *                                       &lt;element name="BankruptcyData" type="{http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/}BankruptcyData" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SNILSCheckResults" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus" minOccurs="0"/>
 *                             &lt;element name="INNMatchResults" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
 *                                     &lt;sequence>
 *                                       &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OMSMatchResults" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
 *                                     &lt;sequence>
 *                                       &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AccountData" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="esiaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Matches">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="TypeOfConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BiomStu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RestrictionCheckResult" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;choice>
 *                                         &lt;element name="NameOfOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                         &lt;element name="FIO" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}FioType" minOccurs="0"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="CodeNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="BIK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="DateOfReceiveInFederalDB" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="INNbyFIO" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
 *                                     &lt;choice>
 *                                       &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/choice>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RMSPLookupResult" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
 *                                     &lt;choice>
 *                                       &lt;element name="RMSPData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *                                       &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/choice>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="EGRZAGSResult" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ActNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ActDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="DeathCertificate" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DCSeries" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="DCNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="DCDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ConfirmingDeathDoc" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DocCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="DocSeriesNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="EGRZAGSFullAnswer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *                                       &lt;element name="StatusResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BLOB" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Errors" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Errors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupCustomersRs", propOrder = {
    "customersData",
    "errors"
})
public class LookupCustomersRs
    extends Message
{

    @XmlElement(name = "CustomersData")
    protected LookupCustomersRs.CustomersData customersData;
    @XmlElement(name = "Errors")
    protected Errors errors;

    /**
     * Gets the value of the customersData property.
     * 
     * @return
     *     possible object is
     *     {@link LookupCustomersRs.CustomersData }
     *     
     */
    public LookupCustomersRs.CustomersData getCustomersData() {
        return customersData;
    }

    /**
     * Sets the value of the customersData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupCustomersRs.CustomersData }
     *     
     */
    public void setCustomersData(LookupCustomersRs.CustomersData value) {
        this.customersData = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CustomerData" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
     *                 &lt;sequence>
     *                   &lt;element name="BankruptcyLookupResults" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
     *                           &lt;sequence>
     *                             &lt;element name="BankruptcyData" type="{http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/}BankruptcyData" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SNILSCheckResults" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus" minOccurs="0"/>
     *                   &lt;element name="INNMatchResults" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
     *                           &lt;sequence>
     *                             &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OMSMatchResults" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
     *                           &lt;sequence>
     *                             &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AccountData" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="esiaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Matches">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="TypeOfConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BiomStu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RestrictionCheckResult" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;choice>
     *                               &lt;element name="NameOfOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                               &lt;element name="FIO" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}FioType" minOccurs="0"/>
     *                             &lt;/choice>
     *                             &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="CodeNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="BIK" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="DateOfReceiveInFederalDB" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="INNbyFIO" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
     *                           &lt;choice>
     *                             &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/choice>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RMSPLookupResult" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
     *                           &lt;choice>
     *                             &lt;element name="RMSPData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
     *                             &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/choice>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="EGRZAGSResult" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ActNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ActDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="DeathCertificate" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DCSeries" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="DCNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="DCDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ConfirmingDeathDoc" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DocCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="DocSeriesNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="EGRZAGSFullAnswer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
     *                             &lt;element name="StatusResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BLOB" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerData"
    })
    public static class CustomersData {

        @XmlElement(name = "CustomerData", required = true)
        protected List<LookupCustomersRs.CustomersData.CustomerData> customerData;

        /**
         * Gets the value of the customerData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LookupCustomersRs.CustomersData.CustomerData }
         * 
         * 
         */
        public List<LookupCustomersRs.CustomersData.CustomerData> getCustomerData() {
            if (customerData == null) {
                customerData = new ArrayList<LookupCustomersRs.CustomersData.CustomerData>();
            }
            return this.customerData;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
         *       &lt;sequence>
         *         &lt;element name="BankruptcyLookupResults" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
         *                 &lt;sequence>
         *                   &lt;element name="BankruptcyData" type="{http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/}BankruptcyData" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SNILSCheckResults" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus" minOccurs="0"/>
         *         &lt;element name="INNMatchResults" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
         *                 &lt;sequence>
         *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OMSMatchResults" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
         *                 &lt;sequence>
         *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AccountData" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="esiaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Matches">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="TypeOfConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BiomStu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RestrictionCheckResult" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;choice>
         *                     &lt;element name="NameOfOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                     &lt;element name="FIO" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}FioType" minOccurs="0"/>
         *                   &lt;/choice>
         *                   &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="CodeNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="BIK" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="DateOfReceiveInFederalDB" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="INNbyFIO" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
         *                 &lt;choice>
         *                   &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/choice>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RMSPLookupResult" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
         *                 &lt;choice>
         *                   &lt;element name="RMSPData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
         *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/choice>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="EGRZAGSResult" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ActNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ActDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="DeathCertificate" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DCSeries" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="DCNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="DCDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ConfirmingDeathDoc" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DocCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="DocSeriesNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="EGRZAGSFullAnswer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
         *                   &lt;element name="StatusResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BLOB" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bankruptcyLookupResults",
            "snilsCheckResults",
            "innMatchResults",
            "omsMatchResults",
            "accountData",
            "restrictionCheckResult",
            "inNbyFIO",
            "rmspLookupResult",
            "egrzagsResult",
            "blob"
        })
        public static class CustomerData
            extends ObjectStatus
        {

            @XmlElement(name = "BankruptcyLookupResults")
            protected LookupCustomersRs.CustomersData.CustomerData.BankruptcyLookupResults bankruptcyLookupResults;
            @XmlElement(name = "SNILSCheckResults")
            protected ObjectStatus snilsCheckResults;
            @XmlElement(name = "INNMatchResults")
            protected LookupCustomersRs.CustomersData.CustomerData.INNMatchResults innMatchResults;
            @XmlElement(name = "OMSMatchResults")
            protected LookupCustomersRs.CustomersData.CustomerData.OMSMatchResults omsMatchResults;
            @XmlElement(name = "AccountData")
            protected List<LookupCustomersRs.CustomersData.CustomerData.AccountData> accountData;
            @XmlElement(name = "RestrictionCheckResult")
            protected LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult restrictionCheckResult;
            @XmlElement(name = "INNbyFIO")
            protected LookupCustomersRs.CustomersData.CustomerData.INNbyFIO inNbyFIO;
            @XmlElement(name = "RMSPLookupResult")
            protected LookupCustomersRs.CustomersData.CustomerData.RMSPLookupResult rmspLookupResult;
            @XmlElement(name = "EGRZAGSResult")
            protected LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult egrzagsResult;
            @XmlElement(name = "BLOB")
            protected List<byte[]> blob;

            /**
             * Gets the value of the bankruptcyLookupResults property.
             * 
             * @return
             *     possible object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.BankruptcyLookupResults }
             *     
             */
            public LookupCustomersRs.CustomersData.CustomerData.BankruptcyLookupResults getBankruptcyLookupResults() {
                return bankruptcyLookupResults;
            }

            /**
             * Sets the value of the bankruptcyLookupResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.BankruptcyLookupResults }
             *     
             */
            public void setBankruptcyLookupResults(LookupCustomersRs.CustomersData.CustomerData.BankruptcyLookupResults value) {
                this.bankruptcyLookupResults = value;
            }

            /**
             * Gets the value of the snilsCheckResults property.
             * 
             * @return
             *     possible object is
             *     {@link ObjectStatus }
             *     
             */
            public ObjectStatus getSNILSCheckResults() {
                return snilsCheckResults;
            }

            /**
             * Sets the value of the snilsCheckResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectStatus }
             *     
             */
            public void setSNILSCheckResults(ObjectStatus value) {
                this.snilsCheckResults = value;
            }

            /**
             * Gets the value of the innMatchResults property.
             * 
             * @return
             *     possible object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.INNMatchResults }
             *     
             */
            public LookupCustomersRs.CustomersData.CustomerData.INNMatchResults getINNMatchResults() {
                return innMatchResults;
            }

            /**
             * Sets the value of the innMatchResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.INNMatchResults }
             *     
             */
            public void setINNMatchResults(LookupCustomersRs.CustomersData.CustomerData.INNMatchResults value) {
                this.innMatchResults = value;
            }

            /**
             * Gets the value of the omsMatchResults property.
             * 
             * @return
             *     possible object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.OMSMatchResults }
             *     
             */
            public LookupCustomersRs.CustomersData.CustomerData.OMSMatchResults getOMSMatchResults() {
                return omsMatchResults;
            }

            /**
             * Sets the value of the omsMatchResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.OMSMatchResults }
             *     
             */
            public void setOMSMatchResults(LookupCustomersRs.CustomersData.CustomerData.OMSMatchResults value) {
                this.omsMatchResults = value;
            }

            /**
             * Gets the value of the accountData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accountData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccountData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LookupCustomersRs.CustomersData.CustomerData.AccountData }
             * 
             * 
             */
            public List<LookupCustomersRs.CustomersData.CustomerData.AccountData> getAccountData() {
                if (accountData == null) {
                    accountData = new ArrayList<LookupCustomersRs.CustomersData.CustomerData.AccountData>();
                }
                return this.accountData;
            }

            /**
             * Gets the value of the restrictionCheckResult property.
             * 
             * @return
             *     possible object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult }
             *     
             */
            public LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult getRestrictionCheckResult() {
                return restrictionCheckResult;
            }

            /**
             * Sets the value of the restrictionCheckResult property.
             * 
             * @param value
             *     allowed object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult }
             *     
             */
            public void setRestrictionCheckResult(LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult value) {
                this.restrictionCheckResult = value;
            }

            /**
             * Gets the value of the inNbyFIO property.
             * 
             * @return
             *     possible object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.INNbyFIO }
             *     
             */
            public LookupCustomersRs.CustomersData.CustomerData.INNbyFIO getINNbyFIO() {
                return inNbyFIO;
            }

            /**
             * Sets the value of the inNbyFIO property.
             * 
             * @param value
             *     allowed object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.INNbyFIO }
             *     
             */
            public void setINNbyFIO(LookupCustomersRs.CustomersData.CustomerData.INNbyFIO value) {
                this.inNbyFIO = value;
            }

            /**
             * Gets the value of the rmspLookupResult property.
             * 
             * @return
             *     possible object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.RMSPLookupResult }
             *     
             */
            public LookupCustomersRs.CustomersData.CustomerData.RMSPLookupResult getRMSPLookupResult() {
                return rmspLookupResult;
            }

            /**
             * Sets the value of the rmspLookupResult property.
             * 
             * @param value
             *     allowed object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.RMSPLookupResult }
             *     
             */
            public void setRMSPLookupResult(LookupCustomersRs.CustomersData.CustomerData.RMSPLookupResult value) {
                this.rmspLookupResult = value;
            }

            /**
             * Gets the value of the egrzagsResult property.
             * 
             * @return
             *     possible object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult }
             *     
             */
            public LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult getEGRZAGSResult() {
                return egrzagsResult;
            }

            /**
             * Sets the value of the egrzagsResult property.
             * 
             * @param value
             *     allowed object is
             *     {@link LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult }
             *     
             */
            public void setEGRZAGSResult(LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult value) {
                this.egrzagsResult = value;
            }

            /**
             * Gets the value of the blob property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the blob property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBLOB().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * byte[]
             * 
             */
            public List<byte[]> getBLOB() {
                if (blob == null) {
                    blob = new ArrayList<byte[]>();
                }
                return this.blob;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="esiaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Matches">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="TypeOfConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BiomStu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "esiaId",
                "status",
                "matches",
                "registrationDate",
                "typeOfConfirmation",
                "biomStu"
            })
            public static class AccountData
                extends ObjectStatus
            {

                protected String esiaId;
                protected String status;
                @XmlElement(name = "Matches")
                protected LookupCustomersRs.CustomersData.CustomerData.AccountData.Matches matches;
                @XmlElement(name = "RegistrationDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar registrationDate;
                @XmlElement(name = "TypeOfConfirmation")
                protected String typeOfConfirmation;
                @XmlElement(name = "BiomStu")
                protected String biomStu;

                /**
                 * Gets the value of the esiaId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEsiaId() {
                    return esiaId;
                }

                /**
                 * Sets the value of the esiaId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEsiaId(String value) {
                    this.esiaId = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
                }

                /**
                 * Gets the value of the matches property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LookupCustomersRs.CustomersData.CustomerData.AccountData.Matches }
                 *     
                 */
                public LookupCustomersRs.CustomersData.CustomerData.AccountData.Matches getMatches() {
                    return matches;
                }

                /**
                 * Sets the value of the matches property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LookupCustomersRs.CustomersData.CustomerData.AccountData.Matches }
                 *     
                 */
                public void setMatches(LookupCustomersRs.CustomersData.CustomerData.AccountData.Matches value) {
                    this.matches = value;
                }

                /**
                 * Gets the value of the registrationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getRegistrationDate() {
                    return registrationDate;
                }

                /**
                 * Sets the value of the registrationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setRegistrationDate(XMLGregorianCalendar value) {
                    this.registrationDate = value;
                }

                /**
                 * Gets the value of the typeOfConfirmation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeOfConfirmation() {
                    return typeOfConfirmation;
                }

                /**
                 * Sets the value of the typeOfConfirmation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeOfConfirmation(String value) {
                    this.typeOfConfirmation = value;
                }

                /**
                 * Gets the value of the biomStu property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBiomStu() {
                    return biomStu;
                }

                /**
                 * Sets the value of the biomStu property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBiomStu(String value) {
                    this.biomStu = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "match"
                })
                public static class Matches {

                    @XmlElement(name = "Match")
                    protected List<String> match;

                    /**
                     * Gets the value of the match property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the match property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMatch().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getMatch() {
                        if (match == null) {
                            match = new ArrayList<String>();
                        }
                        return this.match;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
             *       &lt;sequence>
             *         &lt;element name="BankruptcyData" type="{http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/}BankruptcyData" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bankruptcyData"
            })
            public static class BankruptcyLookupResults
                extends ObjectStatus
            {

                @XmlElement(name = "BankruptcyData")
                protected List<BankruptcyData> bankruptcyData;

                /**
                 * Gets the value of the bankruptcyData property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bankruptcyData property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBankruptcyData().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BankruptcyData }
                 * 
                 * 
                 */
                public List<BankruptcyData> getBankruptcyData() {
                    if (bankruptcyData == null) {
                        bankruptcyData = new ArrayList<BankruptcyData>();
                    }
                    return this.bankruptcyData;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="ActNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ActDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="DeathCertificate" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DCSeries" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="DCNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="DCDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ConfirmingDeathDoc" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DocCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="DocSeriesNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="EGRZAGSFullAnswer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
             *         &lt;element name="StatusResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "actNumber",
                "actDate",
                "deathCertificate",
                "confirmingDeathDoc",
                "egrzagsFullAnswer",
                "statusResult"
            })
            public static class EGRZAGSResult
                extends ObjectStatus
            {

                @XmlElement(name = "ActNumber")
                protected String actNumber;
                @XmlElement(name = "ActDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar actDate;
                @XmlElement(name = "DeathCertificate")
                protected List<LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.DeathCertificate> deathCertificate;
                @XmlElement(name = "ConfirmingDeathDoc")
                protected LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.ConfirmingDeathDoc confirmingDeathDoc;
                @XmlElement(name = "EGRZAGSFullAnswer")
                protected byte[] egrzagsFullAnswer;
                @XmlElement(name = "StatusResult")
                protected String statusResult;

                /**
                 * Gets the value of the actNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActNumber() {
                    return actNumber;
                }

                /**
                 * Sets the value of the actNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActNumber(String value) {
                    this.actNumber = value;
                }

                /**
                 * Gets the value of the actDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getActDate() {
                    return actDate;
                }

                /**
                 * Sets the value of the actDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setActDate(XMLGregorianCalendar value) {
                    this.actDate = value;
                }

                /**
                 * Gets the value of the deathCertificate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the deathCertificate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDeathCertificate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.DeathCertificate }
                 * 
                 * 
                 */
                public List<LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.DeathCertificate> getDeathCertificate() {
                    if (deathCertificate == null) {
                        deathCertificate = new ArrayList<LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.DeathCertificate>();
                    }
                    return this.deathCertificate;
                }

                /**
                 * Gets the value of the confirmingDeathDoc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.ConfirmingDeathDoc }
                 *     
                 */
                public LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.ConfirmingDeathDoc getConfirmingDeathDoc() {
                    return confirmingDeathDoc;
                }

                /**
                 * Sets the value of the confirmingDeathDoc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.ConfirmingDeathDoc }
                 *     
                 */
                public void setConfirmingDeathDoc(LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.ConfirmingDeathDoc value) {
                    this.confirmingDeathDoc = value;
                }

                /**
                 * Gets the value of the egrzagsFullAnswer property.
                 * 
                 * @return
                 *     possible object is
                 *     byte[]
                 */
                public byte[] getEGRZAGSFullAnswer() {
                    return egrzagsFullAnswer;
                }

                /**
                 * Sets the value of the egrzagsFullAnswer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     byte[]
                 */
                public void setEGRZAGSFullAnswer(byte[] value) {
                    this.egrzagsFullAnswer = value;
                }

                /**
                 * Gets the value of the statusResult property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusResult() {
                    return statusResult;
                }

                /**
                 * Sets the value of the statusResult property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusResult(String value) {
                    this.statusResult = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="DocCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="DocSeriesNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "docCode",
                    "docSeriesNumber",
                    "docDate"
                })
                public static class ConfirmingDeathDoc {

                    @XmlElement(name = "DocCode", required = true)
                    protected String docCode;
                    @XmlElement(name = "DocSeriesNumber")
                    protected String docSeriesNumber;
                    @XmlElement(name = "DocDate", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar docDate;

                    /**
                     * Gets the value of the docCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDocCode() {
                        return docCode;
                    }

                    /**
                     * Sets the value of the docCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDocCode(String value) {
                        this.docCode = value;
                    }

                    /**
                     * Gets the value of the docSeriesNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDocSeriesNumber() {
                        return docSeriesNumber;
                    }

                    /**
                     * Sets the value of the docSeriesNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDocSeriesNumber(String value) {
                        this.docSeriesNumber = value;
                    }

                    /**
                     * Gets the value of the docDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDocDate() {
                        return docDate;
                    }

                    /**
                     * Sets the value of the docDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDocDate(XMLGregorianCalendar value) {
                        this.docDate = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="DCSeries" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="DCNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="DCDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "dcSeries",
                    "dcNumber",
                    "dcDate"
                })
                public static class DeathCertificate {

                    @XmlElement(name = "DCSeries", required = true)
                    protected String dcSeries;
                    @XmlElement(name = "DCNumber", required = true)
                    protected String dcNumber;
                    @XmlElement(name = "DCDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dcDate;

                    /**
                     * Gets the value of the dcSeries property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDCSeries() {
                        return dcSeries;
                    }

                    /**
                     * Sets the value of the dcSeries property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDCSeries(String value) {
                        this.dcSeries = value;
                    }

                    /**
                     * Gets the value of the dcNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDCNumber() {
                        return dcNumber;
                    }

                    /**
                     * Sets the value of the dcNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDCNumber(String value) {
                        this.dcNumber = value;
                    }

                    /**
                     * Gets the value of the dcDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDCDate() {
                        return dcDate;
                    }

                    /**
                     * Sets the value of the dcDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDCDate(XMLGregorianCalendar value) {
                        this.dcDate = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
             *       &lt;sequence>
             *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "message"
            })
            public static class INNMatchResults
                extends ObjectStatus
            {

                @XmlElement(name = "Message")
                protected String message;

                /**
                 * Gets the value of the message property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * Sets the value of the message property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
             *       &lt;choice>
             *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/choice>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "inn",
                "message"
            })
            public static class INNbyFIO
                extends ObjectStatus
            {

                @XmlElement(name = "INN")
                protected String inn;
                @XmlElement(name = "Message")
                protected String message;

                /**
                 * Gets the value of the inn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINN() {
                    return inn;
                }

                /**
                 * Sets the value of the inn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINN(String value) {
                    this.inn = value;
                }

                /**
                 * Gets the value of the message property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * Sets the value of the message property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
             *       &lt;sequence>
             *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "message"
            })
            public static class OMSMatchResults
                extends ObjectStatus
            {

                @XmlElement(name = "Message")
                protected String message;

                /**
                 * Gets the value of the message property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * Sets the value of the message property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
             *       &lt;choice>
             *         &lt;element name="RMSPData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
             *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/choice>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "rmspData",
                "message"
            })
            public static class RMSPLookupResult
                extends ObjectStatus
            {

                @XmlElement(name = "RMSPData")
                protected byte[] rmspData;
                @XmlElement(name = "Message")
                protected String message;

                /**
                 * Gets the value of the rmspData property.
                 * 
                 * @return
                 *     possible object is
                 *     byte[]
                 */
                public byte[] getRMSPData() {
                    return rmspData;
                }

                /**
                 * Sets the value of the rmspData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     byte[]
                 */
                public void setRMSPData(byte[] value) {
                    this.rmspData = value;
                }

                /**
                 * Gets the value of the message property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * Sets the value of the message property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;choice>
             *           &lt;element name="NameOfOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *           &lt;element name="FIO" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}FioType" minOccurs="0"/>
             *         &lt;/choice>
             *         &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="CodeNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="BIK" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="DateOfReceiveInFederalDB" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "inn",
                "nameOfOrganization",
                "fio",
                "restriction",
                "id"
            })
            public static class RestrictionCheckResult
                extends ObjectStatus
            {

                @XmlElement(name = "INN")
                protected String inn;
                @XmlElement(name = "NameOfOrganization")
                protected String nameOfOrganization;
                @XmlElement(name = "FIO")
                protected FioType fio;
                @XmlElement(name = "Restriction")
                protected List<LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.Restriction> restriction;
                @XmlElement(name = "ID")
                protected String id;

                /**
                 * Gets the value of the inn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINN() {
                    return inn;
                }

                /**
                 * Sets the value of the inn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINN(String value) {
                    this.inn = value;
                }

                /**
                 * Gets the value of the nameOfOrganization property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNameOfOrganization() {
                    return nameOfOrganization;
                }

                /**
                 * Sets the value of the nameOfOrganization property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNameOfOrganization(String value) {
                    this.nameOfOrganization = value;
                }

                /**
                 * Gets the value of the fio property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FioType }
                 *     
                 */
                public FioType getFIO() {
                    return fio;
                }

                /**
                 * Sets the value of the fio property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FioType }
                 *     
                 */
                public void setFIO(FioType value) {
                    this.fio = value;
                }

                /**
                 * Gets the value of the restriction property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the restriction property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRestriction().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.Restriction }
                 * 
                 * 
                 */
                public List<LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.Restriction> getRestriction() {
                    if (restriction == null) {
                        restriction = new ArrayList<LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.Restriction>();
                    }
                    return this.restriction;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="CodeNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="BIK" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="DateOfReceiveInFederalDB" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "number",
                    "date",
                    "codeNO",
                    "bik",
                    "dateOfReceiveInFederalDB"
                })
                public static class Restriction {

                    @XmlElement(name = "Number", required = true)
                    protected String number;
                    @XmlElement(name = "Date", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar date;
                    @XmlElement(name = "CodeNO", required = true)
                    protected String codeNO;
                    @XmlElement(name = "BIK", required = true)
                    protected String bik;
                    @XmlElement(name = "DateOfReceiveInFederalDB", required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar dateOfReceiveInFederalDB;

                    /**
                     * Gets the value of the number property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumber() {
                        return number;
                    }

                    /**
                     * Sets the value of the number property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumber(String value) {
                        this.number = value;
                    }

                    /**
                     * Gets the value of the date property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDate() {
                        return date;
                    }

                    /**
                     * Sets the value of the date property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDate(XMLGregorianCalendar value) {
                        this.date = value;
                    }

                    /**
                     * Gets the value of the codeNO property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeNO() {
                        return codeNO;
                    }

                    /**
                     * Sets the value of the codeNO property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeNO(String value) {
                        this.codeNO = value;
                    }

                    /**
                     * Gets the value of the bik property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBIK() {
                        return bik;
                    }

                    /**
                     * Sets the value of the bik property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBIK(String value) {
                        this.bik = value;
                    }

                    /**
                     * Gets the value of the dateOfReceiveInFederalDB property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDateOfReceiveInFederalDB() {
                        return dateOfReceiveInFederalDB;
                    }

                    /**
                     * Sets the value of the dateOfReceiveInFederalDB property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDateOfReceiveInFederalDB(XMLGregorianCalendar value) {
                        this.dateOfReceiveInFederalDB = value;
                    }

                }

            }

        }

    }

}
