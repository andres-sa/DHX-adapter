//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.17 at 11:49:24 AM EET
//


package ee.ria.dhx.server.types.ee.riik.xrd.dhl.producers.producer.dhl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faultactor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faultdetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "fault")
public class Fault {

  @XmlElement(namespace = "", required = true)
  protected String faultcode;
  @XmlElement(namespace = "", required = true)
  protected String faultactor;
  @XmlElement(namespace = "", required = true)
  protected String faultstring;
  @XmlElement(namespace = "", required = true)
  protected String faultdetail;

  /**
   * Gets the value of the faultcode property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFaultcode() {
    return faultcode;
  }

  /**
   * Sets the value of the faultcode property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFaultcode(String value) {
    this.faultcode = value;
  }

  /**
   * Gets the value of the faultactor property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFaultactor() {
    return faultactor;
  }

  /**
   * Sets the value of the faultactor property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFaultactor(String value) {
    this.faultactor = value;
  }

  /**
   * Gets the value of the faultstring property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFaultstring() {
    return faultstring;
  }

  /**
   * Sets the value of the faultstring property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFaultstring(String value) {
    this.faultstring = value;
  }

  /**
   * Gets the value of the faultdetail property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFaultdetail() {
    return faultdetail;
  }

  /**
   * Sets the value of the faultdetail property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFaultdetail(String value) {
    this.faultdetail = value;
  }

}
