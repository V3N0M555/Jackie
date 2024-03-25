package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareIsurance {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
		Select s1 = new Select(month);
		s1.selectByValue("11");
		WebElement yr = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		Select s2 = new Select(yr);
		s2.selectByVisibleText("1998");
		driver.findElement(By.linkText("5")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("741859635");
		driver.findElement(By.id("renew_policy_submit") ).click();
		boolean res = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(res)
			System.out.println("error");
		else
			System.out.println("no err");
		
		
		
	}
}
