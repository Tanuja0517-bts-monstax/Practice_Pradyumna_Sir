package seleniumTask;

import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteratorList {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> eles = driver.findElements(By.tagName("a"));
		Iterator<WebElement> i = eles.iterator();
		while(i.hasNext()) {
			System.out.println(i.next().getText());
		}
		driver.quit();
	}
}
