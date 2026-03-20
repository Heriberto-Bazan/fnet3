
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
 *         <element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="movementId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="movementTicketId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="movementForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="movementTicketImg" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sessionId",
    "movementId",
    "movementTicketId",
    "movementForeignId",
    "movementTicketImg"
})
@XmlRootElement(name = "SendMovementTicketRequest")
public class SendMovementTicketRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected long movementId;
    @XmlElement(required = true)
    protected String movementTicketId;
    protected long movementForeignId;
    @XmlElement(required = true)
    protected String movementTicketImg;

    /**
     * Obtiene el valor de la propiedad sessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Define el valor de la propiedad sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad movementId.
     * 
     */
    public long getMovementId() {
        return movementId;
    }

    /**
     * Define el valor de la propiedad movementId.
     * 
     */
    public void setMovementId(long value) {
        this.movementId = value;
    }

    /**
     * Obtiene el valor de la propiedad movementTicketId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementTicketId() {
        return movementTicketId;
    }

    /**
     * Define el valor de la propiedad movementTicketId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementTicketId(String value) {
        this.movementTicketId = value;
    }

    /**
     * Obtiene el valor de la propiedad movementForeignId.
     * 
     */
    public long getMovementForeignId() {
        return movementForeignId;
    }

    /**
     * Define el valor de la propiedad movementForeignId.
     * 
     */
    public void setMovementForeignId(long value) {
        this.movementForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad movementTicketImg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementTicketImg() {
        return movementTicketImg;
    }

    /**
     * Define el valor de la propiedad movementTicketImg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementTicketImg(String value) {
        this.movementTicketImg = value;
    }

}
