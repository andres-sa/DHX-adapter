//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.17 at 11:49:24 AM EET
//


package ee.ria.dhx.server.types.ee.riik.xrd.dhl.producers.producer.dhl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for statusType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="statusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="saatmisel"/&gt;
 *     &lt;enumeration value="saadetud"/&gt;
 *     &lt;enumeration value="katkestatud"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

  @XmlEnumValue("saatmisel")
  SAATMISEL("saatmisel"), @XmlEnumValue("saadetud")
  SAADETUD("saadetud"), @XmlEnumValue("katkestatud")
  KATKESTATUD("katkestatud");
  private final String value;

  StatusType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static StatusType fromValue(String v) {
    for (StatusType c : StatusType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
