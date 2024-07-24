package seleniumScripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collecting_LinksWithText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> eles=driver.findElements(By.xpath("//a"));
		List<WebElement> link_With_Text=new ArrayList<>();
		for(WebElement ele:eles) {
			String str=ele.getText();
			if(!str.isEmpty()) 
				link_With_Text.add(ele);
		}
		
		for(WebElement ele:link_With_Text) {
			System.out.println(ele.getText());
		}
		driver.quit();
	}
}
