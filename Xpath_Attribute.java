package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("GopalPandi@gmail.com");
		driver.findElement(By.xpath("//input[@id='_R_1h6kqsqppb6amH1_']")).sendKeys("GuptaPandi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("DaniDanilas");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();
	}

}
