package org.framework.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import com.framework.generic.CommonMethods;

public class Excel extends CommonMethods {

	public static String readDataFromExcel(String sheetname, String path, int row, int col) {
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			Sheet sh = wb.getSheet(sheetname);
			System.out.println("hi");
			System.out.println(sh.getRow(row).getCell(col).getStringCellValue());
			return sh.getRow(row).getCell(col).getStringCellValue();
		} catch (FileNotFoundException e) {

		} catch (Exception e) {

		}

		return null;
	}

}
