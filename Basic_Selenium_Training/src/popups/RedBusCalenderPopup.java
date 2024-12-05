package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusCalenderPopup {
	public static void main(String[] args) {
		String month="Jan";
		String date="4";
		
		WebDriver driver=new ChromeDriver();
		boolean flag=true;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onwardCal")).click();
		while(flag) {
			try {
				driver.findElement(By.xpath("//span[text()='"+month+"']")).getText();
				if((driver.findElement(By.xpath("//span[text()='"+month+"']")).getText()).equals(month))
					flag=false;
			}
			catch(Exception e) {
				driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1']")).click();
				
				//while(!driver.findElement(By.xpath("//span[text()='"+month+"']")).getText().equals(month)) {
			}
		}
		driver.findElement(By.xpath("//div[text()='"+month+"']/parent::div/following-sibling::div/div[contains(@class,'DayTilesWrapper')]/child::span/div/span[text()='"+date+"']")).click();
	}
}
