package seleniumScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Working_With_TakeScreenShotOfEntireaPageFirefox {
	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		File obj=driver.getFullPageScreenshotAs(OutputType.FILE);
		File  pic=new File("./screenShot/FirefoxBrowserSS.png");
		FileHandler.copy(obj, pic);
		driver.quit();
	}
}
