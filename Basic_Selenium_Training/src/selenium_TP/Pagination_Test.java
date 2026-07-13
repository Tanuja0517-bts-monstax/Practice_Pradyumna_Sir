package selenium_TP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pagination_Test {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		boolean flag = false;
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act = new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//h2[text()='Visitors']"))).perform();

		List<WebElement> pagination = driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
		for (int i = 0; i <= pagination.size(); i++) {
			try {
				List<WebElement> products = driver
						.findElements(By.xpath("//table[@id='productTable']/descendant::tbody/tr/td[2]"));
				for (WebElement product : products) {
					if (product.getText().equals("Router")) {
						driver.findElement(By.xpath("//table[@id='productTable']/descendant::tbody/tr/td[text()='" + product.getText()+"']/following-sibling::td[2]/input")).click();
						flag = true;
						break;
					}
				}
				if(flag==false)
					driver.findElement(By.xpath("//ul[@id='pagination']/li/a[text()='" + (i+1) + "']")).click();
			} catch (Exception e) {
				//System.out.println("Bye");
			}
			if (flag == true)
				break;
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
