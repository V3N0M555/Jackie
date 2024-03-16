package handling_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement day = driver.findElement(By.id("day"));
	WebElement month = driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
//In order to handle 3 dropdowns we need to create object of Select class for 3 time
	Select s1=new Select(day);
	Select s2=new Select(month);
	Select s3=new Select(year);
	Thread.sleep(2000);
	s1.selectByIndex(14);
	Thread.sleep(2000);
	s2.selectByValue("8");
	Thread.sleep(2000);
	s3.selectByVisibleText("1947");
}
}
