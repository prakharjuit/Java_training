// TransferRunner.java
package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "classpath:features",
    glue = "stepDefinition",
    plugin = {"pretty", "html:target/cucumber-transfer-report.html"},
    tags = "@transfer",
    monochrome = true
)
public class TransferRunner extends AbstractTestNGCucumberTests {
   
}
