package seleniumTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Supply_Chain_Management {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String quantity="52";
		
		driver.get("http://49.249.28.218:8081/AppServer/Supply_Chain_Management/index.php");
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("gowtham123");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("123456");
		
		WebElement ele=driver.findElement(By.id("login:type"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Manufacturer");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.linkText("Manage Stock")).click();
		
		WebElement qt=driver.findElement(By.xpath("//input[@name='txtQuantity[11]']"));
		qt.clear();
		qt.sendKeys("32",Keys.ENTER);
		driver.switchTo().alert().accept();
		
		qt=driver.findElement(By.xpath("//input[@name='txtQuantity[11]']"));
		if(quantity.equals(qt.getAttribute("value"))) {
			System.out.println("Upadate is done");
		}
		else
			System.out.println("Update is not done");
		
		driver.quit();
		
	}
}
