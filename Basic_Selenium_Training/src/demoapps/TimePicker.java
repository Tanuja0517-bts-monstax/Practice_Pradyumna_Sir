package demoapps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TimePicker {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//li[.='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//a[.='Time Picker']")).click();
		driver.findElement(By.xpath("//a[.='Time Picker Clock']")).click();
		driver.findElement(By.xpath("//input[contains(@aria-label,'is 12:00 AM')]")).click();
	
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.xpath("//span[text()='7']"))).perform();
		act.click(driver.findElement(By.xpath("//span[text()='15']"))).perform();
		act.click(driver.findElement(By.xpath("//span[text()='PM']"))).perform();
		act.click(driver.findElement(By.xpath("//button[text()='OK']"))).perform();
		driver.quit();
	}
}
