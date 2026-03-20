
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PrizeCategoryFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PrizeCategoryFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="outstandingPrizeCategory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useReview" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendReviewByMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendReviewBySms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendReviewByPush" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="requiredShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizeCategoryFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "enabled",
    "outstandingPrizeCategory",
    "useReview",
    "sendReviewByMail",
    "sendReviewBySms",
    "sendReviewByPush",
    "requiredShipping"
})
public class WSPrizeCategoryFlags {

    protected long flags;
    protected boolean enabled;
    protected boolean outstandingPrizeCategory;
    protected boolean useReview;
    protected boolean sendReviewByMail;
    protected boolean sendReviewBySms;
    protected boolean sendReviewByPush;
    protected boolean requiredShipping;

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
     * Obtiene el valor de la propiedad enabled.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Define el valor de la propiedad enabled.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad outstandingPrizeCategory.
     * 
     */
    public boolean isOutstandingPrizeCategory() {
        return outstandingPrizeCategory;
    }

    /**
     * Define el valor de la propiedad outstandingPrizeCategory.
     * 
     */
    public void setOutstandingPrizeCategory(boolean value) {
        this.outstandingPrizeCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad useReview.
     * 
     */
    public boolean isUseReview() {
        return useReview;
    }

    /**
     * Define el valor de la propiedad useReview.
     * 
     */
    public void setUseReview(boolean value) {
        this.useReview = value;
    }

    /**
     * Obtiene el valor de la propiedad sendReviewByMail.
     * 
     */
    public boolean isSendReviewByMail() {
        return sendReviewByMail;
    }

    /**
     * Define el valor de la propiedad sendReviewByMail.
     * 
     */
    public void setSendReviewByMail(boolean value) {
        this.sendReviewByMail = value;
    }

    /**
     * Obtiene el valor de la propiedad sendReviewBySms.
     * 
     */
    public boolean isSendReviewBySms() {
        return sendReviewBySms;
    }

    /**
     * Define el valor de la propiedad sendReviewBySms.
     * 
     */
    public void setSendReviewBySms(boolean value) {
        this.sendReviewBySms = value;
    }

    /**
     * Obtiene el valor de la propiedad sendReviewByPush.
     * 
     */
    public boolean isSendReviewByPush() {
        return sendReviewByPush;
    }

    /**
     * Define el valor de la propiedad sendReviewByPush.
     * 
     */
    public void setSendReviewByPush(boolean value) {
        this.sendReviewByPush = value;
    }

    /**
     * Obtiene el valor de la propiedad requiredShipping.
     * 
     */
    public boolean isRequiredShipping() {
        return requiredShipping;
    }

    /**
     * Define el valor de la propiedad requiredShipping.
     * 
     */
    public void setRequiredShipping(boolean value) {
        this.requiredShipping = value;
    }

}
