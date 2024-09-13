package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Ancestor_Descendant_Path {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//Ancestor xpath
//		driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]/../../../a")).click();
//		Thread.sleep(3000);
		
		//Descendant xpath
		driver.findElement(By.linkText("COMPUTERS")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')]/../../li/a[contains(text(),'Desktops')])[3]")).click();
		Thread.sleep(2000);

		//Preceding-sibling(before)
//		driver.findElement(By.xpath("(//li[contains(.,'Computer')])[1]/..//preceding-sibling::li[contains(.,'Electronics')]")).click();
//		Thread.sleep(2000);
		
		//following-sibling
		//driver.findElement(By.xpath("//li[contains(.,'Apparel')]/following-sibling::li[contains(.,'Digital')]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
