package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {
	@Test
	public void resgisterTest() {
	  Reporter.log("User Registered Successfully...",true);
	}
	@Test
	public void loginTest() {
		Reporter.log("User Logged In Successfully...",true);
		
	}
	@Test
	public void shoppingTest() {
		Reporter.log("Order Placed Successfully...", true);
	}
	@Test
	public void logoutTest() {
		Reporter.log("User Logged Out Successfully...",true);
	}

}
