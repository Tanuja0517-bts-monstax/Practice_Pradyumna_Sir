package selenium_TP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NinjaHRM {
	public static void main(String[] args) {
		ChromeOptions coption=new ChromeOptions();
		coption.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(coption);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://49.249.28.218:8091/");
	}
}
