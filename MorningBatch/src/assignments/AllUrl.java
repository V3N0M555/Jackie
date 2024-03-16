package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllUrl {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("qspiders"+Keys.ENTER);
	Thread.sleep(2000);
	List<WebElement> url = driver.findElements(By.tagName("a"));
	int count = url.size();
	System.out.println(count);
	for (WebElement ele : url) {
		System.out.println(ele.getAttribute("href")); 
	}
}
}
