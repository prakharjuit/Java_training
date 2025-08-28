package Test_ng_4;
 
import org.testng.IDataProviderListener;
import org.testng.IDataProviderMethod;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
 
public class Dataprovider implements IDataProviderListener {
	
	@Override
    public void beforeDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method, ITestContext iTestContext) {
        log("Commencing", dataProviderMethod, method);
    }
 
	private void log(String message, IDataProviderMethod dataProviderMethod, ITestNGMethod method) {
	    System.out.println(message + " DataProvider: "
	        + dataProviderMethod.getMethod().getName()
	        + " for Test Method: " + method.getMethodName());
	}
 
 
	@Override
    public void afterDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method, ITestContext iTestContext) {
        log("Completed", dataProviderMethod, method);
    }
 
 
}