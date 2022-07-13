package cis.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cis.cispackage.element_Highlight;

public class PageObject_ListPatient {
	
	element_Highlight eh= new element_Highlight();

     WebDriver driver;

 @FindBy(name="Name")
	   WebElement Name;

 @FindBy(name="FamilyName")
	   WebElement FamilyName;

 @FindBy(name="NationalCode")
	   WebElement SEARCHMELICOD;

 @FindBy(name="ElectronicNumber")
	   WebElement SEARCHElectronicNumber;


 @FindBy(xpath="//img[@alt='more']")
	  WebElement More;

 @FindBy(xpath="//label[@for='insuranceType']/following::input[1]")
	   WebElement SEARCHbime;

 @FindBy(name="InsuranceName")
	   WebElement SEARCHbimecode;

 @FindBy(name="oldId")
	   WebElement SEARCHoldId;

 @FindBy(xpath="//label[@for='Nationality']/following::input[1]")
	   WebElement SEARCHmeliat;

 @FindBy(xpath="//div[@title='جستجو']")
	   WebElement SEARCHbutton;

 @FindBy(xpath="//div[@title='بارگذاری مجدد']")
	   WebElement RefreshButton;





	   
	   public void Search_Patient_melicode (WebDriver driver, String elment) throws Throwable {
		   

		      eh.highlightElement(driver, SEARCHMELICOD);
		      Thread.sleep(500);
		      SEARCHMELICOD.click();
		      SEARCHMELICOD.sendKeys(elment);
		      SEARCHMELICOD.sendKeys(Keys.ENTER);
		      Thread.sleep(3000);
                      eh.unhighlightLast(driver, SEARCHMELICOD);
                      
	   }
	   public void Search_Patient_Passport (WebDriver driver, String meli, String pass) throws Throwable {
		   
			 Actions action = new Actions(driver);

		      eh.highlightElement(driver, More);
		      Thread.sleep(500);
		      action
		      .click(More).perform();
		      WebElement meliat=driver.findElement(By.xpath("//label[@for='Nationality']/following::input[1]"));
		      action
		      .click(meliat)
		      .sendKeys(meliat,meli).perform();
		      WebElement passport=driver.findElement(By.name("PassportNumber"));
		      action
		      .click(passport)
		      .sendKeys(passport,pass)
		      .sendKeys(Keys.ENTER)
		      .perform();
		      Thread.sleep(3000);
	   }

           public void Search_Patient_ElectronicNumber (WebDriver driver, String elment) throws Throwable {
		   

		      eh.highlightElement(driver, SEARCHElectronicNumber);
		      Thread.sleep(500);
		      SEARCHElectronicNumber.click();
		      SEARCHElectronicNumber.sendKeys(elment);
		      SEARCHElectronicNumber.sendKeys(Keys.ENTER);
		      Thread.sleep(3000);
	   }

	   
	  
	   
}
