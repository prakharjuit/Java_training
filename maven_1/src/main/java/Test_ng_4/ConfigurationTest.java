package Test_ng_4;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyConfigurationListener.class)
public class ConfigurationTest {

	@BeforeMethod
	public void beforeMethod1()
	{
		System.err.println("Executing configuration method before method 1");
	}
	@Test
	public void testMethod()
	{
		System.err.println("Executing test method");
	}
}
