package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedPopupWithIterator {
	static void closeBro() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter browser needed to be closed: Apple Indeed Google");
		String closer = scan.next();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		
		String mainHandle = driver.getWindowHandle();
		driver.switchTo().window(mainHandle);
//		closeBro();
		Thread.sleep(3000);
		
		Set<String> allHand = driver.getWindowHandles();
		Iterator<String> i = allHand.iterator();
		
		while(i.hasNext()) {
			String wid = i.next();
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains(closer)) {
				driver.close();
			}
		}
		

		System.out.println("end");

	}

}
