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


public class PageObject_group_services {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String InsuranceName;
  String searchInsurance;

  @FindBy(xpath="//mat-select[@name='parentId']")
  WebElement MainGroupServices;

  @FindBy(xpath="//mat-select[@name='groupId']")
  WebElement UnderGroupServices;

  @FindBy(xpath="//mat-select[@name='showDeactives']")
  WebElement Activ_DeActiv;
  
  @FindBy(xpath="//button[@type='submit']")
  WebElement SearchButton;
  
  @FindBy(xpath="//img[@alt='refresh']")
  WebElement  Refresh;
  

  @FindBy(xpath="//button[@mattooltip='ذخیره']")
  WebElement Save;

  
  @FindBy(xpath="(//mat-select[@role='combobox'])[4]")
  WebElement NumberPerPage;
  
  



  public void DeActive_mainGroup ( WebDriver driver, String maingroup, String deactive ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   action
	   .click(MainGroupServices)
	   .perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(maingroup).perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(6000);
      WebElement Checkbox2thjarahi= driver.findElement(By.xpath("//table/tbody/tr[426]/td[3]/descendant::span[1]"));
       System.out.println("samane");
	   Thread.sleep(2000);
	   action
	   .click(Checkbox2thjarahi)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   System.out.println("ali");
	   action.click(Save).perform();
	   System.out.println("mohsen");
	   Thread.sleep(6000);
	   action
	   .click(Activ_DeActiv).perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(deactive).perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(Keys.ENTER)
	   .perform();
	  WebElement x= driver.findElement(By.xpath("//table/tbody/tr[58]/td[3]/descendant::input[@aria-checked='false']"));
       System.out.println(x.getText());
	  
    }
}