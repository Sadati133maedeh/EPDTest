package GV.PageObject;

import static org.testng.Assert.assertEquals;

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


public class PageObject_add_to_global {

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

@FindBy(xpath="//mat-select[@name='lvl4']")
WebElement UnderGroup;


  @FindBy(xpath="//mat-select[@name='showDeactives']")
  WebElement Activ_DeActiv;
  
  @FindBy(xpath="//button[@type='submit']")
  WebElement SearchButton;
  
  @FindBy(xpath="//img[@alt='refresh']")
  WebElement  Refresh;

 
  @FindBy(xpath="//button[@aria-label='save']")
  WebElement Save;

  @FindBy(xpath="//mat-panel-title[text()=' سایر خدمات ']")
  WebElement OthersService;

  
 

  
  

  public void AddToGlobalPeyvand ( WebDriver driver, String toDate ,String toDate2 ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   
	   ExpectedConditions.elementToBeClickable(OthersService);
	   
	   OthersService.click(); Thread.sleep(1000);

	   action
	   //جستجوی خدمت جراحی
	   .click(MainGroupServices)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);
	   
	   action
	   .click(UnderGroupServices)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);
	   
	   action
	   .click(FareGroupServices)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);
	   
	   action
	   .click(UnderGroup)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);
	   
	   action
	   .click(SearchButton)
	   .perform();
	   Thread.sleep(1000);
	   
	   WebElement Tr1Td3Date =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[3]/descendant::input"));
	   action
	   .click(Tr1Td3Date)
	   .sendKeys(toDate)
	   .perform();
	   Thread.sleep(2000);

	   WebElement Tr1Td5box =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[5]/descendant::input"));
	    action
	   .click(Tr1Td5box)
	   .perform();
	   Thread.sleep(1000);
	   
	   WebElement Tr2Td3Date =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[3]/descendant::input"));
	   action
	   .click(Tr2Td3Date)
	   .sendKeys(toDate2)
	   .perform();
	   Thread.sleep(2000);

	   WebElement Tr2Td5box =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[5]/descendant::input"));
	   action
	   .click(Tr2Td5box)
	   .perform();
	   Thread.sleep(1000);
	   
	   action
	   .click(Save).perform();
	   Thread.sleep(1000);

  }

  public void AddToGlobalCenter ( WebDriver driver, String toDate ,String toDate2 ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   
	   ExpectedConditions.elementToBeClickable(OthersService);
	   
	   OthersService.click(); Thread.sleep(1000);

	   action
	   //جستجوی خدمت جراحی
	   .click(MainGroupServices)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);
	   
	   action
	   .click(UnderGroupServices)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);
	   
	   action
	   .click(FareGroupServices)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);
	   
	   action
	   .click(UnderGroup)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.DOWN)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);
	   
	   action
	   .click(SearchButton)
	   .perform();
	   Thread.sleep(1000);
	   
	   WebElement Tr1Td3Date =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[3]/descendant::input"));
	   String dateTr1=Tr1Td3Date.getAttribute("value");
	   Assert.assertEquals(dateTr1, toDate);
       eh.highlightElement(driver,Tr1Td3Date);

	   WebElement Tr2Td3Date =driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[3]/descendant::input"));
	   String dateTr2=Tr2Td3Date.getAttribute("value");
	   Assert.assertEquals(dateTr2, toDate2);
       eh.highlightElement(driver,Tr2Td3Date);

	   

  }
}