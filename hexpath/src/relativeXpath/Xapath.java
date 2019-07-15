package relativeXpath;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xapath {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-17/06/2019&tripType=O&paxType=A-1_C-0_I-0&intl=false&=&cabinClass=E");
	List<WebElement> lw  = driver.findElements(By.xpath("//span[@style='color: rgb(22, 190, 72);']"));
	System.out.println(lw.size());
	System.out.println(lw.indexOf(5));
	
     }
}
