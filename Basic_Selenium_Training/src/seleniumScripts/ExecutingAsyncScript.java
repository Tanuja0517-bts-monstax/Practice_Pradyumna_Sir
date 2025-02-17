package seleniumScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutingAsyncScript {
	 public static void main(String[] args) {
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      //get current system time
	      long s = System.currentTimeMillis();
	      // Javascript executor
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      //executeAsyncScript method to set timeout
	      j.executeAsyncScript("window.setTimeout(arguments[arguments.length − 1], 800);");
//	      System.out.println("Time Elapsed is: " + (System.currentTimeMillis() − s));
	      driver.quit();
	   }

}
