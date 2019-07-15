package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=ap_frn_logo");
		driver.manage().window().maximize();
//		WebElement lgseries=driver.findElement(By.xpath("//img[@alt='LGWseries']"));
//		WebDriverWait wait= new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.visibilityOf(lgseries));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("document.getElementsByClassName(\"a-link-normal aok-inline-block\")[5].click();");
	}
}
