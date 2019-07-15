package XpathDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class XpathDemo {
	WebDriver driver;
	@BeforeSuite
	public  void brouserLaunch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.cssSelector("#onesignal-popover-cancel-button")).click();
		//Thread.sleep(3000);
	//	driver.switchTo().frame(0);
		//driver.switchTo().defaultContent();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
		
	}
	@BeforeMethod
	public void popupClose() {
	
				
		

	}
	
	@Test
	public void Click() {
		driver.findElement(By.xpath("//div[@class='mc-closeModal']")).click();

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("testing shastra");
		driver.findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("test123@gmail.com");
        driver.findElement(By.xpath("//*[@class='btn btn-hero btn-primary btn-block text-center btnsignup']")).click();
	}
	@AfterSuite
	public void DriverClose() {
	  // driver.close();

	}
	

}
