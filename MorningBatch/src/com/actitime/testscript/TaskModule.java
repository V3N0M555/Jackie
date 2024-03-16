package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass{
	
	@Test(groups="smoketest")
public void createTask() {
	Reporter.log("createTask",true);
}
	@Test(groups="regressiontest")
public void deleteTask() {
	Reporter.log("deleteTask",true);
}
	@Test(groups="regressiontest")
public void modifyTask() {
	Reporter.log("modifyTask",true);
}
}
