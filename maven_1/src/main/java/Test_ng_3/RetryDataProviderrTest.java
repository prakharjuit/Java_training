package Test_ng_3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RetryDataProviderrTest {

	@DataProvider(name="data")
	public Object[][] getData()
	{
		return new Object[][]
				{
			{"value1"},
			{"value2"},
			{"value3"},
			
				};
	}
	@Test(dataProvider="data",retryAnalyzer=RetryAanalyzer.class)
	public void testWithData(String input)
	{
		System.out.println("Running test with input: "+ input);
		Assert.assertTrue(input.contains("2"),"only value2 should pass");
		
	}
}
