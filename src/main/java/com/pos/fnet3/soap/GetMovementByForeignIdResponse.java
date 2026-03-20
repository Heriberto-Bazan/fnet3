
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="movement" type="{http://FidelyNET3_SW_01_89_00}WS_Movement"/>
 *         <element name="promotions" type="{http://FidelyNET3_SW_01_89_00}WS_Promotion" maxOccurs="unbounded"/>
 *         <element name="promotionsNotWinner" type="{http://FidelyNET3_SW_01_89_00}WS_PromotionNotWinner" maxOccurs="unbounded"/>
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
    "movement",
    "promotions",
    "promotionsNotWinner"
})
@XmlRootElement(name = "GetMovementByForeignIdResponse")
public class GetMovementByForeignIdResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSMovement movement;
    @XmlElement(required = true)
    protected List<WSPromotion> promotions;
    @XmlElement(required = true)
    protected List<WSPromotionNotWinner> promotionsNotWinner;

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
     * Obtiene el valor de la propiedad movement.
     * 
     * @return
     *     possible object is
     *     {@link WSMovement }
     *     
     */
    public WSMovement getMovement() {
        return movement;
    }

    /**
     * Define el valor de la propiedad movement.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMovement }
     *     
     */
    public void setMovement(WSMovement value) {
        this.movement = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the promotions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPromotion }
     * 
     * 
     * @return
     *     The value of the promotions property.
     */
    public List<WSPromotion> getPromotions() {
        if (promotions == null) {
            promotions = new ArrayList<>();
        }
        return this.promotions;
    }

    /**
     * Gets the value of the promotionsNotWinner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the promotionsNotWinner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionsNotWinner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPromotionNotWinner }
     * 
     * 
     * @return
     *     The value of the promotionsNotWinner property.
     */
    public List<WSPromotionNotWinner> getPromotionsNotWinner() {
        if (promotionsNotWinner == null) {
            promotionsNotWinner = new ArrayList<>();
        }
        return this.promotionsNotWinner;
    }

}
