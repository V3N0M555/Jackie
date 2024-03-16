package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	Select s=new Select(month);
	s.selectByValue("10");Thread.sleep(2000);
	WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	Select s1=new Select(year);
	s1.selectByVisibleText("1988");Thread.sleep(2000);
	driver.findElement(By.linkText("5")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9876543210");
	driver.findElement(By.id("renew_policy_submit")).click();Thread.sleep(2000);
	boolean res = driver.findElement(By.id("policynumberError")).isDisplayed();
	if(res==true) {
		System.out.println("Error message is dispalyed");
	}else {
		System.out.println("Error message is not dispalyed");
	}
}
}
