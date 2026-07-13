package locatos;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Windows {
	public static void main(String[] args) throws Exception {
		//String expectedTitle = "MOTOROLA";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,'Search ')]")).clear();
		driver.findElement(By.xpath("//input[contains(@title,'Search ')]")).sendKeys("laptop",Keys.ENTER);
		
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String win:allWindowId) {
			driver.switchTo().window(win);
			String currentWindowId=driver.getWindowHandle();
			if(!(currentWindowId.equals(parentHandle)))
				break;
		}
		
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();	
	}
}
