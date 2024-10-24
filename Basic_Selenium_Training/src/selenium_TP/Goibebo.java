package selenium_TP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibebo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.myflighttrip.com/");
		driver.findElement(By.xpath("//input[@name='from_location']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='from_location']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@name='from_location']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@name='to_location']")).sendKeys("calipatria");
		driver.findElement(By.xpath("//input[@name='to_location']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@name='to_location']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[text()='October']/../../..//table//a[text()='25']")).click();
		driver.findElement(By.id("searchauto")).click();
		
		System.out.println(driver.findElement(By.xpath("//h2[@class='text-center']")).getText());
		
		driver.quit();
	}
}
