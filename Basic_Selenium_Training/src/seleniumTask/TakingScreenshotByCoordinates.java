package seleniumTask;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshotByCoordinates {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele=driver.findElement(By.linkText("Log in"));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File img=new File("./screenShot/Img.png");
		
		Point po=ele.getLocation();
		int x=po.getX();
		int y=po.getY();
		
		BufferedImage fullimg=ImageIO.read(temp);
		BufferedImage eless=fullimg.getSubimage(po.getX(), po.getY() , 100, 500);
		ImageIO.write(eless, "png", img);
		
		driver.quit();
	}
}
