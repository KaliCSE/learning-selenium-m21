package learning_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		Thread.sleep(2000);
	}

}
