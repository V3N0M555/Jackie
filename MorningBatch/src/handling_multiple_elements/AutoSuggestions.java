package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("java");
	Thread.sleep(2000);
	List<WebElement> allSuggs = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	int count = allSuggs.size();
	System.out.println(count);
	for(WebElement ele:allSuggs) {
		String text = ele.getText();
		System.out.println(text);
	}
	allSuggs.get(count-1).click();
}
}
