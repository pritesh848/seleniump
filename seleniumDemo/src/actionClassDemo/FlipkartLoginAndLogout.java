package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLoginAndLogout {
   
	
	    private void ScrolllDown() {
	    //    Actions action = new Actions(driver);
        //   action.sendKeys(Keys.PAGE_DOWN).build().perform();

		}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8177825559");
	      driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Prit848@");
	      driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	      Actions action = new Actions(driver);
	      //ScrollDown();
	      Thread.sleep(2000);
	      
	      
	      
	      
	      
	      
	      
	    action.moveToElement(driver.findElement(By.xpath("//div[@class='_2aUbKa' and contains(text(),'pritesh')]"))).build().perform();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[@class='_2k68Dy' and @href='#']")).click();
	      
	      
	}

}
