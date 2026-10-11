package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("BalmaPandi@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Balma@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Forgotten password?']")).click();
//	    driver.findElement(By.xpath("//span[text()='Log in']")).click();
	    driver.findElement(By.xpath("//div[text()='தமிழ்']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='हिन्दी']")).click();
	    
	    
	}

}
