package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Locator {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/User/Desktop/AdvSel_Selenium_API/Basic%20Selenium/LoginPage.html");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("gm");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#username")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".userNameclass")).sendKeys("ga");
		Thread.sleep(3000);
		driver.quit();
	}
}
