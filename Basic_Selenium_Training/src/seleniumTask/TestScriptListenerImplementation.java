package seleniumTask;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumTask.ListenerImplementation.class)
public class TestScriptListenerImplementation {
	@Test
	public void testCaseTest1() {
		System.out.println("This is testcase 1");
	}
	
	@Test
	public void testCaseTest2() {
		System.out.println("This is testcase 2");
	}
	
	@Test
	public void testCaseTest3() {
		System.out.println("This is testcase 3");
	}
}
