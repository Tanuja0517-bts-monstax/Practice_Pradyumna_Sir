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

public class SimplePgm {
	
	@Test
	public static void display() {
		System.out.println("@Test annoted Static method of Simple testng class ");
	}
	
	@Test
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

}
