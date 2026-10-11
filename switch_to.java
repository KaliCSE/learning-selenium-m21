package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_to {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("Title - "+driver.getTitle());
		System.out.println("URL - "+driver.getCurrentUrl());
		String facebookTab = driver.getWindowHandle();
	
	    Thread.sleep(2000);
	    
	    
	    //open to new tab
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.instagram.com/");
	    System.out.println("Title - "+driver.getTitle());
	    System.out.print("URL - "+driver.getCurrentUrl());
	    String instagramTab = driver.getWindowHandle();
	    Thread.sleep(2000);
	    
	    
	    driver.switchTo().window(facebookTab);
	    Thread.sleep(2000);
	    driver.switchTo().window(instagramTab);
	    Thread.sleep(2000);  
	    driver.quit();
	    
	}

}
