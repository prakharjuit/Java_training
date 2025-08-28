package Test_ng_4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {

	 WebDriver driver;
	   
	   @BeforeMethod
	   public void setup() throws InterruptedException
	   {
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://the-internet.herokuapp.com/context_menu");
		   Thread.sleep(2000);
	   }
	   @Test
	   public void rightCkick() throws  InterruptedException
	   {
		   //driver.findElement(By.id("hot-spot"));
		   WebElement rightClickBtn = driver.findElement(By.id("hot-spot"));
		   Actions action = new Actions(driver);
		   action.contextClick(rightClickBtn).perform();
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
	   }
	   
}
