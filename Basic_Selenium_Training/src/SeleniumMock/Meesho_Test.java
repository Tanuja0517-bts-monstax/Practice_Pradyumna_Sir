package SeleniumMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho_Test {
	@Test
	public void addToCart() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.meesho.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Try Saree, Kurti')]")).sendKeys("Yoga Mat bag",Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
