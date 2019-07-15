package selectClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NaukariDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent handle :"+parentWindow);
		
		
		driver.findElement(By.xpath("//a[@title='Search CVs for Free now']")).click();
       Set<String> allWindow=driver.getWindowHandles();
       Iterator<String> itr = allWindow.iterator();
       while(itr.hasNext()) {
    	   String title= driver.switchTo().window(itr.next()).getTitle();
    	   if(title.equals("Resdex")) {
    
    		   Select min_CTC = new Select(driver.findElement(By.xpath("//select[@name='MIN_CTC']")));
    		   min_CTC.selectByVisibleText("10");
    		   Select min_THO = new Select(driver.findElement(By.xpath("//select[@name='MIN_CTC_THSND']")));
    
    		   min_THO.selectByValue("5");
    		   
    		   Select max_CTC = new Select(driver.findElement(By.xpath("//select[@name='MAX_CTC']")));
    	
    		   max_CTC.selectByValue("12");
    		   
    		   Select max_THO = new Select(driver.findElement(By.xpath("//select[@name='MAX_CTC_THSND']")));
    		   
    	
    		   max_THO.selectByValue("25");
    		   
    		    
    		   
    	   }else {
    		   if(parentWindow.equals(itr.next())) {
    			   System.out.println("parent window don't close");
    		   }
    		   else {
    			   driver.switchTo().window(itr.next()).close();
    		   }
    	   }
    	   
       }
		
		
	}

}
