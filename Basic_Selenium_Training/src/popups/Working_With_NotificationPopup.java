package popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Working_With_NotificationPopup {
	public static void main(String[] args) {
		ChromeOptions coption=new ChromeOptions();
		coption.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(coption);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.quit();
	}
}
