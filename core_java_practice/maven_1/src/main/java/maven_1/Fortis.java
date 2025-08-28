package maven_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fortis {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.fortishealthcare.com/");
        Thread.sleep(3000);

        // Step 1: Click homepage Book Appointment button
        WebElement bookBtn = driver.findElement(By.xpath("//*[contains(text(),'Book Appointment')]"));
        bookBtn.click();
        Thread.sleep(5000);

        // Step 2: Click the first doctor/hospital card
        WebElement firstDoctor = driver.findElement(
            By.xpath("//*[@id='block-fortis-content']/div[2]/div[1]/div[1]/div/div[1]/a")
        );
        firstDoctor.click();
        Thread.sleep(4000);

        System.out.println("Clicked first doctor/hospital link successfully!");

        driver.quit();
    }
}
