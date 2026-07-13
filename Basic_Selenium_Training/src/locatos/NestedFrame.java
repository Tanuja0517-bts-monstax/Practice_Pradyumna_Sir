package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class NestedFrame {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		driver.navigate().to("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		WebElement ele =driver.findElement(By.linkText("Multiple iframe"));
		ele.click();
		
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("asda");
		 
		driver.switchTo().parentFrame();
		
		System.out.println("Email:"+driver.findElement(RelativeLocator.with(By.xpath("//p")).below(By.xpath("//p[text()='Default Email']"))).getText());
	
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		
		ele.click();
		
		Thread.sleep(4000);
		driver.quit();
	}
}
