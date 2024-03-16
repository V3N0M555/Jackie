package handling_popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP/Desktop/Naukri.html");
	File f=new File("./data/Resume.docx");
	String absPath = f.getAbsolutePath();
	driver.findElement(By.id("upload")).sendKeys(absPath);
	}
}
