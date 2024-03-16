package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		//	driver.get("file:///C:/Users/QSP/Desktop/DemoA.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		//	WebElement ele = allLinks.get(0);
		//	String text = ele.getText();
		//	System.out.println(text);
		for(int i=0;i<count;i++) {
			WebElement ele = allLinks.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		driver.quit();	
	}
}