package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_Popup {
	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/?");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath(""))
		
	}

}
