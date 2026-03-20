
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CampaignTicketFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CampaignTicketFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="printCustomerCopy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="printPointsBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="printCreditsBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="printCreditsGiftBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="printPointsStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="printSignatureOnCustomerCopy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CampaignTicketFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "printCustomerCopy",
    "printPointsBalance",
    "printCreditsBalance",
    "printCreditsGiftBalance",
    "printPointsStatus",
    "printSignatureOnCustomerCopy"
})
public class WSCampaignTicketFlags {

    protected boolean printCustomerCopy;
    protected boolean printPointsBalance;
    protected boolean printCreditsBalance;
    protected boolean printCreditsGiftBalance;
    protected boolean printPointsStatus;
    protected boolean printSignatureOnCustomerCopy;

    /**
     * Obtiene el valor de la propiedad printCustomerCopy.
     * 
     */
    public boolean isPrintCustomerCopy() {
        return printCustomerCopy;
    }

    /**
     * Define el valor de la propiedad printCustomerCopy.
     * 
     */
    public void setPrintCustomerCopy(boolean value) {
        this.printCustomerCopy = value;
    }

    /**
     * Obtiene el valor de la propiedad printPointsBalance.
     * 
     */
    public boolean isPrintPointsBalance() {
        return printPointsBalance;
    }

    /**
     * Define el valor de la propiedad printPointsBalance.
     * 
     */
    public void setPrintPointsBalance(boolean value) {
        this.printPointsBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad printCreditsBalance.
     * 
     */
    public boolean isPrintCreditsBalance() {
        return printCreditsBalance;
    }

    /**
     * Define el valor de la propiedad printCreditsBalance.
     * 
     */
    public void setPrintCreditsBalance(boolean value) {
        this.printCreditsBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad printCreditsGiftBalance.
     * 
     */
    public boolean isPrintCreditsGiftBalance() {
        return printCreditsGiftBalance;
    }

    /**
     * Define el valor de la propiedad printCreditsGiftBalance.
     * 
     */
    public void setPrintCreditsGiftBalance(boolean value) {
        this.printCreditsGiftBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad printPointsStatus.
     * 
     */
    public boolean isPrintPointsStatus() {
        return printPointsStatus;
    }

    /**
     * Define el valor de la propiedad printPointsStatus.
     * 
     */
    public void setPrintPointsStatus(boolean value) {
        this.printPointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad printSignatureOnCustomerCopy.
     * 
     */
    public boolean isPrintSignatureOnCustomerCopy() {
        return printSignatureOnCustomerCopy;
    }

    /**
     * Define el valor de la propiedad printSignatureOnCustomerCopy.
     * 
     */
    public void setPrintSignatureOnCustomerCopy(boolean value) {
        this.printSignatureOnCustomerCopy = value;
    }

}
