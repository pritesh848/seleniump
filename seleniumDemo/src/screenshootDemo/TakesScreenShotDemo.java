package screenshootDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShotDemo {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com/");
		Robot robo = new Robot();
	File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      try {
		    FileUtils.copyFile(Screenshot, new File("D:\\screenshot\\naukari.jpeg"));
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
