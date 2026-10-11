package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_LogicalLocators {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-register' and text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"Gender\" and @value='M']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"text-box single-line\" and @id=\"FirstName\"]")).sendKeys("Billa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"text-box single-line\" and @id=\"LastName\"]")).sendKeys("Pandii");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"text-box single-line\" and @name=\"Email\"]")).sendKeys("BillaPandi@gmail.com");
				
			
	}

}
