package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/images/icons/order-online.svg']/following-sibling::span[@class='label']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='location prompt']")).sendKeys("new sangvi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='results']/child::a[@class='result']/child::div[@class='content']/child::div[contains(text(),'New Sangvi')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='malhar Restaurant, Pimple Saudagar']")).click();

	}

}
