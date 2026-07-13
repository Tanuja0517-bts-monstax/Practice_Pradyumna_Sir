package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/User/Desktop/AdvSel_Selenium_API/Basic%20Selenium/LoginPage.html");
		driver.findElement(By.tagName("input")).sendKeys("hello");
		driver.findElement(By.name("pwd")).sendKeys("byee");
		driver.findElement(By.className("cancelButt")).click();
//		Thread.sleep(3000);
//		driver.quit();
	}
}
