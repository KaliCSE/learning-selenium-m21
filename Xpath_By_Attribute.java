package learning_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='_R_1h6kqsqppb6amH1_']")).sendKeys("kali@2003@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kali@2003") ;
		driver.findElement(By.xpath("//*[name() ='svg' and @class='xilliihq x2lahes x1k9@msu x2h7rmj x1qfuztq x198g3q0 xxk@z11 xvy4dip']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label=\'Log in\']")).click();
		
		
	}

}
