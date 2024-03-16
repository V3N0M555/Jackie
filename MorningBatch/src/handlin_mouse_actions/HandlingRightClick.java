package handlin_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClick {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/ibm/login.do");
	Actions a=new Actions(driver);
	WebElement ele = driver.findElement(By.linkText("actiTIME Inc."));
	Thread.sleep(2000);
	a.contextClick(ele).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);
}
}
