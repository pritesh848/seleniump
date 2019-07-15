package javaScriptExecutior;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManualFindingXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName(\"q\")[0].setAttribute(\"id\",\"pritesh\");");
		Thread.sleep(2000);
		driver.findElement(By.id("pritesh")).sendKeys("tested ok");
		js.executeAsyncScript("document.getElementsByTagName(\"input\")[5].click();");

	}

}
