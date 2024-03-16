package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualTitle = driver.getTitle();
		String expectedTitle="Facebook";
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl="https://www.FACEBOOK.com/";
		if(actualTitle.contains(expectedTitle)&&actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Pass :Both the title and Url are same");
		}else {
			System.out.println("Fail :Both the title and Url are not same");
		}
		driver.close();
	}
}
