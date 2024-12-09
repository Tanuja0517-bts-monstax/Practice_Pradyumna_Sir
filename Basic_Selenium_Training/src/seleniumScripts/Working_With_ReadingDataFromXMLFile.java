package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Working_With_ReadingDataFromXMLFile {
	WebDriver driver=null;
	@Test
	public void readData(XmlTest test) throws Exception {
		String browser=test.getParameter("browser");
		if(browser.equalsIgnoreCase("Chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("Firefox"))
			driver=new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(test.getParameter("url"));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(test.getParameter("un"));
		driver.findElement(By.id("Password")).sendKeys(test.getParameter("pwd"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
