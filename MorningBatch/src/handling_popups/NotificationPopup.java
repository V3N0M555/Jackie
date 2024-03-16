package handling_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito","--disable-notifications","--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.yatra.com");
	}
}
