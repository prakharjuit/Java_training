package Day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Load credentials from properties file
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/Day3/config.properties");
        prop.load(fis);
        String email = prop.getProperty("email");
        String password = prop.getProperty("pass");

        // Open Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to Gmail
        driver.get("https://accounts.google.com/signin");

        // Enter Email
        driver.findElement(By.id("identifierId")).sendKeys(email);
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);

        // Enter Password
        driver.findElement(By.name("Passwd")).sendKeys(password);
        driver.findElement(By.id("passwordNext")).click();

        // Done
        System.out.println("Login attempted");
    }
}
