package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WindowType;
//import org.openqa.selenium.ChromeOptions;



public class SelScript {



	    public static void main(String[] args) throws InterruptedException {

	    	 System.setProperty("webdriver.edge.driver", "C:\\Users\\prakhar\\Downloads\\edgedriver_win64\\msedgedriver.exe"); 
	        WebDriver driver = new EdgeDriver();

	        driver.get("https://www.google.com");
	        Thread.sleep(3000);

	        // open YouTube in the same tab
	        driver.get("https://www.youtube.com");
	        Thread.sleep(3000);
	        //ChromeOptions options= new ChromeOptions();
           // String browserName = options.getBrowserName();
            
	        driver.quit();
	    }
	}


