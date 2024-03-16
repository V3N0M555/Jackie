package handlin_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfScrolling {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://facebook.com/");
	Actions a=new Actions(d);
	WebElement ele = d.findElement(By.linkText("Sign Up"));
//scrollByAmount(x,y) will scroll the web page until the mentioned pixels
	a.scrollByAmount(0, 333).perform();
//scrollToElement(ele) will scroll until particular element is visible 
	a.scrollToElement(ele).perform();
}
}
