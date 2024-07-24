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
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeSSForCart {
	public static void main(String[] args) throws IOException {
		File source;
		File destination;
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sonawaetanuja55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//adding 1st product to cart
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'ing cart')]")).click();
		
		//screenshot of 1st element
		WebElement price1=driver.findElement(By.xpath("//span[text()='Total:']/../span[text()='10.00']"));
		source=price1.getScreenshotAs(OutputType.FILE);
		destination=new File("./screenShot/Price1.png");
		FileHandler.copy(source, destination);
		
		
		//adding 2nd product to cart
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		driver.findElement(By.xpath("//a[text()='Build your own cheap computer']")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'ing cart')]")).click();
		
		//screenshot for 2nd element
		WebElement price2=driver.findElement(By.xpath("//span[text()='Total:']/../span[text()='815.00']"));
		source=price2.getScreenshotAs(OutputType.FILE);
		destination=new File("./screenShot/Price2.png");
		FileHandler.copy(source, destination);
		
		//adding 3rd product to cart
		driver.findElement(By.partialLinkText("DIGITAL DOWNLOADS")).click();
		driver.findElement(By.xpath("//a[text()='3rd Album']")).click();
		//driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("20");
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'ing cart')]")).click();
		
		//screenshot for 3rd element & total price
		WebElement price3=driver.findElement(By.xpath("//span[text()='Total:']/../span[text()='1.00']"));
		source=price3.getScreenshotAs(OutputType.FILE);
		destination=new File("./screenShot/Price3.png");
		FileHandler.copy(source, destination);
	
		WebElement totalPrice=driver.findElement(By.xpath("//div[@class='cart-footer']/..//div[@class='totals']"));
		source=totalPrice.getScreenshotAs(OutputType.FILE);
		destination=new File("./screenShot/TotalPrice.png");
		FileHandler.copy(source, destination);
		
		
		driver.quit();
	}
}
