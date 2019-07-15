package actionClassDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnionBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.unionbankofindia.co.in/english/home.aspx");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Online Services']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li/a[@title='Saving Account' and @target='_blank']")).click();
		String parent = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> itr = allwindows.iterator();
	    
		while(itr.hasNext()) {
			driver.switchTo().window(itr.next());
   System.out.println(driver.switchTo().window(itr.toString()));
			if(!itr.equals(parent)) {
				driver.switchTo().window(itr.next());
								driver.findElement(By.xpath("//input[@value='Full Name*']")).sendKeys("pritesh");
			}
		
		}
	
	}
}
