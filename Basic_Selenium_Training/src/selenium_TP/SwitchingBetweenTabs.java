package selenium_TP;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenTabs {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products,')]")).sendKeys("Samsung FE",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 FE (Mint, 128 GB)']")).click();
		
		Set<String> s=driver.getWindowHandles();
		for(String name:s)
			System.out.println(name);
		
		driver.quit();
	}
}
