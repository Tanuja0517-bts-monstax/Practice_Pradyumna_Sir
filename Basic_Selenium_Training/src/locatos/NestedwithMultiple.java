package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedwithMultiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("abcd");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).clear();
		driver.findElement(By.id("confirm")).sendKeys("abcd");
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText());
		Thread.sleep(5000);
		driver.quit();
	}

}
