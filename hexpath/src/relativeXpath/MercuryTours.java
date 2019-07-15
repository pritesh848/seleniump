package relativeXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MercuryTours {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
		
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("kailas");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("andhalkar");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("kailasandhalkar@gmail.com");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("bhosri pune");
		driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("proper from dubai");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("bhosri pune");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("411046");
		
		WebElement element1 = driver.findElement(By.xpath("//select[@name='country']"));
		Select element = new Select(element1);
        element.selectByValue("21");
        
        
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("kailas123");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("kailas123@");
        driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("kailas123@");
        driver.findElement(By.xpath("//*[@name='register']")).click();
        
        
	}

}
