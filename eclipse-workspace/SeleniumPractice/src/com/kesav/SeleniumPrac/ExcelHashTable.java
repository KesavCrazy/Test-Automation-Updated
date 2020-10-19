package com.kesav.SeleniumPrac;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHashTable {
	public static void main(String[] args) throws IOException {
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
		
		Enumeration name;
		String key;
		
		Hashtable<String, String>hashtable = new Hashtable<String, String>();
		
		hashtable.put("Key1",var);
		hashtable.put("Key2",var2);
		hashtable.put("key3",var3);
		hashtable.put("key4",var4);
		
		name = hashtable.keys();
		while(name.hasMoreElements()) {
			key = (String) name.nextElement();
			System.out.println("Key :" + key + "value :" + hashtable.get(key));
		}
	}
}

