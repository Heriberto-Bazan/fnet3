
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CampaignTicket complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CampaignTicket">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="logoURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="header1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="header2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="footer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="welcomeMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_CampaignTicketFlags"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CampaignTicket", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "logoURL",
    "header1",
    "header2",
    "footer",
    "welcomeMessage",
    "flags"
})
public class WSCampaignTicket {

    @XmlElement(required = true)
    protected String logoURL;
    @XmlElement(required = true)
    protected String header1;
    @XmlElement(required = true)
    protected String header2;
    @XmlElement(required = true)
    protected String footer;
    @XmlElement(required = true)
    protected String welcomeMessage;
    @XmlElement(required = true)
    protected WSCampaignTicketFlags flags;

    /**
     * Obtiene el valor de la propiedad logoURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoURL() {
        return logoURL;
    }

    /**
     * Define el valor de la propiedad logoURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURL(String value) {
        this.logoURL = value;
    }

    /**
     * Obtiene el valor de la propiedad header1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader1() {
        return header1;
    }

    /**
     * Define el valor de la propiedad header1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader1(String value) {
        this.header1 = value;
    }

    /**
     * Obtiene el valor de la propiedad header2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader2() {
        return header2;
    }

    /**
     * Define el valor de la propiedad header2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader2(String value) {
        this.header2 = value;
    }

    /**
     * Obtiene el valor de la propiedad footer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * Define el valor de la propiedad footer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
    }

    /**
     * Obtiene el valor de la propiedad welcomeMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    /**
     * Define el valor de la propiedad welcomeMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeMessage(String value) {
        this.welcomeMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSCampaignTicketFlags }
     *     
     */
    public WSCampaignTicketFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCampaignTicketFlags }
     *     
     */
    public void setFlags(WSCampaignTicketFlags value) {
        this.flags = value;
    }

}
