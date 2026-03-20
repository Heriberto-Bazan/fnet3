
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
 *         <element name="badge" type="{http://FidelyNET3_SW_01_89_00}WS_Badge"/>
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
    "badge"
})
@XmlRootElement(name = "BadgesManagementResponse")
public class BadgesManagementResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSBadge badge;

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
     * Obtiene el valor de la propiedad badge.
     * 
     * @return
     *     possible object is
     *     {@link WSBadge }
     *     
     */
    public WSBadge getBadge() {
        return badge;
    }

    /**
     * Define el valor de la propiedad badge.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBadge }
     *     
     */
    public void setBadge(WSBadge value) {
        this.badge = value;
    }

}
