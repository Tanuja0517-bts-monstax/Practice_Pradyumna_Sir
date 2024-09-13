package testNgTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GotoWishList {
	@Parameters("browser")
	@Test
	public void goingToWishlist(String browser) {
		//Launch Browser
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("Chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("Firefox"))
			driver=new FirefoxDriver();
		else
			driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		//Launch URL
		driver.get("https://demowebshop.tricentis.com/");
				
		//Goto Login page
		driver.findElement(By.linkText("Log in")).click();
				
		//Login to application
		driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
				
		//Goto wishist
		driver.findElement(By.xpath("//a[contains(@class,'wishlist')]")).click();
		
		//close browser
		driver.quit();
	}
}
