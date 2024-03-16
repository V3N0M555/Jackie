package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSrc {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
//getPageSource() is used to get the source code of the web page
	String pgSrc = driver.getPageSource();
	System.out.println(pgSrc);
	driver.quit();
}
}
