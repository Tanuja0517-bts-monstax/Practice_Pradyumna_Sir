package TestNgFeature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Working_With_Parameters {
	WebDriver driver;
	@Parameters("browser2")
	@Test
	public void login(@Optional("Chrome")String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
	}
}
