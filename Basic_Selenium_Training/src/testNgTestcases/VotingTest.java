package testNgTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VotingTest {
	@Test
	public void vote() {
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
						
		//Launch URL
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("TestURL launched");
		
		driver.findElement(By.id("pollanswers-3")).click();
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		Reporter.log("Selected a voting");
		
		driver.quit();
		Reporter.log("Voting test case executed successfully");
	}
}
