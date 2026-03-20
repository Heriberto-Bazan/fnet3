
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Billing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Billing">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="money" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="periodNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="periodCicle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_to" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="date_from" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="billingData" type="{http://FidelyNET3_SW_01_89_00}WS_GeneralBillingDataInf" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Billing", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "money",
    "periodNumber",
    "periodCicle",
    "dateTo",
    "dateFrom",
    "billingData"
})
public class WSBilling {

    protected double money;
    protected int periodNumber;
    @XmlElement(required = true)
    protected String periodCicle;
    @XmlElement(name = "date_to", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    @XmlElement(name = "date_from", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(required = true)
    protected List<WSGeneralBillingDataInf> billingData;

    /**
     * Obtiene el valor de la propiedad money.
     * 
     */
    public double getMoney() {
        return money;
    }

    /**
     * Define el valor de la propiedad money.
     * 
     */
    public void setMoney(double value) {
        this.money = value;
    }

    /**
     * Obtiene el valor de la propiedad periodNumber.
     * 
     */
    public int getPeriodNumber() {
        return periodNumber;
    }

    /**
     * Define el valor de la propiedad periodNumber.
     * 
     */
    public void setPeriodNumber(int value) {
        this.periodNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad periodCicle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodCicle() {
        return periodCicle;
    }

    /**
     * Define el valor de la propiedad periodCicle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodCicle(String value) {
        this.periodCicle = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Define el valor de la propiedad dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Define el valor de la propiedad dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the billingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the billingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSGeneralBillingDataInf }
     * 
     * 
     * @return
     *     The value of the billingData property.
     */
    public List<WSGeneralBillingDataInf> getBillingData() {
        if (billingData == null) {
            billingData = new ArrayList<>();
        }
        return this.billingData;
    }

}
