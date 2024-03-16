package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckbox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
	Thread.sleep(2000);
	List<WebElement> allCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<allCheckbox.size();i++) {
		allCheckbox.get(i).click();
		Thread.sleep(500);
	}
	int count=0;
	for(int i=0;i<allCheckbox.size();i++) {
	if(	allCheckbox.get(i).isSelected()) {
		count++;
	}
	}
	if(count==allCheckbox.size()) {
		System.out.println("All the checkbox are selected");
	}else {
		System.out.println("All the checkbox are not selected");
	}
}
}
