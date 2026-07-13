package locatos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_ActionsClass_keyboardActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Actions act = new Actions(driver);
		
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		act.sendKeys(email, "abc12@gmail.com").perform();
		
		//select all text
		act.keyDown(Keys.CONTROL)
		.sendKeys(email.getText(), "ac")
		.sendKeys(driver.findElement(By.id("Password")), "v")
		.keyUp(Keys.CONTROL).build().perform();
		
		//copy selected text
	/*	act.keyDown(Keys.CONTROL)
		.sendKeys(email.getText(), "c")
		.keyUp(Keys.CONTROL).build().perform();*/
		
		//paste
	/*	act.keyDown(Keys.CONTROL)
		.sendKeys(driver.findElement(By.id("Password")), "v")
		.keyUp(Keys.CONTROL).build().perform();*/
		
		Thread.sleep(3000);
		driver.quit();
	}
}
