package TestNgFeature;

import org.testng.annotations.Test;

public class Working_With_Include_Exclude {
	@Test
	public void registerTest() {
		System.out.println("Executing Register test");
	}
	
	@Test
	public void loginTest() {
		System.out.println("Executing Login test");
	}
	
	@Test
	public void addToCartTest() {
		System.out.println("Executing Add to cart test");
	}
	
	@Test
	public void wishlistTest() {
		System.out.println("Executing Wishlist test");
	}
}
