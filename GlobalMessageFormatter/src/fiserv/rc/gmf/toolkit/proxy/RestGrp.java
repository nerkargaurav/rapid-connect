//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package fiserv.rc.gmf.toolkit.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FoodAmt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}BevgAmt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TipAmt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RestTaxAmt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ServerID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestGrp", propOrder = {
    "foodAmt",
    "bevgAmt",
    "tipAmt",
    "restTaxAmt",
    "serverID"
})
public class RestGrp {

    @XmlElement(name = "FoodAmt")
    protected String foodAmt;
    @XmlElement(name = "BevgAmt")
    protected String bevgAmt;
    @XmlElement(name = "TipAmt")
    protected String tipAmt;
    @XmlElement(name = "RestTaxAmt")
    protected String restTaxAmt;
    @XmlElement(name = "ServerID")
    protected String serverID;

    /**
     * Gets the value of the foodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodAmt() {
        return foodAmt;
    }

    /**
     * Sets the value of the foodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodAmt(String value) {
        this.foodAmt = value;
    }

    /**
     * Gets the value of the bevgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBevgAmt() {
        return bevgAmt;
    }

    /**
     * Sets the value of the bevgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBevgAmt(String value) {
        this.bevgAmt = value;
    }

    /**
     * Gets the value of the tipAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipAmt() {
        return tipAmt;
    }

    /**
     * Sets the value of the tipAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipAmt(String value) {
        this.tipAmt = value;
    }

    /**
     * Gets the value of the restTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestTaxAmt() {
        return restTaxAmt;
    }

    /**
     * Sets the value of the restTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestTaxAmt(String value) {
        this.restTaxAmt = value;
    }

    /**
     * Gets the value of the serverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerID() {
        return serverID;
    }

    /**
     * Sets the value of the serverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerID(String value) {
        this.serverID = value;
    }

}
