package Day3;
import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.util.Properties;

public class Practice1 {
public static void main(String [] args) throws InterruptedException,IOException
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 Properties prop = new Properties();
     FileInputStream fis = new FileInputStream("src/Day3/config.properties");
     prop.load(fis);
     String email = prop.getProperty("email");
     String password = prop.getProperty("password");
     String resume_path = prop.getProperty("resume_path");
		 
		 driver.get("https://www.naukri.com/nlogin/login");
         driver.findElement(By.id("login_Layer")).click();
         Thread.sleep(2000);
         WebElement emailField = driver.findElement(By.id("usernameField"));
         emailField.sendKeys(email);
         WebElement passwordField = driver.findElement(By.id("passwordField"));
         passwordField.sendKeys(password);
         driver.findElement(By.xpath("//button[text()='Login']")).click();

         System.out.println("Login attempted!");
         Thread.sleep(5000); 
         driver.get("https://www.naukri.com/mnjuser/profile");
         Thread.sleep(3000);
         File resume = new File(resume_path);
         WebElement uploadBtn = driver.findElement(By.id("attachCV"));
         uploadBtn.sendKeys(resume.getAbsolutePath());
	 
		 //driver.quit();
	 
	 
}
}
