package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Throw;

public class AmazonDemo {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(1000);
	//  driver.findElement(By.xpath("//div[@id='nav-xshop']/child::script[@type='text/javascript']/following-sibling::a[@class='nav-a' and @tabindex='22']")).click();
      driver.findElement(By.xpath("//div[@id='nav-xshop']/child::script[@type='text/javascript']/following-sibling::a[@class='nav-a' and contains(text(),'Today')]")).click();

	}

}
