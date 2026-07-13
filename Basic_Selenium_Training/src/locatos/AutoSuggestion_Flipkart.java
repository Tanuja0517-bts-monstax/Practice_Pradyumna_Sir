package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Flipkart {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,'Search ')]")).clear();
		driver.findElement(By.xpath("//input[contains(@title,'Search ')]")).sendKeys("sam");
		
		driver.findElement(By.xpath("//div[@class='YGcVZO _2VHNef' and text()='Fridge: Trending Now, Popular']")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
