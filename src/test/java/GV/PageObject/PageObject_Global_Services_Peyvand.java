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

public class PageObject_Global_Services_Peyvand {

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






	  
	  	   public void AddGlobalService ( WebDriver driver ,String globalName ,String globalCode,String kJarahi,String kBihooshi,String degree1,String degree2,String degree3,String degree4, String fromdate,String globalName2 ,String globalCode2 ,String kJarahi2 ,String kBihooshi2,String degree12 ,String degree22,String degree32,String degree42,String fromdate2) throws InterruptedException {
		   Actions action = new Actions(driver);
		   //خدمت اول
		   
		   ExpectedConditions.elementToBeClickable(InputServiceName);
		   
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
               
               Thread.sleep(1000);
               
    		   //خدمت دوم
    		   action
    		   .click(InputServiceName)
    		   .sendKeys(globalName2)
    		   .click(InputCode)
    		   .sendKeys(globalCode2)
    		   .click(InputKJarahi)
    		   .sendKeys(kJarahi2)
    		   .click(InputKBihooshi)
    		   .sendKeys(kBihooshi2)
    		   .click(Inputdegree1)
    		   .sendKeys(degree12)
    		   .click(Inputdegree2)
    		   .sendKeys(degree22)
    		   .click(Inputdegree3)
    		   .sendKeys(degree32)
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
    		   	.sendKeys(Keys.DOWN).perform();  Thread.sleep(1000);
    		   	action
    		   	.sendKeys(Keys.ENTER).perform(); Thread.sleep(1000);
    		   	//جستجو
    		   	action
    		   	.click(SearchPop).perform();
    	   		   Thread.sleep(10000);
    	   		   
    	   		 //انتخاب خدمت  
    	   		   WebElement Checkbox6= driver.findElement(By.xpath("(//tbody)[2]/tr[6]/td[3]/descendant::input"));
    	   		   action
    	   		   .click(Checkbox6).perform(); Thread.sleep(1000);
    	   		   action
    	   		   .click(SavePop).perform(); Thread.sleep(1000);
    	   		   
    	   		   //تاریخ
    	   		   action
    	   		   .click(FromDate)
    	   		   .sendKeys(fromdate2)
    	   		   .click(Save)
    	   		   .perform(); Thread.sleep(6000);
    	   		   
    			   WebElement POPUP2 =driver.findElement(By.xpath("//div[@role='alertdialog']"));
    			   Thread.sleep(500);
    			   String c2=POPUP2.getText();
    		       Assert.assertTrue(c2.contains("موفقیت"));
                   eh.highlightElement(driver,POPUP2); 

	  	   }
	  	   public void SearchGlobalServicePopup ( WebDriver driver) throws InterruptedException {
		   Actions action = new Actions(driver);
		   //سرچ نام خدمت
		   	action
		   	.click(OpenServicesPop).perform(); Thread.sleep(1000);
		   	//زیرگروه خدمت
		   	action
		   	.click(SubGroupService).perform(); Thread.sleep(1000);
		   	
		   	action
		   	.sendKeys(Keys.DOWN).perform();  Thread.sleep(1000);
		   	action
		   	.sendKeys(Keys.ENTER).perform(); Thread.sleep(1000);
		   	//جستجو
		   	action
		   	.click(SearchPop).perform();
	   		   Thread.sleep(10000);

			   WebElement Tr6Td1 =driver.findElement(By.xpath("(//tbody)[2]/tr[6]/td[1]"));
			   
			   String globalName=Tr6Td1.getText();
	   		   Thread.sleep(1000);

			  action
			  .click(RefreshPop).perform();     Thread.sleep(1000);
			  action
			  .click(InputServiceNamePop)
			  .sendKeys(globalName)
			  .click(SearchPop)
			  .perform();  Thread.sleep(1000);
 
			   WebElement Tr1Td1 =driver.findElement(By.xpath("(//tbody)[2]/tr[1]/td[1]"));
			   String globalsearch=Tr1Td1.getText();

		       Assert.assertEquals(globalsearch, globalName);
               eh.highlightElement(driver,Tr1Td1);
               
               //سرچ کد خدمت
 			  action
 			  .click(RefreshPop).perform();     Thread.sleep(1000);
   		   	//زیرگروه خدمت
   		   	action
   		   	.click(SubGroupService).perform(); Thread.sleep(1000);
   		   	
   		   	action
   		   	.sendKeys(Keys.DOWN).perform();  Thread.sleep(1000);
   		   	action
   		   	.sendKeys(Keys.ENTER).perform(); Thread.sleep(1000);
   		   	//جستجو
   		   	action
   		   	.click(SearchPop).perform();
   	   		   Thread.sleep(10000);

   			   WebElement Tr3Td2 =driver.findElement(By.xpath("(//tbody)[2]/tr[3]/td[2]"));
   			   
   			   String globalCode=Tr3Td2.getText();
   	   		   Thread.sleep(1000);

   			  action
   			  .click(RefreshPop).perform();     Thread.sleep(1000);
   			  action
   			  .click(InputServiceCodePop)
   			  .sendKeys(globalCode)
   			  .click(SearchPop)
   			  .perform();  Thread.sleep(1000);
    
   			   WebElement Tr1Td2 =driver.findElement(By.xpath("(//tbody)[2]/tr[1]/td[2]"));
   			   String globalsearch2=Tr1Td2.getText();

   		       Assert.assertEquals(globalsearch2, globalCode);
                  eh.highlightElement(driver,Tr1Td2);		  
	  	   }	 
	  	   public void SearchGlobalServiceAdded ( WebDriver driver) throws InterruptedException {
		   Actions action = new Actions(driver);
		   //سرچ نام خدمت اضافه شده
			   WebElement Tr1Td2 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[2]"));
			   String globalServiceAdded=Tr1Td2.getText();
			   action
			   .click(InputServiceNameSearch)
			   .sendKeys(globalServiceAdded)
			   .click(SearchGrid).perform();  Thread.sleep(1000);
			   
			   WebElement Tr1Td2_2 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[2]"));
			   String globalServiceSearch=Tr1Td2_2.getText();

   		       Assert.assertEquals(globalServiceSearch, globalServiceAdded);
               eh.highlightElement(driver,Tr1Td2_2);
               //رفرش
               action
               .click(RefreshSearchGrid).perform(); Thread.sleep(1000);
    		   //سرچ کد خدمت اضافه شده
			   WebElement Tr2Td3 =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[3]"));
			   String globalCodeServiceAdded=Tr2Td3.getText();
			   action
			   .click(InputCodeSearch)
			   .sendKeys(globalCodeServiceAdded)
			   .click(SearchGrid).perform();  Thread.sleep(1000);
			   
			   WebElement Tr1Td3 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[3]"));
			   String globalCodeServiceSearch=Tr1Td3.getText();

   		       Assert.assertEquals(globalCodeServiceSearch, globalCodeServiceAdded);
               eh.highlightElement(driver,Tr1Td3);

	  	   }
	  	   
