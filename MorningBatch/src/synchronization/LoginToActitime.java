package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitime {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//It will work for all the findElement() and findElements() in the script
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://online.actitime.com/ibm/login.do");
	driver.findElement(By.id("username")).sendKeys("mpchethan999@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("chethan12345");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.findElement(By.id("logoutLink")).click();
}
}
