package com.vanran.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {

	public void highlightElement(WebDriver driver, WebElement element) {
					    JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

}
