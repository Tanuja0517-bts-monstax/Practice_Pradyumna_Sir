package automationExercisePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
	String eTitle="Automation Exercise";
	
	public static void main(String[] args) throws Exception {
		TestCase1 tc = new TestCase1();
		tc.registerUser();
	}
	
	public void registerUser() throws Exception{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//2. Navigate to url 'http://automationexercise.com'
		driver.get("http://automationexercise.com");
		
		//3. Verify that home page is visible successfully
		if(driver.getTitle().equals(eTitle))
			System.out.println("SUccessfully navigated to home page 🥳🥳");
		else
			System.out.println("Something went wrong while navigating please check 😑😑");
		
		//4. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		//5. Verify 'New User Signup!' is visible
		if(driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed())
			System.out.println("Successfully went to Signup page 🥳🥳");
		else
			System.out.println("Something went wrong while navigating please check 😑😑");
		
		//6. Enter name and email address
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("aabcs");
		driver.findElement(RelativeLocator.with(By.name("email")).above(By.xpath("//button[text()='Signup']"))).click();
		driver.findElement(RelativeLocator.with(By.name("email")).above(By.xpath("//button[text()='Signup']"))).sendKeys("aabcs1@gmail.com");
		
		//7. Click 'Signup' button
		Actions act = new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//button[text()='Signup']"))).perform();
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
		if(driver.findElement(By.xpath("//h2[contains(.,'Enter')]")).isDisplayed())
			System.out.println("Enter Account Information is visible 🥳🥳");
		else
			System.out.println("Something went wrong while navigating please check 😑😑");
		
		//9. Fill details: Title, Name, Email, Password, Date of birth
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Richa@123");
		
		Select sel = new Select(driver.findElement(By.id("days")));
		sel.selectByVisibleText("15");
		sel=new Select(driver.findElement(By.id("months")));
		sel.selectByVisibleText("May");
		sel=new Select(driver.findElement(By.id("years")));
		sel.selectByVisibleText("2000");
		
		//10. Select checkbox 'Sign up for our newsletter!'
		driver.findElement(By.id("newsletter")).click();
		
		//11. Select checkbox 'Receive special offers from our partners!'
		driver.findElement(By.id("optin")).click();
		
		//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("Richa");
		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Kulkarni");
		driver.findElement(By.id("company")).clear();
		driver.findElement(By.id("company")).sendKeys("abcdse");
		driver.findElement(By.id("address1")).clear();
		driver.findElement(By.id("address1")).sendKeys("dfghjkaekfyi");
		
		sel = new Select(driver.findElement(By.id("country")));
		sel.selectByVisibleText("India");
		driver.findElement(By.id("state")).clear();
		driver.findElement(By.id("state")).sendKeys("Maharashtra");
		driver.findElement(By.id("zipcode")).clear();
		driver.findElement(By.id("zipcode")).sendKeys("411001");
		driver.findElement(By.id("mobile_number")).clear();
		driver.findElement(By.id("mobile_number")).sendKeys("7685432467");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		driver.findElement(By.id("city")).sendKeys("Pune");
		
		//13. Click 'Create Account button'
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		
		//14. Verify that 'ACCOUNT CREATED!' is visible
		if(driver.findElement(By.xpath("//h2[.='Account Created!']")).isDisplayed())
			System.out.println("Account successfully cteated!!! 🥳🥳");
		else
			System.out.println("Issue while creating account plese check once 😑😑");
		
		//15. Click 'Continue' button
		driver.findElement(By.linkText("Continue")).click();
		
		//16. Verify that 'Logged in as username' is visible
		if(driver.findElement(By.xpath("//a[contains(.,'Logged in as')]")).isDisplayed())
			System.out.println("User is successfully logged in 🥳🥳");
		else
				System.out.println("Issue while logging in please check once 😑😑");
		
		//17. Click 'Delete Account' button
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		
		//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
		if(driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed())
			System.out.println("User is successfully deleted 🥳🥳");
		else
			System.out.println("Issue while deleting user 😑😑");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
