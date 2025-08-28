package Day3;

import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.util.Properties;

public class LoginInsta {
public static void main(String [] args) throws InterruptedException,IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\prakhar\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 Properties prop = new Properties();
     FileInputStream fis = new FileInputStream("src/Day3/config1.properties");
     prop.load(fis);
     String email = prop.getProperty("email1");
     String password = prop.getProperty("pass");
     driver.get("https://www.instagram.com/accounts/login/");

//     driver.findElement(By.className("whsOnd zHQkBf")).click();
     Thread.sleep(2000);
     driver.findElement(By.name("username")).sendKeys(email);
     driver.findElement(By.name("password")).sendKeys(password);

     Thread.sleep(2000); 
     driver.findElement(By.xpath("//button[@type='submit']")).click();

    
	
}
}
