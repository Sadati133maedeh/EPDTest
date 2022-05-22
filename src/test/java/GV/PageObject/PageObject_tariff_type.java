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

import GV.Package.element_Highlight;


public class PageObject_tariff_type {

	  element_Highlight eh= new element_Highlight();
	  

	  @FindBy(xpath="(//input[@name='title'])[1]")
	   WebElement TarrifeName;

	  @FindBy(xpath="//mat-select[@name='standardId']")
	   WebElement standardTarrife;

	   @FindBy(xpath="//button[text()='افزودن']")
	   WebElement AddButton;

	   @FindBy(xpath="//mat-select[@name='active']")
	   WebElement Activ_DeActiv;
	   
	   @FindBy(xpath="//button[@type='submit']")
	   WebElement SearchButton;
	   
	   @FindBy(xpath="(//input[@name='title'])[2]")
	   WebElement SearchTariff;
	   
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

	  

	   
	   

	   public void Add_Tariff( WebDriver driver ,String tariff,String tariff2,String tariff3) throws InterruptedException {
		   Actions action = new Actions(driver);
		   action
		   .click(TarrifeName)
		   .sendKeys(tariff)
		   .click(AddButton)
		   .perform();
		   Thread.sleep(1000);
		   action
		   .click(Refresh)
		   .click(TarrifeName)
		   .sendKeys(tariff2)
		   .click(AddButton)
		   .perform();
		   Thread.sleep(1000);
		   action
		   .click(Refresh)
		   .click(TarrifeName)
		   .sendKeys(tariff3)
		   .click(AddButton)
		   .perform();

	}
	   public void Edit_Tariff( WebDriver driver ,String Newtariff ,String tariff2) throws InterruptedException {
		   Actions action = new Actions(driver);
		   ExpectedConditions.elementToBeClickable(SearchTariff);
		   WebElement FirstPenTariff=driver.findElement(By.xpath("//mat-icon[text()='edit']"));
		   action
		   .click(SearchTariff)
		   .sendKeys(tariff2)
		   .click(SearchButton)
		   .click(FirstPenTariff)
		   .click(TarrifeName)
		   .perform();
		   WebElement EditButton1 =driver.findElement(By.xpath("//button[text()='ویرایش']"));

		   TarrifeName.clear();
		   Thread.sleep(1000);
		   action
		   .click(TarrifeName)
		   .sendKeys(Newtariff)
		   .click(EditButton1)
		   .perform();
		   Thread.sleep(1000);
		   
		   action
		   .click(RefreshSearch).perform();
		   Thread.sleep(1000);
		   action
		   .click(SearchTariff)
		   .sendKeys(Newtariff)
		   .click(SearchButton).perform();
		   Thread.sleep(1000);

		   WebElement FirstTrTariff=driver.findElement(By.xpath("//tbody/tr/td[2]"));
		   String firstTrTariff=FirstTrTariff.getText();
		   Assert.assertEquals(firstTrTariff, Newtariff);
		   eh.highlightElement(driver,FirstTrTariff);

	}
	   public void Active_DeActive( WebDriver driver ,String Newtariff, String activ_deActiv, String activ_deActiv2) throws InterruptedException {
		   Actions action = new Actions(driver);
		   WebElement FirstTrCheckbox=driver.findElement(By.xpath("//tbody/tr/td[4]/descendant::span[1]"));
		   WebElement FirstTrTariff=driver.findElement(By.xpath("//tbody/tr/td[2]"));
//DeActive
		   action
		   .click(SearchTariff)
		   .sendKeys(Newtariff)
		   .click(SearchButton).perform();
		   Thread.sleep(1000);
		   action
		   .click(FirstTrCheckbox)
		   .click(Save)
		   .click(Activ_DeActiv).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(activ_deActiv).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .click(SearchButton)
		   .perform();
		   Thread.sleep(1000);
		   String Tarrif= FirstTrTariff.getText();
		   Assert.assertEquals(Tarrif, Newtariff); 
		   
		   //Active
		   action
		   .click(FirstTrCheckbox)
		   .click(Save)
		   .click(Activ_DeActiv).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(activ_deActiv).perform();
		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER)
		   .click(SearchButton)
		   .perform();
		   Thread.sleep(1000);
		   String Tarrif2= FirstTrTariff.getText();
		   Assert.assertEquals(Tarrif2, Newtariff); 

		      	   	   
	   }
	   public void Standardization ( WebDriver driver ,String tariff, String StandardTariff ) throws InterruptedException {
		   
		   Actions action = new Actions(driver);
		   
		   WebElement StandardizationCombo=driver.findElement(By.xpath("//tbody/tr[1]/td[3]/descendant::mat-select[@role='combobox']"));
		   WebElement PopUp=driver.findElement(By.xpath("//div[@role='alertdialog and 'text()='عملیات با موفقیت انجام شد']"));

		   action
		   .click(SearchTariff)
		   .sendKeys(tariff)
		   .click(SearchButton)
		   .click(Standardization)
		   .click(StandardizationCombo).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(StandardTariff)
		   .sendKeys(Keys.ENTER)
		   .perform();
		   eh.highlightElement(driver,PopUp); 
		   String alert=PopUp.getText();
	       Assert.assertTrue(alert.contains("موفقیت"));
		   Thread.sleep(1000);
		  String AddedStandard=StandardizationCombo.getText();
		   driver.navigate().refresh();
		   Thread.sleep(7000);
		  String AddedStandardCheck=StandardizationCombo.getText();
	       Assert.assertEquals(AddedStandard, AddedStandardCheck);
		   eh.highlightElement(driver,StandardizationCombo); 

	   }
	   
	   
	   public void Check_CopyTariff ( WebDriver driver , String tariff ,String tariff2,String tariff3) throws InterruptedException {
	 	   
		   WebElement TrTariff=driver.findElement(By.xpath("//tbody/tr/td[2]"));
		   WebElement Tr2Tariff=driver.findElement(By.xpath("//tbody/tr[2]/td[2]"));
		   WebElement Tr3Tariff=driver.findElement(By.xpath("//tbody/tr[3]/td[2]"));

		   String trTariff=TrTariff.getText();
		   Assert.assertEquals(trTariff, tariff);
		   eh.highlightElement(driver,TrTariff);
		   Thread.sleep(1000);

		   
		   String tr2Tariff=Tr2Tariff.getText();
		   Assert.assertEquals(tr2Tariff, tariff2);
		   eh.highlightElement(driver,Tr2Tariff);
		   Thread.sleep(1000);


		   String tr3Tariff=Tr3Tariff.getText();
		   Assert.assertEquals(tr3Tariff, tariff3);
		   eh.highlightElement(driver,Tr3Tariff);
		   
 
	 	   
	   }

}
