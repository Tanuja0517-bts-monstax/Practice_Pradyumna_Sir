package seleniumScripts;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*	A broken link, also often called a dead link, is one that does not work i.e. does not redirect to the webpage 
 * 	it is meant to. This usually occurs because the website or particular web page is down or does not exist.
 *  When someone clicks on a broken link, an error message is displayed.
 *  Broken links may exist due to some kind of server error, which, in turn, causes the corresponding page to 
 *  malfunction and not be displayed. A valid URL will have a 2xx HTTP status code.  Broken links, which are 
 *  essentially invalid HTTP requests have 4xx and 5xx status codes.
 *  
 *  We used the HttpURLConnection class to check the response status of each link’s URL. If the response code is 200, 
 *  the link is considered valid; otherwise, it’s marked as a broken link.
 *  
 *  Reason's of broken links:
 *  1. Maybe the page is removed from the web application
 *  2. Maybe the web site structure has been modified(firstly it was in one page, but now it is in some other page but
 *  the links are not modified(So it will give 404 page not found error).*/
public class Learing_BrokenLink_Youtube {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.hyrtutorials.com/");
		
		//Step 1: Get all the links(URL's)
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//Step 2: Iterate from all the links
		for(WebElement link:links) {
			//Step 3: Get each url
			String url=link.getAttribute("href");
			
			//Step 4: Convert the url into URL class instance
			URL urll=new URL(url);
			
			//Step 5: Open connection to the URL server
			URLConnection urlCon=urll.openConnection();
			
			/*Step 6: Now we have opened the connection to the server but now we have to send the request to the server,
			 * based on the protocol for http we have HttpURLConnection class and for https we have HttpsURLConnection 
			 * class, where HttpURLConncetion and HttpsURLConnection are abstract classes */
			HttpURLConnection httpUrlConnection=(HttpURLConnection)urlCon;
			//Some time it will give timeout exception bcz of slow internet or network issue so we will give some wait time
			httpUrlConnection.setConnectTimeout(8000);
			
			//Step 7: Send request to server
			httpUrlConnection.connect();
			
			//Step 8: Verify  the response code
			if(httpUrlConnection.getResponseCode() == 200) 
				System.out.println(url+" - "+httpUrlConnection.getResponseMessage());
			else
				System.err.println(url+" - "+httpUrlConnection.getResponseMessage());
			
			//Step 9: CLose the connection
			httpUrlConnection.disconnect();
		}
		driver.quit();
	}
}
