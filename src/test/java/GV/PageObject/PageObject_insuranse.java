package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_insuranse {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 

  String InsuranceName;
  String searchInsurance;

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
   
   @FindBy(xpath="//button[@type='button' and @mattooltip='انصراف']")
   WebElement Refresh;

   @FindBy(xpath="//tbody/tr[1]/td[5]/descendant::input")
   WebElement checkbox;
   
   @FindBy(xpath="//tbody/tr[1]/td[3]")
   WebElement FirstCodetd;
   
   @FindBy(xpath="//tbody//*[contains (@class , 'true background-lvl-0')][3]/td[2]/descendant::span[2]")
   WebElement NameInsuranse3th;
   
   @FindBy(xpath="//tbody//*[contains (@class , 'true background-lvl-0')][6]/td[2]/descendant::span[2]")
   WebElement NameInsuranse6th;

   
   @FindBy(xpath="//tbody//*[contains (@class , 'true background-lvl-0')][1]/td[2]/descendant::span[2]")
   WebElement FirstNametd;



   
//اضافه کردن بیمه
   public void AddInsurance( WebDriver driver ,String insuranceCode ,String insuranceCode2 ,String insuranceCode3 ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   
//نمایش لیست غیر فعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   Thread.sleep(1000);
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);
//انتخاب و ذخیره بیمه اول
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);
	   WebElement checkbox=driver.findElement(By.xpath("//tbody/tr[1]/td[5]/descendant::span[1]"));
	   action
	   .click(checkbox).perform();
	   Thread.sleep(2000);
	   action
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن بیمه
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);
	   WebElement FirstCodetd=driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));

	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, insuranceCode);
	   eh.highlightElement(driver,FirstCodetd);

	   action.click(Refresh).perform();
		 //نمایش لیست غیر فعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);

//انتخاب و ذخیره بیمه دوم
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode2)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);
	   WebElement checkbox2=driver.findElement(By.xpath("//tbody/tr[1]/td[5]/descendant::span[1]"));

	   action
	   .click(checkbox2).perform();
	   Thread.sleep(2000);
	   action
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن بیمه دوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode2)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);

	   WebElement FirstCodetd2=driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
	   String AddedCode2; 
	   AddedCode2=null;
	   Thread.sleep(1000);
	   AddedCode2=FirstCodetd2.getText();
	   Assert.assertEquals(AddedCode2, insuranceCode2);
	   eh.highlightElement(driver,FirstCodetd2);

	   action.click(Refresh).perform();
		 //نمایش لیست غیر فعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);

 //انتخاب و ذخیره بیمه سوم
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode3)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);
	   WebElement checkbox3=driver.findElement(By.xpath("//tbody/tr[1]/td[5]/descendant::span[1]"));

	   action
	   .click(checkbox3).perform();
	   Thread.sleep(2000);
	   action
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
	   Thread.sleep(2000);

//چک اضافه شدن بیمه سوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode3)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);

	   WebElement FirstCodetd3=driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));

	   String AddedCode3; 
	   AddedCode3=null;
	   Thread.sleep(1000);
	   AddedCode3=FirstCodetd3.getText();
	   Assert.assertEquals(AddedCode3, insuranceCode3);   
	   eh.highlightElement(driver,FirstCodetd3);

   }
 //سرچ نام بیمه
   public void SearchInsuranceName ( WebDriver driver ) throws InterruptedException {
	   ExpectedConditions.elementToBeClickable(Active_Diactive);

	   Actions action = new Actions(driver);
	 //نمایش لیست غیرفعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);
//سرچ مورد بیمه لیست
	   InsuranceName=NameInsuranse3th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(InsuranceName)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);
	   searchInsurance=FirstNametd.getText();
	   Assert.assertEquals(InsuranceName, searchInsurance);
	   eh.highlightElement(driver,FirstNametd);

	   action.click(Refresh).perform();
	 //نمایش لیست غیرفعال
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);
	 //سرچ مورد ششم لیست
	   InsuranceName=NameInsuranse6th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(InsuranceName)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);
	   searchInsurance=FirstNametd.getText();
	   Thread.sleep(1000);
	   Assert.assertEquals(InsuranceName, searchInsurance);
	   eh.highlightElement(driver,FirstNametd);
	   action.click(Refresh).perform();
   }   
   //غیر فعال کردن بیمه
   public void DeActiveInsurance ( WebDriver driver ,String insuranceCode ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   //سرچ بیمه مورد نظر
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);
	   //غیرفعال و ذخیره کردن
	   WebElement checkbox=driver.findElement(By.xpath("//tbody/tr[1]/td[5]/descendant::span[1]"));
	   action
	   .click(checkbox)
	   .click(Save).perform();
	   Thread.sleep(2000);
	   action
	   .click(Refresh)
	   .perform();
	   //نمایش لیست غیر فعال ها
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);
	   //چک غیرفعال شدن بیمه
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);
	   WebElement FirstCodetd=driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));

	   AddedCode=FirstCodetd.getText(); 
       Assert.assertEquals(AddedCode, insuranceCode);
	   eh.highlightElement(driver,FirstCodetd);

   }
 }
