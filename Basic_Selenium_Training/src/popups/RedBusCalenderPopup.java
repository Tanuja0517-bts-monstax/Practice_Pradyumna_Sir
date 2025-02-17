package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RedBusCalenderPopup {
	@Test
	public void setDate() throws InterruptedException {
		String month="Apr";
		String date="17";
		
		WebDriver driver=new ChromeDriver();
		boolean flag=true;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onwardCal")).click();
		Actions act = new Actions(driver);
		while(flag) {
			try {
					if((driver.findElement(By.xpath("//div[text()='"+month+"']")).getText()).contains(month)) {
						driver.findElement(By.xpath("//div[contains(text(),'"+month+"')]/parent::div/following-sibling::div/div[contains(@class,'DayTiles')]/span/div[.='"+date+"']")).click();
						flag=false;
						break;
					}
			}
			catch(Exception e) {
				act.click(driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1']//*[name()='path' and contains(@d,'M25.53,0.13A2.49,2.49,0,0,1,27.3.')]/../.."))).perform();
				Thread.sleep(2000);
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
