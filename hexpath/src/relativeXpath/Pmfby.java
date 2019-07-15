package relativeXpath;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pmfby {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://pmfby.gov.in/");
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window " + parent);
		driver.findElement(By.xpath("//a[@class='newHeader__ciListDetail___1B26A undefined']")).click();
		Thread.sleep(4000);
		
		Select seasson = new Select(driver.findElement(By.xpath("(//select[@placeholder='Select Pack'])[1]")));
		seasson.selectByValue("01///Kharif");
		

		Select year = new Select(driver.findElement(
				By.xpath("//label[contains(text(),'Year ')]/following-sibling::select[@placeholder='Select Pack']")));

		year.selectByValue("2019");

	}

}
