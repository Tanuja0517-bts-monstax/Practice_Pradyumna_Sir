package selenium_TP;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeNethod() {
		System.out.println("before method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
}
