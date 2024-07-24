package TestNgFeature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_DataProvider {
	//Data provider
	@DataProvider(name="TestData")
	public Object[][] testData() {
		Object[][] data=new Object[2][2];
		data[0][0]="sonawaletanuja55@gmail.com";
		data[0][1]="Tanuja@0803";
		
		data[1][0]="sonawaletanuja45@gmail.com";
		data[1][1]="Tanuja@45";
		
		return data;
	}
	
	@Test
	public void show() {
		System.out.println("Show method");
	}
	
	//using the data from data provider to test  cases  

	@Test(dataProvider = "TestData", dependsOnMethods = "show")
	public void login(String un,String pwd) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
		
	}
}
