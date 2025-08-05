package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * 
 * Here we are using substring in xpath where we are using 'substring-before(attribute,'the string before which we want to find the element')'
 *  'substring-after(attribute,'the string after which we want to find the element')'
 * 
 * */
public class Working_With_SubStringXpath {
	@Test
	public void subStringXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[substring-before(text(), 'App')]")).click();
		
		driver.findElement(By.xpath("//a[substring-after(text(),'Haier 185')]")).click();
		driver.quit();
	}
}
