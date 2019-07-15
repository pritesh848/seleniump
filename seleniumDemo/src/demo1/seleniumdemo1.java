package demo1;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.math.IEEE754rUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class seleniumdemo1 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.Firefox.driver", "D:\\testing\\All jar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("avanger end game");
//		driver.findElement(By.xpath("//input[@value='Google Search']")).click();

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("pritesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='VlcLAe']//center/input[1]")).click();
	}

}