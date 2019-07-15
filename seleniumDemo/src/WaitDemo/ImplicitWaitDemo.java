package WaitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'I am a Professional')]")).click();
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("priteshh");

	}

}
