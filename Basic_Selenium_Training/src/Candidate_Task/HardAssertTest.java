package Candidate_Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
	@Test
	public void buyProductTest() {
		
		//lunch browser and navigated to application
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com/");
		
		//search and buy product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes",Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Toe Ballet Flat')]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//Validation
		String expectedValue = driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]")).getText();
		Assert.assertEquals(expectedValue, "Adde to Cart");
		
		System.out.println("Done");
		
		driver.quit();
	}
	
	@Test
	public void display() {
		System.out.println("Display method");
	}

}
