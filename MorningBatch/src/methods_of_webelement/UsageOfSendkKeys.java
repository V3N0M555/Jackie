package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendkKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
//sendKeys() is used to send the values to the text box and also perform key board actions
	driver.findElement(By.id("email")).sendKeys("Ram@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("pass")).sendKeys("Sita@123"+Keys.ENTER);
}
}
