package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_AutoSugession_DD_UnInspectable {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("fila");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()=' shoes'])[2]")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
