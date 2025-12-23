package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
			FileInputStream fis=new FileInputStream("C:\\Users\\asus\\Documents\\instagram.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Module 1");
			Row row = sh.getRow(0);
			Cell cell = row.getCell(1);
			String URL = cell.getStringCellValue();
			
			String username = sh.getRow(0).getCell(0).getStringCellValue();
			
			System.out.println(URL);
	}

}
