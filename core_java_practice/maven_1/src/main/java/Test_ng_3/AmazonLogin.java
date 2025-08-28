package Test_ng_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.elements.Amazon_elements;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin {

    WebDriver driver;
    Amazon_elements amazon ;           // don't instantiate here

    @BeforeClass
    public void setup() throws InterruptedException {
        // ensure chromedriver binary is available
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        amazon= new Amazon_elements(driver);

        // initialize page object AFTER driver is created
        

        // go to home and open login page
        driver.get("https://www.amazon.in/");
        Thread.sleep(3500);
        driver.findElement(By.id("nav-link-accountList")).click();
    }

    @DataProvider(name = "credentials")
    public Object[][] credentialsProvider() {
        return new Object[][]{
            {"prakhar011101@gmail.com", "Prakhar123@"}
        };
    }

    @Test(dataProvider = "credentials")
    public void loginTest(String username, String password) throws InterruptedException {
        System.out.println("Running login test with: " + username);

        // use page object where useful OR direct driver calls (mixed ok for now)
        // Example: amazon.login.sendKeys(username);  <-- works now because amazon was constructed after driver

        // fill email
        amazon.login.sendKeys("prakhar011101@gmail.com");
        amazon.Continue.click();
        Thread.sleep(1000);

        // fill password
        amazon.password.sendKeys("Prakhar123@");
        amazon.submit.click();
        Thread.sleep(2000);

        // Validation (simple heuristic)
        boolean loginSuccess = driver.getTitle().contains("Amazon") && !driver.getCurrentUrl().contains("signin");
        //Assert.assertTrue(loginSuccess, "Login failed for: " + username);

        // navigate back / prepare for next run
       
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
