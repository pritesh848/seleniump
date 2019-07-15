package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FbSignUp {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
     //  driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']/preceding ::div[contains(text(),'First name')]")).click();   
//       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("u are great");
//       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("only testing");
//       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rty@gmail.com");
//       driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("rty@gmail.com");
//       driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456789");
//       Select bday = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
//       bday.selectByIndex(19);
//       Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
//       month.selectByVisibleText("May");
//       Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
//       year.selectByValue("1985");
//       driver.findElement(By.xpath("//input[@value='1']")).click();
//       driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
       
      driver.findElement(By.cssSelector("input.inputtext[type=email]")).sendKeys("9028881222");
	}

}
