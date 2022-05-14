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


public class PageObject_license {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String AddedCode2; 
  String AddedCode3; 
  String licenseName;
  String searchlicense;

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
   
   @FindBy(xpath="//tbody/tr[1]/td[2]")
   WebElement Namelicense1th;
   
   @FindBy(xpath="//tbody/tr[3]/td[2]")
   WebElement Namelicense3th;

   
   @FindBy(xpath="//tbody/tr[1]/td[2]")
   WebElement FirstNametd;


   
   
 //اضافه کردن مچوز
   public void Addlicense( WebDriver driver , String licenseCode ,String licenseCode2 ,String licenseCode3 ) throws InterruptedException {
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


//انتخاب و ذخیره مجوز اول
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(500);
	   action
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن مجوز
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, licenseCode);
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

//انتخاب و ذخیره مجوز دوم
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode2)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(500);
	   action
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن مجوز دوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode2)
	   .click(SearchButtom)
	   .perform();
	   System.out.println(AddedCode);
	   Boolean staleElement = true;
	   while(staleElement){

		   try{

			   AddedCode2=FirstCodetd.getText();

		      staleElement = false;


		   } catch(StaleElementReferenceException FirstCodetd){

		     staleElement = true;

		   }

		 }

	   AddedCode2=FirstCodetd.getText();
	   System.out.println(AddedCode2);
	   Thread.sleep(500);
	   Assert.assertEquals(AddedCode2, licenseCode2);
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

 //انتخاب و ذخیره مجوز سوم
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode3)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(500);
	   action
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن مجوز سوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode3)
	   .click(SearchButtom)
	   .perform();
	   Boolean staleElement1 = true;
	   while(staleElement1){

		   try{

			   AddedCode2=FirstCodetd.getText();

		      staleElement1 = false;


		   } catch(StaleElementReferenceException FirstCodetd){

		     staleElement1 = true;

		   }

		 }


	   AddedCode3=FirstCodetd.getText();
	   Thread.sleep(500);
	   Assert.assertEquals(AddedCode3, licenseCode3);   
	   
   }



//نمایش لیست غیر فعال
   public void showDeActiveslicense( WebDriver driver ) throws InterruptedException {
	   Actions action = new Actions(driver);
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

   }
   
 //سرچ نام مجوز
   public void SearchLicenseName ( WebDriver driver ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	 //نمایش لیست غیرفعال
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

	   
//سرچ مورد یکم لیست
	   licenseName=Namelicense1th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(licenseName)
	   .click(SearchButtom)
	   .perform();
	   searchlicense=FirstNametd.getText();
	   Assert.assertEquals(licenseName, searchlicense);
	   action.click(Refresh).perform();
	 //نمایش لیست غیرفعال
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
	 //سرچ مورد سوم لیست
	   licenseName=Namelicense3th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(licenseName)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);
	   searchlicense=FirstNametd.getText();
	   Thread.sleep(1000);
	   Assert.assertEquals(licenseName, searchlicense);
	   action.click(Refresh).perform();
      }   
   //غیر فعال کردن مجوز
   public void DeActiveLicense ( WebDriver driver ,String licenseCode ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   //سرچ مجوز مورد نظر
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);
	   //غیرفعال و ذخیره کردن
	   action
	   .click(checkbox)
	   .click(Save)
	   .click(Refresh)
	   .perform();
	   //نمایش لیست غیر فعال ها
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
	   .sendKeys(licenseCode)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();   
   }

 }
