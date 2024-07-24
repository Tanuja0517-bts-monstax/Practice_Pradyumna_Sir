package seleniumScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import graphql.language.Type;

public class Working_With_ScreenShots_WebPage {
	public static void main(String[] args) throws Exception {
		
		//Launching the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//Launching web site
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Type casting to TakeScreenshot to make connection between WebDriver and TakesScreenShot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//taking screenshot
		File ss=ts.getScreenshotAs(OutputType.FILE);
				
		//Location to store the screenshot
		File screenshot=new File("./screenShot/DemoWebShop.png");
		
		
		//Copy the screnshot in the file
		FileHandler.copy(ss,screenshot);
		
		//close browser
		//driver.quit();
	}
}