package TestNgFeature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Working_With_SoftAssertion {
	@Test
	public void search() {
		//SoftAssert object
		
		SoftAssert sa=new SoftAssert();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		
		sa.assertEquals(title, "Demo Web Shop", "Page title is not valid");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		sa.assertEquals(driver.findElement(By.xpath("//h1[text()='Search']")).getText(),"Search","Mobile search page was not displayed");
		
		driver.quit();
		
		sa.assertAll();  
	}
}
