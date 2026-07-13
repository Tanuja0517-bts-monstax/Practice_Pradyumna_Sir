package locatos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notofication_Popup {
	public static void main(String[] args) throws InterruptedException {
		//1. create the options class object for that specific browser and pass what u want to handle
		ChromeOptions co = new ChromeOptions();
		//to disbale notification
		co.addArguments("--disable-notifications");
		//incognito mode
		co.addArguments("--incognito");
		//maximize window
		co.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(co);
		//driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
