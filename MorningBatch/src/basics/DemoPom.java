package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DemoPom {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		LoginPage d=new LoginPage();
		PageFactory.initElements(driver, d);
		d.login("admin1","manager1");
		Thread.sleep(5000);
		d.login("admin", "manager");
	}
}
