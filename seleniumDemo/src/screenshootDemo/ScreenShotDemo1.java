package screenshootDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotDemo1 {
	WebDriver driver = new ChromeDriver();
	@Test
	private void ASiteLaunch() {
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/");
	}
	@Test
	private void Screenshoot() {
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   try {
		FileUtils.copyFile(src, new File("D:\\dev2 project\\ab.png"));
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	    
         
	}

}
 