package de.opentosca.yamlconverter.main.interfaces;

import org.opentosca.model.tosca.TDefinitions;

public interface ItoscaBean2BeanConverter {
	/**
	 * Converts a Tosca XML bean to a Tosca YAML bean.
	 * @param xmlroot The XML root bean
	 * @return The YAML root bean
	 */
	public YamlRootElement xmlb2yamlb(TDefinitions xmlroot);
	
	/**
	 * Converts a Tosca YAML bean to a Tosca XML bean.
	 * @param yamlroot The YAML root bean
	 * @return The XML root bean
	 */
	public TDefinitions yamlb2xmlb(YamlRootElement yamlroot);
}
