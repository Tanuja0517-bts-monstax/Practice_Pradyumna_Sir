package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_ActionClass {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get("https://demowebshop.tricentis.com/");
		
		//Action
		Actions act=new Actions(driver);
		//moveToElement method
		act.moveToElement(driver.findElement(By.partialLinkText("COMPUTERS"))).perform();
		
		//act.moveToElement(driver.findElement(By.partialLinkText("Notebooks"))).click().perform();
		
		//Right click(contextClock method)
		act.contextClick(driver.findElement(By.partialLinkText("JEWELRY"))).perform();
		
		//Scrolling upto element
		act.scrollToElement(driver.findElement(By.xpath("//a[contains(text(),'expensive computer')]"))).perform();
		
		//doubleClick method
		act.doubleClick(driver.findElement(By.partialLinkText("BOOKS"))).perform();
		Thread.sleep(2000);
		
		//clickAndHold & release method
		act.clickAndHold(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Apparel')]"))).perform();
		act.release(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Apparel')]"))).perform();
		Thread.sleep(2000);
		
		//keyDown & keyUp & sendKeys
		act.sendKeys(driver.findElement(By.id("small-searchterms")), "Mobile").perform();
		act.keyDown(driver.findElement(By.xpath("//input[@value='Search']")), Keys.ENTER).perform();
		act.keyUp(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		
		driver.quit();
	}
}
