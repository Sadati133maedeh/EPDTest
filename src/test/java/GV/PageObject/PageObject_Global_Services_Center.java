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

public class PageObject_Global_Services_Center {

	  element_Highlight eh= new element_Highlight();

	    @FindBy(xpath="//mat-select[@name='subgroup']")
	  WebElement SubGroupService;

	  	 @FindBy(xpath="//mat-select[@name='group']")
	  WebElement Group;

	  	 @FindBy(xpath="//mat-select[@name='lvl4']")
	  WebElement SubGroup;
	    
// گرید سرچ	  
		  @FindBy(xpath="//input[@name='name']")
		   WebElement InputServiceNameSearch;
;

	  @FindBy(xpath="//input[@name='code']")
       WebElement InputCodeSearch;
	  

	    @FindBy(xpath="//button[@type='submit' and @mattooltip='جستجو']")
	  WebElement SearchGrid;

	  	  @FindBy(xpath="(//button[@type='button' and @mattooltip='بارگذاری مجدد'])[1]")
	  WebElement RefreshSearchGrid;






	  
	  	   public void SearchGlobalServiceCenterByGroup ( WebDriver driver ,String globalName ,String globalCode,String kJarahi,String kBihooshi,String degree1,String degree2,String degree3,String degree4, String fromdate) throws InterruptedException {
		   Actions action = new Actions(driver);
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
		   	.click(SearchGrid).perform();
	   		   Thread.sleep(3000);
	   		   
			   WebElement Tr1Td2 =driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
			   String tr1td2=Tr1Td2.getText();
			       Assert.assertEquals(tr1td2, globalName);
	               eh.highlightElement(driver,Tr1Td2);

			   
			   WebElement Tr1Td3 =driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
			   String tr1td3=Tr1Td3.getText();
		       Assert.assertEquals(tr1td3, globalCode);
	           eh.highlightElement(driver,Tr1Td3);

			   WebElement Tr1Td4 =driver.findElement(By.xpath("//tbody/tr[1]/td[4]"));
			   String tr1td4=Tr1Td4.getText();
		       Assert.assertEquals(tr1td4, kJarahi);
	           eh.highlightElement(driver,Tr1Td4);

			   WebElement Tr1Td5 =driver.findElement(By.xpath("//tbody/tr[1]/td[5]"));
			   String tr1td5=Tr1Td5.getText();
		       Assert.assertEquals(tr1td5, kBihooshi);
	           eh.highlightElement(driver,Tr1Td5);

			   WebElement Tr1Td6 =driver.findElement(By.xpath("(//tbody)[1]/tr[1]/td[6]"));
			   String tr1td6=Tr1Td6.getText();
		       Assert.assertEquals(tr1td6, degree1);
	           eh.highlightElement(driver,Tr1Td6);

			   WebElement Tr1Td7 =driver.findElement(By.xpath("//tbody/tr[1]/td[7]"));
			   String tr1td7=Tr1Td7.getText();
		       Assert.assertEquals(tr1td7, degree2);
	           eh.highlightElement(driver,Tr1Td7);

			   WebElement Tr1Td8 =driver.findElement(By.xpath("//tbody/tr[1]/td[8]"));
			   String tr1td8=Tr1Td8.getText();
		       Assert.assertEquals(tr1td8, degree3);
	           eh.highlightElement(driver,Tr1Td8);

			   WebElement Tr1Td9 =driver.findElement(By.xpath("//tbody/tr[1]/td[9]"));
			   String tr1td9=Tr1Td9.getText();
		       Assert.assertEquals(tr1td9, degree4);
	           eh.highlightElement(driver,Tr1Td9);

	   		   

	  	   }
	  	   
	  	   public void SearchGlobalServiceNameAndCodeCenter (WebDriver driver ,String globalName ,String globalCode,String kJarahi,String kBihooshi,String degree1,String degree2,String degree3,String degree4, String fromdate) throws InterruptedException {
		   Actions action = new Actions(driver);
		   //سرچ نام خدمت اضافه شده
		   ExpectedConditions.elementToBeClickable(InputServiceNameSearch);

		   action
		   .click(InputServiceNameSearch)
		   .sendKeys(globalName)
		   .click(SearchGrid).perform(); 	   		   Thread.sleep(2000);
		   
		   WebElement Tr1Td2 =driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
		   String tr1td2=Tr1Td2.getText();
		       Assert.assertEquals(tr1td2, globalName);
               eh.highlightElement(driver,Tr1Td2);


               //رفرش
               action
               .click(RefreshSearchGrid).perform(); Thread.sleep(1000);
    		   //سرچ کد خدمت اضافه شده
               
    		   action
    		   .click(InputCodeSearch)
    		   .sendKeys(globalCode)
    		   .click(SearchGrid).perform(); 	   		   Thread.sleep(2000);

			   WebElement Tr1Td3 =driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
			   String tr1td3=Tr1Td3.getText();
		       Assert.assertEquals(tr1td3, globalCode);
	           eh.highlightElement(driver,Tr1Td3);
	  	 

		   
	  	   }
}