package handling_disabled_elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUsingJSE {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		System.out.println(jse.executeScript("return document.title"));	
		System.out.println(jse.executeScript("return document.URL"));
	}
}
