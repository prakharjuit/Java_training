package Test_ng_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Amazon_test {
 WebDriver driver;
 @BeforeClass
 public void Setup()
 {
	 driver =new ChromeDriver();
	 driver.manage().window().maximize();
 }
 @BeforeMethod
 public void Amazon()
 {
	 driver.get("https://www.amazon.in/");
 }
 @Test(priority=0)
 public void Amazon_login() throws IOException, InterruptedException
 {
	 Properties prop = new Properties();
     FileInputStream fis = new FileInputStream("src/main/java/Test_ng_1/config1.properties");
     prop.load(fis);
     String email = prop.getProperty("email2");
     String password = prop.getProperty("password");
	 driver.findElement(By.id("nav-link-accountList")).click();
     Thread.sleep(1500); 
   
     driver.findElement(By.id("ap_email_login")).sendKeys(email);
     driver.findElement(By.id("continue")).click();
     Thread.sleep(1000);

 
     driver.findElement(By.id("ap_password")).sendKeys(password);
     driver.findElement(By.id("signInSubmit")).click();

   
     Thread.sleep(3000);
 }
 @Test(priority=1)
 public void Amazon_Search() throws InterruptedException
 {
	 String[] items={"Laptop","Mouse","Keyboard"};
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 for (String item : items) {
	        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
	        searchBox.clear();
	        searchBox.sendKeys(item);

	        driver.findElement(By.id("nav-search-submit-button")).click();

	        // wait until "Add to Cart" button appears and click it
	        WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.name("submit.addToCart")));
	        addToCartBtn.click();

	        // go to cart
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-cart"))).click();

	        // go back home for next search
	        driver.get("https://www.amazon.in/");
     }

 }
 @AfterClass
 public void tearDown() {
     if (driver != null) {
         driver.quit();
     }
 }
}
