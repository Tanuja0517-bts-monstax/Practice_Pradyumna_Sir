package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedShadowRootElement {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow/nested?sublist=2");
		Actions act = new Actions(driver);
		
		//Nested shadow Root from open to closed
		SearchContext mainHost = driver.findElement(By.xpath("//div[@class='shadowOuter']")).getShadowRoot();
		WebElement nestedEle = mainHost.findElement(By.cssSelector("label[for='email']"));
		System.out.println(nestedEle.getText());
		
		
		act.sendKeys(nestedEle,Keys.TAB,"hiii").perform();
		
		//Nested shadow root from closed to open
	
		
		Thread.sleep(5000);
		driver.quit();
	}
}
