package GV.PageObject;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_services {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String InsuranceName;
  String searchservicename;

  @FindBy(xpath="//mat-select[@name='sectionId']")
  WebElement MainGroupServices;

  @FindBy(xpath="//mat-select[@name='subgroup']")
  WebElement UnderGroupServices;

@FindBy(xpath="//mat-select[@name='group']")
  WebElement FareGroupServices;

  @FindBy(xpath="//mat-select[@name='showDeactives']")
  WebElement Activ_DeActiv;
  
  @FindBy(xpath="//button[@type='submit']")
  WebElement SearchButton;
  
  @FindBy(xpath="//img[@alt='refresh']")
  WebElement  Refresh;

  @FindBy(xpath="//button[@type='button' and @data-toggle='collapse']")
  WebElement  collapse;

  @FindBy(xpath="//input[@name='serviceName']")
  WebElement  SearchServiceName;

  @FindBy(xpath="//input[@name='rvuCode']")
  WebElement  SearchRUVcode;
  
  
  @FindBy(xpath="(//mat-select[@role='combobox'])[4]")
  WebElement NumberPerPage;
  
  @FindBy(xpath="//table/tbody/tr[1]/td[4]")
  WebElement FirstServiceName;
 
  @FindBy(xpath="//table/tbody/tr[1]/td[5]")
  WebElement FirstRUVcode;

  
  @FindBy(xpath="//table/tbody/tr[1]/td[5]")
  WebElement FirstServiceNameJarahi;


  
 

  
  

  public void Search_Service ( WebDriver driver, String serviceName1 ,String serviceName2, String RUVCode ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   action
	   //جستجوی خدمت داخلی
	   .click(MainGroupServices)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(3000);
	   collapse.click();
	   Thread.sleep(500);
	   SearchServiceName.click();
	   SearchServiceName.sendKeys(serviceName1);
	   SearchButton.click();
	   Thread.sleep(4000);
	   searchservicename = FirstServiceName.getText();
	   assertEquals(searchservicename, serviceName1);
       eh.highlightElement(driver, FirstServiceName);
	   Thread.sleep(500);
		eh.unhighlightLast(driver, FirstServiceName);

	   Refresh.click();
	   //جستجوی خدمت جراحی
	   action
	   .click(MainGroupServices)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(5000);
	   SearchServiceName.click();
	   SearchServiceName.sendKeys(serviceName2);
	   SearchButton.click();
	   Thread.sleep(4000);
	   searchservicename = FirstServiceNameJarahi.getText();
	   assertEquals(searchservicename, serviceName2);
       eh.highlightElement(driver, FirstServiceNameJarahi);
	   Thread.sleep(500);
		eh.unhighlightLast(driver, FirstServiceNameJarahi);

	   Refresh.click();
	   //جستجوی کد RUV
	   action
	   .click(MainGroupServices)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(5000);
	   SearchRUVcode.click();
	   SearchRUVcode.sendKeys(RUVCode);
	   SearchButton.click();
	   Thread.sleep(4000);
	   searchservicename = FirstRUVcode.getText();
	   assertEquals(searchservicename, RUVCode);
       eh.highlightElement(driver, FirstRUVcode);
	   Thread.sleep(500);
		eh.unhighlightLast(driver, FirstRUVcode);

	   


	   
	   
	   

}
}