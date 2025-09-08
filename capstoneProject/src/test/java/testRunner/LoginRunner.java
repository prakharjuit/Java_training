// LoginRunner.java
package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "classpath:features",
    glue = "stepDefinition",
    plugin = {"pretty", "html:target/cucumber-login-report.html"},
    tags = "@login",
    monochrome = true
)
public class LoginRunner extends AbstractTestNGCucumberTests {
    // no additional code required
}
