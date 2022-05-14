package GV.PageObject;

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
   
   @FindBy(xpath="//span[text()=' power_settings_new ']")
   WebElement Exit;


   public void CIS_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,CIS);
	   Thread.sleep(1000);
	   CIS.click();
	   Thread.sleep(10000);

	   
	   
   }

 public void GV_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,GV);
	   Thread.sleep(1000);
	   GV.click();
	   Thread.sleep(10000);

	   
	   
   }
 public void Exit ( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Exit);
	   Thread.sleep(1000);
	   Exit.click();
	   Thread.sleep(10000);

	   
	   
 }


 }
