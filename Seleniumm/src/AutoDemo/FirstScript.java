package AutoDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
public static void main(String []  args)
{


	        // 1. Set path to ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
	        
	        // 2. Create a new ChromeDriver instance
	        WebDriver driver = new ChromeDriver();
	        
	        // 3. Open Google
	        driver.get("https://www.google.com");
	        
	        // 4. Maximize the window
	        driver.manage().window().maximize();
	        
	        // 5. Find the search box and type "Selenium"
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("Selenium");
	        
	        // 6. Submit the search
	        searchBox.submit();
	        
	        // 7. Wait for 3 seconds to see results
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        // 8. Close the browser
	        driver.quit();
	    }
	


}
