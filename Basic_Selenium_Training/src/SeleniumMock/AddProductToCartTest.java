package SeleniumMock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class AddProductToCartTest {
	
	
	
	@Test
	public void addToCart() throws IOException, InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("seleniumA2@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("selenium@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.id("small-searchterms")).sendKeys("book",Keys.ENTER);
	driver.findElement(By.linkText("Health Book")).click();
	WebElement addtoCart = driver.findElement(By.xpath("//input[@value='Add to cart']/ancestor::div[@class='add-to-cart']/descendant::input[@value='Add to cart']"));
	WebElement Shoppingcart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
	addtoCart.click();
	Shoppingcart.click();
	AddProductToCartTest add=new AddProductToCartTest();
	add.takesScreenchot(driver, "Book");
	WebElement Logo = driver.findElement(By.xpath("//img[@src='/Themes/DefaultClean/Content/images/logo.png']"));
	Logo.click();
	
	driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	//Thread.sleep(2000);
	driver.findElement(By.linkText("Blue and green Sneaker")).click();
	 driver.findElement(By.xpath("//input[@value='Add to cart']/ancestor::div[@class='add-to-cart']/descendant::input[@value='Add to cart']")).click();
	 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	add.takesScreenchot(driver, "Shoes");
	driver.findElement(By.id("small-searchterms")).sendKeys("computer",Keys.ENTER);
	driver.findElement(By.linkText("Build your own cheap computer")).click();
	driver.findElement(By.xpath("//input[@value='Add to cart']/ancestor::div[@class='add-to-cart']/descendant::input[@value='Add to cart']")).click();
	 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	add.takesScreenchot(driver, "Computer");
	
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
	driver.quit();
	}
	
	public void takesScreenchot(WebDriver driver,String Name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenShot/"+Name+".png");
		FileHandler.copy(src, dest);
	}

}
