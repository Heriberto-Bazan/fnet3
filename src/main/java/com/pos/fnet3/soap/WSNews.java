
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
 * <p>Clase Java para WS_News complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_News">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="summaryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fullText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="imageHiperLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="viewDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="imagesList" type="{http://FidelyNET3_SW_01_89_00}WS_NewsImages" maxOccurs="unbounded"/>
 *         <element name="newsCategory" type="{http://FidelyNET3_SW_01_89_00}WS_NewsCategory"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_News", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "title",
    "summaryText",
    "fullText",
    "image",
    "imageHiperLink",
    "issuedDate",
    "viewDate",
    "expireDate",
    "campaignId",
    "imagesList",
    "newsCategory"
})
public class WSNews {

    protected long id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String summaryText;
    @XmlElement(required = true)
    protected String fullText;
    @XmlElement(required = true)
    protected String image;
    @XmlElement(required = true)
    protected String imageHiperLink;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar viewDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    protected long campaignId;
    @XmlElement(required = true)
    protected List<WSNewsImages> imagesList;
    @XmlElement(required = true)
    protected WSNewsCategory newsCategory;

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
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad summaryText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryText() {
        return summaryText;
    }

    /**
     * Define el valor de la propiedad summaryText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryText(String value) {
        this.summaryText = value;
    }

    /**
     * Obtiene el valor de la propiedad fullText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullText() {
        return fullText;
    }

    /**
     * Define el valor de la propiedad fullText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullText(String value) {
        this.fullText = value;
    }

    /**
     * Obtiene el valor de la propiedad image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Define el valor de la propiedad image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Obtiene el valor de la propiedad imageHiperLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageHiperLink() {
        return imageHiperLink;
    }

    /**
     * Define el valor de la propiedad imageHiperLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageHiperLink(String value) {
        this.imageHiperLink = value;
    }

    /**
     * Obtiene el valor de la propiedad issuedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuedDate() {
        return issuedDate;
    }

    /**
     * Define el valor de la propiedad issuedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuedDate(XMLGregorianCalendar value) {
        this.issuedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad viewDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getViewDate() {
        return viewDate;
    }

    /**
     * Define el valor de la propiedad viewDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setViewDate(XMLGregorianCalendar value) {
        this.viewDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expireDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Define el valor de la propiedad expireDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
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
     * Gets the value of the imagesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the imagesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSNewsImages }
     * 
     * 
     * @return
     *     The value of the imagesList property.
     */
    public List<WSNewsImages> getImagesList() {
        if (imagesList == null) {
            imagesList = new ArrayList<>();
        }
        return this.imagesList;
    }

    /**
     * Obtiene el valor de la propiedad newsCategory.
     * 
     * @return
     *     possible object is
     *     {@link WSNewsCategory }
     *     
     */
    public WSNewsCategory getNewsCategory() {
        return newsCategory;
    }

    /**
     * Define el valor de la propiedad newsCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link WSNewsCategory }
     *     
     */
    public void setNewsCategory(WSNewsCategory value) {
        this.newsCategory = value;
    }

}
