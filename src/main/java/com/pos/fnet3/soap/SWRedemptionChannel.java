
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SW_RedemptionChannel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="SW_RedemptionChannel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="category" type="{http://FidelyNET3_SW_01_89_00}WS_PrizeCategory"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}SW_RedemptionChannelFlags"/>
 *         <element name="pathImage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pathImageAbsolute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="foreignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="idCatalog" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="minimunPointsEP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="currencySymbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="otherImages" type="{http://FidelyNET3_SW_01_89_00}WS_OtherImage" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="termsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pathVideo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pathVideoAbsolute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prizeFatherId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeFatherName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prizeFatherCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prizeFatherDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SW_RedemptionChannel", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "name",
    "description",
    "channelCode",
    "category",
    "flags",
    "pathImage",
    "pathImageAbsolute",
    "issueDate",
    "foreignId",
    "idCatalog",
    "minimunPointsEP",
    "currencyId",
    "currencySymbol",
    "otherImages",
    "termsAndConditions",
    "pathVideo",
    "pathVideoAbsolute",
    "prizeFatherId",
    "prizeFatherName",
    "prizeFatherCode",
    "prizeFatherDescription",
    "orderBy"
})
public class SWRedemptionChannel {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String channelCode;
    @XmlElement(required = true)
    protected WSPrizeCategory category;
    @XmlElement(required = true)
    protected SWRedemptionChannelFlags flags;
    @XmlElement(required = true)
    protected String pathImage;
    @XmlElement(required = true)
    protected String pathImageAbsolute;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    protected long foreignId;
    protected long idCatalog;
    protected double minimunPointsEP;
    protected long currencyId;
    @XmlElement(required = true)
    protected String currencySymbol;
    @XmlElement(nillable = true)
    protected List<WSOtherImage> otherImages;
    @XmlElement(required = true)
    protected String termsAndConditions;
    @XmlElement(required = true)
    protected String pathVideo;
    @XmlElement(required = true)
    protected String pathVideoAbsolute;
    protected long prizeFatherId;
    @XmlElement(required = true)
    protected String prizeFatherName;
    @XmlElement(required = true)
    protected String prizeFatherCode;
    @XmlElement(required = true)
    protected String prizeFatherDescription;
    protected long orderBy;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad channelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Define el valor de la propiedad channelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link WSPrizeCategory }
     *     
     */
    public WSPrizeCategory getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrizeCategory }
     *     
     */
    public void setCategory(WSPrizeCategory value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link SWRedemptionChannelFlags }
     *     
     */
    public SWRedemptionChannelFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link SWRedemptionChannelFlags }
     *     
     */
    public void setFlags(SWRedemptionChannelFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad pathImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathImage() {
        return pathImage;
    }

    /**
     * Define el valor de la propiedad pathImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathImage(String value) {
        this.pathImage = value;
    }

    /**
     * Obtiene el valor de la propiedad pathImageAbsolute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathImageAbsolute() {
        return pathImageAbsolute;
    }

    /**
     * Define el valor de la propiedad pathImageAbsolute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathImageAbsolute(String value) {
        this.pathImageAbsolute = value;
    }

    /**
     * Obtiene el valor de la propiedad issueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Define el valor de la propiedad issueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignId.
     * 
     */
    public long getForeignId() {
        return foreignId;
    }

    /**
     * Define el valor de la propiedad foreignId.
     * 
     */
    public void setForeignId(long value) {
        this.foreignId = value;
    }

    /**
     * Obtiene el valor de la propiedad idCatalog.
     * 
     */
    public long getIdCatalog() {
        return idCatalog;
    }

    /**
     * Define el valor de la propiedad idCatalog.
     * 
     */
    public void setIdCatalog(long value) {
        this.idCatalog = value;
    }

    /**
     * Obtiene el valor de la propiedad minimunPointsEP.
     * 
     */
    public double getMinimunPointsEP() {
        return minimunPointsEP;
    }

    /**
     * Define el valor de la propiedad minimunPointsEP.
     * 
     */
    public void setMinimunPointsEP(double value) {
        this.minimunPointsEP = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyId.
     * 
     */
    public long getCurrencyId() {
        return currencyId;
    }

    /**
     * Define el valor de la propiedad currencyId.
     * 
     */
    public void setCurrencyId(long value) {
        this.currencyId = value;
    }

    /**
     * Obtiene el valor de la propiedad currencySymbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Define el valor de la propiedad currencySymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    /**
     * Gets the value of the otherImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the otherImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSOtherImage }
     * 
     * 
     * @return
     *     The value of the otherImages property.
     */
    public List<WSOtherImage> getOtherImages() {
        if (otherImages == null) {
            otherImages = new ArrayList<>();
        }
        return this.otherImages;
    }

    /**
     * Obtiene el valor de la propiedad termsAndConditions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Define el valor de la propiedad termsAndConditions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditions(String value) {
        this.termsAndConditions = value;
    }

    /**
     * Obtiene el valor de la propiedad pathVideo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathVideo() {
        return pathVideo;
    }

    /**
     * Define el valor de la propiedad pathVideo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathVideo(String value) {
        this.pathVideo = value;
    }

    /**
     * Obtiene el valor de la propiedad pathVideoAbsolute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathVideoAbsolute() {
        return pathVideoAbsolute;
    }

    /**
     * Define el valor de la propiedad pathVideoAbsolute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathVideoAbsolute(String value) {
        this.pathVideoAbsolute = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeFatherId.
     * 
     */
    public long getPrizeFatherId() {
        return prizeFatherId;
    }

    /**
     * Define el valor de la propiedad prizeFatherId.
     * 
     */
    public void setPrizeFatherId(long value) {
        this.prizeFatherId = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeFatherName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrizeFatherName() {
        return prizeFatherName;
    }

    /**
     * Define el valor de la propiedad prizeFatherName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrizeFatherName(String value) {
        this.prizeFatherName = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeFatherCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrizeFatherCode() {
        return prizeFatherCode;
    }

    /**
     * Define el valor de la propiedad prizeFatherCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrizeFatherCode(String value) {
        this.prizeFatherCode = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeFatherDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrizeFatherDescription() {
        return prizeFatherDescription;
    }

    /**
     * Define el valor de la propiedad prizeFatherDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrizeFatherDescription(String value) {
        this.prizeFatherDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad orderBy.
     * 
     */
    public long getOrderBy() {
        return orderBy;
    }

    /**
     * Define el valor de la propiedad orderBy.
     * 
     */
    public void setOrderBy(long value) {
        this.orderBy = value;
    }

}
