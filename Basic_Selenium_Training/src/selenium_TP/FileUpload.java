package selenium_TP;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	    @Test
	    public void show() throws Exception {
	        WebDriver driver = new ChromeDriver();
	        
	            driver.get("https://www.ilovepdf.com/word_to_pdf");
	            String parent=driver.getWindowHandle();

	            // Trigger the file upload dialog (clicking a button)  driver.switchTo().window(data);
	            WebElement uploadButton = driver.findElement(By.id("pickfiles"));
	            uploadButton.click();
				
	          
	            Thread.sleep(2000);
	            Robot robot = new Robot();
	            String path="C:\\Users\\User\\Desktop\\Tanuja\\Interview_Questions.docx";
	            
	            try {
	                Runtime.getRuntime().exec(path);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            
//	            for (char c : path.toCharArray()) {
//	                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
//	                robot.keyPress(keyCode);
//	                robot.keyRelease(keyCode);
//	            }
	            // Type the file path in the dialog (simulating typing)
	            
	            
//	            // You can continue typing the full path of the file here
//	            // Simulate pressing the "Enter" key after typing the file path
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
//	            
	    }
}
