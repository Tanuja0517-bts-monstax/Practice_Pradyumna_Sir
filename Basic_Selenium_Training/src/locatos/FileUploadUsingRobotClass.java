package locatos;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingRobotClass {
	public static void main(String[] args) throws Exception {
		// Launch browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://the-internet.herokuapp.com/upload");

				// Click the upload button to open OS window
				driver.findElement(By.id("file-upload")).click();

				// File path to upload
				String filePath = "C:\\Users\\YourName\\Desktop\\samplefile.pdf";

				// Copy file path into clipboard
				StringSelection ss = new StringSelection(filePath);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

				// Use Robot Class
				Robot robot = new Robot();
				Thread.sleep(2000);

				// Press CTRL+V
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(1000);

				// Press ENTER
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

				Thread.sleep(2000);
				
				// Now click submit button on webpage
				driver.findElement(By.id("file-submit")).click();
	}
}
