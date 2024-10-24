package selenium_TP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookMyShow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//div[.='Mumbai']")).click();
		driver.findElement(By.xpath("//img[@alt='Navra Maza Navsacha 2']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='sc-qswwm9-5 ghYvew']")).getText());
		//driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		driver.quit();
	}
}
