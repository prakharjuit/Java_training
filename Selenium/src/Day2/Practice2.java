package Day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.PageLoadStrategy;
public class Practice2 {
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     

	 ChromeOptions chromeOptions = new ChromeOptions();
	 chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
	    WebDriver driver = new ChromeDriver(chromeOptions);  
	    
	    driver.get("https://www.google.com");
	    
	    driver.close();
	    
}
}
