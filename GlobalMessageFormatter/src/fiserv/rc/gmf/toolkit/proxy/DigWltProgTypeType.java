//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package fiserv.rc.gmf.toolkit.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigWltProgTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DigWltProgTypeType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max10AN">
 *     &lt;enumeration value="AndroidPay"/>
 *     &lt;enumeration value="ApplePay"/>
 *     &lt;enumeration value="MerchToken"/>
 *     &lt;enumeration value="PayButton"/>
 *     &lt;enumeration value="SamsungPay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DigWltProgTypeType")
@XmlEnum
public enum DigWltProgTypeType {

    @XmlEnumValue("AndroidPay")
    ANDROID_PAY("AndroidPay"),
    @XmlEnumValue("ApplePay")
    APPLE_PAY("ApplePay"),
    @XmlEnumValue("MerchToken")
    MERCH_TOKEN("MerchToken"),
    @XmlEnumValue("PayButton")
    PAY_BUTTON("PayButton"),
    @XmlEnumValue("SamsungPay")
    SAMSUNG_PAY("SamsungPay");
    private final String value;

    DigWltProgTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigWltProgTypeType fromValue(String v) {
        for (DigWltProgTypeType c: DigWltProgTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
