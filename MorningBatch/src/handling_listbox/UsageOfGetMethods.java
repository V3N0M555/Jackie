package handling_listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetMethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.get("file:///C:/Users/QSP/Desktop/HotelA.html");
//	WebElement slv = driver.findElement(By.id("slv"));
//	Select s=new Select(slv);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	WebElement ele = s.getFirstSelectedOption();
	System.out.println(ele.getText());
	List<WebElement> allEle = s.getAllSelectedOptions();
	for(int i=0;i<allEle.size();i++) {
		String text = allEle.get(i).getText();
		System.out.println(text);
	}
}
}
