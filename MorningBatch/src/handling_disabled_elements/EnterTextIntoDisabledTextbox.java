package handling_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextIntoDisabledTextbox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/disabled.html");
	driver.findElement(By.id("t1")).sendKeys("Virat");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('t2').value='sachin'");
}
}
