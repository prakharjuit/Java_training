package maven_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usecase2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.maxhealthcare.in/");
            Thread.sleep(2000);

            // Search Doctor/Specialty
            Thread.sleep(2000);

         // Doctor input
         // Doctor input
            WebElement doc = driver.findElements(By.cssSelector("div.ng-input input[role='combobox']")).get(0);
            doc.sendKeys("Cardiology");
            Thread.sleep(1500);
            doc.sendKeys(Keys.ENTER);

            Thread.sleep(1500);


         // Location input
         // Location input
            WebElement loc = driver.findElements(By.cssSelector("div.ng-input input[role='combobox']")).get(1);
            loc.sendKeys("Lucknow");
            loc.sendKeys(Keys.ENTER);

            Thread.sleep(2000);



            // Wait and click the first radio button
            Thread.sleep(3000);
            WebElement firstRadio = driver.findElement(By.cssSelector("input[type='radio']"));
            firstRadio.click();

            System.out.println("Doctor and location selected successfully.");
            
         //// Wait for doctor results to load
            Thread.sleep(4000); // wait for doctors to load

            // Using CSS selector you provided
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[4]/div[1]/div/div[2]/div/div[2]/div/button")).click();

            
            Thread.sleep(2000);
            WebElement phoneInput = driver.findElement(By.id("adsasd"));
            phoneInput.clear();
            phoneInput.sendKeys("9517292881");
            
            driver.findElement(By.cssSelector("#tab-mobile-number > form > input")).click();



            System.out.println("Hospital Consultation button clicked successfully!");


        } finally {
            // driver.quit();
        }
    }//*[@id="content"]/div/div/div[4]/div[1]/div/div[2]/div/div[2]/div/button
}
