package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
	driver.get("https://www.instagram.com/");
//isEnabled() is used to check whether element is enabled or disabled 
//(Whether action can be performed on the element)
	boolean res = driver.findElement(By.tagName("button")).isEnabled();
//	boolean res = driver.findElement(By.name("login")).isEnabled();
	if(res==true) {
		System.out.println("Login button is enabled");
	}else {
		System.out.println("Login button is disabled");
	}
	driver.quit();
}
}
