package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_With_JavascriptExecutor_Test {
	@Test
	public void login() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "path");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/users/sign_in");
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		Thread.sleep(3000);
		
		System.out.println(js.executeScript("return document.getElementById('user_email_login').value;"));
		js.executeScript("document.getElementById('user_password').value='password';");
		js.executeScript("document.getElementById('user_submit').click();");
		js.executeScript("alert('enter correct login credentials to continue');");
		
//		String msg = (String) js.executeScript("return window.alertMessage;");
//		System.out.println("Msg:"+msg);
		Thread.sleep(2000);

		driver.quit();
	}
}
