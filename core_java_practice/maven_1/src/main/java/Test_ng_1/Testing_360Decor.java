package Test_ng_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Testing_360Decor {
	
	WebDriver driver;
	 @BeforeClass
	    public void setup() {
	        // set ChromeDriver path (only if not already in PATH)
	       // System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @BeforeMethod
	    public void homeDecor() {
	        driver.get("https://360homedecor.uk");
	        String title = driver.getTitle();
	        System.out.println("Page title: " + title);
	    }
	    @Test(priority=1)
	    public void login()
	    {
	    	driver.findElement(By.id("check_login")).click();
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[1]/form[1]/div[2]/div[1]/input")).sendKeys("chauhanprakhar536@gmail.com");
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[1]/form[1]/div[2]/div[2]/input")).sendKeys("121212");
	    	driver.findElement(By.xpath("//*[@id=\"existed_user_login\"]/div[5]/button")).click();
	    	//*[@id="existed_user_login"]/div[5]/button
	    	
	    	
	    }
	    

    	
    	 
    
}
