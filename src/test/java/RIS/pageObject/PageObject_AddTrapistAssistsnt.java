package cis.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cis.cispackage.element_Highlight;

public class PageObject_AddTrapistAssistsnt{
	

	element_Highlight eh= new element_Highlight();
	
	String  AssistantName;
	String  AssistantName2;
	String  AssistantName3;
	String  AssistantNameAdded;
	String  AssistantNameAdded2;
	String  AssistantNameAdded3;
	String  TrapistName;
	String  TrapistFirstName;
	String  TrapistLastName;
	String  TrapistCodeWithTitle;
	String  TrapistCode;
	String  AssistantNameSRC;
	String  AssistantFirstName;
	String  AssistantLastName;


    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[1]/div/div[1]/mat-checkbox/label/div")
	WebElement trapistCheckbox;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[2]/app-therapist-single/div[1]/div[2]/div/div[1]/kendo-textbox-container/input")
	WebElement trapistNameSearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[2]/app-therapist-single/div[1]/div[2]/div/div[2]/kendo-textbox-container/input")
	WebElement trapistFamilySearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[2]/app-therapist-single/div[1]/div[2]/div/div[3]/kendo-textbox-container/input")
	WebElement trapistCodeSearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[1]/div/div[2]/div")
	WebElement trapistCode;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[1]/div/div[1]/mat-checkbox/label/span")
	WebElement trapistName;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/form/div[2]/div/div[1]/kendo-textbox-container/input")
	WebElement assistantNameSearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/form/div[2]/div/div[2]/kendo-textbox-container/input")
	WebElement assistantFamilySearch;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[3]/td[2]")
	WebElement assistantName;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[2]")
	WebElement assistantName2;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[4]/td[2]")
	WebElement assistantName3;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[3]/td[1]/input")
	WebElement assistantCheckbox;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[3]/kendo-combobox/span/span[2]/span")
	WebElement assistantCombo2;
    
    @FindBy(xpath="")
	WebElement assistantCombo3;
 
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[1]/input")
	WebElement assistantCheckbox2;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[4]/td[1]/input")
	WebElement assistantCheckbox3;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[1]/button")
	WebElement sabtButton;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[2]/app-therapist-single/div[1]/div[1]/div/div[2]")
	WebElement trapistRefreshButton;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[2]/app-therapist-single/div[1]/div[1]/div/div[1]")
	WebElement trapistsearchButton;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/form/div[1]/div/div/div[2]")
	WebElement assistantRefreshButton;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-assistant/div/div/div[3]/app-assistant/form/div[1]/div/div/div[1]")
	WebElement assistsntsearchButton;



    

    


    
    public void AddAssistantToTrapist ( WebDriver driver ) throws InterruptedException {
    	
		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();
    	
    	
	    //choose trapist
    	eh.highlightElement(driver, trapistsearchButton);
    	action.click(trapistsearchButton).perform();
		eh.unhighlightLast(driver, trapistsearchButton);
		Thread.sleep(1000);
    	eh.highlightElement(driver, trapistCheckbox);
    	action.click(trapistCheckbox).perform();
		eh.unhighlightLast(driver, trapistCheckbox);
		Thread.sleep(1000);
		//choose Assistsnt
    	eh.highlightElement(driver, assistsntsearchButton);
    	action.click(assistsntsearchButton).perform();
		eh.unhighlightLast(driver, assistsntsearchButton);
		Thread.sleep(1000);

		//choose $ get Assistsnt
		AssistantName= assistantName.getText();
    	eh.highlightElement(driver, assistantCheckbox);
    	action.click(assistantCheckbox).perform();
		eh.unhighlightLast(driver, assistantCheckbox);
		//choose $ get Assistsnt2
		Thread.sleep(2000);
		AssistantName2= assistantName2.getText();
    	eh.highlightElement(driver, assistantCheckbox2);
    	action.click(assistantCheckbox2).perform();
		eh.unhighlightLast(driver, assistantCheckbox2);
		Thread.sleep(1000);
		action
		.click(assistantCombo2)
		.sendKeys(Keys.DOWN)
		.sendKeys(Keys.ENTER)
		.perform();
		Thread.sleep(1000);
		//choose $ get Assistsnt3
		AssistantName3= assistantName3.getText();
    	eh.highlightElement(driver, assistantCheckbox3);
    	action.click(assistantCheckbox3).perform();
		eh.unhighlightLast(driver, assistantCheckbox3);
		Thread.sleep(1000);
		action
		.click(assistantCombo3)
		.sendKeys(Keys.DOWN)
		.sendKeys(Keys.DOWN)
		.sendKeys(Keys.ENTER)
		.perform();
		Thread.sleep(1000);
		//sabt
    	eh.highlightElement(driver, sabtButton);
    	sabtButton.click();
	    eh.unhighlightLast(driver, sabtButton);
	    //SuccecfulAddMessage
	    WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container/simple-snack-bar"));
	    eh.highlightElement(driver, POPUP);
	    Thread.sleep(1000);
	    String c= POPUP.getText();
	    System.out.print("resulte:"+c);
	    Assert.assertEquals(c,"ثبت با موفقیت انجام شد\n"
	    		+ "x");

	    eh.unhighlightLast(driver, POPUP);

	    
	    //check sabt Assistant
    	action.click(trapistCheckbox).perform();
		Thread.sleep(1000);
        WebElement addedAssistant=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[2]/app-clinic-single/div/div[2]/div[2]/div/div[1]/div/div/div/div/span"));
	    eh.highlightElement(driver, addedAssistant);
		Thread.sleep(1000);
		AssistantNameAdded=addedAssistant.getText();
        Assert.assertTrue(AssistantNameAdded.contains(AssistantName));
	    //check sabt Assistant2
		Thread.sleep(1000);
        WebElement addedAssistant2=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[2]/app-clinic-single/div/div[2]/div[2]/div/div[1]/div/div/div/div[2]/span"));
	    eh.highlightElement(driver, addedAssistant);
		Thread.sleep(1000);
		AssistantNameAdded2=addedAssistant2.getText();
        Assert.assertTrue(AssistantNameAdded.contains(AssistantName2));
	    //check sabt Assistant3
        WebElement addedAssistant3=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[2]/app-clinic-single/div/div[2]/div[2]/div/div[1]/div/div/div/div/span"));
	    eh.highlightElement(driver, addedAssistant);
		Thread.sleep(1000);
		AssistantNameAdded3=addedAssistant3.getText();
        Assert.assertTrue(AssistantNameAdded3.contains(AssistantName3));
        action.click(assistantRefreshButton).perform();
	}
    

