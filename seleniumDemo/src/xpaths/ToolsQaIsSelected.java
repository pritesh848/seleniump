package xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ToolsQaIsSelected {
   WebDriver driver = new ChromeDriver();
   @Test
   public void WebSiteLaunch() {
	driver.get("https://www.toolsqa.com/automation-practice-form/");
    List<WebElement> oRadioButton = driver.findElements(By.xpath("//input[@name='sex']"));
    boolean bvalue = false;
    bvalue = oRadioButton.get(0).isSelected();
    System.out.println(bvalue);
    if(bvalue=false) {
    	oRadioButton.get(0).click();
    }else {oRadioButton.get(1).click();}
  
  //  bvalue = oRadioButton.get(1).is
    
    
}
   @AfterTest
   public void Experiance() {
	driver.findElement(By.xpath("//input[@id='exp-2']")).click();

}
	
}
