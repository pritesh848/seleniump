package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/");

		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//img[@alt='context menu rendered by $.contextMenu']"));
		action.contextClick(button).build().perform();

	}

}
