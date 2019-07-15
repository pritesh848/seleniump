package WindowAndFrame;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class CanaraBankDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.canarabank.in");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[contains(text(),'Login to NetBanking')]")).click();
	//	String s=(char[],int offset,int length);
	
		
		Set<String> allwindow = driver.getWindowHandles();
		Iterator<String> itr = allwindow.iterator();
		System.out.println(driver.getTitle());
		
		while(itr.hasNext()){
				
			String title = driver.switchTo().window(itr.next()).getTitle();
			
			
			if(title.equals("Canara Bank Internet Banking")) 
			
			{
	     driver.switchTo().window((String) itr.next());
		driver.findElement(By.xpath("//input[@id='fldLoginUserId']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@id='fldPassword']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		
         	      }

           }
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[contains(text(),'Login to NetBanking')]")).click();
		
	}
}
