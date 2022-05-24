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


public class PageObject_contract_type {

	  element_Highlight eh= new element_Highlight();
	  

	  @FindBy(xpath="(//input[@name='title'])[1]")
	   WebElement ContracteName;
	  
	  @FindBy(xpath="(//mat-select[@name='tariffType'])[1]")
	   WebElement ContractTariff;

	   @FindBy(xpath="//button[text()='افزودن']")
	   WebElement AddButton;

	   @FindBy(xpath="//mat-select[@name='active']")
	   WebElement Activ_DeActiv;
	   
	   @FindBy(xpath="//button[@type='submit']")
	   WebElement SearchButton;
	   
	   @FindBy(xpath="(//mat-select[@name='tariffType'])[2]")
	   WebElement SearchContractTariff;
	   
	   @FindBy(xpath="(//input[@name='title'])[2]")
	   WebElement SearchContract;

	   
	   @FindBy(xpath="//input[@type='checkbox']")
	   WebElement Standardization;

	   @FindBy(xpath="(//img[@alt='refresh'])[1]")
	   WebElement  Refresh;

	   @FindBy(xpath="(//img[@alt='refresh'])[2]")
	   WebElement  RefreshSearch;
	  
	   @FindBy(xpath="(//mat-select[@role='combobox'])[3]")
	   WebElement NumberPerPage;
	   
	   @FindBy(xpath="//button[@mattooltip='ذخیره']")
	   WebElement Save;

	  

	   
	   

	   public void Add_Contract_Name ( WebDriver driver ,String contractName ,String contractTariff ,String contractName2 ,String contractTariff2,String contractName3 ,String contractTariff3) throws InterruptedException {
		   Actions action = new Actions(driver);
		   
		   action
		   .click(ContracteName)
		   .sendKeys(contractName)
		   .click(ContractTariff).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(contractTariff).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000);
		   action
		   .click(AddButton)
		   .perform();
		   Thread.sleep(1000);
		   action
		   .click(ContracteName)
		   .sendKeys(contractName2)
		   .click(ContractTariff).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(contractTariff2).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000);
		   action
		   .click(AddButton)
		   .perform();
		   Thread.sleep(1000);
		   action
		   .click(ContracteName)
		   .sendKeys(contractName3)
		   .click(ContractTariff).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(contractTariff3).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000);
		   action
		   .click(AddButton)
		   .perform();
  		   Thread.sleep(1000);


		   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
		   Thread.sleep(500);
		   String c2=POPUP.getText();
	       Assert.assertTrue(c2.contains("موفقیت"));
           eh.highlightElement(driver,POPUP); 


	}
	   public void Edit_Contract_Name( WebDriver driver ,String NewContract ,String contract) throws InterruptedException {
		   Actions action = new Actions(driver);
		   action
		   .click(SearchContract)
		   .sendKeys(contract)
		   .click(SearchButton).perform();
  		   Thread.sleep(1000);
		   WebElement FirstPenContract=driver.findElement(By.xpath("//mat-icon[text()='edit']"));

		   action
		   .click(FirstPenContract)
		   .click(ContracteName)
		   .perform();
		   ContracteName.clear();
		   Thread.sleep(1000);
		   action
		   .click(ContracteName)
		   .sendKeys(NewContract).perform();
		   Thread.sleep(1000);
		   WebElement EditButton1 =driver.findElement(By.xpath("//button[text()='ویرایش']"));

		   action
		   .click(EditButton1)
		   .perform();
		   Thread.sleep(1000);
		   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
		   Thread.sleep(500);
		   String c2=POPUP.getText();
	       Assert.assertTrue(c2.contains("موفقیت"));
           eh.highlightElement(driver,POPUP); 

		   WebElement FirstTrContract=driver.findElement(By.xpath("//tbody/tr/td[2]"));
		   String EditedContract= FirstTrContract.getText();
		   Assert.assertEquals(EditedContract, NewContract);
           eh.highlightElement(driver,FirstTrContract); 

	}
	   public void Active_DeActive( WebDriver driver ,String NewContract, String activ_deActiv, String activ_deActiv2) throws InterruptedException {
		   Actions action = new Actions(driver);
//DeActive
		   action
		   .click(SearchContract)
		   .sendKeys(NewContract)
		   .click(SearchButton).perform();
		   Thread.sleep(1000);
		   WebElement FirstTrCheckbox=driver.findElement(By.xpath("//tbody/tr/td[4]/descendant::span[1]"));

		   action
		   .click(FirstTrCheckbox)
		   .click(Save)
		   .click(Activ_DeActiv).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(activ_deActiv).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER)
		   .click(SearchButton)
		   .perform();
		   Thread.sleep(1000);
		   WebElement FirstTrTariff=driver.findElement(By.xpath("//tbody/tr/td[2]"));

		   String Tarrif= FirstTrTariff.getText();
		   Assert.assertEquals(Tarrif, NewContract); 
		   eh.highlightElement(driver,FirstTrTariff);

		   Thread.sleep(1000);

		   //Active
		   WebElement FirstTrCheckbox2=driver.findElement(By.xpath("//tbody/tr/td[4]/descendant::span[1]"));

		   action
		   .click(FirstTrCheckbox2)
		   .click(Save)
		   .click(Activ_DeActiv).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(activ_deActiv2).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER)
		   .click(SearchButton)
		   .perform();
		   WebElement FirstTrTariff2=driver.findElement(By.xpath("//tbody/tr/td[2]"));

		   Thread.sleep(1000);
		   String Tarrif2= FirstTrTariff2.getText();
		   Assert.assertEquals(Tarrif2, NewContract); 
		   eh.highlightElement(driver,FirstTrTariff2);

		      	   	   
	   }
	   public void Standardization ( WebDriver driver ,String tariff, String StandardTariff ) throws InterruptedException {
		   
//		   Actions action = new Actions(driver);
//		   
//		   WebElement StandardizationCombo=driver.findElement(By.xpath("//tbody/tr[1]/td[3]/descendant::mat-select[@role='combobox']"));
//		   WebElement PopUp=driver.findElement(By.xpath("//div[@role='alertdialog and 'text()='عملیات با موفقیت انجام شد']"));
//
//		   action
//		   .click(SearchTariff)
//		   .sendKeys(tariff)
//		   .click(SearchButton)
//		   .click(Standardization)
//		   .click(StandardizationCombo).perform();
//		   Thread.sleep(1000);
//		   action
//		   .sendKeys(StandardTariff)
//		   .sendKeys(Keys.ENTER)
//		   .perform();
//		   eh.highlightElement(driver,PopUp); 
//		   String alert=PopUp.getText();
//	       Assert.assertTrue(alert.contains("موفقیت"));
//		   Thread.sleep(1000);
//		  String AddedStandard=StandardizationCombo.getText();
//		   driver.navigate().refresh();
//		   Thread.sleep(7000);
//		  String AddedStandardCheck=StandardizationCombo.getText();
//	       Assert.assertEquals(AddedStandard, AddedStandardCheck);
//		   eh.highlightElement(driver,StandardizationCombo); 

	   }

}
