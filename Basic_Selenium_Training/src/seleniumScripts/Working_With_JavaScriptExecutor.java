package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_JavaScriptExecutor {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://demowebshop.tricentis.com");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('small-searchterms').value=' Computers'");
		
		WebElement searchButn=driver.findElement(By.xpath("//input[@type='submit']"));
		jse.executeScript("arguments[0].click()",searchButn);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h1[text()='Search']")), "Search"));
		
		driver.quit();
	}
}
