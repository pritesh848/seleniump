package relativeXpath;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandleDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.theaa.ie/car-insurance/journey/getting-started");
		//List<WebElement> radio = driver.findElements(By.xpath("//div[@class='md-radio-label-content']"));
		List<WebElement> pf= driver.findElements(By.xpath("df-radio-group[@id='title']/child::*"));
	
		
		for (int i = 0; i < pf.size(); i++) {
			
			
			WebElement localradio = driver.findElement(By.xpath("//df-radio-group[@id='title']/child::*["+i+"]"));
			String value = localradio.getText();
			System.out.println("buttons are  "+value);
		
		
		
		
//		for (int i = 0; i < radio.size(); i++) {
//			WebElement localradio = radio.get(i);
//			String value = localradio.getText();
//			System.out.println("buttons are  "+value);
			
//			if(value.equals("Miss")) {
//				localradio.click();
			
		}
		
     
		
		
		
	}

}
