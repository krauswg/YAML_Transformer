//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2013.07.10 at 12:45:26 PM CEST
//
// TOSCA version: TOSCA-v1.0-cs02.xsd
//

package org.opentosca.model.tosca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for tPolicyType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tPolicyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tEntityType">
 *       &lt;sequence>
 *         &lt;element name="AppliesTo" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tAppliesTo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="policyLanguage" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPolicyType", propOrder = { "appliesTo" })
public class TPolicyType extends TEntityType {

	@XmlElement(name = "AppliesTo")
	protected TAppliesTo appliesTo;
	@XmlAttribute(name = "policyLanguage")
	@XmlSchemaType(name = "anyURI")
	protected String policyLanguage;

	/**
	 * Gets the value of the appliesTo property.
	 *
	 * @return possible object is {@link TAppliesTo }
	 *
	 */
	public TAppliesTo getAppliesTo() {
		return this.appliesTo;
	}

	/**
	 * Sets the value of the appliesTo property.
	 *
	 * @param value allowed object is {@link TAppliesTo }
	 *
	 */
	public void setAppliesTo(TAppliesTo value) {
		this.appliesTo = value;
	}

	/**
	 * Gets the value of the policyLanguage property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getPolicyLanguage() {
		return this.policyLanguage;
	}

	/**
	 * Sets the value of the policyLanguage property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setPolicyLanguage(String value) {
		this.policyLanguage = value;
	}

}
