package relativeXpath;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://retail.onlinesbi.com/retail/logout.htm");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@title='Forms']")).click();

		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> itr = allWindow.iterator();
		while (itr.hasNext()) {

			String title = driver.switchTo().window(itr.next()).getTitle();
			System.out.println(title);
			if (title.equals("State Bank of India - Personal Banking")) {
				//driver.switchTo().window(itr.next());//>>why not needed

				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[contains(text(),'Mobile / DTH Recharge')]")).click();
			}
		}
		
		driver.switchTo().window(parent);  //not working as default , if taken window(parent) then working
	//	String title1 = driver.switchTo().window(itr.next()).getTitle();
	//	System.out.println(title1);
		driver.findElement(By.xpath("//a[contains(text(),'About Online SBI')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[contains(text(),'State Bank mCASH - Claim Money')]")).click();
		
	}

}
