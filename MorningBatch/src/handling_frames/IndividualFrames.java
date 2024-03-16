package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndividualFrames {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("email")).sendKeys("ABC@gmail.com");
	driver.findElement(By.id("password")).sendKeys("ABC123");
	driver.findElement(By.id("confirm-password")).sendKeys("ABC123");
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.findElement(By.id("username")).sendKeys("Admin");
	driver.findElement(By.id("password")).sendKeys("Admin123");
}
}
