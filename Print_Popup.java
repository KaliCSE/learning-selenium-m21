package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_Popup {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		
		//find the drop down
	    WebElement dropdown = driver.findElement(By.name("country"));
	    
	    //Create an object of select class by passing the drop down in construction
	    Select select = new Select(dropdown);
	    
	    //select 20th option
	    select.selectByIndex(19);
	    Thread.sleep(2000);
	    
	    //Select India by it's value
	    select.selectByValue("IN");
	    Thread.sleep(2000);
	    
	    //select Pakistan
	    select.selectByVisibleText("Pakistan");
	    Thread.sleep(2000);
	    
	    //select Russia by partial text
	    select.selectByContainsVisibleText("Rus");
	    Thread.sleep(2000);
	    
	    
		
	}

}
