package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	
	@Test(groups="smoketest")
public void createProject() {
	Reporter.log("createProject",true);
}
	@Test(groups="regressiontest")
public void deleteProject() {
	Reporter.log("deleteProject",true);
}
	@Test(groups="regressiontest")
public void modifyProject() {
	Reporter.log("modifyProject",true);
}
}
