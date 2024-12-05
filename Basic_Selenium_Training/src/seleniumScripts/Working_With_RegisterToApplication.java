package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Working_With_RegisterToApplication {
	public static void main(String[] args) {
		
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter the URL
		driver.get("https://demowebshop.tricentis.com/");
		
		//Click on Register link
		driver.findElement(By.linkText("Register")).click();
		
//		//Fill information in register page
//		
//		//select gender
//		driver.findElement(By.id("gender-female")).click();
//		
//		//Enter First name
//		driver.findElement(By.id("FirstName")).sendKeys("Rutuja");
//		
//		//Enter Last name
//		driver.findElement(By.id("LastName")).sendKeys("Phand");
//		
//		//Enter emil
//		driver.findElement(By.id("Email")).sendKeys("rutujaPhand03@gmail.com");
//		
//		//Enter password
//		driver.findElement(By.id("Password")).sendKeys("Rutuja@123");
//		
//		//Enter confirm password
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("Rutuja@123");
//		
//		//CLick on register button
//		driver.findElement(By.id("register-button")).click();
		
		//Click on Login link[Relative Locator]
		driver.findElement(RelativeLocator.with(By.xpath("//a[text()='Log in']")).toRightOf(By.xpath("//a[text()='Register']"))).click();
		
		//close the browser
		//driver.quit();
	}
}
