package AutoDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleScript {


	
	    public static void main(String[] args) {
	        
      try
      {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        

	        WebDriver driver = new ChromeDriver();
	        

	        driver.get("https://www.google.com");
	        
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("Selenium Dev");
	        
	        searchBox.submit();
	        Thread.sleep(10000);
            WebElement firstResult = driver.findElement(By.cssSelector("h3"));
            firstResult.click();
            
            System.out.println(firstResult);

            Thread.sleep(5000);

            driver.quit();
	     
      }
	        

      catch (InterruptedException e) {
          e.printStackTrace();
      }
	    }
}
