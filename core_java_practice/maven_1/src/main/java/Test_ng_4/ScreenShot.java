package Test_ng_4;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.nio.file.Files;

public class ScreenShot {
   WebDriver driver;
   
   @BeforeMethod
   public void setup()
   {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://amazon.in");
   }
   @Test
   public void screenshot() throws IOException
   {
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   
	   File destination = new File("C:\\Users\\prakhar\\Desktop\\project\\google.png");
	   Files.copy(src.toPath(), destination.toPath(),StandardCopyOption.REPLACE_EXISTING);
       System.out.println("Screenshot saved to: " + destination.getAbsolutePath());
   }
}
