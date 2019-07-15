package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("http://mrbool.com/");
    Actions action = new Actions(driver);
    action.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).build().perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//ul[@class='submenu']/li/a[contains(text(),'Articles')]")).click();
	}

}
