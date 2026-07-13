package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));

		driver.get("https://shoppersstack.com/");
		Thread.sleep(3000);
		
		// classname
		driver.findElement(By.cssSelector(".navbar_Loginbutton__O9-64")).click();
		// System.out.println("Color:"+
		
		/*simple cssSelector
		driver.findElement(By.cssSelector("a[name='men']")).getCssValue("color"));
		driver.findElement(By.cssSelector("a[name='men']")).click();*/
		Thread.sleep(3000);
		
		// id
		driver.findElement(By.cssSelector("#Password")).sendKeys("hii");
		Thread.sleep(3000);
		
		//starts with
		driver.findElement(By.cssSelector("input[id^='Pas']")).sendKeys("hii");
		Thread.sleep(3000);
		
		//ends with ^(bitwise)
		driver.findElement(By.cssSelector("input[id$='ord']")).sendKeys("bye");
		Thread.sleep(3000);
		
		//substring
		driver.findElement(By.cssSelector("input[id*='or']")).sendKeys("aabc");
		
		//to print string of an element
		System.out.println("Text of button:"+driver.findElement(By.cssSelector("#Login>span")).getText());
		
		//siblings sub child of adjustenet sibling
		System.out.println("dssf:"+driver.findElement(By.cssSelector("#Login+div small")).getText());
		
		// printing css style value for an element
		System.out.println("Background:"+driver.findElement(By.cssSelector(".MuiButton-label")).getCssValue("background"));
		
		//to go to descendant
		driver.findElement(By.cssSelector(".MuiFormControl-root input[id='Email']")).sendKeys("hiiii");
		
		//to go to child
		System.out.println("text of ele:"+driver.findElement(By.cssSelector("#Login>span")).getText());
		driver.quit();
	}
}
