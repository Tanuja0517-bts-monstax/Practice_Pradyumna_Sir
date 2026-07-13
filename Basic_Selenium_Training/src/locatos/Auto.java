package locatos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
	public static void main(String[] args) throws InterruptedException {
		String expected = "dharmendra";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("salm");
		Thread.sleep(3000);
		try {
			List<WebElement> all = driver.findElements(By.xpath("//div[contains(@class,'pcTkSc')]//div[contains(@class,'wM6W7d')]"));
		
			for (WebElement ele : all) {
				if (ele.getText().toLowerCase().contains(expected.toLowerCase())) {
					ele.click();
					break;
				}
			}
		} catch (Exception e) {
			System.err.println("Sorry no search found");
		}
		
		System.out.println("done");
		Thread.sleep(5000);
		driver.quit();
	}
}
