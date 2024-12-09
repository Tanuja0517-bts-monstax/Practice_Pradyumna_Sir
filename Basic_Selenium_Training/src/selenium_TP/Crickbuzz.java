package selenium_TP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzz {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.partialLinkText("RSA vs SL")).click();
		driver.findElement(By.linkText("Scorecard")).click();
		
		String ele=driver.findElement(By.xpath("//div[contains(@class,'cb-col cb-col-67')]/descendant::span[text()='Sri Lanka 1st Innings']/parent::div/following-sibling::div/descendant::a[contains(.,' Prabath ')]/parent::div/following-sibling::div[contains(text(),'.')]")).getText();
		System.out.println("SR:"+ele);
		driver.quit();
	}
}
