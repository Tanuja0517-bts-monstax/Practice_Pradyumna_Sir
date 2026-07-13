package locatos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript_Popup {
	public static void main(String[] args) throws Exception {
		//1. alert popup
		//1.1. launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//1.2. navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		
		//1.3. performing action to trigger alert popup
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);

		//1.4. printing text of popup
		Alert al =driver.switchTo().alert();
		
		System.out.println("Alert text:"+al.getText());
		driver.switchTo().alert().accept();
		
		//2. confirmation popup
		//2.1. Navigating to the aaplication
		driver.navigate().to("https://demoqa.com/alerts");
		
		//2.2 performing action to get the popup
		Actions act = new Actions(driver);
		act.scrollByAmount(0,500).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		
		//2.3 handling it
		driver.switchTo().alert().dismiss();
		
		
		//3. prompt popup
		//3.1. action that triggers the popup
		driver.findElement(By.id("promtButton")).click();
		
		//3.2. handling the popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.sendKeys("a");
		Thread.sleep(3000);
		alt.accept();
		
		//5. closing browser
		Thread.sleep(3000);
		driver.quit();
	}
}
