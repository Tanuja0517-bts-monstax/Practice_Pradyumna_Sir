package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		
		String product = "laptop";
		String productName = "HP 15s Intel Core i3 13th Gen 1315U - (8 GB/512 GB SSD/Windows 11 Home) 15-fd0006TU / 15-fd0569TU Thin...";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,'Search ')]")).clear();
		driver.findElement(By.xpath("//input[contains(@title,'Search ')]")).sendKeys(product,Keys.ENTER);
		
		WebElement next = driver.findElement(By.xpath("//a[@class='_9QVEpD']"));;
		
		while(true) {
			try {
				driver.findElement(By.xpath("//div[text()='"+productName+"']")).click();
				break;
			} catch(Exception e) {
				next = driver.findElement(By.xpath("//a[@class='_9QVEpD']"));
				next.click();
			}
		}
		
		driver.quit();
	}
}
