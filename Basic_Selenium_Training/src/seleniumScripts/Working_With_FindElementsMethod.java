package seleniumScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_FindElementsMethod {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys("laptop",Keys.ENTER);
		//System.out.println("name:"+driver.findElement(By.xpath("//div[@class='KzDlHZ']|//div[@class='Nx9bqj _4b5DiR']")).getText());
		List<WebElement> eles=driver.findElements(By.xpath("//div[@class='KzDlHZ']|//div[@class='Nx9bqj _4b5DiR']"));
		System.out.println("Size:"+eles.size());
		for(WebElement ele:eles) {
			System.out.println(ele.getText());
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
