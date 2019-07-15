package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickDemo {
	static ChromeDriver driver;

	public static void launch() {

		System.setProperty("webdriver.chrome.driver", "D:/testing/Alljar/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

	}

	public static void clickLinkText(String linkTexxt) {
		driver.get(linkTexxt);
	}

	public static void clickSelect(String linkText2) {
           driver.findElementByClassName(linkText2).click();;
	}
	private static void partialSelect(String linkText3) {
		driver.findElementByPartialLinkText(linkText3).click();

	}

	public static void main(String[] args) {
		launch();
		//clickLinkText("https://www.naukri.com/");
		clickLinkText("https://www.naukri.com/");

		clickSelect("lightCyanBtn");
		partialSelect("CREATE JOB");
	}

}
