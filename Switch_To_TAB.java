package Switch_To_Method;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_TAB {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open flipkart webpage
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println("----------------------------------------------");
	    
	    
	    
	    //open another tab amazon webPage
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.amazon.in");
	    Thread.sleep(8000);
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println("----------------------------------------------");
	    
	    //open myntra new Winodow
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.myntra.com");
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println("-------------------------------------------------");
	    
	    
	    //I want to close the amazon Tab switch to amazon TAB
	    String currentID = driver.getWindowHandle();  //Here the current ID is myntra
	    Set<String> allIDs = driver.getWindowHandles(); //Here it will have all ids
	    for (String ids : allIDs) {
	    	driver.switchTo().window(ids);
	    	if(driver.getTitle().contains("Amazon")) {
	    		break;
	    	}
			
		}
	    System.out.println("Here it will fetch the Amazon title & url and close");
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.close();
	    System.out.println("-------------------------------------------------------");
	    
	    
	    //Now Im closing Flipkart webPage same previous amazon WebPage
	    for (String ids: allIDs) {
	    	driver.switchTo().window(ids);
	    	if(driver.getCurrentUrl().contains("flipkart")) {
	    		break;
	    	}
			
		}
	    System.out.println("Here it will fetch the Flipkart title & url and close");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	    System.out.println("-------------------------------------------------------");

	    
	    //i want Myntra Title and Close
	    driver.switchTo().window(currentID);
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	    System.out.println("---------------------------------------------------------");
	    
	}

}
