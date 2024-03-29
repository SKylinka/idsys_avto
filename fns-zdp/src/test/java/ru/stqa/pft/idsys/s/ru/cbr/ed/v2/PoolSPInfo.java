
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Primary account of liquidity pool (LP) OR List of Subordinate Accounts of LP.
 * 
 * <p>Java class for PoolSPInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoolSPInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ListOfSP" type="{urn:cbr-ru:ed:v2.0}ListOfSP"/>
 *         &lt;element name="MainPoolParticipant" type="{urn:cbr-ru:ed:v2.0}MainPoolParticipant"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolSPInfo", propOrder = {
    "listOfSP",
    "mainPoolParticipant"
})
public class PoolSPInfo {

    @XmlElement(name = "ListOfSP")
    protected ListOfSP listOfSP;
    @XmlElement(name = "MainPoolParticipant")
    protected MainPoolParticipant mainPoolParticipant;

    /**
     * Gets the value of the listOfSP property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSP }
     *     
     */
    public ListOfSP getListOfSP() {
        return listOfSP;
    }

    /**
     * Sets the value of the listOfSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSP }
     *     
     */
    public void setListOfSP(ListOfSP value) {
        this.listOfSP = value;
    }

    /**
     * Gets the value of the mainPoolParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link MainPoolParticipant }
     *     
     */
    public MainPoolParticipant getMainPoolParticipant() {
        return mainPoolParticipant;
    }

    /**
     * Sets the value of the mainPoolParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainPoolParticipant }
     *     
     */
    public void setMainPoolParticipant(MainPoolParticipant value) {
        this.mainPoolParticipant = value;
    }

}
