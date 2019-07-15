package xpaths;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertTrial {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.wordpress.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
    Assert.assertEquals("https://testingshastra.wordpress.com/", url);
	}

}
