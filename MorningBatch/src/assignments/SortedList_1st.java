package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedList_1st {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20programs%20for%20Selenium/hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s= new Select(mtr);
		List<WebElement> allEle = s.getOptions();
		List<String> ls = new ArrayList<>();
		
		for (WebElement x : allEle) {
			ls.add(x.getText());
		}
		Collections.sort(ls);
		for (String x : ls) {
			System.out.println(x);
		}
		

	}

}
