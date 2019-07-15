package screenshootDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;

public class AshotFullPageScreenShot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("httpa://www.flipkart.com/");
		
		AShot ashot = new AShot();
	//	ashot.shootingStrategy()

	}

}
