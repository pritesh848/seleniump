package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_']/child::span[contains(text(),'Electronics')]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("java by kanatkar");
      driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//img[@class='_1Nyybr  _30XEf0' and @src='https://rukminim1.flixcart.com/image/612/612/jpu324w0/book/7/7/4/java-projects-original-imafbyz2n8dmyurh.jpeg?q=70']")).click();
 
	}

}
