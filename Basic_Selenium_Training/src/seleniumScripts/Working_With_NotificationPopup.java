package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Working_With_NotificationPopup {
	public static void main(String[] args) {
		/*For Chrome
		 * ChromeOptions cOption=new ChromeOptions();
		
		cOption.addArguments("--disable-notifications");
		cOption.addArguments("--incognitio");
		WebDriver driver=new ChromeDriver(cOption);*/
		
		/*For Edge
		 * EdgeOptions eOption=new EdgeOptions();
		eOption.addArguments("-inprivate");
		WebDriver driver=new EdgeDriver(eOption);*/
		
		FirefoxOptions fOption = new FirefoxOptions();
		fOption.addArguments("-private");
		
		WebDriver driver = new FirefoxDriver(fOption);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.quit();
	}
}
