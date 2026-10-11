package launchBrowser;
import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the browser: ");
		String browser = sc.nextLine();
		System.out.println("title yes/no");
	
		switch(browser) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			new ChromeDriver();
		    break;
		   
		case "edge":
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			new EdgeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			new FirefoxDriver();
			break;
		}
		
	}

}
