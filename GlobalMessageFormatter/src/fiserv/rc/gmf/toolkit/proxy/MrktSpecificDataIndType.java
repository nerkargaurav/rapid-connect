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
 * <p>Java class for MrktSpecificDataIndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MrktSpecificDataIndType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max15AN">
 *     &lt;enumeration value="BillPayment"/>
 *     &lt;enumeration value="Healthcare"/>
 *     &lt;enumeration value="Transit"/>
 *     &lt;enumeration value="EcomAgg"/>
 *     &lt;enumeration value="B2B"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="AutoRental"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MrktSpecificDataIndType")
@XmlEnum
public enum MrktSpecificDataIndType {

    @XmlEnumValue("BillPayment")
    BILL_PAYMENT("BillPayment"),
    @XmlEnumValue("Healthcare")
    HEALTHCARE("Healthcare"),
    @XmlEnumValue("Transit")
    TRANSIT("Transit"),
    @XmlEnumValue("EcomAgg")
    ECOM_AGG("EcomAgg"),
    @XmlEnumValue("B2B")
    B_2_B("B2B"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("AutoRental")
    AUTO_RENTAL("AutoRental");
    private final String value;

    MrktSpecificDataIndType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MrktSpecificDataIndType fromValue(String v) {
        for (MrktSpecificDataIndType c: MrktSpecificDataIndType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}