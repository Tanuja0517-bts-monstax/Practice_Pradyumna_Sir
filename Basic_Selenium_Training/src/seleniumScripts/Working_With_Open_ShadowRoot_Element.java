package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Open_ShadowRoot_Element {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[contains(text(),'Root')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//section[contains(text(),'Root')])[2]")).click();
		Thread.sleep(2000);
		
		//Identify shadow host and use it to search shadow root element and sending data to it
		SearchContext shadowRoot_un=driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		shadowRoot_un.findElement(By.cssSelector("input[type='text']")).sendKeys("tanuja");
		Thread.sleep(2000);
		
		////Identify shadow host and use it to search shadow root element and sending data to it
		SearchContext shadowRoot_pwd=driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		shadowRoot_pwd.findElement(By.cssSelector("input[type='text']")).sendKeys("sonawale");
		Thread.sleep(3000);
		
		//close browser
		driver.quit();
	}
}
