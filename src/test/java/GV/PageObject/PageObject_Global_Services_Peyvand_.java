package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import cis.cispackage.element_Highlight;

public class PageObject_Global_Services_Peyvand_ {

	  element_Highlight eh= new element_Highlight();

	  @FindBy(xpath="(//input[@name='name'])[1]")
	   WebElement InputServiceName;
	   
	   	  @FindBy(xpath="(//input[@name='code'])[1]")
	   WebElement InputCode;


	 	  @FindBy(xpath="(//input[@name='surgeon'])[1]")
	   WebElement InputKJarahi;
	  
	  @FindBy(xpath="(//input[@name='anesthesia'])[1]")
	  WebElement InputKBihooshi;
	  
	  	  @FindBy(xpath="(//input[@name='degree1'])[1]")
	  WebElement Inputdegree1;
	  
	  	  	  @FindBy(xpath="(//input[@name='degree2'])[1]")
	  WebElement Inputdegree2;

	  	  @FindBy(xpath="(//input[@name='degree3'])[1]")
	  WebElement Inputdegree3;
	  
 	  	  @FindBy(xpath="(//input[@name='degree4'])[1]")
	   WebElement Inputdegree4;
 	  	  
 	  	  @FindBy(xpath="//input[@name='fromDate']")
	   WebElement FromDate;
 	  	  
 	  	  @FindBy(xpath="//button[@type='submit' and text()=' ذخیره ']")
	   WebElement Save;
 	  	  
 	  	  @FindBy(xpath="//button[@type='button' and @mattooltip='انصراف']")
	   WebElement Refresh;


	  
	  @FindBy(xpath="(//button[@type='button'])[2]")
	  WebElement OpenServicesPop;

// پاپ آپ کد خدمات مرتبط
	    @FindBy(xpath="//mat-select[@name='subgroup']")
	  WebElement SubGroupService;

	  	 @FindBy(xpath="//mat-select[@name='group']")
	  WebElement Group;

	  	 @FindBy(xpath="//mat-select[@name='lvl4']")
	  WebElement SubGroup;
	  
	  	 @FindBy(xpath="(//input[@name='name'])[3]")
	  WebElement InputServiceNamePop;

	    @FindBy(xpath="(//input[@name='code'])[3]")
	  WebElement InputServiceCodePop;
	  
	    @FindBy(xpath="(//button[@type='button' and @mattooltip='جستجو'])[2]")
	  WebElement SearchPop;

	  
	    @FindBy(xpath="(//button[@type='button' and @mattooltip='بارگذاری مجدد'])[2]")
	  WebElement RefreshPop;
	  
	    @FindBy(xpath="//button[@type='button' and text()=' ثبت ']")
	  WebElement SavePop;
	  
// گرید سرچ	  
		  @FindBy(xpath="(//input[@name='name'])[2]")
		   WebElement InputServiceNameSearch;
;

	  @FindBy(xpath="(//input[@name='code'])[2]")
       WebElement InputCodeSearch;
	  

	    @FindBy(xpath="//button[@type='submit' and @mattooltip='جستجو']")
	  WebElement SearchGrid;

	  	  @FindBy(xpath="(//button[@type='button' and @mattooltip='بارگذاری مجدد'])[1]")
	  WebElement RefreshSearchGrid;






	  
	  	   public void AddGlobalService ( WebDriver driver ,String globalName ,String globalCode,String kJarahi,String kBihooshi,String degree1,String degree2,String degree3,String degree4, String fromdate) throws InterruptedException {
		   Actions action = new Actions(driver);
		   
		   action
		   .click(InputServiceName)
		   .sendKeys(globalName)
		   .click(InputCode)
		   .sendKeys(globalCode)
		   .click(InputKJarahi)
		   .sendKeys(kJarahi)
		   .click(InputKBihooshi)
		   .sendKeys(kBihooshi)
		   .click(Inputdegree1)
		   .sendKeys(degree1)
		   .click(Inputdegree2)
		   .sendKeys(degree2)
		   .click(Inputdegree3)
		   .sendKeys(degree3)
		   .click(Inputdegree4)
		   .sendKeys(degree4)

		   .perform();
		   		   Thread.sleep(1000);
		   	//PopUp
		   		   
		   	action
		   	.click(OpenServicesPop).perform(); Thread.sleep(1000);
		   	//زیرگروه خدمت
		   	action
		   	.click(SubGroupService).perform(); Thread.sleep(1000);
		   	
		   	action
		   	.sendKeys(Keys.DOWN)
		   	.sendKeys(Keys.DOWN).perform();  Thread.sleep(1000);
		   	action
		   	.sendKeys(Keys.ENTER).perform(); Thread.sleep(1000);
		   	//گروه
		   	action
		   	.click(Group).perform(); Thread.sleep(1000);
		   	
  			action
		   	.sendKeys(Keys.DOWN)
		   	.sendKeys(Keys.DOWN)
		   	.sendKeys(Keys.DOWN).perform();  Thread.sleep(1000);
		   	action
		   	.sendKeys(Keys.ENTER).perform(); Thread.sleep(1000);
		   	//زیرگروه
		   	action
		   	.click(SubGroup).perform(); Thread.sleep(1000);
		   	
  			action
		   	.sendKeys(Keys.DOWN)
		   	.sendKeys(Keys.DOWN)
		   	.sendKeys(Keys.DOWN)
		   	.sendKeys(Keys.DOWN).perform();  Thread.sleep(1000);
		   	action
		   	.sendKeys(Keys.ENTER).perform(); Thread.sleep(1000);
		   	//جستجو
		   	action
		   	.click(SearchPop).perform();
	   		   Thread.sleep(10000);
	   		   
	   		 //انتخاب خدمت  
	   		   WebElement Checkbox1= driver.findElement(By.xpath("(//tbody)[2]/tr[1]/td[3]/descendant::input"));
	   		   action
	   		   .click(Checkbox1).perform(); Thread.sleep(1000);
	   		   action
	   		   .click(SavePop).perform(); Thread.sleep(1000);
	   		   
	   		   //تاریخ
	   		   action
	   		   .click(FromDate)
	   		   .sendKeys(fromdate)
	   		   .click(Save)
	   		   .perform(); Thread.sleep(6000);
	   		   
			   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
			   Thread.sleep(500);
			   String c=POPUP.getText();
		       Assert.assertTrue(c.contains("موفقیت"));
               eh.highlightElement(driver,POPUP); 

	   		 
		   
	  	   }
}
