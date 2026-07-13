package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Nested_ShadowRootElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow/nested?sublist=2");
		
		//open shadow roo host
		SearchContext host1=driver.findElement(By.xpath("//div[@class='shadowOuter']")).getShadowRoot();
		WebElement ele=host1.findElement(By.cssSelector("label[for='email']"));
		
		//closed shadow root
		Actions act =new Actions(driver);
		act.sendKeys(ele, Keys.TAB,"hi").perform();
		
		//driver.findElement(By.cssSelector(".shadowInner")).sendKeys(Keys.TAB,"hiii");
	}
}
