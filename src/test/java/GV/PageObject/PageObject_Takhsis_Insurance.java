package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cis.cispackage.element_Highlight;

public class PageObject_Takhsis_Insurance {

	  element_Highlight eh= new element_Highlight();

	  @FindBy(xpath="//button[@data-toggle='collapse']")
	   WebElement Collapse;
	   
	   	  @FindBy(xpath="//button[@mattooltip='Ø°Ø®ÛŒØ±Ù‡']")
	   WebElement Save;


//Ù„ÛŒØ³Øª Ø¨ÛŒÙ…Ù‡ Ùˆ Ùˆ ØµÙ†Ø¯ÙˆÙ‚


	  @FindBy(xpath="(//button[@mattooltip='Ø¨Ø§Ø±Ú¯Ø°Ø§Ø±ÛŒ Ù…Ø¬Ø¯Ø¯'])[1]")
	   WebElement RefreshInsuranceList;
	  
	  @FindBy(xpath="(//button[@type='submit'])[1]")
	  WebElement SearchInsuranceList;
	  
	  	  @FindBy(xpath="//input[@formcontrolname='InsuranceName1']")
	  WebElement InputSearchInsuranceList;
	  
	  	  	  @FindBy(xpath="(//tbody/tr)[1]")
	  WebElement TR1Insurance;

	  	  @FindBy(xpath="(//tbody/tr/td)[1]")
	  WebElement TR1TD1Insurance;
	  
	  //Ù„ÛŒØ³Øª Ù‚Ø±Ø§Ø±Ø¯Ø§Ø¯
	  
	  	  @FindBy(xpath="(//button[@mattooltip='Ø¨Ø§Ø±Ú¯Ø°Ø§Ø±ÛŒ Ù…Ø¬Ø¯Ø¯'])[2]")
	   WebElement RefreshContractList;
	  
	  @FindBy(xpath="(//button[@type='submit'])[2]")
	  WebElement SearchContractList;


	    @FindBy(xpath="//mat-select[@formcontrolname='ContractName2']")
	  WebElement ChooseContract1;

	  	 @FindBy(xpath="//mat-select[@formcontrolname='Tariff2']")
	  WebElement ChooseTariff1;

	  	 @FindBy(xpath="//mat-select[@formcontrolname='ModelMohasebati2']")
	  WebElement ChooseModel1;
	  
	  	 @FindBy(xpath="(//tbody)[2]/tr")
	  WebElement TR1Contract;

	    @FindBy(xpath="(//tbody)[2]/tr[1]/td[1]")
	  WebElement TR1TD1Contract;
	  
	    @FindBy(xpath="(//tbody)[2]/tr[2]/td[1]")
	  WebElement TR2TD1Contract;


	  
	    @FindBy(xpath="(//tbody/tr/td[2]/following::input)[2]")
	  WebElement TR1TD1ContractCheckbox;
	  
	    @FindBy(xpath="(//tbody/tr[2]/td[2]/following::input)[2]")
	  WebElement TR2TD1ContractCheckbox;
	  
