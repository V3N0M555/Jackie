package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {
	@Test 
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		String expectedTitle="Googly";
		String actualTitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		Assert.assertEquals(actualTitle, expectedTitle);
		s.assertEquals(actualTitle, expectedTitle );
		driver.quit();	
		s.assertAll();
	}
}
