import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(element);
		s.selectByVisibleText("Fjallraven - Foldsac...");
		s.selectByIndex(1);
		s.selectByValue("Mens Casual Slim Fit");
		s.deselectByIndex(1);
		Thread.sleep(5000);
		String option = s.getFirstSelectedOption().getText();
		System.out.println(option);
		
		System.out.println("WrappedElement:"+s.getWrappedElement().getText());
		Thread.sleep(5000);
		driver.quit();
	}

}
