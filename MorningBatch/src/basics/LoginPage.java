package basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTbx;
	@FindBy(name="pwd")						//Declaration
	private WebElement pwdTbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;
	
	public void login(String un, String pwd) {
		unTbx.sendKeys(un); 							// Utilization
		pwdTbx.sendKeys(pwd);		//Lazy Initialization or lazy instantiation
		loginBtn.click();
	}
}
