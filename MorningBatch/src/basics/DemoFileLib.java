package basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class DemoFileLib {
public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
	String url = f.readDataFromProperty("url");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	String un=f.readDataFromProperty("un");
	String pwd=f.readDataFromProperty("pwd");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	String data = f.readDataFromExcel("InvalidLogin",5,1);
	System.out.println(data);
	String data1 = f.readDataFromExcel("Sheet2",13,0);
	System.out.println(data1);
	String data2=f.readDataFromExcel("CreateCustomer", 1, 2);
	System.out.println(data2);
	f.writeDataIntoExcel("CreateCustomer", 1, 2,"Kohli");
	f.writeDataIntoExcel("Sheet2", 15,0, "Warner");
	f.writeDataIntoExcel("InvalidLogin", 1, 10, "Akaay");
}
}
