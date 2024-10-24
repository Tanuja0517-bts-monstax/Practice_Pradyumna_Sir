package TestNgFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_For_FactoryAnnotation1 {
	@Test
	public void method() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.co.in");
		driver.quit();
	}
}
