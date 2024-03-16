package basics;

import org.openqa.selenium.WebDriver;

public class DemoA {
public static void test(WebDriver d){
	d.get("https://www.google.com");
	System.out.println(d.getTitle());
	d.close();
	}
}
