package basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelExecution {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	WebDriver driver;
	System.out.println("Enter the browser");
	String browser=s.next();
	if(browser.equals("chrome")) {
		 driver=new ChromeDriver();
	}else if(browser.equals("edge")) {
		 driver=new EdgeDriver();
	}else {
		 driver=new FirefoxDriver();
	}
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	
}
}
