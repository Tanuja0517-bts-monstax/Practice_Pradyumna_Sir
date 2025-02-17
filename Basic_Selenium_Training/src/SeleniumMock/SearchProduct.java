package SeleniumMock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).clear();
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("samsung s24",Keys.ENTER);

		List<WebElement> productName=driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24') and @class='KzDlHZ']"));
		List<WebElement> productPrice=driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24')]/ancestor::a[contains(@href,'/samsung-galaxy-s24')]/descendant::div[@class='Nx9bqj _4b5DiR']"));
		List<WebElement> prodNameverify= driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24')]/ancestor::a[contains(@href,'/samsung-galaxy-s24')]/descendant::div[@class='Nx9bqj _4b5DiR']/ancestor::div[@class='col col-5-12 BfVC2z']/preceding-sibling::div/div[@class='KzDlHZ']"));
		int i=0;
		for(WebElement ele:productName) {
			for(;i<productPrice.size();) {
				for(WebElement ele2:prodNameverify) {
					if(ele2.getText().equals(ele.getText())) {
						System.out.println("Product name:"+ele.getText()+" "+"Price of product:"+productPrice.get(i).getText());
						break;
					}
				}
				i++;
				break;
			}
		}
		driver.quit();
	}
}
