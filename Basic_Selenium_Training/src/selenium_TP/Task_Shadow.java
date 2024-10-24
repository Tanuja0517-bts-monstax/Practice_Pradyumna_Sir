package selenium_TP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Shadow {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Nested iframe")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame);
		System.out.println("Hii");
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		System.out.println(email);
		driver.close();
	}
}
