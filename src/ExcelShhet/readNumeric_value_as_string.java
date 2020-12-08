package ExcelShhet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readNumeric_value_as_string {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Excel_Sheet_Practice.xlsx");

		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();

		System.out.println(value);

	}
}
