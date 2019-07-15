package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MmtmouseDemo {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
	driver.get("https://www.makemytrip.com/");
	action.moveToElement(driver.findElement(By.xpath("//span[@class='chNavText']"))).build().perform();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[@class='moreOption font16 latoBold']/a[4]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'My Biz')]")).click();
		
		
	}

}
