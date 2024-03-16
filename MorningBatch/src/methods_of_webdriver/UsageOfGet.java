package methods_of_webdriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsageOfGet {
public static void main(String[] args) {
	  FirefoxDriver driver = new FirefoxDriver();
	 //get() is used to trigger the url of an application
	 driver.get("https://google.com");
	 //getTitle() is used to get the title of current web page
	 String title = driver.getTitle();
	 System.out.println(title);
	//getCurrentUrl() is used to get the url of current web page
//The url we trigger can be different from the url present on the web page
//to verify that we make use of getCurrentUrl()
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 //close() is used to close the current browser
	 driver.close();
}
}
