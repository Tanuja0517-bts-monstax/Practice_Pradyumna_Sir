package selenium_TP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
	}
}
