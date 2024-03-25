package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListEelBasedOnUserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.err.println("Enter hotel name");
//		String hotel = scan.nextLine();
		System.err.println("Enter Dish name");
		String dish = scan.nextLine();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20programs%20for%20Selenium/hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s= new Select(mtr);
		List<WebElement> allEle = s.getOptions();
		int count=0;
		
		for (WebElement x : allEle) {
			String text = x.getText();
			if(dish.equalsIgnoreCase(text)) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("present");
		}
		else
			System.out.println("not present");
		

	}

}
