package basics;

import org.testng.annotations.DataProvider;

public class UsageOfDataProvider {
	@DataProvider
	public Object[][] getData() {
//		Object[][]data=new Object[3][2];		data[0][0]="admin";
		Object[][]data= {{"admin","manager"},{"admin1","manager1"},{"admin2","manager2"}};
		return data;
	}
	
}