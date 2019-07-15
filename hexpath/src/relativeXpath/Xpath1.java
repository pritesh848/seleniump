package relativeXpath;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-17/06/2019&tripType=O&paxType=A-1_C-0_I-0&intl=false&=&cabinClass=E");
		
		//div[@class='fli-list one-way ']//div[@class='pull-left price']//span[@class='INR']
		//List<WebElement> wb = driver.findElements(By.xpath(("//span[@class='actual-price']")));
		Thread.sleep(6000);
		List<WebElement> wb = driver.findElements(By.xpath(("	//div[@class='fli-list one-way ']//div[@class='pull-left price']//span[@class='actual-price']")));
		// System.out.println(wb.toString());
		int[] nums = new int[wb.size()];

		for (int i = 0; i < wb.size(); i++) {
			nums[i] = Integer.parseInt(wb.get(i).getText().replace("Rs ", "").replace(",", ""));
		}
		Arrays.sort(nums);
		for (int j : nums) {
			System.out.println(j);
		}

	}

}
//iterator it = wb.iterator();
//System.out.println()
//while(it){
//    syso((webelement)it.next().getText())}