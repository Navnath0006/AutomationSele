package ExcelShhet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verify_Type_Of_Cell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Excel_Sheet_Practice.xlsx");

		Cell cellvalue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(0);

		if (cellvalue.getCellType() == CellType.STRING)
		{
			System.out.println(cellvalue.getStringCellValue());
		} 
		else if (cellvalue.getCellType() == CellType.NUMERIC)
		{
			System.out.println(cellvalue.getNumericCellValue());
		}
		else if (cellvalue.getCellType() == CellType.BOOLEAN)
		{
			System.out.println(cellvalue.getBooleanCellValue());
		}
		

	}
}
