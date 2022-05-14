package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_education {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String EducationName;
  String searchEducationName;



   @FindBy(xpath="//button[@type='submit']")
   WebElement SearchButtom;

   @FindBy(xpath="//input[@name='title']")
   WebElement SearchName;
   
   @FindBy(xpath="//input[@name='code']")
   WebElement SearchCode;
      
   @FindBy(xpath="//button[@type='button' and @mattooltip='بارگذاری مجدد']")
   WebElement Refresh;
   
   @FindBy(xpath="//tbody/tr[1]/td[2]")
   WebElement FirstCodetd;
   
   @FindBy(xpath="//tbody/tr[6]/td[1]")
   WebElement NameEducation6th;
   
   @FindBy(xpath="//tbody/tr[2]/td[1]")
   WebElement NameEducation2th;

   
   @FindBy(xpath="//tbody/tr[1]/td[1]")
   WebElement FirstNametd;

   
 //سرچ نام تحصیلات
   public void SearchEducationName ( WebDriver driver ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
//سرچ مورد ششم لیست
	   EducationName=NameEducation6th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(EducationName)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);
	   searchEducationName=FirstNametd.getText();
	   Assert.assertEquals(EducationName, searchEducationName);
	   action.click(Refresh).perform();
	 //سرچ مورد دوم لیست
	   EducationName=NameEducation2th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(EducationName)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);
	   searchEducationName=FirstNametd.getText();
	   Assert.assertEquals(EducationName, searchEducationName);
	   action.click(Refresh).perform();
   }   
 }
