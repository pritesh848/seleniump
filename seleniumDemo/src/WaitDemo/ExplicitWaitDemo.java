package WaitDemo;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		FluentWait wait = new FluentWait(driver);
	//	WebDriverWait wait2= new WebDriverWait(driver, 10);
		
		wait.pollingEvery(100, TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'I am a Professional')]")));
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("priteshh");

	}

}



