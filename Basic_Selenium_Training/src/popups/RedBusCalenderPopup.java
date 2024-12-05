package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBusCalenderPopup {
	public static void main(String[] args) {
		String month="Feb";
		String date="7";
		
		WebDriver driver=new ChromeDriver();
		boolean flag=true;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onwardCal")).click();
		Actions act = 
				new Actions(driver);
		while(flag) {
			try {
					if((driver.findElement(By.xpath("//div[text()='"+month+"']")).getText()).equals(month))
						flag=false;
			}
			catch(Exception e) {
				act.click(driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1']//*[name()='path' and contains(@d,'M25.53,0.13A2.49,2.49,0,0,1,27.3.')]/../.."))).perform();
			}
		}
		act.scrollByAmount(0,500).perform();
		driver.findElement(By.xpath("//div[text()='"+month+"']/parent::div/following-sibling::div/div[contains(@class,'DayTilesWrapper')]/child::span/div/span[text()='"+date+"']")).click();
	}
}
