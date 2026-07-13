package locatos;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloadPopup {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://testautomationpractice.blogspot.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Download Files"))));
		
		driver.findElement(By.linkText("Download Files")).click();
		
		FluentWait fw = new FluentWait(driver);
		fw.withTimeout(Duration.ofSeconds(15));
		fw.pollingEvery(Duration.ofMillis(1));
		fw.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("inputText"))));
		
		driver.findElement(By.id("inputText")).clear();
		driver.findElement(By.id("inputText")).sendKeys("Good Morning");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		/*
		 * driver.findElement(By.id("generateTxt")).click();
		 * driver.findElement(By.id("txtDownloadLink")).click();
		 */

		Thread.sleep(5000);
		driver.quit();
	}
}
