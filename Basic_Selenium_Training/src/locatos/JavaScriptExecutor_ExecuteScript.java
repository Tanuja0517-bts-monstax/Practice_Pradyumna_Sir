package locatos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_ExecuteScript {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/p/download-files_25.html");
		Thread.sleep(3000);
		
		//typecasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1. scrolling using amount
		js.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		
		//2. scrolling to element
		WebElement ele = driver.findElement(By.id("generatePdf"));
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(3000);
		
		//3. sending data to a trextfield
		js.executeScript("document.getElementById('inputText').value='abcdefgh';");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('inputText').value='';");
		Thread.sleep(3000);
		
		//4.click action on element
		//js.executeScript("arguments[0].click();", driver.findElement(By.className("home-link")));
		//Thread.sleep(3000);
		
		//5. Selection option
		js.executeScript("arguments[0].checked=true;", driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")));
		
		Thread.sleep(5000);
		driver.quit();
	}
}
