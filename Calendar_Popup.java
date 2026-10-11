package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Popup {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		
	WebElement frame = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame);
	driver.findElement(By.id("datepicker")).click();
	if( driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText().equals("August 1947")) {
		driver.findElement(By.linkText("15")).click();
	}
	else {
		while(true) {
			WebElement title = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			if(title.getText().equals("August 1947")) {
				break;
			}
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			
		}
		driver.findElement(By.linkText("15")).click();
	}
	}

}
