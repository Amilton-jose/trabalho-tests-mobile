package org.trabalho.automacao.mobile.bdd;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("org/trabalho/automacao/mobile/bdd")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME,value = "org.trabalho.automacao.mobile.bdd")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@only")

public class CucumberTest {
}
