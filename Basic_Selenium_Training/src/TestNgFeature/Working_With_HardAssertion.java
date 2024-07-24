package TestNgFeature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Working_With_HardAssertion {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Demo Web Shop");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Search']")).getText(),"Search","Mobile search page was not displayed");
		
		driver.quit();
	}
}
