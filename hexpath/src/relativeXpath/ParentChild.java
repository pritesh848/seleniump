package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing shastra");
		driver.findElement(By.xpath("//div[@style='height:233px;margin-top:89px']")).click();
		driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[2]")).click();

	}

}
