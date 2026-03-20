
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="answerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="customerUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="customerSurname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="customerCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="periodToExpired" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="badgesWons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="pointBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="accumulatedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="redeemedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="expiredPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="balanceStatusPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="currentLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="missingStatusPointsToChangeLevel" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="missingBadgesToChangeLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="pendingBadges" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pointsToExpire" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="initialBalancePoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="finalBalancePoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "answerCode",
    "customerId",
    "customerUserName",
    "customerName",
    "customerSurname",
    "customerCard",
    "periodToExpired",
    "badgesWons",
    "pointBalance",
    "accumulatedPoints",
    "redeemedPoints",
    "expiredPoints",
    "currentBalance",
    "balanceStatusPoints",
    "currentLevel",
    "missingStatusPointsToChangeLevel",
    "missingBadgesToChangeLevel",
    "pendingBadges",
    "link",
    "pointsToExpire",
    "initialBalancePoints",
    "finalBalancePoints"
})
@XmlRootElement(name = "GetAccountStateByCustomerResponse")
public class GetAccountStateByCustomerResponse {

    protected int answerCode;
    protected long customerId;
    @XmlElement(required = true)
    protected String customerUserName;
    @XmlElement(required = true)
    protected String customerName;
    @XmlElement(required = true)
    protected String customerSurname;
    @XmlElement(required = true)
    protected String customerCard;
    @XmlElement(required = true)
    protected String periodToExpired;
    @XmlElement(required = true)
    protected List<String> badgesWons;
    protected double pointBalance;
    protected double accumulatedPoints;
    protected double redeemedPoints;
    protected double expiredPoints;
    protected double currentBalance;
    protected double balanceStatusPoints;
    @XmlElement(required = true)
    protected String currentLevel;
    protected double missingStatusPointsToChangeLevel;
    @XmlElement(required = true)
    protected List<String> missingBadgesToChangeLevel;
    @XmlElement(required = true)
    protected List<String> pendingBadges;
    @XmlElement(required = true)
    protected String link;
    protected double pointsToExpire;
    protected double initialBalancePoints;
    protected double finalBalancePoints;

    /**
     * Obtiene el valor de la propiedad answerCode.
     * 
     */
    public int getAnswerCode() {
        return answerCode;
    }

    /**
     * Define el valor de la propiedad answerCode.
     * 
     */
    public void setAnswerCode(int value) {
        this.answerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    /**
     * Obtiene el valor de la propiedad customerUserName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUserName() {
        return customerUserName;
    }

    /**
     * Define el valor de la propiedad customerUserName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUserName(String value) {
        this.customerUserName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSurname() {
        return customerSurname;
    }

    /**
     * Define el valor de la propiedad customerSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSurname(String value) {
        this.customerSurname = value;
    }

    /**
     * Obtiene el valor de la propiedad customerCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCard() {
        return customerCard;
    }

    /**
     * Define el valor de la propiedad customerCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCard(String value) {
        this.customerCard = value;
    }

    /**
     * Obtiene el valor de la propiedad periodToExpired.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodToExpired() {
        return periodToExpired;
    }

    /**
     * Define el valor de la propiedad periodToExpired.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodToExpired(String value) {
        this.periodToExpired = value;
    }

    /**
     * Gets the value of the badgesWons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the badgesWons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBadgesWons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the badgesWons property.
     */
    public List<String> getBadgesWons() {
        if (badgesWons == null) {
            badgesWons = new ArrayList<>();
        }
        return this.badgesWons;
    }

    /**
     * Obtiene el valor de la propiedad pointBalance.
     * 
     */
    public double getPointBalance() {
        return pointBalance;
    }

    /**
     * Define el valor de la propiedad pointBalance.
     * 
     */
    public void setPointBalance(double value) {
        this.pointBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad accumulatedPoints.
     * 
     */
    public double getAccumulatedPoints() {
        return accumulatedPoints;
    }

    /**
     * Define el valor de la propiedad accumulatedPoints.
     * 
     */
    public void setAccumulatedPoints(double value) {
        this.accumulatedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad redeemedPoints.
     * 
     */
    public double getRedeemedPoints() {
        return redeemedPoints;
    }

    /**
     * Define el valor de la propiedad redeemedPoints.
     * 
     */
    public void setRedeemedPoints(double value) {
        this.redeemedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad expiredPoints.
     * 
     */
    public double getExpiredPoints() {
        return expiredPoints;
    }

    /**
     * Define el valor de la propiedad expiredPoints.
     * 
     */
    public void setExpiredPoints(double value) {
        this.expiredPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad currentBalance.
     * 
     */
    public double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Define el valor de la propiedad currentBalance.
     * 
     */
    public void setCurrentBalance(double value) {
        this.currentBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceStatusPoints.
     * 
     */
    public double getBalanceStatusPoints() {
        return balanceStatusPoints;
    }

    /**
     * Define el valor de la propiedad balanceStatusPoints.
     * 
     */
    public void setBalanceStatusPoints(double value) {
        this.balanceStatusPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad currentLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Define el valor de la propiedad currentLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLevel(String value) {
        this.currentLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad missingStatusPointsToChangeLevel.
     * 
     */
    public double getMissingStatusPointsToChangeLevel() {
        return missingStatusPointsToChangeLevel;
    }

    /**
     * Define el valor de la propiedad missingStatusPointsToChangeLevel.
     * 
     */
    public void setMissingStatusPointsToChangeLevel(double value) {
        this.missingStatusPointsToChangeLevel = value;
    }

    /**
     * Gets the value of the missingBadgesToChangeLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the missingBadgesToChangeLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingBadgesToChangeLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the missingBadgesToChangeLevel property.
     */
    public List<String> getMissingBadgesToChangeLevel() {
        if (missingBadgesToChangeLevel == null) {
            missingBadgesToChangeLevel = new ArrayList<>();
        }
        return this.missingBadgesToChangeLevel;
    }

    /**
     * Gets the value of the pendingBadges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pendingBadges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingBadges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the pendingBadges property.
     */
    public List<String> getPendingBadges() {
        if (pendingBadges == null) {
            pendingBadges = new ArrayList<>();
        }
        return this.pendingBadges;
    }

    /**
     * Obtiene el valor de la propiedad link.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Define el valor de la propiedad link.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsToExpire.
     * 
     */
    public double getPointsToExpire() {
        return pointsToExpire;
    }

    /**
     * Define el valor de la propiedad pointsToExpire.
     * 
     */
    public void setPointsToExpire(double value) {
        this.pointsToExpire = value;
    }

    /**
     * Obtiene el valor de la propiedad initialBalancePoints.
     * 
     */
    public double getInitialBalancePoints() {
        return initialBalancePoints;
    }

    /**
     * Define el valor de la propiedad initialBalancePoints.
     * 
     */
    public void setInitialBalancePoints(double value) {
        this.initialBalancePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad finalBalancePoints.
     * 
     */
    public double getFinalBalancePoints() {
        return finalBalancePoints;
    }

    /**
     * Define el valor de la propiedad finalBalancePoints.
     * 
     */
    public void setFinalBalancePoints(double value) {
        this.finalBalancePoints = value;
    }

}
