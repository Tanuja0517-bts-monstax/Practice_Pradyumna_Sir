package testNgTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TC01 {
	public WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		//Lauching Browser
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@BeforeTest
	public void beforeTest() {
		//Launching the web application
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing Before Class method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@Test
	public void searchProduct() {
		driver.findElement(By.id("small-searchterms")).sendKeys("Somputers");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Aftre class method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test method");
		driver.quit();
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite method");
	}
}
