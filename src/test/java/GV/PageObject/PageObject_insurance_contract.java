package GV.PageObject;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_insurance_contract {

	  element_Highlight eh= new element_Highlight();

	  @FindBy(xpath="//mat-icon[text()='add']")
	   WebElement Pluse;

	  @FindBy(xpath="//mat-select[@name='contract']")
	   WebElement ChooseContract;
	  
	  @FindBy(xpath="//mat-select[@name='modelMohasebati']")
	  WebElement ChooseModel;
	  
	  	  @FindBy(xpath="(//button[@type='button'   and @aria-label='Open calendar' ])[1]")
	  WebElement StartDate;
	  
	  	  	  @FindBy(xpath="(//button[@type='button'   and @aria-label='Open calendar' ])[2]")
	  WebElement EndDate;

	  	  @FindBy(xpath="//mat-checkbox[@name='darsadMoteghayer']")
	  WebElement CheckboxDarsadmoteghayer;

	  	  @FindBy(xpath="//button[@type='submit' and text()='افزودن']")
	  WebElement AddButton;

	  	  @FindBy(xpath="//button[@type='button' and @mattooltip='انصراف']")
	  WebElement RefreshPluse;

	  	  	  @FindBy(xpath="//input[@formcontrolname='rrofePatientShear']")
	  WebElement HerfeyiPatientShear;
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='rrofeInsurShare']")
	  WebElement HerfeyiInsurShear;
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='rrofeFeranshiz']")
	  WebElement HerfeyiFeranshiz;
	  
	  	  	  @FindBy(xpath="//mat-checkbox[@formcontrolname='isRrofeFixed']")
	  WebElement CheckboxisRrofeFixed;
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='technicalPatientShear']")
	  WebElement TechnicalPatientShear;
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='technicalInsurShare']")
	  WebElement TechnicalInsurShare;
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='technicalFeranshiz']")
	  WebElement TechnicalFeranshiz;
	  
	  	  	  @FindBy(xpath="//mat-checkbox[@formcontrolname='isTechnicalFixed']")
	  WebElement CheckboxisTechnicalFixed;

	  	  	  @FindBy(xpath="//mat-checkbox[@formcontrolname='isActiveDiference']")
	  WebElement CheckboxActiveDiference;
	  
	  	  	  @FindBy(xpath="//mat-select[@formcontrolname='diferenceKTypeID']")
	  WebElement DiferenceTariffType;
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='patientDiference']")
	  WebElement PatientDiference;
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='insurDiference']")
	  WebElement InsurDiference;
	  
	  	     @FindBy(xpath="//mat-checkbox[@formcontrolname='isExteraFixed']")
	  WebElement CheckboxisExteraFixed;

	  	  	  @FindBy(xpath="//input[@formcontrolname='exteraKInsurShare']")
	  WebElement ExteraKInsurShare;
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='extraKFranshiz']")
	  WebElement ExtraKFranshiz;
	  
	  	  	  @FindBy(xpath="//input[@formcontrolname='drugInsurShare']")
	  WebElement DrugInsurShare;
	  
	  		  @FindBy(xpath="//input[@formcontrolname='drugFranshizShare']")
	  WebElement DrugFranshizShare;



	  
	  	   public void AddInsuranceContract ( WebDriver driver ,String Contract ,String model ,String herfeyiPatientShear ,String herfeyiInsurShear, String herfeyiFeranshiz, String technicalPatientShear,String technicalInsurShare, String technicalFeranshiz, String tariff, String patientDiference, String insurDiference,String exteraKInsurShare,String extraKFranshiz,String drugInsurShare,String drugFranshizShare,String Contract2,String model2,String herfeyiPatientShear2,String herfeyiInsurShear2,String herfeyiFeranshiz2,String technicalPatientShear2,String technicalInsurShare2,String technicalFeranshiz2,String tariff2,String patientDiference2,String insurDiference2,String exteraKInsurShare2,String extraKFranshiz2,String drugInsurShare2,String drugFranshizShare2) throws InterruptedException {
		   Actions action = new Actions(driver);
		   
		   action
		   .click(Pluse).perform();
		   Thread.sleep(1000);
		   
		   
		   action
		   .click(ChooseContract).perform();
		   Thread.sleep(1000);
		   

		   
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000);
		   
		   System.out.println("samane");
		   
		   action.sendKeys(Keys.TAB).perform();
		   action
		   .click(ChooseModel).perform();
		   Thread.sleep(1000);
		   
		   System.out.println("samane");

		   
		   action
		   .sendKeys(model).perform();
   		   Thread.sleep(500);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   		   Thread.sleep(500);
		   		   
		   System.out.println("samane");

		   action
		   .click(StartDate).perform();
		   		   Thread.sleep(1000);

		   
		   		   WebElement OpenYear= driver.findElement(By.xpath("//button[@cdkarialive='polite']"));
		   
		  action
		  .click(OpenYear).perform();
		  		   Thread.sleep(2000);

		  
		  		    WebElement ChoosePeresentYear= driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[text()]"));
		   action
		  .click(ChoosePeresentYear).perform();
		  		   Thread.sleep(2000);

	    
	    		      WebElement ChooseMonth= driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[text()]"));

	      action
	      .moveToElement(ChooseMonth).perform();
 		   Thread.sleep(1000);
           action
		  .click(ChooseMonth).perform();
		  		   Thread.sleep(2000);

		  
		  	    	  WebElement ChooseDay= driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[text()]"));

	      action
		  .click(ChooseDay).perform();
		  		   Thread.sleep(2000);
		  		   
		  action
		  .click(HerfeyiPatientShear)
		  .sendKeys(herfeyiPatientShear)
		  .click(HerfeyiInsurShear)
		  .sendKeys(herfeyiInsurShear)
		  .click(HerfeyiFeranshiz)
		  .sendKeys(herfeyiFeranshiz).perform();
		  		   Thread.sleep(1000);

		  action
		  .click(TechnicalPatientShear)
		  .sendKeys(technicalPatientShear)
		  .click(TechnicalInsurShare)
		  .sendKeys(technicalInsurShare)
		  .click(TechnicalFeranshiz)
		  .sendKeys(technicalFeranshiz).perform();
		  		   Thread.sleep(1000);
		  		   

		   action
		  .click(CheckboxActiveDiference).perform();
		  		  		   Thread.sleep(500);
		  	action
		  	.click(DiferenceTariffType).perform();
		  		  		   Thread.sleep(500);
		  	action
		  	.sendKeys(tariff)
		  	.sendKeys(Keys.ENTER).perform();
		  			  	  Thread.sleep(500);
		  	action
		  	.click(PatientDiference)
		  	.sendKeys(patientDiference)
		  	.click(InsurDiference)
		  	.sendKeys(insurDiference).perform();
		  		   Thread.sleep(1000);

		   	action
		  	.click(ExteraKInsurShare)
		  	.sendKeys(exteraKInsurShare)
		  	.click(ExtraKFranshiz)
		  	.sendKeys(extraKFranshiz).perform();
		  		   Thread.sleep(1000);

		   	action
		  	.click(DrugInsurShare)
		  	.sendKeys(drugInsurShare)
		  	.click(DrugFranshizShare)
		  	.sendKeys(drugFranshizShare).perform();
		  		   Thread.sleep(1000);
		  		   
		  	action
		  	.click(AddButton).perform();
	  		   Thread.sleep(500);


			   WebElement POPUP =driver.findElement(By.xpath("//div[@role='alertdialog']"));
			   Thread.sleep(500);
			   String c=POPUP.getText();
		       Assert.assertTrue(c.contains("موفقیت"));
               eh.highlightElement(driver,POPUP); 

			   Thread.sleep(1000);
			   
			   
			   //ثبت قرارداد دوم
			   
			   action
			   .click(ChooseContract).perform();
			   Thread.sleep(1000);
			   

			   
			   action
			   .sendKeys(Contract2)
			   .sendKeys(Keys.DOWN).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   Thread.sleep(1000);
			   
			   System.out.println("samane");
			   
			   action.sendKeys(Keys.TAB).perform();
			   action
			   .click(ChooseModel).perform();
			   Thread.sleep(1000);
			   
			   System.out.println("samane");

			   
			   action
			   .sendKeys(model2).perform();
	   		   Thread.sleep(500);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   		   Thread.sleep(500);
			   		   
			   System.out.println("samane");

			   action
			   .click(StartDate).perform();
			   		   Thread.sleep(1000);

			   
			   		   WebElement OpenYear2= driver.findElement(By.xpath("//button[@cdkarialive='polite']"));
			   
			  action
			  .click(OpenYear2).perform();
			  		   Thread.sleep(2000);

			  
			  		    WebElement ChoosePeresentYear2= driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[text()]"));
			   action
			  .click(ChoosePeresentYear2).perform();
			  		   Thread.sleep(2000);

		    
		    		      WebElement ChooseMonth2= driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[text()]"));

		      action
		      .moveToElement(ChooseMonth2).perform();
	 		   Thread.sleep(1000);
	           action
			  .click(ChooseMonth2).perform();
			  		   Thread.sleep(2000);

			  
			  	    	  WebElement ChooseDay2= driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[text()]"));

		      action
			  .click(ChooseDay2).perform();
			  		   Thread.sleep(2000);
			  		   
			  action
			  .click(HerfeyiPatientShear)
			  .sendKeys(herfeyiPatientShear2)
			  .click(HerfeyiInsurShear)
			  .sendKeys(herfeyiInsurShear2)
			  .click(HerfeyiFeranshiz)
			  .sendKeys(herfeyiFeranshiz2).perform();
			  		   Thread.sleep(1000);

			  action
			  .click(TechnicalPatientShear)
			  .sendKeys(technicalPatientShear2)
			  .click(TechnicalInsurShare)
			  .sendKeys(technicalInsurShare2)
			  .click(TechnicalFeranshiz)
			  .sendKeys(technicalFeranshiz2).perform();
			  		   Thread.sleep(1000);
			  		   

			   action
			  .click(CheckboxActiveDiference).perform();
			  		  		   Thread.sleep(500);
			  	action
			  	.click(DiferenceTariffType).perform();
			  		  		   Thread.sleep(500);
			  	action
			  	.sendKeys(tariff)
			  	.sendKeys(Keys.ENTER).perform();
			  			  	  Thread.sleep(500);
			  	action
			  	.click(PatientDiference)
			  	.sendKeys(patientDiference2)
			  	.click(InsurDiference)
			  	.sendKeys(insurDiference2).perform();
			  		   Thread.sleep(1000);

			   	action
			  	.click(ExteraKInsurShare)
			  	.sendKeys(exteraKInsurShare2)
			  	.click(ExtraKFranshiz)
			  	.sendKeys(extraKFranshiz2).perform();
			  		   Thread.sleep(1000);

			   	action
			  	.click(DrugInsurShare)
			  	.sendKeys(drugInsurShare2)
			  	.click(DrugFranshizShare)
			  	.sendKeys(drugFranshizShare2).perform();
			  		   Thread.sleep(1000);
			  		   
			  	action
			  	.click(AddButton).perform();
		  		   Thread.sleep(500);


				   WebElement POPUP2 =driver.findElement(By.xpath("//div[@role='alertdialog']"));
				   Thread.sleep(500);
				   String c2=POPUP2.getText();
			       Assert.assertTrue(c2.contains("موفقیت"));
	               eh.highlightElement(driver,POPUP2); 

				   Thread.sleep(500);

	}
	
		  	   public void EditInsuranceContract ( WebDriver driver ,String Contract ,String model ,String herfeyiPatientShear ,String herfeyiInsurShear, String herfeyiFeranshiz, String technicalPatientShear,String technicalInsurShare, String technicalFeranshiz, String tariff, String patientDiference, String insurDiference,String exteraKInsurShare,String extraKFranshiz,String drugInsurShare,String drugFranshizShare) throws InterruptedException {
		  	       
		  	       
		   Actions action = new Actions(driver);
		   
		   action
		   .click(Pluse).perform();
		   Thread.sleep(1000);

		   
		      		      WebElement EditButtonTr1=driver.findElement(By.xpath("//tbody/tr[1]/td[19]/button"));

		   action
		   .click(EditButtonTr1).perform();
		    Thread.sleep(500);
		  	  		   
		   action
		   .click(ChooseContract).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Contract)
		   .sendKeys(Keys.DOWN).perform();		   Thread.sleep(1000);

		   action
		   .sendKeys(Keys.DOWN).perform();		   Thread.sleep(1000);

		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000);
		   
		   action.sendKeys(Keys.TAB).perform();
		   Thread.sleep(500);


		   	action
		   .click(ChooseModel).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(model).perform();		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER).perform();
		    Thread.sleep(500);
		   	
		   action
		   .click(StartDate).perform();
		   	Thread.sleep(1000);

		   
		   		   WebElement OpenYear= driver.findElement(By.xpath("//button[@cdkarialive='polite']"));
		   
		  action
		  .click(OpenYear).perform();
		  		   Thread.sleep(1000);

		  
		  		    WebElement ChoosePeresentYear= driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[text()]"));
		   action
		  .click(ChoosePeresentYear).perform();
		  		   Thread.sleep(1000);

	    
	    		      WebElement ChooseMonth= driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[text()]"));

	      action
		  .click(ChooseMonth).perform();
		  		   Thread.sleep(1000);

		  
		  	    	  WebElement ChooseDay= driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[text()]"));

	      action
		  .click(ChooseDay).perform();
		  		   Thread.sleep(1000);
		  		   
		  action
		  .click(HerfeyiPatientShear).perform();
		  HerfeyiPatientShear.clear();
		   action
		  .click(HerfeyiPatientShear)
		  .sendKeys(herfeyiPatientShear).perform();
		  
		  action
		  .click(HerfeyiInsurShear).perform();
		  HerfeyiInsurShear.clear();
		   action
		  .click(HerfeyiInsurShear)
		  .sendKeys(herfeyiInsurShear).perform();
		  
		  action
		  .click(HerfeyiFeranshiz).perform();
		  HerfeyiFeranshiz.clear();
		   action
		  .click(HerfeyiFeranshiz)
		  .sendKeys(herfeyiFeranshiz).perform();
		  		   Thread.sleep(1000);

		  action
		  .click(TechnicalPatientShear).perform();
		  TechnicalPatientShear.clear();
		  action
		  .click(TechnicalPatientShear)
		  .sendKeys(technicalPatientShear).perform();
		  		  	  Thread.sleep(1000);

		  action
		  .click(TechnicalInsurShare).perform();
		  TechnicalInsurShare.clear();
		  action
		  .click(TechnicalInsurShare)
		  .sendKeys(technicalInsurShare).perform();
		  		   Thread.sleep(1000);

		  action
		  .click(TechnicalFeranshiz).perform();
		  TechnicalFeranshiz.clear();
		  action
		  .click(TechnicalFeranshiz)
		  .sendKeys(technicalFeranshiz).perform();
		  		   Thread.sleep(1000);
		  		   

		  	action
		  	.click(DiferenceTariffType).perform();
		  		  		   Thread.sleep(500);
		  	action
		  	.sendKeys(tariff)
		  	.sendKeys(Keys.ENTER).perform();
		  			  	  Thread.sleep(500);
		  	action
		  	.click(PatientDiference).perform();
		  	PatientDiference.clear();
		   	action
		  	.click(PatientDiference)
		  	.sendKeys(patientDiference).perform();
		  		   Thread.sleep(500);

		  	
		  	action
		  	.click(InsurDiference).perform();
		  	InsurDiference.clear();
		 	action
		  	.click(InsurDiference)
		  	.sendKeys(insurDiference).perform();
		  		   Thread.sleep(500);

		   	action
		  	.click(ExteraKInsurShare).perform();
		  	ExteraKInsurShare.clear();
		  	action
		  	.click(ExteraKInsurShare)
		  	.sendKeys(exteraKInsurShare).perform();
		  	 		   Thread.sleep(500);

		  	action
		  	.click(ExtraKFranshiz).perform();
		  	ExtraKFranshiz.clear();
		 	 action
		  	.click(ExtraKFranshiz)
		  	.sendKeys(extraKFranshiz).perform();
		  	 	   Thread.sleep(500);

		   	action
		  	.click(DrugInsurShare).perform();
		  	DrugInsurShare.clear();
		   	action
		  	.click(DrugInsurShare)
		  	.sendKeys(drugInsurShare).perform();
		  			   Thread.sleep(500);

		  	action
		  	.click(DrugFranshizShare).perform();
		  	DrugFranshizShare.clear();
		 	action
		  	.click(DrugFranshizShare)
		  	.sendKeys(drugFranshizShare).perform();
		  	 	   Thread.sleep(500);
		  	 	   
          WebElement EditButton=driver.findElement(By.xpath("//button[text()='ویرایش']"));

		  		   
		  	action
		  	.click(EditButton).perform();
		  		   Thread.sleep(2000);


              WebElement PopUp=driver.findElement(By.xpath("//div[@role='alertdialog']"));
              String alert=PopUp.getText();
              Assert.assertTrue(alert.contains("موفقیت"));
   		      eh.highlightElement(driver,PopUp); 
   		      
   		      action
   		      .click()
   		      .sendKeys(Keys.PAGE_DOWN).perform();
   		      		  		   Thread.sleep(1000);
   		      		  		   
   		      WebElement ContractName=driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
              String td2=ContractName.getText();
              System.out.println(td2);
              Assert.assertTrue(td2.contains(Contract));
              System.out.println(td2);
   		      eh.highlightElement(driver,ContractName);
              System.out.println(td2);

   		      
   		      WebElement Model=driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
              String td3=Model.getText();
              Assert.assertEquals(td3 , model);
   		      eh.highlightElement(driver,Model); 
   		      
   		      WebElement pp=driver.findElement(By.xpath("//tbody/tr[1]/td[5]"));
              String td5=pp.getText();
              Assert.assertTrue(td5.contains(herfeyiPatientShear));
   		      eh.highlightElement(driver,pp); 

   		      WebElement pi=driver.findElement(By.xpath("//tbody/tr[1]/td[6]"));
              String td6=pi.getText();
              Assert.assertTrue(td6.contains(herfeyiInsurShear));
   		      eh.highlightElement(driver,pi); 

   		      WebElement pf=driver.findElement(By.xpath("//tbody/tr[1]/td[7]"));
              String td7=pf.getText();
              Assert.assertTrue(td7.contains(herfeyiFeranshiz));
   		      eh.highlightElement(driver,pf); 

   		      WebElement tp=driver.findElement(By.xpath("//tbody/tr[1]/td[8]"));
              String td8=tp.getText();
              Assert.assertTrue(td8.contains(technicalPatientShear));
   		      eh.highlightElement(driver,tp); 

   		      WebElement ti=driver.findElement(By.xpath("//tbody/tr[1]/td[9]"));
              String td9=ti.getText();
              Assert.assertTrue(td9.contains(technicalInsurShare));
   		      eh.highlightElement(driver,ti); 

   		      WebElement tf=driver.findElement(By.xpath("//tbody/tr[1]/td[10]"));
              String td10=tf.getText();
              Assert.assertTrue(td10.contains(technicalFeranshiz));
   		      eh.highlightElement(driver,tf); 

   		      WebElement dp=driver.findElement(By.xpath("//tbody/tr[1]/td[11]"));
              String td11=dp.getText();
              Assert.assertTrue(td11.contains(patientDiference));
   		      eh.highlightElement(driver,dp); 

   		      WebElement di=driver.findElement(By.xpath("//tbody/tr[1]/td[12]"));
              String td12=di.getText();
              Assert.assertTrue(td12.contains(insurDiference));
   		      eh.highlightElement(driver,di); 

   		      WebElement ei=driver.findElement(By.xpath("//tbody/tr[1]/td[13]"));
              String td13=ei.getText();
              Assert.assertTrue(td13.contains(exteraKInsurShare));
   		      eh.highlightElement(driver,ei); 

   		      WebElement ef=driver.findElement(By.xpath("//tbody/tr[1]/td[14]"));
              String td14=ef.getText();
              Assert.assertTrue(td14.contains(extraKFranshiz));
   		      eh.highlightElement(driver,ef); 

   		      WebElement dri=driver.findElement(By.xpath("//tbody/tr[1]/td[15]"));
              String td15=dri.getText();
              Assert.assertTrue(td15.contains(drugInsurShare));
   		      eh.highlightElement(driver,dri); 
   		      
   		      WebElement drf=driver.findElement(By.xpath("//tbody/tr[1]/td[16]"));
              String td16=drf.getText();
              Assert.assertTrue(td16.contains(drugFranshizShare));
   		      eh.highlightElement(driver,drf); 

		  	   	  	  		   
		  	  		   
}
}
