package AutoDemo;
import java.time.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Day1 {
public static void main(String[] args)
{
	try
	{
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in");


    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
    searchBox.sendKeys("laptop");

    searchBox.submit();

    Thread.sleep(10000);
    WebElement firstResult = driver.findElement(By.cssSelector("h2 a"));
    firstResult.click();
    //driver.quit();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}
