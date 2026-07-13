package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Xpath_Locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(RelativeLocator.with(By.partialLinkText("ELECTRONICS")).toRightOf(driver.findElement(By.partialLinkText("COMPUTERS")))).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
