package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_Locators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//find the locations of WebELemet
		By a = By.id("_R_1h6kqsqppb6amH1_");
	
		//found the WebElement
     	WebElement email = driver.findElement(a);	
     
     	email.sendKeys("ram123@gmail.com");
		
         
        By b = By.id("_R_1hmkqsqppb6amH1_");
        
        WebElement password = driver.findElement(b);
       
        password.sendKeys("ram@123");
        
	}

}
