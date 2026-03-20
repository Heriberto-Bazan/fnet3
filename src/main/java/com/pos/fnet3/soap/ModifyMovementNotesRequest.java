
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
 *         <element name="movementForeignId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "movementForeignId",
    "notes"
})
@XmlRootElement(name = "ModifyMovementNotesRequest")
public class ModifyMovementNotesRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected long movementId;
    @XmlElement(required = true)
    protected String movementForeignId;
    @XmlElement(required = true)
    protected String notes;

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
     * Obtiene el valor de la propiedad movementForeignId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementForeignId() {
        return movementForeignId;
    }

    /**
     * Define el valor de la propiedad movementForeignId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementForeignId(String value) {
        this.movementForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Define el valor de la propiedad notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
