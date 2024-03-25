package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeHomeURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://online.actitime.com/qsp4/login.do");
		driver.findElement(By.id("username")).sendKeys("sam.the.undertaker@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("sam123"+Keys.ENTER);
		Thread.sleep(5000);
		String uRL = driver.getCurrentUrl();
		System.out.println(uRL);
		driver.quit();
	}

}
