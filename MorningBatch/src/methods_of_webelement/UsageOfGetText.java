package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.linkText("Create new account"));
//getTagName() is used to get the tag name of the particular element
	String tag = ele.getTagName();
	System.out.println("The tagname of create new account button is: "+tag);
//getText() is used to get the tag text of the particular element
//If tag text is not present it will return empty spaces
	String text = ele.getText();
	System.out.println("The tag text of create new account button is: "+text);
//getAttribute() is used to get the attribute value of a particular element. It is a parameterized
//method which takes string attName as parameter, bcoz one element will have multiple attributes
//If the attribute is not present it will return null
	String attValue = ele.getAttribute("href");
	System.out.println("The attValue of href in create button is: "+attValue);
}
}
