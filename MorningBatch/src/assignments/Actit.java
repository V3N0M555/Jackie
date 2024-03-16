package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actit {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/ibm/login.do");
	driver.findElement(By.id("username")).sendKeys("mpchethan999@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("chethan12345");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	System.out.println(driver.getTitle());
//	driver.findElement(By.id("logoutLink")).click();
}
}
