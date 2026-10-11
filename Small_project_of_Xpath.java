package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Small_project_of_Xpath {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//button[@id=\"loginBtn\"]")).click();
		driver.findElement(By.xpath("//input[@id=\'Email\']")).sendKeys("Paandii@gmail.com");
	}

}
