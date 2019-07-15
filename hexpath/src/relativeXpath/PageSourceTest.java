package relativeXpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	
         System.out.println(driver.getPageSource());
	}

}
