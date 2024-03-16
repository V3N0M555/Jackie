package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//First we need to get the sheet where we need to enter the data, get the row and
//get the cell, then to set the value for a cell we use setCellValue(String value)
		wb.getSheet("CreateCustomer").getRow(1).getCell(5).setCellValue("Pass");
//In order to convert the data from java understandable to excel format we use FileoutputStream
		FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
//Actually writing data into excel happens here with the help of write(FileOutputStream fos)
		wb.write(fos);
	}
}
