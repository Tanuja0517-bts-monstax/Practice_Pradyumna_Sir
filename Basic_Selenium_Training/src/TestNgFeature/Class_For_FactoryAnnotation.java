package TestNgFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class_For_FactoryAnnotation {
	@Test
	public void display() {
		System.out.println("Method of Class_For_FactoryAnnotation class");
		WebDriver driver=new ChromeDriver();
		driver.quit();
	}
	@Test
	public void display1() {
		WebDriver driver=new FirefoxDriver();
		driver.quit();
	}
}
