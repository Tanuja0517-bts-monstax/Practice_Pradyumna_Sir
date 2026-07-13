package seleniumScripts;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class Working_WIth_Firefox_Screenshot {
	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/p/download-files_25.html");
		
		File f = driver.getFullPageScreenshotAs(OutputType.FILE);
		File f1 = new File("./screenShot/Firefox_Browser.png");
		
		FileHandler.copy(f, f1);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
