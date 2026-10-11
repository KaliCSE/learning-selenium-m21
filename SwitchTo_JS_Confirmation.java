package Switch_To_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_JS_Confirmation {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("kalik@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("Kali@222");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class=\"account\"])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Addresses")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value=\"Delete\"]")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        
       // driver.switchTo().alert().dismiss();
        driver.switchTo().alert().accept();
        
       
	}

}
