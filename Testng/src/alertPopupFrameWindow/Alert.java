package alertPopupFrameWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Alert {
	WebDriver driver;
	@BeforeSuite
	public  void brouserLaunch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		
	}
	@Test
	private void A() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),' Start Practising ')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div/a[contains(text(),'Javascript Alerts')]")).click();
		
		

	}
	@Test(priority=1)
	private void B() {
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		driver.switchTo().alert().accept();

	}
	@Test
	private void Calender() {
		int i = 3;
		int j=2;
		driver.findElement(By.xpath("(//a[contains(text(),'Date pickers')])[2]")).click();
		driver.findElement(By.xpath("(//li/ul/li/a[contains(text(),'Bootstrap Date Picker')])[2]")).click();
		driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']")).click();
     driver.findElement(By.xpath("//div[@class='datepicker-days']/table[@class='table-condensed']//tr[2]/td[3]")).click();
	}
	
	
}
