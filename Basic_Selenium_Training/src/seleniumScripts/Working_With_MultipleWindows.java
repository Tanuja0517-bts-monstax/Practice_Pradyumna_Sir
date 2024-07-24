package seleniumScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_MultipleWindows {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String window: allWindows) {
			driver.switchTo().window(window);
			System.out.println("Page title:"+driver.getTitle());
			if(driver.getTitle().contains("Google")) {
				driver.manage().window().maximize();
				driver.close();
			}
			Thread.sleep(2000);
		}
		driver.quit();
	}
}
