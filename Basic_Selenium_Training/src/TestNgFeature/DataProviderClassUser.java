package TestNgFeature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderClassUser {
	
	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "provideData")
	public void workking(String brand, String product) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://www.flipkart.com/");
		WebElement search= driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		search.click();
		search.clear();
		search.sendKeys(brand);
		search.sendKeys(Keys.ENTER);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='yKfJKb row']//div[.='"+product+"']/../following-sibling::div/div/div/div")).getText());
		driver.quit();
	}
}
