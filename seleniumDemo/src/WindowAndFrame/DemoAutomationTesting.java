package WindowAndFrame;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomationTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().config();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[contains(text(),'    click   ')]")).click();
		//String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		Iterator<String> itr = child.iterator();
       
		while (itr.hasNext()) {
			String title = driver.switchTo().window(itr.next()).getTitle();
			System.out.println(title);
			if (title.equals("Sakinalium | Home")) {
				driver.switchTo().window(itr.next());
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("(//a[@style='padding-top: 28px; padding-bottom: 28px;'])[3]"))
						.click();
				
			}	
		}
//		for (String object : child) {
//			if (!object.equals(parent)) {
//				//driver.switchTo().window(itr.next());
//				  driver.switchTo().window(object);
//				  Thread.sleep(2000);
//				driver.findElement(
//						By.xpath("//a[@style='padding-top: 28px; padding-bottom: 28px;' and @href='contact.php']"))
//						.click();
//			}
//		}
		System.out.println(driver.getTitle());
	}

}
