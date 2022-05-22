package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_speciality {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String SpecialityName;
  String searchSpecialityName;

 @FindBy(xpath="//mat-select[@name='active']")
   WebElement Active_Diactive;

   @FindBy(xpath="//button[@type='submit']")
   WebElement SearchButtom;

   @FindBy(xpath="//input[@name='title']")
   WebElement SearchName;
   
   @FindBy(xpath="//input[@name='code']")
   WebElement SearchCode;
   
   @FindBy(xpath="//button[@mattooltip='ذخیره']")
   WebElement Save;
   
   @FindBy(xpath="//button[@type='button' and @mattooltip='بارگذاری مجدد']")
   WebElement Refresh;

   @FindBy(xpath="//tbody/tr[1]/td[5]/descendant::input")
   WebElement checkbox;
  
   @FindBy(xpath="//tbody/tr[1]/td[4]")
   WebElement FirstCodetd;
   
   @FindBy(xpath="//tbody/tr[6]/td[2]")
   WebElement NameSpeciality6th;
   
   @FindBy(xpath="//tbody/tr[2]/td[2]")
   WebElement NameSpeciality2th;
   
   @FindBy(xpath="//tbody/tr[1]/td[2]")
   WebElement FirstNametd;




   
   
//اضافه کردن تخصص
   public void AddSpeciality( WebDriver driver ,String specialitiyCode ,String specialitiyCode2 ,String specialitiyCode3 ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   
//نمایش لیست غیر فعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.UP)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);
//انتخاب و ذخیره تخصص اول
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(500);
       action
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن تخصص
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode)
	   .click(SearchButtom)
	   .perform();
	   Boolean staleElement = true;
	   while(staleElement){

		   try{

			   AddedCode=FirstCodetd.getText();

		      staleElement = false;


		   } catch(StaleElementReferenceException FirstCodetd){

		     staleElement = true;

		   }

		 }

	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, specialitiyCode);
	   action.click(Refresh).perform();
	 //نمایش لیست غیر فعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.UP)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);

//انتخاب و ذخیره تخصص دوم
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode2)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(500);
       action
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن تخصص دوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode2)
	   .click(SearchButtom)
	   .perform();
	   Boolean staleElement2 = true;
	   while(staleElement2){

		   try{

			   AddedCode=FirstCodetd.getText();

		      staleElement2 = false;


		   } catch(StaleElementReferenceException FirstCodetd){

		     staleElement2 = true;

		   }

		 }

	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, specialitiyCode2);
	   action.click(Refresh).perform();

	 //نمایش لیست غیر فعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.UP)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);

 //انتخاب و ذخیره تخصص سوم
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode3)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(500);
       action
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن تخصص سوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode3)
	   .click(SearchButtom)
	   .perform();
	   Boolean staleElement3 = true;
	   while(staleElement3){

		   try{

			   AddedCode=FirstCodetd.getText();

		      staleElement3 = false;


		   } catch(StaleElementReferenceException FirstCodetd){

		     staleElement3 = true;

		   }

		 }

	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, specialitiyCode3); 
	   action.click(Refresh).perform();

	   
   }
 //سرچ نام تخصص
   public void SearchSpecialityName ( WebDriver driver ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	 //نمایش لیست غیر فعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.UP)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);
//سرچ مورد ششم لیست
	   SpecialityName=NameSpeciality6th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(SpecialityName)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);
	   searchSpecialityName=FirstNametd.getText();
	   Assert.assertEquals(SpecialityName, searchSpecialityName);
	   eh.highlightElement(driver,FirstNametd);

	   action.click(Refresh).perform();
	 //نمایش لیست غیر فعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.UP)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);
	 //سرچ مورد دوم لیست
	   SpecialityName=NameSpeciality2th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(SpecialityName)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);
	   searchSpecialityName=FirstNametd.getText();
	   Assert.assertEquals(SpecialityName, searchSpecialityName);
	   eh.highlightElement(driver,FirstNametd);

	   action.click(Refresh).perform();
   }   
   //غیر فعال کردن تخصص
   public void DeActiveSpeciality ( WebDriver driver ,String specialitiyCode ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   //سرچ تخصص مورد نظر
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);
	   //غیرفعال و ذخیره کردن
	   action
	   .click(checkbox)
	   .click(Save)
	   .click(Refresh)
	   .perform();
	 //نمایش لیست غیر فعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.UP)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);
	   //چک غیرفعال شدن تخصص
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);

	   WebElement FirstCodetd=driver.findElement(By.xpath("//tbody/tr[1]/td[4]")); 
	   AddedCode=FirstCodetd.getText();   
	   Assert.assertEquals(AddedCode, specialitiyCode);
	   eh.highlightElement(driver,FirstCodetd);

   }
 }
