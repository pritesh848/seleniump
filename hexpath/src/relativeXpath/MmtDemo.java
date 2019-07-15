package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MmtDemo {

	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.makemytrip.com/");
	   driver.findElement(By.xpath("//label[@for='departure']/child::span[@class='lbl_input latoBold appendBottom10']")).click();
      
	}

}
