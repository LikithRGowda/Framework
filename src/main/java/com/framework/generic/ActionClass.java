package com.framework.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends CommonMethods {

	Actions act = new Actions(gv.driver);
	//WebElement element;
	public void rightClick(WebElement element) {

		act.contextClick(element).build().perform();
	}

	public void drag(WebElement from, WebElement too) {
		// Actions act= new Actions(gv.driver);
		act.dragAndDrop(from, too).build().perform();
	}

	public void mouseOver(WebElement element) {
		// Actions act= new Actions(gv.driver);
		act.moveToElement(element).build().perform();
	}

	public void Hold(WebElement ele) {
//	Actions act= new Actions(gv.driver);
		act.clickAndHold(ele);
	}

}
