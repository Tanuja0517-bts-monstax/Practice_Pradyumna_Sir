package selenium_TP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenDifferentWindows {
	public static void main(String[] args) {
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.com");
	}
}
