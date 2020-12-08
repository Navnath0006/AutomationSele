package ExcelShhet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_Cell_count_in_row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Excel_Sheet_Practice.xlsx");

		int cellCount = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println("total no of cells in row no: 0 is : " + cellCount);

	}
}
