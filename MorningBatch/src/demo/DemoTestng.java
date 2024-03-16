package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestng {
	@Test
	public static void demoB() {
		Reporter.log("Hi World");//It will print only in the report
//		Reporter.log("Hi World",false);//It will print only in the report
	}

	@Test
	public static void demoC() {
		Reporter.log("Bye World", true);//It will print both on report and console
	}

	@Test
	public static void demoA() {
		System.out.println("Hello World");//It will print only on the console
	}

}
