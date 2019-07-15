package screenshootDemo;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class PageScreenShotAshot {

	public static void main(String[] args) {
		String date = new SimpleDateFormat("YYYY-MM-dd-HH-mm-ss").format(new Date());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		AShot ashot = new AShot();
		
		Screenshot sc = ashot.takeScreenshot(driver);
		try {
			ImageIO.write(sc.getImage(), "PNG", new File("ScreenShot/"+date+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
