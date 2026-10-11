package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
	}

}
