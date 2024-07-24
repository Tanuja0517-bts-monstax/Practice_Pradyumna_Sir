package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		System.out.println("Page Title"+driver.getTitle());
		System.out.println("Current URL:"+driver.getCurrentUrl());
		System.out.println("Page Source:"+driver.getPageSource());
		System.out.println("Window Handle:"+driver.getWindowHandle());
		
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
	}
}
