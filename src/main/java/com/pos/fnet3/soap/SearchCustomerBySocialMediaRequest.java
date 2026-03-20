
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
 *         <element name="facebook_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="twitter_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="instagram_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="youtube_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "facebookId",
    "twitterId",
    "instagramId",
    "youtubeId",
    "email"
})
@XmlRootElement(name = "SearchCustomerBySocialMediaRequest")
public class SearchCustomerBySocialMediaRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected long campaignID;
    @XmlElement(name = "facebook_id", required = true)
    protected String facebookId;
    @XmlElement(name = "twitter_id", required = true)
    protected String twitterId;
    @XmlElement(name = "instagram_id", required = true)
    protected String instagramId;
    @XmlElement(name = "youtube_id", required = true)
    protected String youtubeId;
    @XmlElement(required = true)
    protected String email;

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
     * Obtiene el valor de la propiedad facebookId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookId() {
        return facebookId;
    }

    /**
     * Define el valor de la propiedad facebookId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookId(String value) {
        this.facebookId = value;
    }

    /**
     * Obtiene el valor de la propiedad twitterId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterId() {
        return twitterId;
    }

    /**
     * Define el valor de la propiedad twitterId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterId(String value) {
        this.twitterId = value;
    }

    /**
     * Obtiene el valor de la propiedad instagramId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstagramId() {
        return instagramId;
    }

    /**
     * Define el valor de la propiedad instagramId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstagramId(String value) {
        this.instagramId = value;
    }

    /**
     * Obtiene el valor de la propiedad youtubeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYoutubeId() {
        return youtubeId;
    }

    /**
     * Define el valor de la propiedad youtubeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYoutubeId(String value) {
        this.youtubeId = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
