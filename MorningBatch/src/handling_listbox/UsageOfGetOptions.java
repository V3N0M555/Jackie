package handling_listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetOptions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP/Desktop/HotelA.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	List<WebElement> allEle = s.getOptions();
	for(int i=0;i<allEle.size();i++) {
		s.selectByIndex(i);				//Selecting in ascending order
		}
	for(int i=allEle.size()-1;i>=0;i--) {
		s.deselectByIndex(i);			//Deselecting in descending order
		}
	for(WebElement ele:allEle) {
		String text = ele.getText();	//Printing all the options in dropdown and 
		System.out.println(text);		//selecting all options using attribute and tag text
		String value = ele.getAttribute("value");
//		s.selectByVisibleText(text);
		s.selectByValue(value);
		}
	//getWrappedElement() is used to wrap all the elements into one element
	WebElement ele = s.getWrappedElement();
	System.out.println(ele.getText());
}
}







