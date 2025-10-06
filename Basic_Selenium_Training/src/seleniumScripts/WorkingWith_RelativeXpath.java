package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WorkingWith_RelativeXpath {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(RelativeLocator.with(By.id("name")).above(driver.findElement(By.xpath("//label[text()='Email Id']")))).sendKeys("hiiii");
		//WebElement ele=driver.findElement(By.xpath("//label[text()='Email Id']"));
		Thread.sleep(5000);
		driver.quit();
	}
}
