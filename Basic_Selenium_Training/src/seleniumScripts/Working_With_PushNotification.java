package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Working_With_PushNotification {
	public static void main(String[] args) throws Exception {
		
		//Create ChromeOptions class object
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		driver.wait(2000);
		
		driver.quit();
	}
}
