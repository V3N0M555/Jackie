package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		wait.until(ExpectedConditions.alertIsPresent());	//Explicit condition for alert popup
		Alert a = driver.switchTo().alert();				//Alert Popup
		String alertText = a.getText();	
		a.accept();		
		System.out.println(alertText);
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();				//Confirmation Popup
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert a1 = driver.switchTo().alert();				//Prompt Popup
		a1.sendKeys("Modi ji");
		a1.accept();
		System.out.println(driver.findElement(By.id("demo1")).getText());
	}
}









