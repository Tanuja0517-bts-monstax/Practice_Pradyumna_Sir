package locatos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[contains(@title,'Search ')]")).clear();
		driver.findElement(By.xpath("//input[contains(@title,'Search ')]")).sendKeys("Sal");
		driver.findElement(By.xpath("//span[text()='Indian actor and film producer']/parent::div/preceding-sibling::div/span[text()='Salman Khan']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
