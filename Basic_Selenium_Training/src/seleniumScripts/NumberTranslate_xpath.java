package seleniumScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberTranslate_xpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).clear();
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("Men t-shirt",Keys.ENTER);
		List<WebElement> eles = driver.findElements(By.xpath("//div[number(translate(text(),'₹',''))>400]/ancestor::a[@class='+tlBoD']/preceding-sibling::a[contains(@class,'WKTcLC')]|//div[number(translate(text(),'₹',''))>400]"));
		
		int i =0;
		for(WebElement ele:eles) {
			if(i<2 ) {
				System.out.print(ele.getText()+" ");
				i++;
			} else {
				System.out.println();
				i=0;
			}			
		}
		//driver.quit();
	}
}
