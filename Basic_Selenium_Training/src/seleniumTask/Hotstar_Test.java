package seleniumTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Hotstar_Test {
	public WebDriver driver=null;
	public String expectedTitle="";
	@BeforeClass
	public void launchURL() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hotstar.com/");
		
		System.out.println(driver.getTitle());
	}
	@BeforeMethod
	public void loginToHotstar_Test() {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Home']")));
		driver.findElement(By.xpath("//span[text()='My Space']")).click();
		driver.findElement(By.xpath("//button[.='Log In']")).click();
		driver.findElement(By.id("7")).clear();
		driver.findElement(By.id("7")).sendKeys("7030791546");
		driver.findElement(By.xpath("//button[.='Get OTP']")).click();
		driver.findElement(By.xpath("//button[.='Continue']")).click();
	}
	
	@AfterMethod
	public void logOut() {
		driver.findElement(By.xpath("//button[.='Help & Settings']")).click();
		driver.findElement(By.xpath("//span[text()='Log Out'])[1]")).click();
	}
	
	@Test
	public void tryToPlaySomeThingFromHome() {
		driver.findElement(By.xpath("//button[.='Home']")).click();
		driver.findElement(By.xpath("//span[text()='Dil Bechara']")).click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
