package demo1;
//screen shoot
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class JavaScript {

	public static void main(String[] args) {
	  WebDriver driver =  new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  TakesScreenshot ts = (TakesScreenshot)driver;
		//	  File ScreenShot = ts.getScreenshotAs(
	//  JavascriptExecutor js = (JavascriptExecutor)driver;
	//  js.executeAsyncScript("document.getElementById(\"u_0_2\").click()");
	  

	}

}
