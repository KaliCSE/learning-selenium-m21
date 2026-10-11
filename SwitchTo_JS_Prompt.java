package Switch_To_Method;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_JS_Prompt {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
//		
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
		WebElement element = driver.findElement(By.xpath("//p[@id=\"result\"]"));
	    
		if(element.getText().contains(text)) {
			System.out.println("true");
		}
		
		
	}

}
