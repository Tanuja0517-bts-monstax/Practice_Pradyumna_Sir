package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation_NestedShadowroot {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		SearchContext mainHost = driver.findElement(By.id("shadow_host")).getShadowRoot();
		System.out.println("main child:"+mainHost.findElement(By.cssSelector("span[id='shadow_content']>span")).getText());
		
		
		SearchContext childHost = mainHost.findElement(By.cssSelector("div[id='nested_shadow_host']")).getShadowRoot();
		System.out.println("Child's child:"+childHost.findElement(By.cssSelector("div[id='nested_shadow_content']>div")).getText());
		
		Thread.sleep(3000);
		driver.quit();
	}
}
