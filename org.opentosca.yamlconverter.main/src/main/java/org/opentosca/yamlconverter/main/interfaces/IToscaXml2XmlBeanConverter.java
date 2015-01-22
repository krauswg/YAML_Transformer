package org.opentosca.yamlconverter.main.interfaces;

import org.opentosca.model.tosca.Definitions;

public interface IToscaXml2XmlBeanConverter {
	/**
	 * Converts Tosca XML beans to Tosca XML
	 *
	 * @param root The Tosca XML root bean
	 * @return A Tosca XML-containing String
	 */
	public String xmlbean2xml(Definitions root);

	/**
	 * Converts Tosca XML to Tosca XML beans.
	 *
	 * @param xmlstring A Tosca XML-containing String
	 * @return The Tosca XML root bean
	 */
	public Definitions xml2xmlbean(String xmlstring);
}