package Test_ng_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Instagram {
	 WebDriver driver;

	   
	    private final String USERNAME = "test_selenium_prakhar";
	    private final String PASSWORD = "Prakhar123@";
	   
	    private final String IMAGE_PATH = "C:\\path\\to\\image.jpg";
	   

	    @BeforeClass
	    public void setup() throws InterruptedException {
	     
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.instagram.com/");
	        Thread.sleep(3000); // let page load
	    }

	    @Test(priority = 0)
	    public void login() throws InterruptedException {
	        
	        driver.findElement(By.name("username")).sendKeys(USERNAME);
	        driver.findElement(By.name("password")).sendKeys(PASSWORD);

	        
	        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button")).click();
	        Thread.sleep(5000); // wait for login & redirect


	        System.out.println("Login attempted. If Instagram requests 2FA, complete it manually.");
	    }

	    @Test(priority = 1)
	    public void postImage() throws InterruptedException {
//	      
//	    	WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
//	        Thread.sleep(1500);
//	        uploadInput.sendKeys( "C:\\Users\\prakhar\\Downloads\\Leo_messi_barce_2005.webp");
	        
//	        driver.findElement(By.cssSelector("input[type='file']")).sendKeys(IMAGE_PATH);
//	        Thread.sleep(3000); // wait for upload preview

	        // Click Next
	        driver.findElement(By.xpath("//*[@id=\"mount_0_0_H1\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[7]")).click();
	        Thread.sleep(1500);

	        // Now locate the hidden input[type='file']
	        WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));

	        // Send file path
	        uploadInput.sendKeys( "C:\\Users\\prakhar\\Downloads\\Leo_messi_barce_2005.webp");

	        Thread.sleep(3000);

	        
	        driver.findElement(By.xpath("//textarea[@aria-label='Write a caption…' or @aria-label='Write a caption']")).sendKeys("Automated post - test");
	        Thread.sleep(500);

	       
	        driver.findElement(By.xpath("//button[contains(.,'Share') or contains(.,'Post')]")).click();
	        Thread.sleep(5000); // wait for post to complete

	        System.out.println("Post attempted. Check your Instagram feed to verify.");
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	           // driver.quit();
	        }
	    }
}
