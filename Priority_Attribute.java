package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Attribute {
	@Test(priority = 1)
	public void registerTest() {
		Reporter.log("User Registerd Successfully...",true);
	}
	
    @Test(priority = 2)
    public void loginTest() {
    	Reporter.log("User Logged In Successfully...",true);
    }
    @Test(priority = 3)
    public void shoppingTest() {
    	Reporter.log("Order Placed Successfulluy...",true);
    }
    @Test(priority = 4)
    public void loggedTest() {
    	Reporter.log("User Out Successfully...",true);
    }
    

}
