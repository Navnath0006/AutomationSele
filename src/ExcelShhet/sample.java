package ExcelShhet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Excel_Sheet_Practice.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");

		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			Cell cellValue = sh.getRow(i).getCell(0);
			if (cellValue.getCellType() == CellType.STRING) {
				System.out.print(cellValue.getStringCellValue() + " ");
			} else if (cellValue.getCellType() == CellType.NUMERIC) {
				System.out.print(cellValue.getNumericCellValue() + " ");
			} else if (cellValue.getCellType() == CellType.BOOLEAN) {
				System.out.print(cellValue.getBooleanCellValue() + " ");
			}
			System.out.println();
		}
	}
}