	  	   public void EditGlobalServiceAdded ( WebDriver driver,String globalName ,String globalCode,String kJarahi,String kBihooshi,String degree1,String degree2,String degree3,String degree4,String fromdate) throws InterruptedException {
		   Actions action = new Actions(driver);
		   
		   WebElement EditButton1 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[13]/div[2]"));
		   
		   action
		   .click(EditButton1).perform();  	   Thread.sleep(1000);
  
		   action
		   .click(InputServiceName).perform();
		   InputServiceName.clear();
		   action
		   .click(InputServiceName)
		   .sendKeys(globalName)
		   .click(InputCode).perform();
		   InputCode.clear();
		   action
		   .click(InputCode)
		   .sendKeys(globalCode)
		   .click(InputKJarahi).perform();
		   InputKJarahi.clear();
		   action
		   .click(InputKJarahi)
		   .sendKeys(kJarahi)
		   .click(InputKBihooshi).perform();
		   InputKBihooshi.clear();
		   action
		   .click(InputKBihooshi)
		   .sendKeys(kBihooshi)
		   .click(Inputdegree1).perform();
		   Inputdegree1.clear();
		   action
		   .click(Inputdegree1)
		   .sendKeys(degree1)
		   .click(Inputdegree2).perform();
		   Inputdegree2.clear();
		   action
		   .click(Inputdegree2)
		   .sendKeys(degree2)
		   .click(Inputdegree3).perform();
		   Inputdegree3.clear();
		   action
		   .click(Inputdegree3)
		   .sendKeys(degree3)
		   .click(Inputdegree4).perform();
		   Inputdegree4.clear();
		   action
		   .click(Inputdegree4)
		   .sendKeys(degree4)
		   .perform();
		   		   Thread.sleep(1000);
	
	       WebElement Edit =driver.findElement(By.xpath("//button[text()='ویرایش ']"));

		   	
		   action
		   .click(Edit).perform();  		   Thread.sleep(1000);
		   
		   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
		   Thread.sleep(500);
		   String c=POPUP.getText();
	       Assert.assertTrue(c.contains("موفقیت"));
           eh.highlightElement(driver,POPUP); 
           
           //چک ویرایش
           
		   WebElement Tr1Td2 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[2]"));
		   String tr1td2=Tr1Td2.getText();
		       Assert.assertEquals(tr1td2, globalName);
               eh.highlightElement(driver,Tr1Td2);

		   
		   WebElement Tr1Td3 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[3]"));
		   String tr1td3=Tr1Td3.getText();
	       Assert.assertEquals(tr1td3, globalCode);
           eh.highlightElement(driver,Tr1Td3);

		   WebElement Tr1Td4 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[4]"));
		   String tr1td4=Tr1Td4.getText();
	       Assert.assertEquals(tr1td4, kJarahi);
           eh.highlightElement(driver,Tr1Td4);

		   WebElement Tr1Td5 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[5]"));
		   String tr1td5=Tr1Td5.getText();
	       Assert.assertEquals(tr1td5, kBihooshi);
           eh.highlightElement(driver,Tr1Td5);

		   WebElement Tr1Td6 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[6]"));
		   String tr1td6=Tr1Td6.getText();
	       Assert.assertEquals(tr1td6, degree1);
           eh.highlightElement(driver,Tr1Td6);

		   WebElement Tr1Td7 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[7]"));
		   String tr1td7=Tr1Td7.getText();
	       Assert.assertEquals(tr1td7, degree2);
           eh.highlightElement(driver,Tr1Td7);

		   WebElement Tr1Td8 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[8]"));
		   String tr1td8=Tr1Td8.getText();
	       Assert.assertEquals(tr1td8, degree3);
           eh.highlightElement(driver,Tr1Td8);

		   WebElement Tr1Td9 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[9]"));
		   String tr1td9=Tr1Td9.getText();
	       Assert.assertEquals(tr1td9, degree4);
           eh.highlightElement(driver,Tr1Td9);

	  	   }
	  	   
