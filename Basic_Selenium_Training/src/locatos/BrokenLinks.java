package locatos;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws Exception {
		String eachLink=null;
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		//2. Navigate to application
		driver.get("http://49.249.28.218:8888/");
		
		//3. Collecting all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//4. checking broken links
		for(WebElement link : links) {
			try {
			//4.1 Take href attribute value
			eachLink= link.getAttribute("href"); 
			//4.2 Coverting the string to URL 
			/* URI uri = new URI(eachLink);
			URL url =uri.toURL();
			 * */
			URL url = new URL(eachLink);
			//4.3 Making connection between the code ant the specific url
			URLConnection uttp = url.openConnection();
			HttpURLConnection http = (HttpURLConnection)uttp;
			
			if(http.getResponseCode()>=400) {
				System.out.println("Fail "+eachLink+" ********* "+http.getResponseCode()+" ********* "+http.getResponseMessage());
			}
		/*	else {
				System.out.println("Success "+eachLink+eachLink+http.getResponseCode()+"*********"+http.getResponseMessage());
			}*/
			} catch(Exception e) {
				System.out.println("eachLink Failed "+eachLink+" eachLink");
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
