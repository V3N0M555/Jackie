package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowserUsingIterator {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Type the title of the webpage");
	String title = s.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allWid = driver.getWindowHandles();
	Iterator<String> i = allWid.iterator();
	while(i.hasNext()) {
		String wid = i.next();
		driver.switchTo().window(wid);
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(title))
		driver.close();
	}
}
}
