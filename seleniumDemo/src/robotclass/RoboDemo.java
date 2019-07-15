package robotclass;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	   
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("");
	    Robot robo = new Robot();
	   // robo.keyPress(KeyEvent.VK_DOWN);
	     //   robo.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
	        robo.keyPress(KeyEvent.VK_8);
	        robo.keyPress(KeyEvent.VK_ALT);
	        Thread.sleep(1000);
	        robo.keyPress(KeyEvent.VK_F4);
	        Thread.sleep(1000);
	        robo.keyRelease(KeyEvent.VK_ALT);
	        robo.keyRelease(KeyEvent.VK_F4);
	        

	   

	}

}
