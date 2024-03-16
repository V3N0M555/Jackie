package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Converting the data into java understandable language(Stream of bytes)
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		// In order to interact with excel file we should make use of Workbook interface
		// method.
		// By creating an object using WorkbookFactory.create(fis) which will create the
		// object
		// of workbook interface type and load all data while creating object itself
		Workbook wb = WorkbookFactory.create(fis);
		// First after creating object we should get the sheet from workbook by
		// specifying
		// getSheet(String sheetName) and after fetching the sheet we need to get the row
		// by specifying
		// getRow(int index), after getting the row we need to fetch the specific cell
		// by using
		// getCell(int index), then we can retrieve the String data from cell using
		// getStringCellValue()
		String data = wb.getSheet("CreateCustomer").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
	}
}
