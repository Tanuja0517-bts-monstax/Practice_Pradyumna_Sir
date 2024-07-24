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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_Screenshot_WebElement {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//Launch the application
		driver.get("https://demowebshop.tricentis.com/");
		
		//Login to the account
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Computing and Internet')]/../..//input[@value='Add to cart']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='bar-notification success']"))));
		WebElement msg=driver.findElement(By.xpath("//div[@class='bar-notification success']"));
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		File ss=msg.getScreenshotAs(OutputType.FILE);
		File location=new File("./screenShot/AddToCart.png");
		FileHandler.copy(ss,location);
		
		driver.quit();
	}
}
