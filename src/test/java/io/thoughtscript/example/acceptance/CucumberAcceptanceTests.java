package io.thoughtscript.example.acceptance;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.boot.test.context.SpringBootTest;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

// Looks like this assumes the root dir test/resources/...
@SelectClasspathResource("features")
// This the test package containing the actual Java Step Definition Classes
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "io.thoughtscript.example.acceptance")

// These are required for Cucumber to get picked up by Jupiter during maven-sure-fire.
@Suite
@IncludeEngines("cucumber")

// These are required by Spring
@CucumberContextConfiguration
@SpringBootTest()
public class CucumberAcceptanceTests {
}