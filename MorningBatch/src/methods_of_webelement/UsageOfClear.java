package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClear {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	Thread.sleep(2000);
WebElement ele = driver.findElement(By.id("username"));
//clear() is used to clear the value present in the textbox
ele.clear();
Thread.sleep(2000);
driver.findElement(By.id("password")).clear();
}
}
