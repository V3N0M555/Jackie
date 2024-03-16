package methods_of_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.fb.com");
		d.manage().window().setSize(new Dimension(360, 183));
		d.manage().window().setPosition(new Point(-10, -500));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().window().fullscreen();
		d.manage().window().minimize();
	}
}
