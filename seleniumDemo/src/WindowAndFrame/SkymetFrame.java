package WindowAndFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SkymetFrame {
	WebDriver driver= new ChromeDriver();
	@Test
    private void driver() {
		 driver.get("https://www.skymetweather.com/");
		 driver.manage().window().maximize();
	}
	@Test
    private void frmae() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='border:none;overflow:hidden']")));
	//	 driver.switchTo().frame("//iframe[@style='border:none;overflow:hidden']");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@title='Skymet Weather']")).click();
	}

}
