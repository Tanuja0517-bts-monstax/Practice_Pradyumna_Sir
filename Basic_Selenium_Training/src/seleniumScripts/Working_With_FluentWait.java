package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Working_With_FluentWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		WebElement search=driver.findElement(By.id("small-searchterms"));
		
		FluentWait fwait=new FluentWait(driver);
		
		search.sendKeys("Computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement searchPage=driver.findElement(By.xpath("//h1[text()='Search']"));
		
		fwait.pollingEvery(Duration.ofSeconds(1));
		fwait.withTimeout(Duration.ofSeconds(10));
		fwait.until(ExpectedConditions.visibilityOf(searchPage));
		
		driver.quit();
		
	}
}
