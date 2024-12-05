package seleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumTask.ListenerImplementation.class)
public class TestScriptListenerImplementation2 extends ConfigurationAnnotations{
	@Test(retryAnalyzer = ImplementingIretryAnalyser.class)
	protected void show() {
		System.out.println("Show method");
	}
	
	@Test(retryAnalyzer = ImplementingIretryAnalyser.class)
	private void display(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		System.out.println("Display method");
		driver.quit();
	}
}
