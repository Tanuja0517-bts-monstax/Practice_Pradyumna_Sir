package TestNgFeature;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Working_With_Config_Anno {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method method");
	}
	
	@Test
	public static void display() {
		System.out.println("@Test annoted Static method of Simple testng class ");
	}
	
	@Test (invocationCount = 3,threadPoolSize = 3)
	public void show() {
		System.out.println("@Test annoted Non-static method of Simple testng class");
	}
	
	@Test
	public void register() {
		System.out.println("Register testcase");
	}
	
	@Test
	public void login() {
		System.out.println("Login testcase");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Aftre class method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite method");
		}
}