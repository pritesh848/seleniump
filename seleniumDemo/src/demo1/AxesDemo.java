package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesDemo {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("mumbai");
	
	driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText']")).click();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[3]/div[4]/div[@aria-disabled='false'][2]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBlack widgetSearchBtn ']")).click();




//String title = driver.getTitle();
//System.out.println(title);
//  if(title.equals("google")) {
//	  System.out.println("incorrct title");
//  }else {
//	  System.out.println("correct");
//  }
//  
//  System.out.println(driver.getCurrentUrl());
//  
//  driver.quit();
}
}
