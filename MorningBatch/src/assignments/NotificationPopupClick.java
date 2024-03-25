package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopupClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.yatra.com/");
		Thread.sleep(10000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);	
		r.keyPress(KeyEvent.VK_TAB);	Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);	Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		

	}

}
