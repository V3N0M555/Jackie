package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		WebDriver d1= new EdgeDriver();
		WebDriver d2= new FirefoxDriver();
		DemoA.test(d);
		DemoA.test(d1);
		DemoA.test(d2);
	}
}
