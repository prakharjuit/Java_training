package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxScript {

    public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\prakhar\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");


        WebDriver driver = new FirefoxDriver();

       driver.get("https://www.google.com");
       Thread.sleep(3000);

       // open YouTube in the same tab
       driver.get("https://www.youtube.com");
       Thread.sleep(3000);

       driver.quit();
   }
}