	  //Ù„ÛŒØ³Øª  Ù‚Ø±Ø§Ø±Ø¯Ø§Ø¯Ù‡Ø§ÛŒ ØªØ®ØµÛŒØµ Ø¯Ø§Ø¯Ù‡ Ø´Ø¯Ù‡
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='InsuranceName3']")
	  WebElement InputSearchInsuranceList2;

	  	  @FindBy(xpath="(//button[@mattooltip='Ø¨Ø§Ø±Ú¯Ø°Ø§Ø±ÛŒ Ù…Ø¬Ø¯Ø¯'])[3]")
	   WebElement RefreshContractList2;
	  
	  @FindBy(xpath="(//button[@type='submit'])[3]")
	  WebElement SearchContractList2;


	  	  @FindBy(xpath="//mat-select[@formcontrolname='ContractName3']")
	  WebElement ChooseContract2;

	  	  @FindBy(xpath="//mat-select[@formcontrolname='Tariff3']")
	  WebElement ChooseTariff2;

	  	  	  @FindBy(xpath="//mat-select[@formcontrolname='ModelMohasebati3']")
	  WebElement ChooseModel2;





	  
	  	   public void SerachInsuranceList ( WebDriver driver ) throws InterruptedException {
		   Actions action = new Actions(driver);
		   
		   action
		   .click(Collapse).perform();
		   		   Thread.sleep(1000);

		   
		   //Ø³Ø±Ú† Ø¨ÛŒÙ…Ù‡ Ø§ÙˆÙ„
		   WebElement Tr3= driver.findElement(By.xpath("(//tbody/tr[3]/td)[1]"));
		   
		   
		   String tr3= Tr3.getText();
		   
		   action
		   .click(InputSearchInsuranceList)
		   .sendKeys(tr3)
		   .click(SearchInsuranceList)
		   .perform();
		   Thread.sleep(1000);
		   
		    WebElement Tr1= driver.findElement(By.xpath("(//tbody/tr[1]/td)[1]"));

		     String tr1= Tr1.getText();

		        Assert.assertEquals(tr1 , tr3);
 		      eh.highlightElement(driver,Tr1); 
 		      		    Thread.sleep(2000);

 		 //Ø±Ù�Ø±Ø´ Ù„ÛŒØ³Øª
 		 
 		 action
 		 .click(RefreshInsuranceList)
		 .perform();
		    Thread.sleep(500);

 		      
 		      
 		 //Ø³Ø±Ú†  Ø¨ÛŒÙ…Ù‡ Ø¯ÙˆÙ…
 		 
 		 		   WebElement Tr5= driver.findElement(By.xpath("(//tbody/tr[5]/td)[1]"));

 		      		   String tr5= Tr5.getText();
		   
		   action
		   .click(InputSearchInsuranceList)
		   .sendKeys(tr5)
		   .click(SearchInsuranceList)
		   .perform();
		   Thread.sleep(1000);
		   
		    WebElement Tr1_1= driver.findElement(By.xpath("(//tbody/tr[1]/td)[1]"));

		     String tr1_1= Tr1_1.getText();

		        Assert.assertEquals(tr1_1 , tr5);
 		      eh.highlightElement(driver,Tr1_1); 
 		      		    Thread.sleep(1000);

 		      

		   
	}
	
		  	   public void SearchContractList ( WebDriver driver ) throws InterruptedException {
		  	       
		  	       
		   Actions action = new Actions(driver);
		   
		    action
		   .click(Collapse).perform();
		   		   Thread.sleep(1000);

		   
		   //Ø³Ø±Ú† Ù‚Ø±Ø§Ø±Ø¯Ø§Ø¯ Ø¨Ø± Ø§Ø³Ø§Ø³ Ù…Ø¯Ù„
		   
		   WebElement Tr1TD3= driver.findElement(By.xpath("(//tbody)[2]/tr/td[3]"));
		   
		   String tr1td3=Tr1TD3.getText();

		   action
		   .click(ChooseModel1).perform();
		    Thread.sleep(500);
		    
		    action
		   .sendKeys(tr1td3).perform();
		    Thread.sleep(1000);
		    
		    action
		   .sendKeys(Keys.ENTER).perform();
		    Thread.sleep(1000);
		    
		    
		   action
		   .click(SearchContractList).perform();
		    Thread.sleep(1000);
		  
		   WebElement Tr1TD3_2= driver.findElement(By.xpath("(//tbody)[2]/tr/td[3]"));
		   String tr1td3_2=Tr1TD3_2.getText();

		        Assert.assertEquals(tr1td3_2 , tr1td3);
 		      eh.highlightElement(driver,Tr1TD3_2); 
 		      		    Thread.sleep(2000);
 		      		    
//Ø±Ù�Ø±Ø´ Ù„ÛŒØ³Øª
 		 
 		 action
 		 .click(RefreshContractList)
		 .perform();
		    Thread.sleep(500);

 		      		    
 		      		    
    // Ø³Ø±Ú† Ø¨Ø± Ø§Ø³Ø§Ø³ ØªØ¹Ø±Ù�Ù‡
    
    		   WebElement Tr2TD2= driver.findElement(By.xpath("(//tbody)[2]/tr[2]/td[2]"));
		   
		   String tr2td2=Tr2TD2.getText();

		   action
		   .click(ChooseTariff1).perform();
		    Thread.sleep(500);
		    
 		   
		   
		    action
		    .sendKeys(Keys.DOWN).perform();
		    Thread.sleep(1000);
		    
		    action
		   .sendKeys(Keys.ENTER).perform();
		    Thread.sleep(1000);
		    
		    
		   action
		   .click(SearchContractList).perform();
		    Thread.sleep(1000);
		  
		   WebElement Tr1TD2_2= driver.findElement(By.xpath("(//tbody)[2]/tr/td[2]"));
		   String tr1td2_2=Tr1TD2_2.getText();

		        Assert.assertEquals(tr1td2_2 , tr2td2);
 		      eh.highlightElement(driver,Tr1TD2_2); 
 		      		    Thread.sleep(1000);

}

	  	   public void AddeInsuranceAllocation ( WebDriver driver ,String insurance, String fromeDate , String toDate) throws InterruptedException {
	  	       
	  	       		   Actions action = new Actions(driver);

	  	       		    action
		   .click(Collapse).perform();
		   		   Thread.sleep(1000);
		   	//Ø§Ù†ØªØ®Ø§Ø¨ Ø¨ÛŒÙ…Ù‡	   
		   		   
		   	  action
		   .click(InputSearchInsuranceList)
		   .sendKeys(insurance)
		   .click(SearchInsuranceList)
		   .perform();
		   Thread.sleep(1000);

		     WebElement Tr1TD1= driver.findElement(By.xpath("(//tbody)[1]/tr/td[1]"));

	  	       		    action
		   .click(Tr1TD1).perform();
		   Thread.sleep(1000);
		   
		   // Ø§Ù†ØªØ®Ø§Ø¨ Ù‚Ø±Ø§Ø±Ø¯Ø§Ø¯
		   action
		   .click(TR2TD1ContractCheckbox).perform();
		   		   Thread.sleep(1000);
		   		   
		   		   String contract=TR2TD1Contract.getText();
		   		   
		   		   action
		   		 .click(Save).perform();
		   		   Thread.sleep(1500);
		   	//Ø¯Ø±Ø¬ ØªØ§Ø±ÛŒØ®	   
		   		   
			       WebElement FromeDate= driver.findElement(By.xpath("//input[@name='fromDate']"));
			       
			       action
			       .click(FromeDate)
			       		   .sendKeys(fromeDate).perform();
		   		   Thread.sleep(1000);
		   		   
			       WebElement ToDate= driver.findElement(By.xpath("//input[@name='toDate']"));
			       
			       action
			       .click(ToDate)
			       		   .sendKeys(toDate).perform();
		   		   Thread.sleep(1000);
		   		   
			       WebElement Sabt= driver.findElement(By.xpath("//button[text()='Ø«Ø¨Øª']"));
			       
		   		   action
		   		 .click(Sabt).perform();
		   		   Thread.sleep(1500);
		   		   
				   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
				   Thread.sleep(500);
				   String c=POPUP.getText();
			       Assert.assertTrue(c.contains("Ù…ÙˆÙ�Ù‚ÛŒØª"));
				   Thread.sleep(500);

}
}
