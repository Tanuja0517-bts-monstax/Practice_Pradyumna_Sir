package TestNgFeature;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider
	public Object[][] provideData() {
		Object obj[][]=new Object[3][2];
		obj[0][0]="iphone";
		obj[0][1]="Apple iPhone 15 (Black, 256 GB)";
		
		obj[1][0]="samsung note 20 ultra";
		obj[1][1]="SAMSUNG Galaxy Note 20 Ultra 5G (Mystic Black, 256 GB)";
		
		obj[2][0]="google pixel";
		obj[2][1]="Google Pixel 8 (Rose, 128 GB)";
		return obj;
	}
}
