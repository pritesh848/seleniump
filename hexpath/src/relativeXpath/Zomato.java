package relativeXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/pune/restaurants");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("//div[@id='explore-keywords-dropdown']/preceding-sibling::div/descendant::*[10]")).sendKeys("kailas pure veg");
      //  driver.findElement(By.xpath("//input[@class='location prompt']")).sendKeys("mumbai");
        //driver.findElement(By.xpath("//span[@class='hide-on-mobile']")).click();
        driver.findElement(By.xpath("//span[@class='search-bar-icon mr5']/parent::div[@class='k-pre-2 w100']")).sendKeys("pure veg");
    //    driver.findElement(By.xpath("//span[@class='search-bar-icon mr5']/parent::div[@class='k-pre-2  w100']"))
	}

}
