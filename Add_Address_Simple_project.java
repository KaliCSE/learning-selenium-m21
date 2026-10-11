package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Address_Simple_project {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//login your email ID
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("kalik@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Kali@2003");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Addresses")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='button-1 add-address-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Address_FirstName")).sendKeys("Billa");
		Thread.sleep(2000);
		driver.findElement(By.id("Address_LastName")).sendKeys("Pandii");
		Thread.sleep(2000);
		driver.findElement(By.id("Address_Email")).sendKeys("Billa@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Address_CountryId")).sendKeys("india");
		Thread.sleep(2000);
		driver.findElement(By.id("Address_City")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.id("Address_Address1")).sendKeys(" 99th St, Ottagapalayam, Sector 15, Vadapalani, Chennai, Greater Chennai, Tamil Nadu 600078");
		Thread.sleep(2000);
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("600078");
		Thread.sleep(2000);
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("0987654321");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='button-1 save-address-button']")).click();
	
		
	
	}

}
