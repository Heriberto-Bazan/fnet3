
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
 * <p>Clase Java para WS_PrizeInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PrizeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="points" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxToExchange" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="category" type="{http://FidelyNET3_SW_01_89_00}WS_PrizeCategory"/>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="minimunPointsEP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_PrizeFlags"/>
 *         <element name="pathImage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pathImageAbsolute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catalogName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="termsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="otherImages" type="{http://FidelyNET3_SW_01_89_00}WS_OtherImage" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="pathVideo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pathVideoAbsolute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="typeDeliver" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizeInfo", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "name",
    "description",
    "points",
    "moneyValue",
    "stock",
    "maxToExchange",
    "prizeCode",
    "catalogId",
    "category",
    "campaignId",
    "minimunPointsEP",
    "flags",
    "pathImage",
    "pathImageAbsolute",
    "issueDate",
    "brand",
    "catalogName",
    "categoryName",
    "termsAndConditions",
    "otherImages",
    "pathVideo",
    "pathVideoAbsolute",
    "typeDeliver"
})
public class WSPrizeInfo {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    protected double points;
    protected double moneyValue;
    protected int stock;
    protected long maxToExchange;
    @XmlElement(required = true)
    protected String prizeCode;
    protected long catalogId;
    @XmlElement(required = true)
    protected WSPrizeCategory category;
    protected long campaignId;
    protected double minimunPointsEP;
    @XmlElement(required = true)
    protected WSPrizeFlags flags;
    @XmlElement(required = true)
    protected String pathImage;
    @XmlElement(required = true)
    protected String pathImageAbsolute;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(required = true)
    protected String brand;
    @XmlElement(required = true)
    protected String catalogName;
    @XmlElement(required = true)
    protected String categoryName;
    @XmlElement(required = true)
    protected String termsAndConditions;
    @XmlElement(nillable = true)
    protected List<WSOtherImage> otherImages;
    @XmlElement(required = true)
    protected String pathVideo;
    @XmlElement(required = true)
    protected String pathVideoAbsolute;
    protected int typeDeliver;

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
     * Obtiene el valor de la propiedad points.
     * 
     */
    public double getPoints() {
        return points;
    }

    /**
     * Define el valor de la propiedad points.
     * 
     */
    public void setPoints(double value) {
        this.points = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyValue.
     * 
     */
    public double getMoneyValue() {
        return moneyValue;
    }

    /**
     * Define el valor de la propiedad moneyValue.
     * 
     */
    public void setMoneyValue(double value) {
        this.moneyValue = value;
    }

    /**
     * Obtiene el valor de la propiedad stock.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Define el valor de la propiedad stock.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * Obtiene el valor de la propiedad maxToExchange.
     * 
     */
    public long getMaxToExchange() {
        return maxToExchange;
    }

    /**
     * Define el valor de la propiedad maxToExchange.
     * 
     */
    public void setMaxToExchange(long value) {
        this.maxToExchange = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrizeCode() {
        return prizeCode;
    }

    /**
     * Define el valor de la propiedad prizeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrizeCode(String value) {
        this.prizeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogId.
     * 
     */
    public long getCatalogId() {
        return catalogId;
    }

    /**
     * Define el valor de la propiedad catalogId.
     * 
     */
    public void setCatalogId(long value) {
        this.catalogId = value;
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
     * Obtiene el valor de la propiedad campaignId.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Define el valor de la propiedad campaignId.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
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
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSPrizeFlags }
     *     
     */
    public WSPrizeFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrizeFlags }
     *     
     */
    public void setFlags(WSPrizeFlags value) {
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
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * Define el valor de la propiedad catalogName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Define el valor de la propiedad categoryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
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
     * Obtiene el valor de la propiedad typeDeliver.
     * 
     */
    public int getTypeDeliver() {
        return typeDeliver;
    }

    /**
     * Define el valor de la propiedad typeDeliver.
     * 
     */
    public void setTypeDeliver(int value) {
        this.typeDeliver = value;
    }

}
