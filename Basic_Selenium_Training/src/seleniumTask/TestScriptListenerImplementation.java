package seleniumTask;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(seleniumTask.ListenerImplementation.class)
public class TestScriptListenerImplementation extends ConfigurationAnnotations{
	@Test(retryAnalyzer = IRetryAnalyzer.class)
	public void testCaseTest1() {
		System.out.println("This is testcase 1");
	}
	
	@Test(retryAnalyzer = IRetryAnalyzer.class)
	public void testCaseTest2() {
		System.out.println("This is testcase 2");
	}
	
	@Test(retryAnalyzer = IRetryAnalyzer.class)
	public void testCaseTest3() {
		System.out.println("This is testcase 3");
	}
}
