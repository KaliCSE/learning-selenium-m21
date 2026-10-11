package WebElement_Interface_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter_Method {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//div[@aria-label='Log in']"));
		
		//Fetch the text
		System.out.println(loginButton.getText());
		System.out.println(loginButton.getTagName());
		System.out.println("------------------------------------");
		
		//fetch tag of the element:
		System.out.println(loginButton.getAriaRole());
		System.out.println("------------------------------------");
		
		//fetch the height and width an element:
		//In Dimension class, toString() of object class is overridden
		System.out.println(loginButton.getSize());
		System.out.println(loginButton.getSize().getWidth());
		System.out.println(loginButton.getSize().getHeight());
		System.out.println("------------------------------------");

		//Fetch the location of an element:
		//In point class, toString() of object class is overridden:
		System.out.println(loginButton.getLocation());
		System.out.println(loginButton.getLocation().getX());
		System.out.println(loginButton.getLocation().getY());
		System.out.println("------------------------------------");

		//Fetch the Height , Width , X, and Y dimension of an element:
		//in Rectangle class, toString() of object class is not overridden:
		Rectangle rect = loginButton.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println("------------------------------------");

		

	}
	

}
