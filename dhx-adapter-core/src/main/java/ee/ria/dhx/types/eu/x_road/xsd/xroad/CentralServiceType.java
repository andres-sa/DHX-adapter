//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.10 at 01:13:12 PM EET
//


package ee.ria.dhx.types.eu.x_road.xsd.xroad;

import ee.ria.dhx.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for CentralServiceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="implementingService" type="{http://x-road.eu/xsd/identifiers}XRoadServiceIdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralServiceType", propOrder = {
    "serviceCode",
    "implementingService"
})
public class CentralServiceType {

  @XmlElement(required = true)
  protected String serviceCode;
  protected XRoadServiceIdentifierType implementingService;

  /**
   * Gets the value of the serviceCode property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getServiceCode() {
    return serviceCode;
  }

  /**
   * Sets the value of the serviceCode property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setServiceCode(String value) {
    this.serviceCode = value;
  }

  /**
   * Gets the value of the implementingService property.
   * 
   * @return possible object is {@link XRoadServiceIdentifierType }
   * 
   */
  public XRoadServiceIdentifierType getImplementingService() {
    return implementingService;
  }

  /**
   * Sets the value of the implementingService property.
   * 
   * @param value allowed object is {@link XRoadServiceIdentifierType }
   * 
   */
  public void setImplementingService(XRoadServiceIdentifierType value) {
    this.implementingService = value;
  }

}
