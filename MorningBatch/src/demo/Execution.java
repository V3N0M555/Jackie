package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class Execution extends BaseClass {
	@Test(priority = 1, invocationCount = 2)
	public void createCustomer() {
		Reporter.log("createCustomer", true);
	}

	@Test(dependsOnMethods = "modifyCustomer")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer", true);
	}

	@Test
	public void modifyCustomer() {
		Reporter.log("modifyCustomer", true);
	}
}
