package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Working_With_IFrame {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium/Iframe.html");
		
		//switchTo frame by index
		driver.switchTo().frame(1);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.switchTo().defaultContent();
		
		//switchTo frame by name attribute
		driver.switchTo().frame("skillrary");
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		
		//switchTo frame by webElement
		driver.switchTo().frame(driver.findElement(By.id("FR2")));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
	
		//close browser
		driver.quit();
 	}
	
	@Test
	public void framess() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		
		driver.findElement(By.id("username")).sendKeys("cvbnm");
		driver.quit();
	}
}
