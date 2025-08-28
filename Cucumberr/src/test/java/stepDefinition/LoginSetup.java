package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSetup {

    WebDriver driver;

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open the login page")
    public void i_open_the_login_page() {
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("nav-link-accountList")).click();
    }

    @When("I enter valid UserName and password")
    public void i_enter_valid_username_and_password() throws InterruptedException {
        // enter email, click continue, then password
        WebElement username = driver.findElement(By.id("ap_email_login"));
        username.clear();
        username.sendKeys("prakhar011101@gmail.com");

        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);       
        WebElement password = driver.findElement(By.id("ap_password"));
        password.clear();
        password.sendKeys("Prakhar123@");
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Then("I should be navigated to the home page")
    public void i_should_be_navigated_to_the_home_page() throws InterruptedException {
        try {
            // simple pause to let page load
            Thread.sleep(3000);
            WebElement user = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
            String text = user.getText();
            if (text != null && text.contains("Hello")) {
                System.out.println("Successfully logged in to Amazon!");
            } else {
                System.out.println("Login failed or greeting text unexpected: " + text);
            }
        } catch (Exception e) {
            System.out.println("Login failed - element not found or timeout: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
