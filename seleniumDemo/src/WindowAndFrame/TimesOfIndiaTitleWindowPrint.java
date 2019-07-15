package WindowAndFrame;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;

public class TimesOfIndiaTitleWindowPrint {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
	
		driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//div[@class='top-story']/ul/li"));
			Actions action = new Actions(driver);
			List<WebElement> allwindow =  driver.findElements(By.xpath("//div[@class='top-story']/ul/li"));

			Robot robo = new Robot();
		/* Thread.sleep(3000); */
			
			for (WebElement webElement : allwindow) {
				//webElement.click();
				action.contextClick(webElement).click().build().perform();
				robo.keyPress(KeyEvent.VK_DOWN);
				robo.keyPress(KeyEvent.VK_DOWN);
				robo.keyPress(KeyEvent.VK_DOWN);
				robo.keyPress(KeyEvent.VK_ENTER);	
			}
			
			

            int nums = allwindow.size();
            System.out.println(nums);
            for (int i = 0; i < allwindow.size(); i++) {
            	System.out.println(allwindow.get(i).getText());
				
			}
            
            
	}

}
