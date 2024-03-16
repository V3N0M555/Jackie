package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
	public static void main(String[] args) throws IOException {
		//Converting the data into java understandable language(Stream of bytes)
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		//In order to retrieve data from property file we need to use NSM's of Properties class
		Properties p=new Properties();
		//We are loading the data from fis into empty property object
		p.load(fis);
		//In order to fetch the data from property object we use getProperty() which takes
		//String key as argument and returns String Value of the specified key
		String url = p.getProperty("url");
		String un = p.getProperty("un");
		String pwd = p.getProperty("pwd");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
}