package seleniumScripts;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 	A broken link, also often called a dead link, is one that does not work i.e. does not redirect to the webpage 
 * 	it is meant to. This usually occurs because the website or particular web page is down or does not exist.
 *  When someone clicks on a broken link, an error message is displayed.
 *  Broken links may exist due to some kind of server error, which, in turn, causes the corresponding page to 
 *  malfunction and not be displayed. A valid URL will have a 2xx HTTP status code.  Broken links, which are 
 *  essentially invalid HTTP requests have 4xx and 5xx status codes.
 *  
 *  We used the HttpURLConnection class to check the response status of each link’s URL. If the response code is 200, 
 *  the link is considered valid; otherwise, it’s marked as a broken link.*/
public class Working_With_BrokenLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();


		// Navigate to BStackDemo Website
		driver.get("https://bstackdemo.com/");


		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));


		// Iterating each link and checkin
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
			}


			driver.quit();
			}


			public static void verifyLink(String url) {
			try {
				URL link = new URL(url);
				HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
				httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
				httpURLConnection.connect();


				if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
				} else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
				}
				} catch (Exception e) {
				System.out.println(url + " - " + "is a broken link");
			}
	}
}