package Day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	 public static void main(String[] args) throws IOException, InterruptedException {
	        // Load credentials from properties file
	        Properties prop = new Properties();
	        FileInputStream fis = new FileInputStream("src/Day3/config1.properties");
	        prop.load(fis);
	        String email = prop.getProperty("email2");
	        String password = prop.getProperty("password");

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");

	        
	        driver.findElement(By.id("nav-link-accountList")).click();
            Thread.sleep(1500); 
          
            driver.findElement(By.id("ap_email_login")).sendKeys(email);
            driver.findElement(By.id("continue")).click();
            Thread.sleep(1000);

        
            driver.findElement(By.id("ap_password")).sendKeys(password);
            driver.findElement(By.id("signInSubmit")).click();

          
            Thread.sleep(3000);
	 
	        System.out.println("Login attempted");
	        
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");

	        driver.findElement(By.id("nav-search-submit-button")).click();
	        
	        Thread.sleep(2000);
	        //driver.findElement(By.cssSelector("h2")).click();
	        driver.findElement(By.xpath("//*[@id=\"8b72cda2-d775-47f2-8838-875bf7f6dafd\"]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2")).click();
	        Thread.sleep(2000);
	        
	    }
}
