package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemoTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select tp = new Select(element);
	for (int i = 0; i < 31; i++) {
		tp.selectByIndex(i);
		Thread.sleep(2000);
	}
   System.out.println(tp.getFirstSelectedOption().getText());
   System.out.println(tp.getOptions().get(2).getText());
	}

}
