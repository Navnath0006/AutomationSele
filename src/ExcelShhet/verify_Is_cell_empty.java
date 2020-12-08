package ExcelShhet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verify_Is_cell_empty {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Excel_Sheet_Practice.xlsx");

		Cell cellvalue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(0);

		if (cellvalue.getCellType() == CellType.) {
			System.out.println("cell is empty");
		} else {
			System.out.println("cell not empty");
		}

	}
}
