package AutoDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class FirefoxScript {



	    public static void main(String[] args) throws InterruptedException {
	        
	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		        

		        WebDriver driver = new ChromeDriver();
		        

		        driver.get("https://www.google.com");
		        
		        Thread.sleep(3000);
		        
		        
		        //driver.switchTo().window("www.youtube.com");
		        //driver.switchTo().newWindow(WindowType.TAB);
		        driver.get("https://www.youtube.com");
		        Thread.sleep(3000);
	        

	        

	        //driver.quit();
	    }
	}


