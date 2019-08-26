package com.framework.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectListOfElement extends CommonMethods {
	
	public void dSelectAll(String object) {
		WebElement element = locate(object);
		Select sc =new Select(element);
		sc.deselectAll();
	}
	
	public void OptionByIndex (String object,int index) {
		WebElement element = locate(object);
		Select sc =new Select(element);
		sc.selectByIndex(index);
	}
	
	public void OptionByValue (String object,String value) {
		WebElement element = locate(object);
		Select sc =new Select(element);
		sc.selectByValue(value);
	}
	
	public void OptionByText (String object,String text) {
		WebElement element = locate(object);
		Select sc =new Select(element);
		sc.selectByVisibleText(text);
	}
	
	public void dSelectByIndex (String object,int index) {
		WebElement element = locate(object);
		Select sc =new Select(element);
		sc.deselectByIndex(index);
	}
	
	
}