    public void Search_three_letter_trapist ( WebDriver driver ) throws InterruptedException {
		Actions action = new Actions(driver);
  	element_Highlight eh= new element_Highlight();

  	 
  	//get name
		eh.highlightElement(driver, trapistsearchButton);
		action.click(trapistsearchButton).perform();
		eh.unhighlightLast(driver, trapistsearchButton);
  	    eh.highlightElement(driver, trapistName);
		Thread.sleep(1000);
     	TrapistName= trapistName.getText();
		Thread.sleep(500);
		eh.unhighlightLast(driver, trapistName);
		action.click(trapistRefreshButton);
		
		 //split trapist name
		String substrings[] = TrapistName.split(" "); 
		
		TrapistFirstName=substrings[0];
		TrapistLastName=substrings[1];
		
 	    //search name
		String threeN = TrapistFirstName.substring(0, 2);
		action.click(trapistNameSearch).perform();
		action.sendKeys(threeN).perform();
		eh.highlightElement(driver, trapistsearchButton);
		action.click(trapistsearchButton).perform();
		eh.unhighlightLast(driver, trapistsearchButton);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistName.contains(TrapistFirstName));
		trapistNameSearch.clear();
		action.click(trapistRefreshButton).perform();
		Thread.sleep(1000);

		
		//search Family
		eh.highlightElement(driver, trapistsearchButton);
		action.click(trapistsearchButton).perform();
		eh.unhighlightLast(driver, trapistsearchButton);
		Thread.sleep(1000);
	    threeN = TrapistLastName.substring(0, 2);
		action.click(trapistFamilySearch).perform();
		action.sendKeys(threeN).perform();
		eh.highlightElement(driver, trapistsearchButton);
		action.click(trapistsearchButton).perform();
		eh.unhighlightLast(driver, trapistsearchButton);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistName.contains(TrapistLastName));
		action.click(trapistRefreshButton).perform();

	
   } 
    
        public void Search_trapist_code ( WebDriver driver ) throws InterruptedException {
		Actions action = new Actions(driver);
  	    element_Highlight eh= new element_Highlight();
  	
  	    //get Code
		eh.highlightElement(driver, trapistsearchButton);
		action.click(trapistsearchButton).perform();
		eh.unhighlightLast(driver, trapistsearchButton);
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
		eh.highlightElement(driver, trapistsearchButton);
		action.click(trapistsearchButton).perform();
		eh.unhighlightLast(driver, trapistsearchButton);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistCodeWithTitle.contains(TrapistCode));
		trapistNameSearch.clear();
		  	
    }
        public void Search_three_letter_assistant ( WebDriver driver ) throws InterruptedException {
        	
    		Actions action = new Actions(driver);
    	  	element_Highlight eh= new element_Highlight();

    	  	 
    	  	//get name
    			eh.highlightElement(driver, assistsntsearchButton);
    			action.click(assistsntsearchButton).perform();
    			eh.unhighlightLast(driver, assistsntsearchButton);
    	  	    eh.highlightElement(driver, assistantName);
    			Thread.sleep(1000);
    			AssistantNameSRC= assistantName.getText();
    			Thread.sleep(500);
    			eh.unhighlightLast(driver, assistantName);
    			action.click(trapistRefreshButton);
    			
    			 //split trapist name
    			String substrings[] = AssistantNameSRC.split(" "); 
    			
    			AssistantFirstName=substrings[0];
    			AssistantLastName=substrings[1];
    			
    	 	    //search name
    			String threeN = AssistantFirstName.substring(0, 2);
    			action.click(assistantNameSearch).perform();
    			action.sendKeys(threeN).perform();
    			eh.highlightElement(driver, assistsntsearchButton);
    			action.click(assistsntsearchButton).perform();
    			eh.unhighlightLast(driver, assistsntsearchButton);
    			Thread.sleep(1000);
    			Assert.assertTrue(AssistantNameSRC.contains(AssistantFirstName));
    			trapistNameSearch.clear();
    			action.click(assistantRefreshButton).perform();
    			Thread.sleep(1000);

    			
    			//search Family
    			eh.highlightElement(driver, assistsntsearchButton);
    			action.click(assistsntsearchButton).perform();
    			eh.unhighlightLast(driver, assistsntsearchButton);
    			Thread.sleep(1000);
    		    threeN = AssistantLastName.substring(0, 2);
    			action.click(assistantFamilySearch).perform();
    			action.sendKeys(threeN).perform();
    			eh.highlightElement(driver, assistsntsearchButton);
    			action.click(assistsntsearchButton).perform();
    			eh.unhighlightLast(driver, assistsntsearchButton);
    			Thread.sleep(1000);
    			Assert.assertTrue(AssistantNameSRC.contains(AssistantLastName));
    			action.click(assistantRefreshButton).perform();

        }
      
}

