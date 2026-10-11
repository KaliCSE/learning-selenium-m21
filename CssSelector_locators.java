package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_locators {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		//ignore this line 
		driver.findElement(By.xpath("//button[text()='English']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[aria-controls='pr_id_1_list']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='ng-tns-c68-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Bangalore");
		
	

}
}
