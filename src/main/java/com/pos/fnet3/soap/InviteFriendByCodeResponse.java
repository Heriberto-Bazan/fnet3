
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="answerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="customerinvitedId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="customerinviteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "answerCode",
    "customerinvitedId",
    "customerinviteCode"
})
@XmlRootElement(name = "InviteFriendByCodeResponse")
public class InviteFriendByCodeResponse {

    protected int answerCode;
    protected long customerinvitedId;
    @XmlElement(required = true)
    protected String customerinviteCode;

    /**
     * Obtiene el valor de la propiedad answerCode.
     * 
     */
    public int getAnswerCode() {
        return answerCode;
    }

    /**
     * Define el valor de la propiedad answerCode.
     * 
     */
    public void setAnswerCode(int value) {
        this.answerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customerinvitedId.
     * 
     */
    public long getCustomerinvitedId() {
        return customerinvitedId;
    }

    /**
     * Define el valor de la propiedad customerinvitedId.
     * 
     */
    public void setCustomerinvitedId(long value) {
        this.customerinvitedId = value;
    }

    /**
     * Obtiene el valor de la propiedad customerinviteCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerinviteCode() {
        return customerinviteCode;
    }

    /**
     * Define el valor de la propiedad customerinviteCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerinviteCode(String value) {
        this.customerinviteCode = value;
    }

}
