package com.kesav.SeleniumPrac;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDemo {
public static void main (String[] args) throws IOException{
FileInputStream files = new FileInputStream("C:\\Users\\Admin\\Desktop\\ScreenShot\\Excel\\ExcelDemoFile.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(files);
XSSFSheet sheet = workbook.getSheetAt(0);
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);

System.out.println(sheet.getRow(0).getCell(0));
System.out.println(sheet.getRow(1).getCell(0));
System.out.println(sheet.getRow(0).getCell(1));
System.out.println(sheet.getRow(1).getCell(1));


}
}
