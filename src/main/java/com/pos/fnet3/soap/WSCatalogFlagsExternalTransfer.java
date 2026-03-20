
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CatalogFlagsExternalTransfer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CatalogFlagsExternalTransfer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="validate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="prizeCanBeExchanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCRM" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="exchangeInTerminal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="exchangeInCustomerArea" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="outstanding" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="limitedStock" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="fixedPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="upperAndLowerLimitPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="externalAccountNumberRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CatalogFlagsExternalTransfer", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "enable",
    "validate",
    "prizeCanBeExchanged",
    "usePeriod",
    "useCRM",
    "exchangeInTerminal",
    "exchangeInCustomerArea",
    "outstanding",
    "limitedStock",
    "fixedPoints",
    "upperAndLowerLimitPoints",
    "externalAccountNumberRequired"
})
public class WSCatalogFlagsExternalTransfer {

    protected long flags;
    protected boolean enable;
    protected boolean validate;
    protected boolean prizeCanBeExchanged;
    protected boolean usePeriod;
    protected boolean useCRM;
    protected boolean exchangeInTerminal;
    protected boolean exchangeInCustomerArea;
    protected boolean outstanding;
    protected boolean limitedStock;
    protected boolean fixedPoints;
    protected boolean upperAndLowerLimitPoints;
    protected boolean externalAccountNumberRequired;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     */
    public long getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     */
    public void setFlags(long value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad enable.
     * 
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Define el valor de la propiedad enable.
     * 
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

    /**
     * Obtiene el valor de la propiedad validate.
     * 
     */
    public boolean isValidate() {
        return validate;
    }

    /**
     * Define el valor de la propiedad validate.
     * 
     */
    public void setValidate(boolean value) {
        this.validate = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeCanBeExchanged.
     * 
     */
    public boolean isPrizeCanBeExchanged() {
        return prizeCanBeExchanged;
    }

    /**
     * Define el valor de la propiedad prizeCanBeExchanged.
     * 
     */
    public void setPrizeCanBeExchanged(boolean value) {
        this.prizeCanBeExchanged = value;
    }

    /**
     * Obtiene el valor de la propiedad usePeriod.
     * 
     */
    public boolean isUsePeriod() {
        return usePeriod;
    }

    /**
     * Define el valor de la propiedad usePeriod.
     * 
     */
    public void setUsePeriod(boolean value) {
        this.usePeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad useCRM.
     * 
     */
    public boolean isUseCRM() {
        return useCRM;
    }

    /**
     * Define el valor de la propiedad useCRM.
     * 
     */
    public void setUseCRM(boolean value) {
        this.useCRM = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeInTerminal.
     * 
     */
    public boolean isExchangeInTerminal() {
        return exchangeInTerminal;
    }

    /**
     * Define el valor de la propiedad exchangeInTerminal.
     * 
     */
    public void setExchangeInTerminal(boolean value) {
        this.exchangeInTerminal = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeInCustomerArea.
     * 
     */
    public boolean isExchangeInCustomerArea() {
        return exchangeInCustomerArea;
    }

    /**
     * Define el valor de la propiedad exchangeInCustomerArea.
     * 
     */
    public void setExchangeInCustomerArea(boolean value) {
        this.exchangeInCustomerArea = value;
    }

    /**
     * Obtiene el valor de la propiedad outstanding.
     * 
     */
    public boolean isOutstanding() {
        return outstanding;
    }

    /**
     * Define el valor de la propiedad outstanding.
     * 
     */
    public void setOutstanding(boolean value) {
        this.outstanding = value;
    }

    /**
     * Obtiene el valor de la propiedad limitedStock.
     * 
     */
    public boolean isLimitedStock() {
        return limitedStock;
    }

    /**
     * Define el valor de la propiedad limitedStock.
     * 
     */
    public void setLimitedStock(boolean value) {
        this.limitedStock = value;
    }

    /**
     * Obtiene el valor de la propiedad fixedPoints.
     * 
     */
    public boolean isFixedPoints() {
        return fixedPoints;
    }

    /**
     * Define el valor de la propiedad fixedPoints.
     * 
     */
    public void setFixedPoints(boolean value) {
        this.fixedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad upperAndLowerLimitPoints.
     * 
     */
    public boolean isUpperAndLowerLimitPoints() {
        return upperAndLowerLimitPoints;
    }

    /**
     * Define el valor de la propiedad upperAndLowerLimitPoints.
     * 
     */
    public void setUpperAndLowerLimitPoints(boolean value) {
        this.upperAndLowerLimitPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad externalAccountNumberRequired.
     * 
     */
    public boolean isExternalAccountNumberRequired() {
        return externalAccountNumberRequired;
    }

    /**
     * Define el valor de la propiedad externalAccountNumberRequired.
     * 
     */
    public void setExternalAccountNumberRequired(boolean value) {
        this.externalAccountNumberRequired = value;
    }

}
