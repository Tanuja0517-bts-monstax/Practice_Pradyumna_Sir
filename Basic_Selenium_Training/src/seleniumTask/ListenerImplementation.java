package seleniumTask;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener,ISuiteListener{
	public void onStart(ISuite suite) {
	    System.out.println("On start");
	  }
	
	public void onFinish(ISuite suite) {
	    System.out.println("On finish");
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("On Test Start");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("On Test Success");
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
