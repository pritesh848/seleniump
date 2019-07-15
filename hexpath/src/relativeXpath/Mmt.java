package relativeXpath;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mmt {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
		driver.findElement(By.xpath("//span[contains(text(),'Pune')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Destination']")).sendKeys("Delhi (DEL)");	
		driver.findElement(By.xpath("//span[contains(text(),'Delhi')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		
	//	List<WebElement> priceDays=driver.findElements(By.xpath("//span[contains(@id,'price')]"));
      //   Iterable itr = priceDays.i 
	}

}
