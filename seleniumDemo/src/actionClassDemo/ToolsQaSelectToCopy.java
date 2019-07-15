package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolsQaSelectToCopy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
		Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='contextMenuItem'][1]")).click();
		//action.moveToElement(click).build().perform();
	}

}
