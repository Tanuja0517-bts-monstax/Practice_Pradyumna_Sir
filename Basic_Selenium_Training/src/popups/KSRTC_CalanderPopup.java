package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KSRTC_CalanderPopup {
	public static void main(String[] args) {
		String month="January";
		String date="3";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		boolean flag=true;
		driver.get("https://ksrtc.in/");
		driver.findElement(By.id("imgDepartDate")).click();
		try {
			while(flag) {
				driver.findElement(By.xpath("//span[text()='"+month+"']")).getText();
				if((driver.findElement(By.xpath("//span[text()='"+month+"']")).getText()).equals(month))
					flag=false;
			}
		}
		catch(Exception e) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//span[text()='"+month+"']/ancestor::div[contains(@class,'ui-datepicker-group')]/table/tbody/tr/td[.='"+date+"']"))).perform();
		driver.findElement(By.xpath("//span[text()='"+month+"']/ancestor::div[contains(@class,'ui-datepicker-group')]/table/tbody/tr/td[.='"+date+"']")).click();
		driver.quit();
	}
}
