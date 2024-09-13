package selenium_TP;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Spotify {
	public WebDriver driver=null;
	@Test
	public void searchSong() throws IOException {
		String expectedTitle="";
		//Reading data from property file
		FileInputStream fis=new FileInputStream("./test-Data/Info.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("url1");
		
		//Launching browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		//triggering url
		driver.get(url);
		System.out.println(driver.getTitle());
		
		//performing task
		driver.findElement(By.id("onetrust-close-btn-container")).click();
		//Login(Can't perform)
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.id("login-username")).sendKeys("tanujans@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Tanuja@1234");
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		
		//Search song
//		driver.findElement(By.xpath("//input[@placeholder='What do you want to play?']")).sendKeys("Ishq");
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//div[@data-testid='herocard-click-handler']"))).perform();
//		
//		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		//driver.quit();
	}
}
