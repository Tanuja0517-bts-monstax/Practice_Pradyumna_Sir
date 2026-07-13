package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Nested_Frame {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		driver.findElement(By.id("email")).sendKeys("hi");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
