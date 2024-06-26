//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package fiserv.rc.gmf.toolkit.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinlessDebitResponseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinlessDebitResponseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommonGrp" type="{com/fiserv/Merchant/gmfV10.02}CommonGrp" minOccurs="0"/>
 *         &lt;element name="BillPayGrp" type="{com/fiserv/Merchant/gmfV10.02}BillPayGrp" minOccurs="0"/>
 *         &lt;element name="CardGrp" type="{com/fiserv/Merchant/gmfV10.02}CardGrp" minOccurs="0"/>
 *         &lt;element name="AddtlAmtGrp" type="{com/fiserv/Merchant/gmfV10.02}AddtlAmtGrp" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="TAGrp" type="{com/fiserv/Merchant/gmfV10.02}TAGrp" minOccurs="0"/>
 *         &lt;element name="DebitGrp" type="{com/fiserv/Merchant/gmfV10.02}DebitGrp" minOccurs="0"/>
 *         &lt;element name="RespGrp" type="{com/fiserv/Merchant/gmfV10.02}RespGrp" minOccurs="0"/>
 *         &lt;element name="FileDLGrp" type="{com/fiserv/Merchant/gmfV10.02}FileDLGrp" minOccurs="0"/>
 *         &lt;element name="FraudMitRespGrp" type="{com/fiserv/Merchant/gmfV10.02}FraudMitRespGrp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinlessDebitResponseDetails", propOrder = {
    "commonGrp",
    "billPayGrp",
    "cardGrp",
    "addtlAmtGrp",
    "taGrp",
    "debitGrp",
    "respGrp",
    "fileDLGrp",
    "fraudMitRespGrp"
})
public class PinlessDebitResponseDetails {

    @XmlElement(name = "CommonGrp")
    protected CommonGrp commonGrp;
    @XmlElement(name = "BillPayGrp")
    protected BillPayGrp billPayGrp;
    @XmlElement(name = "CardGrp")
    protected CardGrp cardGrp;
    @XmlElement(name = "AddtlAmtGrp")
    protected List<AddtlAmtGrp> addtlAmtGrp;
    @XmlElement(name = "TAGrp")
    protected TAGrp taGrp;
    @XmlElement(name = "DebitGrp")
    protected DebitGrp debitGrp;
    @XmlElement(name = "RespGrp")
    protected RespGrp respGrp;
    @XmlElement(name = "FileDLGrp")
    protected FileDLGrp fileDLGrp;
    @XmlElement(name = "FraudMitRespGrp")
    protected FraudMitRespGrp fraudMitRespGrp;

    /**
     * Gets the value of the commonGrp property.
     * 
     * @return
     *     possible object is
     *     {@link CommonGrp }
     *     
     */
    public CommonGrp getCommonGrp() {
        return commonGrp;
    }

    /**
     * Sets the value of the commonGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonGrp }
     *     
     */
    public void setCommonGrp(CommonGrp value) {
        this.commonGrp = value;
    }

    /**
     * Gets the value of the billPayGrp property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayGrp }
     *     
     */
    public BillPayGrp getBillPayGrp() {
        return billPayGrp;
    }

    /**
     * Sets the value of the billPayGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayGrp }
     *     
     */
    public void setBillPayGrp(BillPayGrp value) {
        this.billPayGrp = value;
    }

    /**
     * Gets the value of the cardGrp property.
     * 
     * @return
     *     possible object is
     *     {@link CardGrp }
     *     
     */
    public CardGrp getCardGrp() {
        return cardGrp;
    }

    /**
     * Sets the value of the cardGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardGrp }
     *     
     */
    public void setCardGrp(CardGrp value) {
        this.cardGrp = value;
    }

    /**
     * Gets the value of the addtlAmtGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAmtGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmtGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddtlAmtGrp }
     * 
     * 
     */
    public List<AddtlAmtGrp> getAddtlAmtGrp() {
        if (addtlAmtGrp == null) {
            addtlAmtGrp = new ArrayList<AddtlAmtGrp>();
        }
        return this.addtlAmtGrp;
    }

    /**
     * Gets the value of the taGrp property.
     * 
     * @return
     *     possible object is
     *     {@link TAGrp }
     *     
     */
    public TAGrp getTAGrp() {
        return taGrp;
    }

    /**
     * Sets the value of the taGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAGrp }
     *     
     */
    public void setTAGrp(TAGrp value) {
        this.taGrp = value;
    }

    /**
     * Gets the value of the debitGrp property.
     * 
     * @return
     *     possible object is
     *     {@link DebitGrp }
     *     
     */
    public DebitGrp getDebitGrp() {
        return debitGrp;
    }

    /**
     * Sets the value of the debitGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitGrp }
     *     
     */
    public void setDebitGrp(DebitGrp value) {
        this.debitGrp = value;
    }

    /**
     * Gets the value of the respGrp property.
     * 
     * @return
     *     possible object is
     *     {@link RespGrp }
     *     
     */
    public RespGrp getRespGrp() {
        return respGrp;
    }

    /**
     * Sets the value of the respGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespGrp }
     *     
     */
    public void setRespGrp(RespGrp value) {
        this.respGrp = value;
    }

    /**
     * Gets the value of the fileDLGrp property.
     * 
     * @return
     *     possible object is
     *     {@link FileDLGrp }
     *     
     */
    public FileDLGrp getFileDLGrp() {
        return fileDLGrp;
    }

    /**
     * Sets the value of the fileDLGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDLGrp }
     *     
     */
    public void setFileDLGrp(FileDLGrp value) {
        this.fileDLGrp = value;
    }

    /**
     * Gets the value of the fraudMitRespGrp property.
     * 
     * @return
     *     possible object is
     *     {@link FraudMitRespGrp }
     *     
     */
    public FraudMitRespGrp getFraudMitRespGrp() {
        return fraudMitRespGrp;
    }

    /**
     * Sets the value of the fraudMitRespGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudMitRespGrp }
     *     
     */
    public void setFraudMitRespGrp(FraudMitRespGrp value) {
        this.fraudMitRespGrp = value;
    }

}
