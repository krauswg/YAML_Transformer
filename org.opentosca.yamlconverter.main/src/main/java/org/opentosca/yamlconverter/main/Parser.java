package org.opentosca.yamlconverter.main;

import java.util.HashMap;
import java.util.Map;

import org.opentosca.model.tosca.Definitions;
import org.opentosca.yamlconverter.main.exceptions.ConverterException;
import org.opentosca.yamlconverter.main.interfaces.IToscaBean2BeanConverter;
import org.opentosca.yamlconverter.main.interfaces.IToscaXml2XmlBeanConverter;
import org.opentosca.yamlconverter.main.interfaces.IToscaYaml2YamlBeanConverter;
import org.opentosca.yamlconverter.main.interfaces.IToscaYamlParser;
import org.opentosca.yamlconverter.yamlmodel.yaml.element.Input;
import org.opentosca.yamlconverter.yamlmodel.yaml.element.ServiceTemplate;

public class Parser implements IToscaYamlParser {
	private final IToscaYaml2YamlBeanConverter y2yb = new YamlBeansConverter();
	private final IToscaBean2BeanConverter b2b = new SwitchMapperConverter();
	private final IToscaXml2XmlBeanConverter x2xb = new JAXBConverter();

	private String xml = "";
	private ServiceTemplate serviceTempl = null;
	private Definitions definition = null;

	private Map<String, String> inputs = new HashMap<>();

	@Override
	public void parse(String yamlString) {
		try {
			this.serviceTempl = this.y2yb.yaml2yamlbean(yamlString);
		} catch (final ConverterException e) {
			throw new RuntimeException(e);
		}
		this.definition = this.b2b.yamlb2xmlb(this.serviceTempl);
		this.xml = this.x2xb.xmlbean2xml(this.definition);
	}

	@Override
	public String getXML() {
		if (this.xml.equals("")) {
			throw new IllegalStateException("Call parse(..) before calling getXML()");
		}
		return fillGetter();
	}

	private String fillGetter() {
		// TODO: implement me :)
		return this.xml;
	}

	@Override
	public String getXSD() {
		throw new UnsupportedOperationException("not supported yet");
	}

	@Override
	public Map<String, String> getInputRequirements() {
		final Map<String, String> result = new HashMap<String, String>();
		if (this.serviceTempl == null) {
			throw new IllegalStateException("Call parse(..) before calling getInputRequirements()");
		}
		for (final Input inp : this.serviceTempl.getInput()) {
			// TODO:
			// result.put(inp, inp);
		}
		return result;
	}

	@Override
	public void setInputValues(Map<String, String> input) {
		this.inputs = input;
	}

}
