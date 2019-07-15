package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchDemo {
	public static void launch() {

		//System.setProperty("webdriver.chrome.driver", "D:/testing/Alljar/Drivers/chromedriver.exe");
	
		System.setProperty("webdriver.firefox.driver", "D:/testing/Alljar/Drivers/gecodriver.exe");

		
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

	}

	public static void main(String[] args) {
		launch();

	}

}
