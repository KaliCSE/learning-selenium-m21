package locators;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		driver.findElement(By.xpath("(//input[@name=\"q\" ])[1]")).sendKeys("mobiles");
		Thread.sleep(2000);
//		List<WebElement>suggestions = driver.findElements(By.xpath("//li[@class=\"Swx5kP\"]"));
//		
//		System.out.println(suggestions.size());
//		for (WebElement sugg : suggestions) {
//			System.out.println(sugg.getText());
//			
//			if(sugg.getText().equals("mobiles under 25000")) {
//				sugg.click();
//				break;
//			
//			}
//		}
		List<WebElement>name = driver.findElements(By.xpath(""));
	}

	
	
}
