package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup_Using_ChromeOptions {
	public static void main(String[] args) throws Exception {
		
		ChromeOptions Options = new ChromeOptions(); 
		Options.addArguments("--disable-notifications");
		
		
		
		WebDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/?");
		Thread.sleep(2000);
		
		
	}

}
