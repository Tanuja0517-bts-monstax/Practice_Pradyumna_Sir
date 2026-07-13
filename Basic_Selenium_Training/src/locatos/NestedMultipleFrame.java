package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class NestedMultipleFrame {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		
		//main parent frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='w-full h-96']")));
		
		//parent frame
		driver.switchTo().frame(0);
		
		//child frame(email)
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("hi");
		
		//parent frame
		driver.switchTo().parentFrame();
		
		//child frame(password)
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("hello");
		
		//parent frame
		driver.switchTo().parentFrame();
		
		//child frame(confirm password)
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).clear();
		driver.findElement(By.id("confirm")).sendKeys("hello");
		
		//parent frame
		driver.switchTo().parentFrame();
		
		//child frame(submit)
		driver.switchTo().frame(3);
		driver.findElement(By.id("submitButton")).click();
		
		//main parent frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
		//print the default email value
		System.out.println("Email:"+ driver.findElement(RelativeLocator.with(By.xpath("//p")).below(By.xpath("//p[text()='Default Email']"))).getText());
		
		//print the default password value 
		System.out.println("Password:"+driver.findElement(RelativeLocator.with(By.xpath("//p")).below(By.xpath("//p[text()='Default Password']"))).getText());
		
		//print the default confirm password value
		System.out.println("Confirm Password:"+driver.findElement(RelativeLocator.with(By.xpath("//p")).below(By.xpath("//p[text()='Default Confirm Password']"))).getText());
		
		Thread.sleep(3000);
		driver.quit();
	}
}
