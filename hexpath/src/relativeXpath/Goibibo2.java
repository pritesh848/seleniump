package relativeXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo2 {

	public static void main(String[] args) throws InterruptedException {
		String month = "July 2019";
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement e = driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']"));
		e.sendKeys("pune");
		Thread.sleep(2000);
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ENTER);
		// Thread.sleep(1000);

		WebElement d = driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));

		d.sendKeys("delhi");
		Thread.sleep(2000);
		d.sendKeys(Keys.ARROW_DOWN);
		d.sendKeys(Keys.ENTER);

		// driver.findElement(By.xpath("//div[@class='fltHpyImg']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();

		String mn = driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption' and contains(text(),'June 2019')]")).getText();
		System.out.println(mn);

		// System.out.println(mn);
		if (!mn.equals(month)) {
			
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='fare_20190724']")).click();
		}

//      driver.findElement(By.xpath("//div[@id='fare_20190626']")).click();
//      
//      driver.findElement(By.xpath("//button[@class='fb button orange large ht55 fltHpySrchBtn']")).click();
//      Thread.sleep(1000);
//   //   List<WebElement> sd = driver.findElements(By.xpath("//span[@class='clearfix db padT3']"));
//      List<WebElement> sp= driver.findElements(By.xpath("//span[@class='clearfix db padT3']"));
//      Thread.sleep(3500);
//  //   System.out.println(sp.size());
//     System.out.println(sp);
//      for (int i = 0; i < sp.size(); i++) {
//		String se = sp.get(i).getText().replace(",", "");
//		System.out.println(se);
//	}
//      
	}

}
