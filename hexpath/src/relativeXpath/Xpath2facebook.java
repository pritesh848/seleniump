package relativeXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2facebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pritesh848@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9970793632");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_6a _6b uiPopover _1io_ _5v-0']")).click();
		driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']/a")).click();
	//	driver.findElement(By.xpath("//ul[@class='_54nf']/li[8]/a")).click();

	}

}
