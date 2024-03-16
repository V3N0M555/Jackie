package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMutlipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//getLastRowNum() is used to get the last row index containing data in a sheet (Starts from 0)
	int count=wb.getSheet("Sheet2").getLastRowNum();
	for(int i=0;i<=count;i++) {
		String data = wb.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
		System.out.println(data);	}
//getLastCellNum() is used to return number of cells containing data in a row (Starts from 1)
	int lastCell1 = wb.getSheet("Sheet2").getRow(1).getLastCellNum();
	for(int i=0;i<lastCell1;i++) {
		String data=wb.getSheet("Sheet2").getRow(0).getCell(i).getStringCellValue();
		System.out.println(data);	}
	int lastRow = wb.getSheet("Sheet2").getLastRowNum();
	for (int i = 0; i <= lastRow; i++) {// Outer for loop is used to iterate rows
		int lastCell = wb.getSheet("Sheet2").getRow(i).getLastCellNum();
		for (int j = 0; j < lastCell; j++) {// Inner for loop is used to iterate cells
			String data = wb.getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
			System.out.print(data + " ");	}
		System.out.println();		}
	}
}
