package TestNgFeature;

import org.testng.annotations.Test;

public class Working_With_Groups01 {
	@Test(groups = "ST")
	public void logIn() {
		System.out.println("Executing Login test case");
	}
	
	@Test(groups = "FT")
	public void register() {
		System.out.println("Executing Register test case");
	}
	
	@Test(groups = "FT")
	public void logOut() {
		System.out.println("Executing Logout est case");
	}
}
