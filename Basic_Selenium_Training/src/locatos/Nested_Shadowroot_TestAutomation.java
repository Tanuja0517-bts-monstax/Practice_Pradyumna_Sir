package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Shadowroot_TestAutomation {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		SearchContext mainHost = driver.findElement(By.id("shadow_host")).getShadowRoot();
		
		System.out.println("1st child:"+mainHost.findElement(By.cssSelector("span[id='shadow_content']>span")).getText());
		
		mainHost.findElement(By.cssSelector("input[type='text']")).sendKeys("Hi");
		
		mainHost.findElement(By.cssSelector("a[href='https://www.pavantestingtools.com/']~input[type='file']")).sendKeys("C:\\Users\\User\\Desktop\\StoringScreenshotInExcel_Test.txt");
		
		/*SearchContext childHost  = mainHost.findElement(By.cssSelector("div[id='nested_shadow_host']")).getShadowRoot();
		System.out.println("Element:"+childHost.findElement(By.cssSelector("div[id='nested_shadow_content']>div")).getText());*/
		
		Thread.sleep(3000);
		driver.quit();
	}
}
