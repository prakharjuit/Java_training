package maven_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
public class OpenMRS {
public static void main(String [] args)throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://o2.openmrs.org/openmrs/login.htm");
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("Admin");
	driver.findElement(By.id("password")).sendKeys("Admin123");
	driver.findElement(By.id("Registration Desk")).click();
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("fr9793-field")).sendKeys("Prakhar");
	driver.findElement(By.id("fr5608-field")).sendKeys("Singh");
	driver.findElement(By.id("fr584-field")).sendKeys("Chauhan");
	driver.findElement(By.id("next-button")).click();
}
}
