package webDriver_Interface_Methods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrl_Method {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://x.com/");
		Thread.sleep(2000);
		
		//fetch the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
