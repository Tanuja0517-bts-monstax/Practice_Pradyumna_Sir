package seleniumTask;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method method");
	}
}
