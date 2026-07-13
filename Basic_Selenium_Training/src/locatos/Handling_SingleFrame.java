package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_SingleFrame {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame("frame1");
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("Hiiii");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
