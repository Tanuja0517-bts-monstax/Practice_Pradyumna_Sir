package seleniumTask;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumTask.ListenerImplementation.class)
public class TestScriptListenerImplementation2 extends ConfigurationAnnotations{
	@Test(retryAnalyzer = IRetryAnalyzer.class)
	protected void show() {
		System.out.println("Show method");
	}
	
	@Test(retryAnalyzer = IRetryAnalyzer.class)
	private void display(){
		System.out.println("Display method");
	}
}
