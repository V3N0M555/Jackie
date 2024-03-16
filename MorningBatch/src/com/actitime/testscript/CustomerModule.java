package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test(groups={"regressiontest","smoketest"})
	public void createCustomer() {
		Assert.fail();
		Reporter.log("createCustomer", true);	}
	@Test(groups="regressiontest")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer", true);	}
	@Test(groups="regressiontest",dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer", true);	}
}
