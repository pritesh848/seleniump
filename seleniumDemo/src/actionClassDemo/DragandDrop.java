package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
driver.switchTo().frame(0);

WebElement SourceElement = driver.findElement(By.id("draggable"));
WebElement TargetElement = driver.findElement(By.id("droppable"));
Actions action = new Actions(driver);
action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();

//action.dragAndDrop(SourceElement, TargetElement);



	}

}
