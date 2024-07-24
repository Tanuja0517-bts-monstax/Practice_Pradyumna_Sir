package TestNgFeature;

import org.testng.annotations.Test;

public class Working_With_Groups02 {
	@Test(groups = "ST")
	public void addToCart() {
		System.out.println("Executing Add To Cart test case");
	}
	
	@Test(groups = "FT")
	public void subscribe() {
		System.out.println("Executing Subscribe test case");
	}
	
	@Test(groups = "FT")
	public void vote() {
		System.out.println("Executing Vote test case");
	}
}
