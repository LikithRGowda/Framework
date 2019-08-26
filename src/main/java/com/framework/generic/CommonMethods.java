package com.framework.generic;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.framework.base.BaseClass;

public class CommonMethods extends BaseClass {

	public WebElement locate(String object) {

		By by = null;
		String s = gv.object.getProperty(object);
		String[] locator = s.split("-");
		if (locator[0].equals("id")) {
			by = By.id(locator[1]);
		} else if (locator[0].equals("name")) {
			by = By.name(locator[1]);
		} else if (locator[0].equals("className")) {
			by = By.className(locator[1]);
		} else if (locator[0].equals("tagName")) {
			by = By.tagName(locator[1]);
		} else if (locator[0].equals("linkText")) {
			by = By.linkText(locator[1]);
		} else if (locator[0].equals("partialLinkText")) {
			by = By.partialLinkText(locator[1]);
		} else if (locator[0].equals("partialLinkText")) {
			by = By.partialLinkText(locator[1]);
		} else if (locator[0].equals("cssSelector")) {
			by = By.cssSelector(locator[1]);
		} else if (locator[0].equals("xpath")) {
			by = By.xpath(locator[1]);
		}

		WebElement element = gv.driver.findElement(by);
		return element;

	}
	
	public List<WebElement> locate1(String object) {

		By by = null;
		String[] locator = object.split("-");
		if (locator[0].equals("id")) {
			by = By.id(locator[1]);
		} else if (locator[0].equals("name")) {
			by = By.name(locator[1]);
		} else if (locator[0].equals("className")) {
			by = By.className(locator[1]);
		} else if (locator[0].equals("tagName")) {
			by = By.tagName(locator[1]);
		} else if (locator[0].equals("linkText")) {
			by = By.linkText(locator[1]);
		} else if (locator[0].equals("partialLinkText")) {
			by = By.partialLinkText(locator[1]);
		} else if (locator[0].equals("partialLinkText")) {
			by = By.partialLinkText(locator[1]);
		} else if (locator[0].equals("cssSelector")) {
			by = By.cssSelector(locator[1]);
		} else if (locator[0].equals("xpath")) {
			by = By.xpath(locator[1]);
		}

		List<WebElement> element = gv.driver.findElements(by);
		return element;

	}


	public void sendData(String object, String data) {
		locate(object).sendKeys(data);
	}

	public void clear(String object) {
		locate(object).clear();
	}

	public void click(String object) {
		locate(object).click();
	}
	public String text(String object) {
		return locate(object).getText();
	}
	public boolean Display(String object) {
		return locate(object).isDisplayed();
	}
	
	
}
