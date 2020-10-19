package com.kesav.SeleniumPrac;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDemoHashSet {
public static void main(String[]args) throws IOException{
FileInputStream files = new FileInputStream("C:\\Users\\Admin\\Desktop\\ScreenShot\\Excel\\ExcelDemoFile.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(files);
XSSFSheet sheet = workbook.getSheetAt(0);
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);

String var = String.valueOf(sheet.getRow(0).getCell(0));
//System.out.println(var);
String var2 = String.valueOf(sheet.getRow(1).getCell(0));
//System.out.println(var2);
String var3 = String.valueOf(sheet.getRow(2).getCell(0));
//System.out.println(var3);
String var4 = String.valueOf(sheet.getRow(3).getCell(0));
//System.out.println(var4);

//System.out.println(sheet.getRow(3).getCell(0));
//System.out.println(sheet.getRow(4).getCell(0));
//System.out.println(sheet.getRow(0).getCell(1));
//System.out.println(sheet.getRow(0).getCell(1));
//System.out.println(sheet.getRow(1).getCell(1));
//System.out.println(sheet.getRow(2).getCell(1));
//System.out.println(sheet.getRow(3).getCell(1));
//System.out.println(sheet.getRow(4).getCell(1));
Set<String> ex = new HashSet<String>();
ex.add(var);
ex.add(var2);
ex.add(var3);
ex.add(var4);
System.out.println(ex);


}
}
