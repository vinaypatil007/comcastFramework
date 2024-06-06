package learntestng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyFile {
	public void propertyfile() throws IOException {
		FileInputStream fis=new FileInputStream("");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty("browser");
		
		FileInputStream fis1=new FileInputStream("");
		Workbook workbook=WorkbookFactory.create(fis1);
		Sheet sheet=workbook.getSheet("");
		Row row=sheet.getRow(0);
		
		
	}
}
