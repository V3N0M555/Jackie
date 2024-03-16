package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
//		String pwid = driver.getWindowHandle();
//		System.out.println("Parent Wid "+pwid);
		Set<String> allWid = driver.getWindowHandles();
		int count=allWid.size();
		System.out.println(count);
		for(String wid:allWid) {
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			driver.close();
		}
	}
}
