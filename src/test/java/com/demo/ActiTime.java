package com.demo;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.framework.util.Excel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.framework.util.MyListeners.class)
public class ActiTime extends Excel {
	@Test
	public void actiTimeTc1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		sendData("username", Excel.readDataFromExcel("Sheet2",gv.directory + "\\src\\main\\resources\\ExcelData\\ActiTime.xlsx", 0, 0));
	}
}
