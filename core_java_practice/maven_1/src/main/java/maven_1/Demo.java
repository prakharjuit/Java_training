package maven_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/java/maven_1/config.properties");
        prop.load(fis);
        String email = prop.getProperty("email2");
        String password = prop.getProperty("password");

        // list of items to search
        String[] items = {"laptop", "mouse", "keyboard"};

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(1500);

        driver.findElement(By.id("ap_email_login")).sendKeys(email);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(3000);

        System.out.println("Login attempted");

        // loop through each item
        for (String item : items) {
            driver.findElement(By.id("twotabsearchtextbox")).clear();
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
            driver.findElement(By.id("nav-search-submit-button")).click();
            Thread.sleep(2000);

            driver.findElement(By.name("submit.addToCart")).click(); Thread.sleep(2000);

            // go back to home page for next search
            driver.get("https://www.amazon.in/");
            Thread.sleep(2000);
        }

        System.out.println("All items attempted to add.");
    }
}
