package SeleniumMock;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws Exception {
		String href = null;

		// 1. Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// 2. Navigate to application
		driver.get("https://www.flipkart.com/");

		// 3. collect all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// 4. looping and finding if it is broken link or not
		for (WebElement link : links) {
			try {
				
//				URI uri = new URI(href);
//
//                // Convert URI back to URL for connection
//                URL url = uri.toURL();
				
				href = link.getAttribute("href");
				URL url = new URL(href);

				HttpURLConnection http = (HttpURLConnection) url.openConnection();
				if (http.getResponseCode() == 200)
					System.out.println(href + "******************" + http.getResponseMessage());
				else
					System.out.println(href + "******************" + http.getResponseMessage());
			} catch (Exception e) {
				System.out.println(href + " is broken link");
			}
		}
		
		//5. Close browser
		driver.quit();
	}
}
