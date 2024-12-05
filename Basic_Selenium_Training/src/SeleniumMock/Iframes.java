package SeleniumMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/User/Downloads/iframes.html");
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7675123456");
		Actions act=new Actions(driver);
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.xpath("//div[.='Sign in with Google']"));
		act.click(ele).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
