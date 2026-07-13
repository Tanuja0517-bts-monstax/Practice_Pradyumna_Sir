package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_Popup {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 1500).perform();
		driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\User\\git\\Practice_Pradyumna_Sir\\Basic_Selenium_Training\\test-Data\\Info.properties");
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
