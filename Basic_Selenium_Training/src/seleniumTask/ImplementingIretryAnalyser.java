package seleniumTask;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ImplementingIretryAnalyser implements IRetryAnalyzer{

	int ct=0,max=10;
	@Override
	public boolean retry(ITestResult result) {
		if(ct<max) {
			ct++;
			return true;
		}
		return false;
	}
	
}
