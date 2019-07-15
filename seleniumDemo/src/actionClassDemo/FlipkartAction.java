package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAction {
	
	/*1 mouce move
	 * 2 right click
	 * 3 scrool down
	 * 4  doubleckick and hold firs move mouse there
	 * 5 drag and drop
	 * 6 
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Men')]"))).build().perform();
        //action.contextClick(driver.findElement(By.xpath("//span[contains(text(),'Offer Zone')]"))).build().perform();
	  // action.sendKeys(Keys.PAGE_DOWN).build().perform();
	   action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Cart')]"))).build().perform();
	   action.doubleClick().build().perform();
	   
	   
	}

}
