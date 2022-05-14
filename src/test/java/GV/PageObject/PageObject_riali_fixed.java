package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_riali_fixed {

	  element_Highlight eh= new element_Highlight();
	  
	  @FindBy(xpath="//mat-panel-title[text()=' ثبت ']")
	   WebElement Add;

	  @FindBy(xpath="(//button[@type='submit'])[1]")
	   WebElement AddSearch;

	  @FindBy(xpath="(//button[@type='submit'])[2]")
	   WebElement ShowSearch;
	  
	  @FindBy(xpath="(//mat-select[@name='sectionId'])[1]")
	  WebElement AddMainGroupServices;
	  
	  @FindBy(xpath="(//mat-select[@name='sectionId'])[2]")
	  WebElement ShowMainGroupServices;
	  
	  @FindBy(xpath="(//mat-select[@name='subgroup'])[1]")
	  WebElement AddUnderGroupServices;
	  
	  @FindBy(xpath="(//mat-select[@name='subgroup'])[2]")
	  WebElement ShowUnderGroupServices;
	  
	  @FindBy(xpath="(//mat-select[@name='group'])[1]")
	  WebElement AddFareGroupServices;

	  @FindBy(xpath="(//mat-select[@name='group'])[2]")
	  WebElement ShowFareGroupServices;
	  
	  @FindBy(xpath="(//input[@formcontrolname='ServiceName'])[1]")
	  WebElement  AddSearchServiceName;
	  
	  @FindBy(xpath="(//input[@formcontrolname='ServiceName'])[2]")
	  WebElement  ShowSearchServiceName;
	  
	  @FindBy(xpath="(//input[@formcontrolname='RvuCode'])[1]")
	  WebElement  AddSearchRUVcode;

	  @FindBy(xpath="//input[@name='rvuCode']")
	  WebElement  ShowSearchRUVcode;

	  @FindBy(xpath="//mat-select[@name='tariffId']")
	  WebElement  SearchTariff;

	  @FindBy(xpath="//mat-select[@name='contractId']")
	  WebElement  SearchContract;
	  
	  @FindBy(xpath="//mat-panel-title[text()=' نمایش ']")
	  WebElement  Show;
	  
	  @FindBy(xpath="(//button[@mattooltip='بارگذاری مجدد'])[2]")
	  WebElement  ShowRefresh;




	   

	   public void AddFixPrice  ( WebDriver driver ,String mainGroup,String herfeyi ,String fani,String fulltime,String herfeyi2 ,String fani2,String fulltime2,String tariff,String contract,String tariff2,String contract2) throws InterruptedException {
		   Actions action = new Actions(driver);
		   //فراخوانی خدمات داخلی با ثابت ریالی
		  
		   action
		   .click(Add).perform();
		   Thread.sleep(500);
		   action
		   .click(AddMainGroupServices).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(mainGroup).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);

		   //اضافه کردن سهم حرفه ای و فنی 1
		   
		   WebElement addHerfeyiRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[3]/descendant::input[@type='text']"));
		   WebElement addFaniRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[4]/descendant::input[@type='text']"));
		   WebElement addFulltimeRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[5]/descendant::input[@type='text']"));
		   WebElement addSaveRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[7]/descendant::mat-icon[@role='img']"));

		   action
		   .click(addHerfeyiRow1)
		   .sendKeys(herfeyi).perform();
		   Thread.sleep(500);
		   action
		   .click(addFaniRow1)
		   .sendKeys(fani).perform();
		   Thread.sleep(500);
		   action
		   .click(addFulltimeRow1)
		   .sendKeys(fulltime).perform();
		   Thread.sleep(500);
		   action
		   .click(addSaveRow1).perform();
		   Thread.sleep(500);
		   //دیالوگ تعرفه و قرارداد
		   WebElement Tariff =driver.findElement(By.xpath("//form[@id='SaveDialogForm']/descendant::mat-select[@name='tariffName']"));
		   WebElement Contract =driver.findElement(By.xpath("//form[@id='SaveDialogForm']/descendant::mat-select[@name='contractName']"));
		   WebElement Save =driver.findElement(By.xpath("//button[text()='ذخیره']"));
		   
		   action
		   .click(Tariff).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(tariff).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);

		   action
		   .click(Contract).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(contract).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);
		   action
		   .click(Save).perform();
		   Thread.sleep(500);

		   
		   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
		   Thread.sleep(500);
		   String c=POPUP.getText();
	       Assert.assertTrue(c.contains("موفقیت"));
		   Thread.sleep(500);
		   
		   action
		   .click()
		   .sendKeys(Keys.PAGE_DOWN).perform();
		   Thread.sleep(500);


		   //اضافه کردن سهم حرفه ای و فنی 2
		   
		   WebElement addHerfeyiRow10 =driver.findElement(By.xpath("//mat-row[10]/mat-cell[3]/descendant::input[@type='text']"));
		   WebElement addFaniRow10 =driver.findElement(By.xpath("//mat-row[10]/mat-cell[4]/descendant::input[@type='text']"));
		   WebElement addFulltimeRow10 =driver.findElement(By.xpath("//mat-row[10]/mat-cell[5]/descendant::input[@type='text']"));
		   WebElement addSaveRow10 =driver.findElement(By.xpath("//mat-row[10]/mat-cell[7]/descendant::mat-icon[@role='img']"));

		   action
		   .click(addHerfeyiRow10)
		   .sendKeys(herfeyi2).perform();
		   Thread.sleep(1000);
		   action
		   .click(addFaniRow10)
		   .sendKeys(fani2).perform();
		   Thread.sleep(1000);
		   action
		   .click(addFulltimeRow10)
		   .sendKeys(fulltime2).perform();
		   Thread.sleep(1000);
		   action
		   .click(addSaveRow10).perform();
		   Thread.sleep(500);
		   //دیالوگ تعرفه و قرارداد
		   WebElement Tariff2 =driver.findElement(By.xpath("//form[@id='SaveDialogForm']/descendant::mat-select[@name='tariffName']"));
		   WebElement Contract2 =driver.findElement(By.xpath("//form[@id='SaveDialogForm']/descendant::mat-select[@name='contractName']"));
		   WebElement Save2 =driver.findElement(By.xpath("//button[text()='ذخیره']"));
		   
		   action
		   .click(Tariff2).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(tariff2).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);

		   action
		   .click(Contract2).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(contract2).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);

		   action
		   .click(Save2).perform();
		   Thread.sleep(500);

		   
		   WebElement POPUP2 =driver.findElement(By.xpath("//div[@role='alertdialog']"));
		   Thread.sleep(500);
		   String s=POPUP2.getText();
	       Assert.assertTrue(s.contains("موفقیت"));



	}
	   public void SearchService_Add ( WebDriver driver ,String mainGroup) throws InterruptedException {
		   Actions action = new Actions(driver);
		   //فراخوانی خدمات داخلی با ثابت ریالی
			  
		   action
		   .click(Add).perform();
		   Thread.sleep(500);
		   action
		   .click(AddMainGroupServices).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(mainGroup).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);
		   
		   WebElement addServiceNameRow5 =driver.findElement(By.xpath("//mat-row[5]/mat-cell[1]"));
		   String serviceName= addServiceNameRow5.getText();
		   eh.highlightElement(driver,addServiceNameRow5); 

		   driver.navigate().refresh();
			  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS); 
			   Thread.sleep(2000);

			   action
			   .click(Add).perform();
			   Thread.sleep(500);
			   action
			   .click(AddMainGroupServices).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(mainGroup).perform();
			   Thread.sleep(500);
			   action
			   .click().perform();
			   Thread.sleep(500);
			   action
			   .click(AddSearchServiceName)
			   .sendKeys(serviceName)
			   .click(AddSearch).perform();
			   
			   WebElement FindeServiceNameRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[1]"));
			   String findeServiceNameRow1= FindeServiceNameRow1.getText(); 
			   Assert.assertEquals(findeServiceNameRow1, serviceName);
			   eh.highlightElement(driver,FindeServiceNameRow1); 




	}
	   public void SearchService_Show ( WebDriver driver ,String mainGroup, String serviceName) throws InterruptedException {
		   Actions action = new Actions(driver);
		   action
		   .click(Show).perform();
		   Thread.sleep(500);
		   action
		   .click(ShowMainGroupServices).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(mainGroup).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(500);
		   action
		   .click(ShowSearchServiceName)
		   .sendKeys(serviceName)
		   .click(ShowSearch).perform();
		   Thread.sleep(500);
		   
		   WebElement FindeServiceNameRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[2]"));
		   String findeServiceNameRow1= FindeServiceNameRow1.getText(); 
		   Assert.assertEquals(findeServiceNameRow1, serviceName);
		   eh.highlightElement(driver,FindeServiceNameRow1); 

		      	   	   
	   }
	   public void SearchTariffContract ( WebDriver driver,String mainGroup ,String tariff, String contract) throws InterruptedException {
		   
		   Actions action = new Actions(driver);
		   action
		   .click(Show).perform();
		   Thread.sleep(500);
		   action
		   .click(ShowMainGroupServices).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(mainGroup).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(500);
		   

		   action
		   .click(SearchTariff).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(tariff).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);
		   
		   WebElement FindTariffNameRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[4]"));

		   
		   String Tariff= FindTariffNameRow1.getText();
		   Assert.assertEquals(Tariff, tariff);
		   eh.highlightElement(driver,FindTariffNameRow1); 
		   Thread.sleep(500);
		   
		   action
		   .click(ShowRefresh).perform();
		   Thread.sleep(500);
		   
		   action
		   .click(ShowMainGroupServices).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(mainGroup).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(500);
		   


		   action
		   .click(SearchContract).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(contract).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);
		   
		   WebElement Find2ContractNameRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[5]"));

		   
		   String Contract= Find2ContractNameRow1.getText();
		   Assert.assertEquals(Contract, contract);
		   eh.highlightElement(driver,Find2ContractNameRow1); 
		   Thread.sleep(500);




	   }
	   
	   public void AddFixPriceRepetitious ( WebDriver driver,String mainGroup,String herfeyi ,String fani,String fulltime,String tariff,String contract) throws InterruptedException {
		   
		   Actions action = new Actions(driver);
		   //فراخوانی خدمات داخلی با ثابت ریالی
			  
		   action
		   .click(Add).perform();
		   Thread.sleep(500);
		   action
		   .click(AddMainGroupServices).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(mainGroup).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);

		   //اضافه کردن سهم حرفه ای و فنی 1
		   
		   WebElement addHerfeyiRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[3]/descendant::input[@type='text']"));
		   WebElement addFaniRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[4]/descendant::input[@type='text']"));
		   WebElement addFulltimeRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[5]/descendant::input[@type='text']"));
		   WebElement addSaveRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[7]/descendant::mat-icon[@role='img']"));

		   action
		   .click(addHerfeyiRow1)
		   .sendKeys(herfeyi).perform();
		   Thread.sleep(500);
		   action
		   .click(addFaniRow1)
		   .sendKeys(fani).perform();
		   Thread.sleep(500);
		   action
		   .click(addFulltimeRow1)
		   .sendKeys(fulltime).perform();
		   Thread.sleep(500);
		   action
		   .click(addSaveRow1).perform();
		   Thread.sleep(500);
		   //دیالوگ تعرفه و قرارداد
		   WebElement Tariff =driver.findElement(By.xpath("//form[@id='SaveDialogForm']/descendant::mat-select[@name='tariffName']"));
		   WebElement Contract =driver.findElement(By.xpath("//form[@id='SaveDialogForm']/descendant::mat-select[@name='contractName']"));
		   WebElement Save =driver.findElement(By.xpath("//button[text()='ذخیره']"));
		   
		   action
		   .click(Tariff).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(tariff).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);

		   action
		   .click(Contract).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(contract).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);
		   action
		   .click(Save).perform();
		   Thread.sleep(500);

		   
		   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
		   Thread.sleep(500);
		   String c=POPUP.getText();
	       Assert.assertTrue(c.contains("ثابت"));
		   eh.highlightElement(driver,POPUP); 
		   Thread.sleep(500);

	   }
	   
	   public void EditFixPrice ( WebDriver driver,String mainGroup,String herfeyi ,String fani,String fulltime,String tariff,String contract) throws InterruptedException {
		   
		   Actions action = new Actions(driver);
		   
		   action
		   .click(Show).perform();
		   Thread.sleep(500);
		   action
		   .click(ShowMainGroupServices).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(mainGroup).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(500);
			  
		   WebElement EditButtonRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[10]/button[1]"));
		    action
		    .click(EditButtonRow1).perform();
			   Thread.sleep(500);
			   
		  WebElement EditFormHerfyiRow1 =driver.findElement(By.xpath("//input[@formcontrolname='professionalPrice']"));
		  WebElement EditForFaniRow1 =driver.findElement(By.xpath("//input[@formcontrolname='technicalPrice']"));
		  WebElement EditForFulltimeRow1 =driver.findElement(By.xpath("//input[@formcontrolname='fullTime']"));
		  WebElement EditFormTariffRow1 =driver.findElement(By.xpath("//mat-select[@formcontrolname='tariffId']"));
		  WebElement EditFormContractRow1 =driver.findElement(By.xpath("(//mat-select[@formcontrolname='ContractId'])[2]"));
		  WebElement EditFormButtonRow1 =driver.findElement(By.xpath("//button[text()='ویرایش']"));
		  
		  //ویرایش نرخ حرفه ای
		  action
		  .click(EditFormHerfyiRow1).perform();
		  EditFormHerfyiRow1.clear();
		   Thread.sleep(500);
		  action
		  .click(EditFormHerfyiRow1)
		  .sendKeys(herfeyi)
		  .perform();
		   Thread.sleep(500);

		  //ویرایش نرخ فنی
		  action
		  .click(EditForFaniRow1).perform();
		  EditForFaniRow1.clear();
		   Thread.sleep(500);
		  action
		  .click(EditForFaniRow1)
		  .sendKeys(fani)
		  .perform();
		   Thread.sleep(500);

		  //ویرایش نرخ تمام وقت
		  action
		  .click(EditForFulltimeRow1).perform();
		  EditForFulltimeRow1.clear();
		   Thread.sleep(500);
		  action
		  .click(EditForFulltimeRow1)
		  .sendKeys(fulltime)
		  .perform();
		   Thread.sleep(500);
		   
		   //ویرایش تعرفه
		   action
		   .click(EditFormTariffRow1).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(tariff).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);
		   
		   //ویرایش قرارداد
		   action
		   .click(EditFormContractRow1).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(contract).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .perform();
		   Thread.sleep(500);
		   //ذخیره تغییرات
		   action
		   .click(EditFormButtonRow1).perform();
		   Thread.sleep(500);

		   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
		   Thread.sleep(500);
		   String c=POPUP.getText();
	       Assert.assertTrue(c.contains("موفقیت"));
		   eh.highlightElement(driver,POPUP); 
		   Thread.sleep(500);


	   }
	   
	   public void DeleteFixPrice ( WebDriver driver,String mainGroup) throws InterruptedException {
		   
		   Actions action = new Actions(driver);
		   
		   action
		   .click(Show).perform();
		   Thread.sleep(500);
		   action
		   .click(ShowMainGroupServices).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(mainGroup).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(500);
		   
		   WebElement DeleteButtonRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[10]/button[2]"));
		   WebElement Row1Td2ServiceName =driver.findElement(By.xpath("//mat-row[1]/mat-cell[2]"));
		   
		   String deletedServisName=Row1Td2ServiceName.getText();
		   
		   action
		   .click(DeleteButtonRow1).perform();
		   Thread.sleep(1000);
		   
		   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
		   Thread.sleep(500);
		   String c=POPUP.getText();
	       Assert.assertTrue(c.contains("موفقیت"));
		   eh.highlightElement(driver,POPUP); 
		   Thread.sleep(500);
		   
		   driver.navigate().refresh();
			  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS); 
			   Thread.sleep(2000);
			   
			   action
			   .click(Add).perform();
			   Thread.sleep(500);
			   action
			   .click(AddMainGroupServices).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(mainGroup).perform();
			   Thread.sleep(500);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   Thread.sleep(500);
			   action
			   .click(AddSearchServiceName)
			   .sendKeys(deletedServisName)
			   .click(AddSearch).perform();
			   
			   WebElement FindeServiceNameRow1 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[1]"));
			   String findeServiceNameRow1= FindeServiceNameRow1.getText(); 
			   Assert.assertEquals(findeServiceNameRow1, deletedServisName);
			   eh.highlightElement(driver,FindeServiceNameRow1); 
			   
			   WebElement FindeRow1Td6 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[6]"));
			   String findeRow1Td6= FindeRow1Td6.getText(); 
			   Assert.assertEquals(findeRow1Td6, "");
			   eh.highlightElement(driver,FindeRow1Td6); 
			   
			   WebElement FindeRow1Td7 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[7]"));
			   String findeRow1Td7= FindeRow1Td7.getText(); 
			   Assert.assertEquals(findeRow1Td7, "");
			   eh.highlightElement(driver,FindeRow1Td7); 

			   WebElement FindeRow1Td8 =driver.findElement(By.xpath("//mat-row[1]/mat-cell[8]"));
			   String findeRow1Td8= FindeRow1Td8.getText(); 
			   Assert.assertEquals(findeRow1Td8, "");
			   eh.highlightElement(driver,FindeRow1Td8); 

	   }
}
