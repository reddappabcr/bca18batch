package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary1 {

	

	public String GetExcelData(String sheetname,int rownumber, int cellnumber)
	{
		String retval=null;
			
			try {
				
				FileInputStream fis = new FileInputStream("D:\\BCA\\data.xlsx");
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet(sheetname);	
				Row r=sh.getRow(rownumber);	
				Cell c=r.getCell(cellnumber);
				 retval=c.getStringCellValue();
				
				
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return 	retval;
}
	
	public int getLastRowNumber(String sheetname)
	{
		int retval=0;
		try {
			FileInputStream fis = new FileInputStream("D:\\BCA\\data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetname);	
			retval= sh.getLastRowNum();
			
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return retval;
	}
	
	
}
