package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//button[contains(text(),'English')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@role,'searchbox')])[1]")).sendKeys("chennai");
		
	}

}
