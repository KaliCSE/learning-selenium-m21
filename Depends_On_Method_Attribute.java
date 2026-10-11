package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Method_Attribute {
	@Test
	public void registerTest() {
		Reporter.log("User Registered Successfully...",true);
	}
	@Test(dependsOnMethods = "registerTest")
	public void loginTest() {
		Reporter.log("User Logged In Successfully...",true);
	}
	@Test(dependsOnMethods = "loginTest")
	public void shoppingTest() {
		Reporter.log("Order Placed Successfully...",true);
	}
	@Test(dependsOnMethods = {"registerTest","loginTest","shoppingTest"})
	public void logoutTest() {
		Reporter.log("User Logged Out Successfully...",true);
	}

}
