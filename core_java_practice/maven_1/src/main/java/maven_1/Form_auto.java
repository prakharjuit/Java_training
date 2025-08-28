package maven_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form_auto {
	 public static void main(String[] args) throws InterruptedException {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("https://demoqa.com/automation-practice-form");
	            Thread.sleep(2000);
	            driver.findElement(By.id("firstName")).sendKeys("prakhar");
	            driver.findElement(By.id("lastName")).sendKeys("chauhan");
	            driver.findElement(By.cssSelector("#userEmail")).sendKeys("chauhanprakhar536@gmail.com");
	            driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
	            driver.findElement(By.id("userNumber")).sendKeys("9517292881");
	            //driver.findElement(By.id("dateOfBirthInput")).sendKeys("01 Oct 2001");
	            driver.findElement(By.id("dateOfBirthInput")).click();
	            driver.findElement(By.className("react-datepicker__month-select")).click();
	             
	            driver.findElement(By.xpath("//option[text()='April']")).click();
	            Thread.sleep(3000);
	             
	            driver.findElement(By.className("react-datepicker__year-select")).click();
	             
	            driver.findElement(By.xpath("//option[text()='2003']")).click();
	            Thread.sleep(3000);
	             
	            driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[4]")).click();
	           WebElement sub = driver.findElement(By.id("subjectsInput"));
	             sub.sendKeys("English");
	            sub.sendKeys(Keys.DOWN,Keys.ENTER);
	            
	            //driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[1]]/div[2]/div[1]")).click();
	           // driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[1]/div[2]/div[1]")).click();

	            driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\prakhar\\Downloads\\profo.jpg");
	            driver.findElement(By.id("currentAddress")).sendKeys("nishatganj,lucknow");
	            WebElement state=driver.findElement(By.id("react-select-3-input"));
	            state.sendKeys("uttar pradesh");
	            state.sendKeys(Keys.DOWN,Keys.ENTER);
	            WebElement city=driver.findElement(By.id("react-select-4-input"));
		        city.sendKeys("lucknow");
		        city.sendKeys(Keys.DOWN,Keys.ENTER);		
		        
		        WebElement submit = driver.findElement(By.id("submit"));
		        submit.click();
	            
	            
	            
	            
	            


	    }
}
