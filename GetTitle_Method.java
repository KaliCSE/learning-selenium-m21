package webDriver_Interface_Methods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle_Method {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=khjj5kn2JrU");
		Thread.sleep(2000);
		
		//fetching the title
		String title =  driver.getTitle();
		System.out.println(title);
	}

}
