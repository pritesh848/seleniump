package navigationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationForwardBack {
     WebDriver driver = new ChromeDriver();
     @Test
     public void Wbpage() throws InterruptedException {
		 driver.get("http://www.google.com/");
		   driver.manage().window().maximize();
		 driver.get("http://www.amazon.in/");
		 
		 driver.navigate().back();
		 Thread.sleep(5000);
		 
		 driver.navigate().forward();

	}
     
}
