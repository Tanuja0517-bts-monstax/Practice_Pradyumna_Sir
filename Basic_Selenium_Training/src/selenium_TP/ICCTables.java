package selenium_TP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ICCTables {
	@Test
	public void teams() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.icc-cricket.com/");
		driver.findElement(By.linkText("RANKINGS")).click();
		driver.findElement(By.linkText("TEAM RANKINGS PREDICTOR")).click();
		
		//driver.quit();
	}
}
