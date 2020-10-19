package Cucumber.Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import com.google.common.io.Files;

public class ExcelSheet {

	 public static HashMap<String, String> getData() throws IOException {
			 FileInputStream files = new FileInputStream("C:\\Users\\Admin\\Desktop\\ScreenShot\\Excel\\book1.xlsx");
			 XSSFWorkbook workbook = new XSSFWorkbook(files);
			 XSSFSheet sheet = workbook.getSheetAt(0);
			 Row row = sheet.getRow(0);
			 Cell cell = row.getCell(0);
			 
			 String var = String.valueOf(sheet.getRow(0).getCell(0));
			 String var1 = String.valueOf(sheet.getRow(1).getCell(0).getNumericCellValue());
			 String var2 = String.valueOf(sheet.getRow(2).getCell(0));
			 String var3 = String.valueOf(sheet.getRow(3).getCell(0));
			 
			 HashMap<String, String> userInfo = new HashMap<String, String>();
			 userInfo.put("1",var);
			 userInfo.put("2",var1);
			 userInfo.put("3",var2);
			 userInfo.put("4",var3);
			 return userInfo;
	 }


}
