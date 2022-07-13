package cis.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cis.cispackage.element_Highlight;

public class PageObgect_AddTrapistToClinic{
	

	element_Highlight eh= new element_Highlight();
	
	String  ClinicName;
	String  ClinicNameAdded;
	String  TrapistName;
	String  TrapistNameAdded;
	String  TrapistFirstName;
	String  TrapistLastName;
	String  TrapistCode;
	String  TrapistCodeWithTitle;



    @FindBy(xpath="//label[text()='نام کلینیک']/following-sibling::input")
	WebElement clinicNameSearch;
    
    @FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement clinicCheckbox;
    
    @FindBy(xpath="//div[text()=' انتخاب نام کلینیک ']/following::span[@class='mat-checkbox-label'][1]")
	WebElement clinicName;
    
    @FindBy(xpath="(//div[contains(@class,'info-container flex-grow-1')]//div)[1]")
	WebElement trapistName;

    @FindBy(xpath="//div[@title='جستجو']")
	WebElement trapistSearchButtom;

    @FindBy(xpath="//label[text()='نام']/following::input[1]")
	WebElement trapistNameSearch;
    
    @FindBy(xpath="//label[text()='نام خانوادگی']/following::input[1]")
	WebElement trapistFamilySearch;
    
    @FindBy(xpath="//label[text()='نظام پزشکی']/following::input[1]")
	WebElement trapistCodeSearch;
    
    @FindBy(xpath="(//div[contains(@class,'info-container flex-grow-1')]//div)[2]")
	WebElement trapistCode;
    
    @FindBy(xpath="//div [text()=' انتخاب نام درمانگر ']/following::input[@type='checkbox'][1]")
	WebElement trapistCheckbox;
    
    @FindBy(xpath="//span[text()='ثبت']")
	WebElement sabtBtton;
    
    @FindBy(xpath="//div[@title='جستجو']")
	WebElement searchtBtton;
    
    @FindBy(xpath="(//div[@title='بارگذاری مجدد'])[2]")
	WebElement refreshTrapist;

    


    
    public void AddTrapistToClinic ( WebDriver driver ) throws InterruptedException {
    	
		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();
    	
    	
	    //choose clinic
    	eh.highlightElement(driver, clinicCheckbox);
    	action.click(clinicCheckbox).perform();
		eh.unhighlightLast(driver, clinicCheckbox);
		Thread.sleep(1000);
		//choose trapist
		eh.highlightElement(driver, searchtBtton);
		action.click(searchtBtton).perform();
		eh.unhighlightLast(driver, searchtBtton);
    	eh.highlightElement(driver, trapistName);
		Thread.sleep(1000);
    	TrapistName= trapistName.getText();
		eh.unhighlightLast(driver, trapistName);
    	eh.highlightElement(driver, trapistCheckbox);
    	action.click(trapistCheckbox).perform();
		eh.unhighlightLast(driver, trapistCheckbox);
		Thread.sleep(1000);
		//sabt
    	eh.highlightElement(driver, sabtBtton);
    	sabtBtton.click();
	    eh.unhighlightLast(driver, sabtBtton);
	    //SuccecfulAddMessage
	    WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container/simple-snack-bar"));
	    eh.highlightElement(driver, POPUP);
	    Thread.sleep(1000);
	    String c= POPUP.getText();
	    System.out.print("resulte:"+c);
	    Assert.assertEquals(c,"ثبت با موفقیت انجام شد\n"
	    		+ "x");
	    eh.unhighlightLast(driver, POPUP);

	    
	    //check sabt
    	action.click(clinicCheckbox).perform();
		Thread.sleep(1000);
        WebElement addedTrtapist=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[2]/app-clinic-single/div/div[2]/div[2]/div/div[1]/div/div/div/div/span"));
	    eh.highlightElement(driver, addedTrtapist);
		Thread.sleep(1000);
        TrapistNameAdded=addedTrtapist.getText();
        Assert.assertTrue(TrapistNameAdded.contains(TrapistName));
	}
    
      public void Search_three_letter ( WebDriver driver ) throws InterruptedException {
  		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();

    	 
    	//get name
  		eh.highlightElement(driver, searchtBtton);
  		action.click(searchtBtton).perform();
  		eh.unhighlightLast(driver, searchtBtton);
    	eh.highlightElement(driver, trapistName);
		Thread.sleep(1000);
    	TrapistName= trapistName.getText();
		Thread.sleep(500);
		eh.unhighlightLast(driver, trapistName);
		action.click(refreshTrapist);
		
		 //split trapist name
		String substrings[] = TrapistName.split(" "); 
		
		TrapistFirstName=substrings[0];
		TrapistLastName=substrings[1];
		
   	    //search name
		String threeN = TrapistFirstName.substring(0, 2);
		action.click(trapistNameSearch).perform();
		action.sendKeys(threeN).perform();
		eh.highlightElement(driver, searchtBtton);
		action.click(searchtBtton).perform();
		eh.unhighlightLast(driver, searchtBtton);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistName.contains(TrapistFirstName));
		trapistNameSearch.clear();
		action.click(refreshTrapist).perform();
		Thread.sleep(1000);

		
		//search Family
		eh.highlightElement(driver, searchtBtton);
		action.click(searchtBtton).perform();
		eh.unhighlightLast(driver, searchtBtton);
		Thread.sleep(1000);
	    threeN = TrapistLastName.substring(0, 2);
		action.click(trapistFamilySearch).perform();
		action.sendKeys(threeN).perform();
		eh.highlightElement(driver, searchtBtton);
		action.click(searchtBtton).perform();
		eh.unhighlightLast(driver, searchtBtton);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistName.contains(TrapistLastName));
		action.click(refreshTrapist).perform();

	
     } 
      
      public void Search_trapist_code ( WebDriver driver ) throws InterruptedException {
  		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();
    	
    	//get Code
  		eh.highlightElement(driver, searchtBtton);
  		action.click(searchtBtton).perform();
  		eh.unhighlightLast(driver, searchtBtton);
    	eh.highlightElement(driver, trapistCode);
		Thread.sleep(1000);
    	TrapistCodeWithTitle= trapistCode.getText();
		eh.unhighlightLast(driver, trapistCode);
		
	    //split trapist code
		String substrings[] = TrapistCodeWithTitle.split(" "); 
		TrapistCode=substrings[2];
		
   	    //search code
		eh.highlightElement(driver, trapistCodeSearch);
		action.click(trapistCodeSearch).perform();
		action.sendKeys(TrapistCode).perform();
		Thread.sleep(1000);
		eh.unhighlightLast(driver, trapistCodeSearch);
		eh.highlightElement(driver, searchtBtton);
		action.click(searchtBtton).perform();
		eh.unhighlightLast(driver, searchtBtton);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistCodeWithTitle.contains(TrapistCode));
		trapistNameSearch.clear();
		  	
      }
}

