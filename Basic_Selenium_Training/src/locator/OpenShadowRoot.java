package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class OpenShadowRoot {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(3000);
		
		SearchContext sc= driver.findElement(RelativeLocator.with(By.xpath("//form/div[1]"))).getShadowRoot();//.near(By.xpath("//h1[text()='Login']"))).getShadowRoot();
		sc.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("Hii");
		Thread.sleep(3000);
		
		SearchContext sc1= driver.findElement(RelativeLocator.with(By.xpath("//form/div[2]"))).getShadowRoot();
		sc1.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Hii");
		Thread.sleep(3000);
		driver.quit();
	}
}
