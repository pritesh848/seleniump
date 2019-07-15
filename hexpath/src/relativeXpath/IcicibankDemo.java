package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IcicibankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");
	//	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
       driver.findElement(By.xpath("//span[@class='pl-login-box']")).click();
       driver.findElement(By.xpath("(//a[@style='color: rgb(240, 120, 0);'])[1]")).click();
     //input[@class='ui-autocomplete-input']
       driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys("jkhsdlkjas");
       driver.findElement(By.xpath("//input[@id='Search']/following-sibling::input[@value='Search']")).click();
       
       
	}

}
