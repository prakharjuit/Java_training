
package Test_ng_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class Dependencies {
  
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window();	
		}
	@Test(groups= {"healthsetup"})
	public void HealthSetup()
	{
		driver.get("https://o2.openmrs.org/openmrs/login.htm");	
	}	
	@Test(groups= {"login"})
	//@Ignore
	public void Login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		
		driver.findElement(By.id("Registration Desk")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	}
//	@Test(dependsOnMethods= {"HealthSetup","Login"})
//	public void patientRegister() throws InterruptedException
//	{
//		driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[1]/input")).sendKeys("XYZ");
//		
//		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[3]/input")).sendKeys("ABC");
//		driver.findElement(By.id("next-button")).click();
//		driver.findElement(By.xpath("//option[@value='M']")).click();
//		driver.findElement(By.id("next-button")).click();
//		driver.findElement(By.xpath("//input[@id='birthdateDay-field']")).sendKeys("22");
//		driver.findElement(By.xpath("//select[@id='birthdateMonth-field']")).sendKeys("");
//		driver.findElement(By.xpath("//select[@id='birthdateYear-field']")).sendKeys("2002");
//		driver.findElement(By.id("next-button")).click();
//		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[2]/div/fieldset[1]/p[2]/input")).sendKeys("abcabcabc");
//		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[2]/div/fieldset[1]/p[4]/input")).sendKeys("xyzxyzxyz");
//		driver.findElement(By.id("cityVillage")).sendKeys("lucknow");
//		driver.findElement(By.id("stateProvince")).sendKeys("uttar pradesh");
//		driver.findElement(By.id("postalCode")).sendKeys("226006");
//		driver.findElement(By.id("next-button")).click();
//		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[2]/div/fieldset[2]/p/input")).sendKeys("1234567890");
//		driver.findElement(By.id("next-button")).click();
//		driver.findElement(By.id("next-button")).click();
//		driver.findElement(By.id("submit")).click();
//		
//		
//		
//		
//		
//	}
}
