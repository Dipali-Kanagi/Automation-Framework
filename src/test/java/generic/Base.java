package generic;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import junit.framework.Assert;

public class Base {
	
	public String getAndConcatPath(String path) {
		String currentPath =null;
		currentPath= System.getProperty("user.dir");
		return currentPath + path;
	}
  
	public void writeexcel() throws Exception {
		File file = new File("D:\\Apps\\eclipse-java-2018-09-win32-x86_64\\projects\\NewExcel.xlsx");
		System.out.println(file);
			Workbook work = new XSSFWorkbook();
			Sheet sheet = work.createSheet("FirstSheet");
			Row row = sheet.createRow(4);
			Cell cell = row.createCell(4);
			cell.setCellValue("Dipali");
			FileOutputStream writetofile = new FileOutputStream(file);
			work.write(writetofile);
			work.close();
	}
	public void compareValues(Object actualValue, Object expectedValue) {
		Assert.assertEquals(expectedValue, actualValue);
		Assert.assertEquals(actualValue+ "doesnt match with"+ expectedValue, expectedValue, actualValue);
	}
}
