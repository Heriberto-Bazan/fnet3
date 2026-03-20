
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
 *         <element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nameFriend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="surnameFriend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mailFriend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mobileFriend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sendBy" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "session",
    "nameFriend",
    "surnameFriend",
    "mailFriend",
    "mobileFriend",
    "sendBy"
})
@XmlRootElement(name = "InviteFriendByCodeRequest")
public class InviteFriendByCodeRequest {

    @XmlElement(required = true)
    protected String session;
    @XmlElement(required = true)
    protected String nameFriend;
    @XmlElement(required = true)
    protected String surnameFriend;
    @XmlElement(required = true)
    protected String mailFriend;
    @XmlElement(required = true)
    protected String mobileFriend;
    protected long sendBy;

    /**
     * Obtiene el valor de la propiedad session.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSession() {
        return session;
    }

    /**
     * Define el valor de la propiedad session.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSession(String value) {
        this.session = value;
    }

    /**
     * Obtiene el valor de la propiedad nameFriend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFriend() {
        return nameFriend;
    }

    /**
     * Define el valor de la propiedad nameFriend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFriend(String value) {
        this.nameFriend = value;
    }

    /**
     * Obtiene el valor de la propiedad surnameFriend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameFriend() {
        return surnameFriend;
    }

    /**
     * Define el valor de la propiedad surnameFriend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameFriend(String value) {
        this.surnameFriend = value;
    }

    /**
     * Obtiene el valor de la propiedad mailFriend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailFriend() {
        return mailFriend;
    }

    /**
     * Define el valor de la propiedad mailFriend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailFriend(String value) {
        this.mailFriend = value;
    }

    /**
     * Obtiene el valor de la propiedad mobileFriend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileFriend() {
        return mobileFriend;
    }

    /**
     * Define el valor de la propiedad mobileFriend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileFriend(String value) {
        this.mobileFriend = value;
    }

    /**
     * Obtiene el valor de la propiedad sendBy.
     * 
     */
    public long getSendBy() {
        return sendBy;
    }

    /**
     * Define el valor de la propiedad sendBy.
     * 
     */
    public void setSendBy(long value) {
        this.sendBy = value;
    }

}
