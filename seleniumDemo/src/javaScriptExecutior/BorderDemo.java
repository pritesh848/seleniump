 package javaScriptExecutior;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BorderDemo {
	public static void flash(WebElement element,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgcolour = element.getCssValue("backgroundcolour");
		for (int i = 0; i <100; i++) {
			changeColour("rgb(0,200,0)", element, driver);
			changeColour(bgcolour, element, driver);
			
		}


	}
	public static void changeColour(String colour, WebElement element , WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundcolour = '"+colour+"'", element);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}

	}
	public static  void drawborder(WebElement element , WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='4px solid red'", element);


	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		drawborder(login, driver);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\testing\\screenshot\\flikart.jpg"));

	}

}
