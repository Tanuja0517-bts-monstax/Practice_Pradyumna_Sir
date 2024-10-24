package selenium_TP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VTigerQuickCreate {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		Select sel = new Select(driver.findElement(By.id("qccombo")));
		sel.selectByValue("Documents");
		
		driver.findElement(By.xpath("//div[@id='qcform']//input[@name='notes_title']")).sendKeys("Abc");
		driver.quit();
	}
}
