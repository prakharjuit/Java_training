package Day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserName {

		    public static void main(String[] args) throws InterruptedException {
		    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			        

			    WebDriver driver = new ChromeDriver();
			        

			    driver.get("https://www.google.com");
			        
			    Thread.sleep(3000);
//
//		        driver.get("https://www.youtube.com");
//		        Thread.sleep(3000);
//		        ChromeOptions options= new ChromeOptions();
//	            String browserName = options.getBrowserVersion();
	            //System.out.println(browserName);
	            Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
	            String browserVersion = caps.getBrowserVersion();
	            String browserName = caps.getBrowserName();
	            // Print browser info
	            System.out.println("Browser Name: " + browserName);
	            System.out.println("Browser Version: " + browserVersion);
	            System.out.println("Platform Name: "+caps.getPlatformName());
	            System.out.println("Capabilites Name: " + caps.getCapabilityNames());
	            

	            
		        driver.quit();
		    }
		}




