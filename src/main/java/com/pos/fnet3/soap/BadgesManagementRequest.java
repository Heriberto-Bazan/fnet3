
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
 *         <element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="campaignID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="operationKind" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sessionID",
    "campaignID",
    "operationKind",
    "badge"
})
@XmlRootElement(name = "BadgesManagementRequest")
public class BadgesManagementRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected long campaignID;
    protected int operationKind;
    @XmlElement(required = true)
    protected WSBadge badge;

    /**
     * Obtiene el valor de la propiedad sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Define el valor de la propiedad sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignID.
     * 
     */
    public long getCampaignID() {
        return campaignID;
    }

    /**
     * Define el valor de la propiedad campaignID.
     * 
     */
    public void setCampaignID(long value) {
        this.campaignID = value;
    }

    /**
     * Obtiene el valor de la propiedad operationKind.
     * 
     */
    public int getOperationKind() {
        return operationKind;
    }

    /**
     * Define el valor de la propiedad operationKind.
     * 
     */
    public void setOperationKind(int value) {
        this.operationKind = value;
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
