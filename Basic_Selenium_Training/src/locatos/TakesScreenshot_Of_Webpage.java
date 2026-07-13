package locatos;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot_Of_Webpage {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/p/download-files_25.html");
		
		// To take screenshot of web page visible on view port area
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File f1 = new File("./screenShot/Image1.png");
		
		FileHandler.copy(f, f1);
		
		//To take screenshot of webelement
		File file = driver.findElement(By.cssSelector("button[name='start']")).getScreenshotAs(OutputType.FILE);
		File file1 = new File("./screenShot/Element1.png");
		FileHandler.copy(file, file1);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
