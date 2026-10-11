package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIle_Upload_Popup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thep-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		
		
		
	}

}
