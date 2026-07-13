package automationExercisePractice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestCase3 {
	public static void main(String[] args) throws Exception {
		TestCase3 tc = new TestCase3();
		tc.incorrectCredentials();
	}
	
	public void incorrectCredentials() throws Exception{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//2. Navigate to url 'http://automationexercise.com'
		driver.get("http://automationexercise.com");
		
		//3. Verify that home page is visible successfully
		if(driver.getTitle().equals("Automation Exercise"))
			System.out.println("Successfully navigated to home page");
		else
			System.out.println("Some issue while navigating it");
		
		//4. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		//5. Verify 'Login to your account' is visible
		if(driver.findElement(By.xpath("//h2[text()='Login to your account']")).getText().equals("Login to your account"))
			System.out.println("Successfully navigated to Login page");
		else
			System.out.println("Some issue while navogating");
		
		//6. Enter incorrect email address and password
		driver.findElement(RelativeLocator.with(By.name("email")).below(By.xpath("//h2[text()='Login to your account']"))).clear();
		driver.findElement(RelativeLocator.with(By.name("email")).below(By.xpath("//h2[text()='Login to your account']"))).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("asdfghj");
		
		//7. Click 'login' button
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		//8. Verify error 'Your email or password is incorrect!' is visible
		if(driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).isDisplayed())
			System.out.println("Error is coming");
		else
			System.out.println("Error is not present");
		
		//9. Taking screenshot of method
		File f =driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).getScreenshotAs(OutputType.FILE);
		File f1 = new File("./screenshots/error.png");
		FileHandler.copy(f, f1);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
