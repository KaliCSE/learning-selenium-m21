package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Index {
	public static void main(String[] args) throws Exception {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[text()='Register']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input[@name='Gender'])[1]")).click();
	   driver.findElement(By.xpath("((//input[@type=\"text\"])[3]")).sendKeys("kali");
	   
	}

}
