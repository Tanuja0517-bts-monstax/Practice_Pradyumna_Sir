package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenShadowRootElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		
		//Working with open shadow root
		
		//1. locate the host
		SearchContext emailHost = driver.findElement(By.xpath("//form[@class='pe-5']")).getShadowRoot();
		
		//2. with help of host find open shadow root element
		emailHost.findElement(By.cssSelector("div[class='my-3] input[placeholder='Enter your username']")).clear();
		emailHost.findElement(By.cssSelector("div[class='my-3] input[placeholder='Enter your username']")).sendKeys("Hii");
		
		SearchContext pwd = driver.findElement(By.xpath("//div[@class='my-3'][2]")).getShadowRoot();
		pwd.findElement(By.cssSelector("input[placeholder='Enter your password']")).clear();
		pwd.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Bye");
		Thread.sleep(5000);
		driver.quit();
	}
}
