package seleniumTask;

import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener,ISuiteListener{
	public void onStart(ISuite suite) {
	    System.out.println("On start of suite");
	  }
	
	public void onFinish(ISuite suite) {
	    System.out.println("On finish of suite");
	  }
	
	public void onStart(ITestContext context) {
		    System.out.println("on start of test");
	 }
	
	public void onFinish(ITestContext context) {
	    System.out.println("on finish of test");
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("On Test Start");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("On Test Success");
	    System.out.println("get test name:"+result.getTestName());
	    System.out.println("getName:"+result.getName());
	    System.out.println("get method name:"+result.getMethod().getMethodName());
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("On Test Failure");
	  }
	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("On Test Skipped");
	  }
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    System.out.println("On Test Failed But Within Success Percentage");
	  }
	
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On Test Failed With Timeout");
	    onTestFailure(result);
	  }
}
