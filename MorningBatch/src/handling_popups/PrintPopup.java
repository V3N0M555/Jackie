package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(4000);
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	for(int i=0;i<4;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_1);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_MINUS);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_2);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
}
}
