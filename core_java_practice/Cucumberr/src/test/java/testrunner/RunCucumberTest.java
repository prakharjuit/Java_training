package testrunner;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
 
@Suite
@SelectClasspathResource(".")
@ConfigurationParameter(key=GLUE_PROPERTY_NAME, value="stepDefinition")
@ConfigurationParameter(
	    key = PLUGIN_PROPERTY_NAME,
	    value = "pretty, html:target/cucumber-reports.html, json:target/cucumber.json"
		)
		 
public class RunCucumberTest {
 
}