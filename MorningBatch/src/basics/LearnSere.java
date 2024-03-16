package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSere {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/static%20webpages/Demo.html");
	//@01 will be stored in the ele reference variable
	WebElement ele = driver.findElement(By.id("d1"));
	//The address of the element will get changed to @02
	driver.navigate().refresh();//This will refresh the webpage and changes the address
	ele.click();
//	driver.navigate().back();	//Once navigating to another webpage address will get changed
//	ele.click();
}
}
