package Test_ng_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EcommerceTests {

	WebDriver driver;

	@BeforeClass
	public void goHome()
	{
		driver=new ChromeDriver();
		driver.get("https://amazon.in");
	}
	@Test(groups= {"smoke"})
	public void testTitle() throws InterruptedException
	{
		 System.out.println("Smoke-test title check");
	        Thread.sleep(1000);
	        System.out.println("page title: " + driver.getTitle());
	}
	@Test(groups= {"regression"})
	public void testSearch() throws InterruptedException
	{
		System.out.println("Regression-test Search");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);
	}
	@Test(groups= {"sanity"})
	public void TestCart()
	{
		System.out.println("Sanity-regression-cart test");
	}
	@AfterClass
	public void teardown()
	{
		 try {
		        if (driver != null) {
		            driver.quit();
		        }
		    } catch (Exception e) {
		        System.out.println("Teardown error (ignored): " + e.getMessage());
		    }
	}
}
