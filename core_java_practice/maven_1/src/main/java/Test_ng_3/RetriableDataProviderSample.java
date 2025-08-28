package Test_ng_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RetriableDataProviderSample {

	private boolean throwException=true;
	
	@Test(dataProvider = "test-data")
	public void sampleTestMethod(int input)
	{
		System.err.println("input value = "+ input);
	}
	
	@DataProvider(retryUsing = RetryDataProvider.class, name= "test-data")
	public Object[][] testDataSupplier()
	{
		if(throwException)
		{
			throwException = false;
			System.err.println("Simulating a problem when invoking data provider");
			throw new IllegalStateException("Simulating failure in data provider");
		}
		return new Object[][] {
			{1},{2}
		};
	}

}
