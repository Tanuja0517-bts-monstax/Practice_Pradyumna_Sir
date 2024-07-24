package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_ConfirmAlert {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("5698");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		
		driver.quit();
	}
}
