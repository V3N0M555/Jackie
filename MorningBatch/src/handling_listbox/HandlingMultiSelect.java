package handling_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/HotelA.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	s.selectByIndex(0);Thread.sleep(1000);
	s.selectByValue("d");Thread.sleep(1000);
	s.selectByVisibleText("Ricebath");Thread.sleep(1000);
//We can use deselect methods for multi select dropdowns, we cannot use it for single select,
//it will throw UnsupportedOperationException
	s.deselectByVisibleText("Idly");Thread.sleep(1000);
	s.deselectByIndex(1);Thread.sleep(1000);
	s.deselectByValue("r");
	s.deselectAll();
}
}
