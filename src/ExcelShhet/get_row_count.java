package ExcelShhet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_row_count {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Excel_Sheet_Practice.xlsx");

		int lastRowIndex = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();

		System.out.println(lastRowIndex);

		System.out.println("total no of rows in sheet: " + (lastRowIndex + 1));

	}
}
