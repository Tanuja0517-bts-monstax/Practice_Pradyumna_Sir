package locatos;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_DragAndDrop_Action {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act = new Actions(driver);
		//act.scrollToElement(driver.findElement(By.xpath("//h2[text()='Slider']"))).perform();
		//act.scrollByAmount(0, driver.findElement(By.id("field1")).getLocation().getY()).perform();
		//act.dragAndDropBy(driver.findElement(By.id("draggable")),150,20).perform();
		//act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//button[text()='Copy Text']"))).perform();
		//act.moveToElement(driver.findElement(By.xpath("//button[text()='Point Me']"))).perform();
		act.scrollByAmount(0, 1500).perform();
		act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
