package seleniumTask;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEndScenario {
	public static void addToCart() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		driver.findElement(By.partialLinkText("Notebooks")).click();
		
		WebElement orderBy=driver.findElement(By.id("products-orderby"));
		Select sel1=new Select(orderBy);
		sel1.selectByIndex(0);
		
		WebElement pageSize=driver.findElement(By.id("products-pagesize"));
		Select sel2=new Select(pageSize);
		sel2.selectByVisibleText("12");
		
		WebElement viewMode=driver.findElement(By.id("products-viewmode"));
		Select sel3=new Select(viewMode);
		sel3.selectByVisibleText("List");
		
		WebElement price=driver.findElement(By.xpath("//div[@class='prices']/..//span[contains(text(),'1590')]"));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ff=price.getScreenshotAs(OutputType.FILE);
		File loc=new File("./screenShot/price.png");
		FileHandler.copy(ff, loc);
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		if(driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).isDisplayed()) {
			File ff1=ts.getScreenshotAs(OutputType.FILE);
			File loc1=new File("./screenShot/filterComp1.png");
			FileHandler.copy(ff1, loc1);
		}
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@value='1']"));
		ele.clear();
		ele.sendKeys("2");
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		EndToEndScenario.addToCart();
	}
}
