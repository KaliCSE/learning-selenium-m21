package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Action {
	public static void main(String[] args) throws Exception {
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("file:///C:/Users/kaliraj/Downloads/Telegram%20Desktop/DragandDrop.html");
	     Thread.sleep(2000);
	     
	     
	     Actions action = new Actions(driver);
	     for(int i=1;i<=7;i++) {
	    	 WebElement dragElement = driver.findElement(By.id("cap-"+i));
		     WebElement dropElement = driver.findElement(By.id("cc-"+i));
		     
		     
		   
		     action.dragAndDrop(dragElement, dropElement).perform();
	    	 
	     }
	     
	     
	    
	     
	}

}
