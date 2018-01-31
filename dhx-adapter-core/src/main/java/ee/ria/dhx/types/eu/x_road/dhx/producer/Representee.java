//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.10 at 01:13:12 PM EET
//


package ee.ria.dhx.types.eu.x_road.dhx.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>
 * Java class for representee complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="representee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="memberCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="representeeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="representeeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "representee", propOrder = {
    "memberCode",
    "representeeName",
    "representeeSystem",
    "startDate",
    "endDate"
})
public class Representee {

  @XmlElement(required = true)
  protected String memberCode;
  @XmlElement(required = true)
  protected String representeeName;
  protected String representeeSystem;
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar startDate;
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar endDate;

  /**
   * Gets the value of the memberCode property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMemberCode() {
    return memberCode;
  }

  /**
   * Sets the value of the memberCode property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMemberCode(String value) {
    this.memberCode = value;
  }

  /**
   * Gets the value of the representeeName property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getRepresenteeName() {
    return representeeName;
  }

  /**
   * Sets the value of the representeeName property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setRepresenteeName(String value) {
    this.representeeName = value;
  }

  /**
   * Gets the value of the representeeSystem property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getRepresenteeSystem() {
    return representeeSystem;
  }

  /**
   * Sets the value of the representeeSystem property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setRepresenteeSystem(String value) {
    this.representeeSystem = value;
  }

  /**
   * Gets the value of the startDate property.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   * 
   */
  public XMLGregorianCalendar getStartDate() {
    return startDate;
  }

  /**
   * Sets the value of the startDate property.
   * 
   * @param value allowed object is {@link XMLGregorianCalendar }
   * 
   */
  public void setStartDate(XMLGregorianCalendar value) {
    this.startDate = value;
  }

  /**
   * Gets the value of the endDate property.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   * 
   */
  public XMLGregorianCalendar getEndDate() {
    return endDate;
  }

  /**
   * Sets the value of the endDate property.
   * 
   * @param value allowed object is {@link XMLGregorianCalendar }
   * 
   */
  public void setEndDate(XMLGregorianCalendar value) {
    this.endDate = value;
  }

}