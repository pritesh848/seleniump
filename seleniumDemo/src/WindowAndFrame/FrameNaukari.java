package WindowAndFrame;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class FrameNaukari {
	
	WebDriver driver = new ChromeDriver();
	@Test
	public void Website() throws InterruptedException {
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframe1']")));
		Thread.sleep(17000);
        driver.findElement(By.xpath("//a[@href='http://toolsqa.com/cucumber/cucumber-tutorial/']/img[@class='ngg-singlepic ngg-center aligncenter lazyloaded']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//span[contains(text(),'Online Training')]")).click();
	}
	@Ignore
	@Test
	public void z() {
		

	  String parent= driver.getWindowHandle();
	  Set<String> child = driver.getWindowHandles();
	  Iterator<String> itr = child.iterator();
	  while(itr.hasNext())
        driver.findElement(By.xpath("//span[@class='titreck' and contains(text(),'Big Data')]")).click();
	}
	@Ignore
	@Test
	private void naukari() {
		// TODO Auto-generated method stub
		driver.get("https://www.naukri.com/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width='120']")));
		driver.findElement(By.xpath("//img[@height='45']")).click();
	}
	@AfterTest
	
	private void click() {
		System.out.println("all is well");
	

	}
   

}
