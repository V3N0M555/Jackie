package handling_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfIsMultiple {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.get("file:///C:/Users/QSP/Desktop/HotelA.html");
//	WebElement mtr = driver.findElement(By.id("mtr"));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
//isMultiple() is used to check whether dropdown is multi select or not
	boolean res = s.isMultiple();
	if(res==false) {
		System.out.println("The dropdown is single select");
	}else {
		System.out.println("The dropdown is multi select");
	}
	
}
}
