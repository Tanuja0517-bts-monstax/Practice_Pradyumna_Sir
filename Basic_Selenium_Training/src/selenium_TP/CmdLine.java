package selenium_TP;

import org.testng.annotations.Test;

public class CmdLine {
	@Test
	public void m1() {
		System.out.println("data:"+System.getProperty("url"));
	}
}
