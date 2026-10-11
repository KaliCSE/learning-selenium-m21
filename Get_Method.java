package webDriver_Interface_Methods;




import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Method {
    public static void main(String []args) {
  	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//    	new ChromeDriver();
    	FirefoxDriver driver = new FirefoxDriver();
    	//open the application Twitter
    	driver.get("https://x.com/");
       

    	
    }
}
