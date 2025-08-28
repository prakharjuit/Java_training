package maven_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Appointment {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            Thread.sleep(800);

            // Click Make Appointment
            driver.findElement(By.id("btn-make-appointment")).click();
            Thread.sleep(700);

            // Login
            driver.findElement(By.id("txt-username")).sendKeys("John Doe");
            driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
            driver.findElement(By.id("btn-login")).click();
            Thread.sleep(1000);

            driver.findElement(By.id("combo_facility")).sendKeys("Seoul CURA Healthcare Center");
            Thread.sleep(300);

            if (!driver.findElement(By.id("chk_hospotal_readmission")).isSelected()) {
                driver.findElement(By.id("chk_hospotal_readmission")).click();
            }
            Thread.sleep(200);


            driver.findElement(By.id("radio_program_medicaid")).click();
            Thread.sleep(200);

            String date = "2025-09-01";
            ((JavascriptExecutor) driver).executeScript(
                "document.findElementBy.id('txt_visit_date').value = arguments[0];",
                date
            );
            Thread.sleep(300);


            driver.findElement(By.id("txt_comment")).sendKeys("Simple automated booking.");

            Thread.sleep(300);


            driver.findElement(By.id("btn-book-appointment")).click();
            Thread.sleep(4000);

            System.out.println("Booking attempted. Check browser for confirmation.");

            Thread.sleep(4000);
        } finally {
            driver.quit();
        }
    }
}
