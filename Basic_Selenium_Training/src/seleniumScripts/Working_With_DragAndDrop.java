package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		act.clickAndHold(ele).moveToElement(driver.findElement(By.id("droppable"))).release(ele).build().perform();
		
		act.clickAndHold(driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"))).moveToLocation(120, 0).perform();
		act.release(driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"))).build().perform();
		
		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("abcd");
		
		act.keyDown(Keys.CONTROL)
		.sendKeys(name,"a").perform();
		Thread.sleep(3000);
		act.keyUp(Keys.CONTROL)
		.build().perform();
		
		act.keyDown(Keys.CONTROL)
		.sendKeys(name.getText(),"x")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		WebElement email=driver.findElement(By.id("email"));
		act.keyDown(Keys.CONTROL)
		.sendKeys(email,"v")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		//Thread.sleep(3000);
		//driver.quit();
	}
}
