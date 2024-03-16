package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCss {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
//getCssValue() is used to get the property value of a particular element. It is a parameterized
//method which takes string propertyName as parameter,bcoz one element will have multiple properties
//If property name is not present it will return empty space
	String size = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
	System.out.println("The size of forgotten password link is: "+size);
	String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
	System.out.println("The color of forgotten password link is: "+color);
}
}
