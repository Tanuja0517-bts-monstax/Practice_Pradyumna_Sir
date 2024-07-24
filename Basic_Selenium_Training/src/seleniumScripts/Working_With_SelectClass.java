package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Working_With_SelectClass {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get("https://demowebshop.tricentis.com/");
		
		//Login 
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//Enter username
		driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
		
		//Enter password
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		
		//Click on Login
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//click on books section
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		//Select drop down(By selectByVisibleText() method)
		Select sortBy=new Select(driver.findElement(By.id("products-orderby")));
		
		sortBy.selectByVisibleText("Name: A to Z");
		
		//Select drop down(By selectByVisibleText() method)
		Select display=new Select(driver.findElement(By.id("products-pagesize")));
		display.selectByValue("https://demowebshop.tricentis.com/books?orderby=5&pagesize=12");
		
		//Select drop down(By Options)
		Select option=new Select(driver.findElement(RelativeLocator.with(By.id("products-viewmode")).toRightOf(By.xpath("//span[text()='View as']"))));
		List<WebElement> options=option.getOptions();
		
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
		
		//Select drop down(isMultipleSelect)
		System.out.println("Is Multiple Select:"+sortBy.isMultiple());
		
		Thread.sleep(2000);
		//closing the browser
		driver.quit();
	}
}
