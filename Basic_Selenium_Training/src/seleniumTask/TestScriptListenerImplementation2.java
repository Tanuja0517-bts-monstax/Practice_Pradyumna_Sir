package seleniumTask;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumTask.ListenerImplementation.class)
public class TestScriptListenerImplementation2 {
	@Test
	public void show() {
		System.out.println("Show method");
	}
	
	@Test
	public void display(){
		System.out.println("Display method");
	}
}
