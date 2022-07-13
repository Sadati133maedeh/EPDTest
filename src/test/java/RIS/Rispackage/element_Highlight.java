package cis.cispackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class element_Highlight {
	
 public void highlightElement(WebDriver driver,WebElement element) {  
  JavascriptExecutor js=(JavascriptExecutor) driver;
  js.executeScript("arguments[0].style.border='3px solid yellow'", element);
 }
 public void highlightElementA(WebDriver driver,WebElement element) {  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].style.border='3px solid red'", element);
	 }


 public void unhighlightLast(WebDriver driver,WebElement element) { 
  JavascriptExecutor js=(JavascriptExecutor) driver;
  js.executeScript("arguments[0].style.border='0px'", element);
 }
 public void unhighlightLastB(WebDriver driver,WebElement element) { 
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].style.border='2px solid #212529'", element);
	 }

 
}
		


