package cis.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cis.cispackage.element_Highlight;

public class PageObject_Landing {

  element_Highlight eh= new element_Highlight();

   @FindBy(xpath="//span[text()='مدیریت منابع انسانی']")
   WebElement HR;

   @FindBy(xpath="//span[text()='متغیرهای سیستم']")
   WebElement GV;

   @FindBy(xpath="//span[text()='CIS']")
   WebElement CIS;

   public void CIS_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,CIS);
	   Thread.sleep(1000);
	   CIS.click();
	   Thread.sleep(10000);

	   
	   
   }
	   
 }
