package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_KeyboardActions {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).perform();
		act.moveToElement(driver.findElement(By.id("small-searchterms"))).click().sendKeys("Mobile").perform();
		act.keyUp(Keys.SHIFT).perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();
	
		act.keyUp(Keys.TAB).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
