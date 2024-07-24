package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Closed_ShdowRoot_Elemnt {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[contains(text(),'Root')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//section[contains(text(),'Root')])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
		Thread.sleep(2000);
		
		//locating the nearest element and performing actions
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("tanuja").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("sonawale").perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
