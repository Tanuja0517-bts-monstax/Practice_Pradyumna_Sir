package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_DragDropMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.navigate().refresh();
		
		Actions act=new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("box5")), driver.findElement(By.id("box105"))).perform();
		

		driver.quit();
	}
}
