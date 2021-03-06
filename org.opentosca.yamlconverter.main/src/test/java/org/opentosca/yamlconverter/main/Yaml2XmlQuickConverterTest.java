package org.opentosca.yamlconverter.main;

import org.junit.Test;
import org.opentosca.yamlconverter.main.exceptions.ConverterException;
import org.opentosca.yamlconverter.main.interfaces.IToscaYaml2XmlConverter;

import java.io.IOException;
import java.net.URISyntaxException;

public class Yaml2XmlQuickConverterTest extends BaseTest {
	private final IToscaYaml2XmlConverter c = new ToscaYaml2XmlConverter();

	@Test
	public void testYaml2xml() throws URISyntaxException, IOException, ConverterException {
		final String yaml = this.testUtils.readYamlTestResource("/yaml/helloworld.yaml");
		final String result = this.c.convertToXml(yaml);
		// TODO: assertNotEquals is not a correct method! Maybe assertNotSame ?
//		Assert.assertNotEquals(result, "");
		System.out.println(result);
	}
}
