package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClosedShadowRootElement {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		
		SearchContext con = driver.findElement(By.xpath("//div[@class='my-3']")).getShadowRoot();
		con.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("hi");
		
	/*	Actions act = new Actions(driver);
		WebElement loginEle = driver.findElement(By.xpath("//h1[text()='Login']"));
		act.sendKeys(loginEle,Keys.TAB,"Hii").perform();
		
		act.sendKeys(loginEle,Keys.TAB,Keys.TAB,"Bye").perform();*/
		Thread.sleep(5000);
		driver.quit();
	}
}
