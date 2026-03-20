
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Operator complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Operator">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="language" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_OperatorFlags"/>
 *         <element name="profile" type="{http://FidelyNET3_SW_01_89_00}WS_SimpleTerminalProfile"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Operator", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "username",
    "name",
    "surname",
    "language",
    "flags",
    "profile"
})
public class WSOperator {

    protected long id;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String surname;
    protected long language;
    @XmlElement(required = true)
    protected WSOperatorFlags flags;
    @XmlElement(required = true)
    protected WSSimpleTerminalProfile profile;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Define el valor de la propiedad username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad surname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Define el valor de la propiedad surname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     */
    public long getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     */
    public void setLanguage(long value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSOperatorFlags }
     *     
     */
    public WSOperatorFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSOperatorFlags }
     *     
     */
    public void setFlags(WSOperatorFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad profile.
     * 
     * @return
     *     possible object is
     *     {@link WSSimpleTerminalProfile }
     *     
     */
    public WSSimpleTerminalProfile getProfile() {
        return profile;
    }

    /**
     * Define el valor de la propiedad profile.
     * 
     * @param value
     *     allowed object is
     *     {@link WSSimpleTerminalProfile }
     *     
     */
    public void setProfile(WSSimpleTerminalProfile value) {
        this.profile = value;
    }

}
