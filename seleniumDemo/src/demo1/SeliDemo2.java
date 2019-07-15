package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SeliDemo2 {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
	//	driver.get("https://secunderabad.rrbonlinereg.in/");
	driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Pritesh Raje");;
		
	}

}



