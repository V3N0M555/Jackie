package assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSortedElementAndNoDuplicateAndFindDuplicates_3rd4th {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20programs%20for%20Selenium/hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s= new Select(mtr);
		List<WebElement> allEle = s.getOptions();
		
		TreeSet<String> ts= new TreeSet<>();
		boolean res;
		
		System.out.println("-----------------------------");
		for (String x : ts) 
			System.out.println(x);
		
		for(int i=0;i<allEle.size();i++) {
			String text = allEle.get(i).getText();
		res = ts.add(text);
		if(!res) 
			System.out.println(text);
		}
		
		
		
	}

}
