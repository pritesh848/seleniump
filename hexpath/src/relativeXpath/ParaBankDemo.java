package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();;
	//	driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=CB751CC30ABFAB6832D6F073487B4D72");
		driver.findElement(By.id("customer.firstName")).sendKeys("testing");
	
		driver.findElement(By.id("customer.lastName")).sendKeys("shastra ");
		driver.findElement(By.id("customer.address.street")).sendKeys("new sangvi pune");
		driver.findElement(By.id("customer.address.city")).sendKeys("pune");
		driver.findElement(By.id("customer.address.state")).sendKeys("maharashtra");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("431009");

		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9890099000");
		driver.findElement(By.id("customer.ssn")).sendKeys("558845214");
		driver.findElement(By.id("customer.username")).sendKeys("TESTING123");
		driver.findElement(By.id("customer.password")).sendKeys("Prit848");
		driver.findElement(By.id("repeatedPassword")).sendKeys("Prit848");
        driver.findElement(By.xpath("//input[@value='Register']")).click();



	}

}
