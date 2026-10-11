package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_DynamicLocators {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products, Brands and More\"])[1]")).sendKeys("iphone",Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement name2 = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']"));
		System.out.println(name2.getText());
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../..//div[@class='hZ3P6w DeU9vF']"));
		System.out.println(name.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