	  	   public void AddInformalGlobalservices ( WebDriver driver,String globalName ,String globalCode,String kJarahi,String kBihooshi,String degree1,String degree2,String degree3,String degree4, String fromdate) throws InterruptedException {
		   Actions action = new Actions(driver);
		   
		   ExpectedConditions.elementToBeClickable(InputServiceName);

		   WebElement PlusInformalservices =driver.findElement(By.xpath("(//i[@title='اضافه کردن'])[1]"));
		   PlusInformalservices.click();
//		   action
//		   .click(PlusInformalservices).perform(); Thread.sleep(1000);
		   //خدمت اول
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
	   		   WebElement Checkbox2= driver.findElement(By.xpath("(//tbody)[2]/tr[2]/td[3]/descendant::input"));
	   		   action
	   		   .click(Checkbox2).perform(); Thread.sleep(1000);
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
               
               Thread.sleep(1000);
               
    		   WebElement Tr1Td2i =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[2]/descendant::i"));
    		   
    		   action
    		   .click(Tr1Td2i).perform(); Thread.sleep(1000);
    		   
    		   WebElement Tr1Td2 =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[2]"));
    		   String tr1td2=Tr1Td2.getText();
    		       Assert.assertEquals(tr1td2, globalName);
                   eh.highlightElement(driver,Tr1Td2);

    		   
    		   WebElement Tr1Td3 =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[3]"));
    		   String tr1td3=Tr1Td3.getText();
    	       Assert.assertEquals(tr1td3, globalCode);
               eh.highlightElement(driver,Tr1Td3);

    		   WebElement Tr1Td4 =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[4]"));
    		   String tr1td4=Tr1Td4.getText();
    	       Assert.assertEquals(tr1td4, kJarahi);
               eh.highlightElement(driver,Tr1Td4);

    		   WebElement Tr1Td5 =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[5]"));
    		   String tr1td5=Tr1Td5.getText();
    	       Assert.assertEquals(tr1td5, kBihooshi);
               eh.highlightElement(driver,Tr1Td5);

    		   WebElement Tr1Td6 =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[6]"));
    		   String tr1td6=Tr1Td6.getText();
    	       Assert.assertEquals(tr1td6, degree1);
               eh.highlightElement(driver,Tr1Td6);

    		   WebElement Tr1Td7 =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[7]"));
    		   String tr1td7=Tr1Td7.getText();
    	       Assert.assertEquals(tr1td7, degree2);
               eh.highlightElement(driver,Tr1Td7);

    		   WebElement Tr1Td8 =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[8]"));
    		   String tr1td8=Tr1Td8.getText();
    	       Assert.assertEquals(tr1td8, degree3);
               eh.highlightElement(driver,Tr1Td8);

    		   WebElement Tr1Td9 =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[9]"));
    		   String tr1td9=Tr1Td9.getText();
    	       Assert.assertEquals(tr1td9, degree4);
               eh.highlightElement(driver,Tr1Td9);
		   
	  	   }
	  	   
	  	   public void AddGlobalServiceRepetitiousCode ( WebDriver driver ,String globalName ,String globalCode,String kJarahi,String kBihooshi,String degree1,String degree2,String degree3,String degree4, String fromdate,String globalName2 ,String globalCode2 ,String kJarahi2 ,String kBihooshi2,String degree12 ,String degree22,String degree32,String degree42,String fromdate2) throws InterruptedException {
		   Actions action = new Actions(driver);
		   //خدمت اول
		   
		   ExpectedConditions.elementToBeClickable(InputServiceName);
		   
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
		       Assert.assertTrue(c.contains("کد"));
               eh.highlightElement(driver,POPUP); 
               
               Thread.sleep(1000);
	  	   }
}
