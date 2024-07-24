package seleniumTask;

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

public class ScreenShotOfWebElement {
	public void screenshotOfEle() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		File ff=ele.getScreenshotAs(OutputType.FILE);
		File loc=new File("./screenShot/AppLogo.png");
		FileHandler.copy(ff, loc);
		
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		ScreenShotOfWebElement obj = new ScreenShotOfWebElement();
		obj.screenshotOfEle();
	}
}
