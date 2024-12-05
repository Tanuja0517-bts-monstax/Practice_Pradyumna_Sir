package seleniumScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class TakingScreenshot_WebPageSS {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//Launch the application
		driver.get("https://demowebshop.tricentis.com/");
		
		//Login to the account
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
		
		
//		WebElement ele=driver.findElement(By.id("Password"));
//		Select sel=new Select(ele);
		
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Computing and Internet')]/../..//input[@value='Add to cart']")).click();
		
		//TakeScreenshot obj
		TakesScreenshot tss=(TakesScreenshot)driver;
		Thread.sleep(3000);
		
		//Taking the screenshot
		File ss=tss.getScreenshotAs(OutputType.FILE);
		
		//Location to store file
		File locaiton=new File("./screenShot/AddingPrdToCart.png");
		
		//coping the screenshot to file
		FileHandler.copy(ss, locaiton);
		//close browser
		driver.quit();
	}
}
