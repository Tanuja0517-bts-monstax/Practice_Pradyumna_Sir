package seleniumTask;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfEntirePageTest {
	public void takeSS() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ff=ts.getScreenshotAs(OutputType.FILE);
		File loc=new File("./screenShot/FullScreen.png");
		FileHandler.copy(ff, loc);
		driver.quit();
	}
	public static void main(String[] args) throws IOException {
		ScreenshotOfEntirePageTest ss=new ScreenshotOfEntirePageTest();
		ss.takeSS();
	}
}
