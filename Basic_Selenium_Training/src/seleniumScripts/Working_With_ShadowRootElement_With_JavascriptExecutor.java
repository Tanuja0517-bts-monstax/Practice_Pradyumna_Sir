package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_ShadowRootElement_With_JavascriptExecutor {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/*WebElement ele = driver.findElement(By.cssSelector("div[class='my-3']"));
		WebElement host = (WebElement) js.executeScript("return arguments[0].shadowRoot", ele);
		WebElement ele1 = host.findElement(By.cssSelector("div[placeholder='Enter your username']"));*/
		//WebElement ele1 = js.executeAsyncScript("\"return document.querySelector('shadow-element')\" +\r\n"
			//	+ "	            \".shadowRoot.querySelector('input[placeholder=\\\"Enter your username\\\"]");
		//ele1.sendKeys("hii");
	}
}
