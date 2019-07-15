package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EagerCrow {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://eagercrow.com/Home");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//img[@src='https://firebasestorage.googleapis.com/v0/b/shpping-project.appspot.com/o/Icons%2FChair.png?alt=media&token=1b737ee7-672d-405f-a8d5-0957c552ccbf']")).click();
     driver.findElement(By.xpath("//a[contains(text(),'Polytech Plastic Chair (Beige)')]")).click();
     driver.findElement(By.xpath("//button[@class='flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4']")).click();
	
	}

}
