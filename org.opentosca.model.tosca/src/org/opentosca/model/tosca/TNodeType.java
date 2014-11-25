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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for tNodeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tNodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tEntityType">
 *       &lt;sequence>
 *         &lt;element name="RequirementDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequirementDefinition" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequirementDefinition" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CapabilityDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CapabilityDefinition" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tCapabilityDefinition" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InstanceStates" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tTopologyElementInstanceStates" minOccurs="0"/>
 *         &lt;element name="Interfaces" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Interface" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tInterface" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tNodeType", propOrder = {"requirementDefinitions", "capabilityDefinitions", "instanceStates", "interfaces"})
public class TNodeType extends TEntityType {
	
	@XmlElement(name = "RequirementDefinitions")
	protected TNodeType.RequirementDefinitions requirementDefinitions;
	@XmlElement(name = "CapabilityDefinitions")
	protected TNodeType.CapabilityDefinitions capabilityDefinitions;
	@XmlElement(name = "InstanceStates")
	protected TTopologyElementInstanceStates instanceStates;
	@XmlElement(name = "Interfaces")
	protected TNodeType.Interfaces interfaces;
	
	
	/**
	 * Gets the value of the requirementDefinitions property.
	 * 
	 * @return possible object is {@link TNodeType.RequirementDefinitions }
	 * 
	 */
	public TNodeType.RequirementDefinitions getRequirementDefinitions() {
		return this.requirementDefinitions;
	}
	
	/**
	 * Sets the value of the requirementDefinitions property.
	 * 
	 * @param value allowed object is {@link TNodeType.RequirementDefinitions }
	 * 
	 */
	public void setRequirementDefinitions(TNodeType.RequirementDefinitions value) {
		this.requirementDefinitions = value;
	}
	
	/**
	 * Gets the value of the capabilityDefinitions property.
	 * 
	 * @return possible object is {@link TNodeType.CapabilityDefinitions }
	 * 
	 */
	public TNodeType.CapabilityDefinitions getCapabilityDefinitions() {
		return this.capabilityDefinitions;
	}
	
	/**
	 * Sets the value of the capabilityDefinitions property.
	 * 
	 * @param value allowed object is {@link TNodeType.CapabilityDefinitions }
	 * 
	 */
	public void setCapabilityDefinitions(TNodeType.CapabilityDefinitions value) {
		this.capabilityDefinitions = value;
	}
	
	/**
	 * Gets the value of the instanceStates property.
	 * 
	 * @return possible object is {@link TTopologyElementInstanceStates }
	 * 
	 */
	public TTopologyElementInstanceStates getInstanceStates() {
		return this.instanceStates;
	}
	
	/**
	 * Sets the value of the instanceStates property.
	 * 
	 * @param value allowed object is {@link TTopologyElementInstanceStates }
	 * 
	 */
	public void setInstanceStates(TTopologyElementInstanceStates value) {
		this.instanceStates = value;
	}
	
	/**
	 * Gets the value of the interfaces property.
	 * 
	 * @return possible object is {@link TNodeType.Interfaces }
	 * 
	 */
	public TNodeType.Interfaces getInterfaces() {
		return this.interfaces;
	}
	
	/**
	 * Sets the value of the interfaces property.
	 * 
	 * @param value allowed object is {@link TNodeType.Interfaces }
	 * 
	 */
	public void setInterfaces(TNodeType.Interfaces value) {
		this.interfaces = value;
	}
	
	
	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="CapabilityDefinition" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tCapabilityDefinition" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {"capabilityDefinition"})
	public static class CapabilityDefinitions {
		
		@XmlElement(name = "CapabilityDefinition", required = true)
		protected List<TCapabilityDefinition> capabilityDefinition;
		
		
		/**
		 * Gets the value of the capabilityDefinition property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the capabilityDefinition property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getCapabilityDefinition().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TCapabilityDefinition }
		 * 
		 * 
		 */
		public List<TCapabilityDefinition> getCapabilityDefinition() {
			if (this.capabilityDefinition == null) {
				this.capabilityDefinition = new ArrayList<TCapabilityDefinition>();
			}
			return this.capabilityDefinition;
		}
		
	}
	
	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Interface" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tInterface" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {"_interface"})
	public static class Interfaces {
		
		@XmlElement(name = "Interface", required = true)
		protected List<TInterface> _interface;
		
		
		/**
		 * Gets the value of the interface property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the interface property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getInterface().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TInterface }
		 * 
		 * 
		 */
		public List<TInterface> getInterface() {
			if (this._interface == null) {
				this._interface = new ArrayList<TInterface>();
			}
			return this._interface;
		}
		
	}
	
	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="RequirementDefinition" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequirementDefinition" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {"requirementDefinition"})
	public static class RequirementDefinitions {
		
		@XmlElement(name = "RequirementDefinition", required = true)
		protected List<TRequirementDefinition> requirementDefinition;
		
		
		/**
		 * Gets the value of the requirementDefinition property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the requirementDefinition property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getRequirementDefinition().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TRequirementDefinition }
		 * 
		 * 
		 */
		public List<TRequirementDefinition> getRequirementDefinition() {
			if (this.requirementDefinition == null) {
				this.requirementDefinition = new ArrayList<TRequirementDefinition>();
			}
			return this.requirementDefinition;
		}
		
	}
	
}
