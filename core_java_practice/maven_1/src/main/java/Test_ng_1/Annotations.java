package Test_ng_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Annotations {
    WebDriver driver;
    @BeforeSuite
    public void beforeSuite()
    {
    	System.out.println("Before suite - setup reports");
    }
    @BeforeTest
    public void beforeTest()
    {
    	System.out.println("Before test - Launch browser");
    	
    }
    @BeforeClass
    public void beforeClass()
    {
    	System.out.println("Before class - open application");
    	driver.get("www.google.com");
    }
    @BeforeMethod
    public void beforeMethod()
    {
    	System.out.println("Before method - login if required.");
    }
    @Test(priority=1)
    public void testSearch()
    {
    	System.out.println("Tesst search product");
    	driver.findElement(By.id("")).sendKeys("");
    	
    }
    @Test(priority=2)
    public void testTitle()
    {
    	System.out.println("Tesst verify title");
    	String title= driver.getTitle();
    	System.out.println("title"+title);
    	
    }
}
