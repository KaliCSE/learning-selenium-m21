package learning_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmail {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		System.out.print("Page Title: "+driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[contains(.,'Create account')]")).click();
	}

}
