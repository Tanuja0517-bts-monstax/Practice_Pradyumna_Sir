package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_CalanderPopup {
	public static void main(String[] args) {
		String month="January";
		String date="15";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		boolean flag=true;
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
		while(flag) {
		try {
			driver.findElement(By.xpath("//span[text()='"+month+"']")).getText();
			if((driver.findElement(By.xpath("//span[text()='"+month+"']")).getText()).equals(month))
				flag=false;
		}
		catch(Exception e) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']")).click();
			//while(!driver.findElement(By.xpath("//span[text()='"+month+"']")).getText().equals(month)) {
		}
		}
		driver.findElement(By.xpath("//span[text()='"+month+"']/parent::div/../../div[@class='ui-datepicker-calendar-container ng-tns-c58-10 ng-star-inserted']/table/tbody/tr/td/a[.='"+date+"']")).click();
		driver.quit();
	}
}
