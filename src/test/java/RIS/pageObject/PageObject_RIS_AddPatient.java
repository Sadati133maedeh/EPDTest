package RIS.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cis.cispackage.element_Highlight;

public class PageObject_RIS_AddPatient {
	
	element_Highlight eh= new element_Highlight();

     WebDriver driver;


	
	   @FindBy(xpath="//input[@formcontrolname='name']")
	   WebElement NAME;
	   
	   @FindBy(xpath="//input[@formcontrolname='nameEn']")
	   WebElement NAMEEN;


	   @FindBy(xpath="//input[@formcontrolname='familyName']")
	   WebElement FAMILY;
	   
	   @FindBy(xpath="//input[@formcontrolname='familyEn']")
	   WebElement FAMILYEN;


	   @FindBy(xpath="//input[@formcontrolname='fatherName']")
	   WebElement FATHER;

	   @FindBy(xpath="//input[@formcontrolname='nationalCode']")
	   WebElement MELICODE;
	   
	   @FindBy(xpath="(//span[@title='clear'])[1]")
	   WebElement ClearMeliat;
	   
	   @FindBy(xpath="//label[@id='nationalityStatus']/following::input[1]")
	   WebElement MELIAT;


	   @FindBy(xpath="//input[@formcontrolname='passportNumber']")
	   WebElement PASSPORT;
	     

	   @FindBy(xpath="//*[@id=\\\"file\\\"]\"")
	   WebElement AVATAR;

	   @FindBy(xpath="//kendo-combobox[@formcontrolname='sex']/descendant::input")
	   WebElement SEX;

	   @FindBy(xpath="//input[@formcontrolname='birthDate']")
	   WebElement BIRTHDATE;
	   
	   @FindBy(xpath="//input[@id='myCheck' and @formcontrolname='outOfIranBirthPlace']")
	   WebElement OutOfIranBirthPlaceCheckBox;

	   @FindBy(xpath="//input[@formcontrolname='birthPlaceOut']")
	   WebElement BIRTHPLACE;

	   @FindBy(xpath="//kendo-combobox[@id='inputBirthPlace']/descendant::input")
	   WebElement MAHALTAVALOD;

	   @FindBy(xpath="//kendo-combobox[@formcontrolname='maritalStatus']/descendant::input")
	   WebElement TAHOL;
	   
	   @FindBy(xpath="(//span[@title='clear'])[5]")
	   WebElement CLEARCITY;

	   @FindBy(xpath="//kendo-combobox[@formcontrolname='cityCode']/descendant::input")
	   WebElement CITY;

	   @FindBy(xpath="//input[@formcontrolname='addressStr']")
	   WebElement ADRESS;

	   @FindBy(xpath="//input[@formcontrolname='telNo']")
	   WebElement PHONE;
	   
	   @FindBy(xpath="//input[@formcontrolname='phoneNO']")
	   WebElement TELPHONE;
	   
	   @FindBy(xpath="//input[@formcontrolname='zipCode']")
	   WebElement POST;

	   @FindBy(xpath="//input[@formcontrolname='email']")
	   WebElement EMAIL;

	   @FindBy(xpath="//kendo-combobox[@formcontrolname='lastInsurance']/descendant::input[1]")
	   WebElement BIME;
	   
	   @FindBy(xpath="//kendo-combobox[@formcontrolname='lastInsuranceKind']/descendant::input[1]")
	   WebElement SANDOGH;
	   
	   @FindBy(xpath="//input[@formcontrolname='insuranceNo']")
	   WebElement BIMECODE;

	   @FindBy(xpath="//input[@formcontrolname='lastInsuranceDate']")
	   WebElement BIMEDATE;

	   @FindBy(xpath="//kendo-combobox[@formcontrolname='insur_Relation']/descendant::input")
	   WebElement NESBAT;
	   
	   @FindBy(xpath="//input[@formcontrolname='oldId']")
	   WebElement 	OLDID;
	   
	   @FindBy(xpath="//input[@formcontrolname='comment']")
	   WebElement CASECOMMENT;

	   @FindBy(xpath="//button[@type='button']/span[text()='ثبت']")
	   WebElement SABT;
	   


	   
	   public void AddPersionPatient_AllFields (WebDriver driver, String Name ,String Family ,String NameEn,String FamilyEn,String Father,String Avatar,String Sex ,String Tahol ,String BirthDate ,String Mahaltavalod 
				  ,String City ,String Phone, String TelPhone, String Post,String Adress ,String Email ,String Bime ,String Sandogh ,String BimeDate ,String Nesbat,String Meliat,String OldId,String CaseComment) throws Throwable {
		   
			 Actions action = new Actions(driver);

		     //name
		     eh.highlightElement(driver, NAME);
		     action.click(NAME).perform();
		     action.sendKeys(Name).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, NAME);
			 
             //family
		     eh.highlightElement(driver, FAMILY);
		     action.click(FAMILY).perform();
			 action.sendKeys(Family).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, FAMILY);
			 
		     //name En
		     eh.highlightElement(driver, NAMEEN);
		     action.click(NAMEEN).perform();
		     action.sendKeys(NameEn).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, NAMEEN);

		     //family En
		     eh.highlightElement(driver, FAMILYEN);
		     action.click(FAMILYEN).perform();
		     action.sendKeys(FamilyEn).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, FAMILYEN);

			 
             //father name
		     eh.highlightElement(driver, FATHER);
		     action.click(FATHER).perform();
			 action.sendKeys(Father).perform();
		     Thread.sleep(2000);
			 eh.unhighlightLastB(driver, FATHER);
			 
//			 //meliat
//		     eh.highlightElement(driver, MELIAT);
//		     action.click(MELIAT).perform();
//		     action.click(ClearMeliat).perform();
//		     Thread.sleep(1000);
//			 action.sendKeys(Meliat).perform();
//		     Thread.sleep(2000);
//			 eh.unhighlightLastB(driver, MELIAT);

			 

			  //Avatar
			  WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"file\"]"));
			  upload_file.sendKeys(Avatar);
			  //upload_file.sendKeys("C:/Users/s.mollahasani/Desktop/CIS/mr2.png");
			  Thread.sleep(1000);

              //sex
			  eh.highlightElement(driver, SEX);
			  action.click(SEX).perform();
			  SEX.sendKeys(Sex);
			 // action.sendKeys(Sex).perform();
			  eh.unhighlightLast(driver, SEX);
    	      Thread.sleep(500);

			//TAHOL
		      eh.highlightElement(driver, TAHOL);
		      Thread.sleep(500);
		      action.click(TAHOL).perform();
		      action.sendKeys(Tahol).perform();
    		  eh.unhighlightLast(driver, TAHOL);
    	      Thread.sleep(500);


			  //tarikh tavalod
			  eh.highlightElement(driver, BIRTHDATE);
			  Thread.sleep(500);
			  BIRTHDATE.sendKeys(BirthDate);
		      eh.unhighlightLast(driver, BIRTHDATE);
		      
		      //mahal tavalod
		      eh.highlightElement(driver, MAHALTAVALOD);
		      Thread.sleep(500);
		      action.click(MAHALTAVALOD).perform();
		      action.sendKeys(Mahaltavalod).perform();
		 	  eh.unhighlightLast(driver, MAHALTAVALOD);
		 	  
    		  //clear city
    		  Thread.sleep(500);
    		  action.click(CLEARCITY).perform();
    	      Thread.sleep(500);

		 	  
		 	      		  
    		  //city
    		  eh.highlightElement(driver, CITY);
    		  Thread.sleep(500);
    		  action.click(CITY).perform();
    		  action.sendKeys(City).perform();
    	      eh.unhighlightLast(driver, CITY);
    	      Thread.sleep(500);

    	      
    	      //Phone
    	      int x= (int)(Math.random()*100000000);
    	     // WebElement PHONE= driver.findElement(By.name("telNo"));
    	      eh.highlightElement(driver, PHONE);
    	      Thread.sleep(500);
    	      PHONE.sendKeys("0935"+x);
    	      eh.unhighlightLastB(driver, PHONE);
    	      
    	      //TelPhone
    	      int y= (int)(Math.random()*100000000);
    	      eh.highlightElement(driver, TELPHONE);
    	      Thread.sleep(500);
    	      TELPHONE.sendKeys("021"+y);
    	      eh.unhighlightLastB(driver, TELPHONE);

    	      
    	      //Email
    	      //WebElement EMAIL= driver.findElement(By.name("EAddress"));
    	      eh.highlightElement(driver, EMAIL);
    	      Thread.sleep(500);
    	      EMAIL.sendKeys(Email);
    	      eh.unhighlightLastB(driver, EMAIL);
    	      
    	      //Post
    	      eh.highlightElement(driver, POST);
    	      Thread.sleep(500);
    	      POST.sendKeys(Post);
    	      eh.unhighlightLastB(driver, POST);

    	      
    	      //Adress
    	      eh.highlightElement(driver, ADRESS);
    	      Thread.sleep(500);
    	      ADRESS.sendKeys(Adress);
    	      eh.unhighlightLastB(driver, ADRESS);

    	      
    	      //Bime
    	      eh.highlightElement(driver, BIME);
    	      Thread.sleep(500);
    	      action.click(BIME).perform();
    	      action.sendKeys(Bime).perform();
    	      eh.unhighlightLast(driver, BIME);
    	      
    	      //Sandogh
    	      Thread.sleep(1000);
    	      eh.highlightElement(driver, SANDOGH);
    	      Thread.sleep(500);
    	      action.click(SANDOGH).perform();
    	      action.sendKeys(Sandogh).perform();
    	      eh.unhighlightLast(driver, SANDOGH);

    	      //BimeCode
    	      int z= (int)(Math.random()*10000000);
    	      //WebElement BIMECODE=driver.findElement(By.name("InsuranceNo"));
    	      eh.highlightElement(driver, BIMECODE);
    	      Thread.sleep(500);
    	      BIMECODE.sendKeys("1"+z);
    	      eh.unhighlightLastB(driver, BIMECODE);

    	      //BimeDate
    	      eh.highlightElement(driver, BIMEDATE);
    	      Thread.sleep(500);
    	      BIMEDATE.sendKeys(BimeDate);
    	      eh.unhighlightLast(driver, BIMEDATE);
    	      Thread.sleep(500);


    	      //Nesbat
    	     eh.highlightElement(driver, NESBAT);
    	     Thread.sleep(500);
    	     action.click(NESBAT).perform();
    	     NESBAT.sendKeys(Nesbat);
    	     //action.sendKeys(Nesbat).perform();
    	      eh.unhighlightLast(driver, NESBAT);
    	      Thread.sleep(500);
    	      
    	      //OldId
    	      eh.highlightElement(driver, OLDID);
    	      Thread.sleep(500);
    	      OLDID.sendKeys(OldId);
    	      eh.unhighlightLastB(driver,OLDID);
    	      Thread.sleep(500);

    	      //CaseComment
    	      eh.highlightElement(driver, CASECOMMENT);
    	      Thread.sleep(500);
    	      CASECOMMENT.sendKeys(CaseComment);
    	      eh.unhighlightLastB(driver,CASECOMMENT);


    	      //Sabt
    	      eh.highlightElement(driver, SABT);
    	      Thread.sleep(500);
    	      eh.unhighlightLast(driver, SABT);
    		  Thread.sleep(1000);
    		  action.click(SABT).perform();
    	      Thread.sleep(1000);
    	      
    	      //SuccecfulAddMessage
    	      WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container"));
    	      eh.highlightElement(driver, POPUP);
    	      Thread.sleep(1000);
    	      String c= POPUP.getText();
    	      System.out.print("resulte:"+ c);
    	      Assert.assertEquals(c, "پرونده بیمار با موفقیت ثبت شد.\n"
    	      		+ "x");
          		   } 
	   
	   public void AddPersionPatient_bornOutOfIranAndFree (WebDriver driver, String Name ,String Family ,String NameEn,String FamilyEn,String Father,String Avatar,String Sex ,String Tahol ,String BirthDate ,String Mahaltavalod 
				  ,String City ,String Phone, String TelPhone, String Post,String Adress ,String Email ,String Bime ,String Sandogh ,String BimeDate ,String Nesbat,String Meliat,String OldId,String CaseComment) throws Throwable {
		   
			 Actions action = new Actions(driver);

		     //name
		     eh.highlightElement(driver, NAME);
		     action.click(NAME).perform();
		     action.sendKeys(Name).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, NAME);
			 
          //family
		     eh.highlightElement(driver, FAMILY);
		     action.click(FAMILY).perform();
			 action.sendKeys(Family).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, FAMILY);
			 
		   

			 
          //father name
		     eh.highlightElement(driver, FATHER);
		     action.click(FATHER).perform();
			 action.sendKeys(Father).perform();
		     Thread.sleep(2000);
			 eh.unhighlightLastB(driver, FATHER);
			 

			 

           //sex
			  eh.highlightElement(driver, SEX);
			  action.click(SEX).perform();
			  SEX.sendKeys(Sex);
			 // action.sendKeys(Sex).perform();
			  eh.unhighlightLast(driver, SEX);
 	      Thread.sleep(500);

			//TAHOL
		      eh.highlightElement(driver, TAHOL);
		      Thread.sleep(500);
		      action.click(TAHOL).perform();
		      action.sendKeys(Tahol).perform();
 		  eh.unhighlightLast(driver, TAHOL);
 	      Thread.sleep(500);


			  //tarikh tavalod
			  eh.highlightElement(driver, BIRTHDATE);
			  Thread.sleep(500);
			  BIRTHDATE.sendKeys(BirthDate);
		      eh.unhighlightLast(driver, BIRTHDATE);
		      
		      //mahal tavalod Out Check
		      Thread.sleep(500);
		      action.click(OutOfIranBirthPlaceCheckBox).perform();

		      
		      //mahal tavalod
		      eh.highlightElement(driver, BIRTHPLACE);
		      Thread.sleep(500);
		      action.click(BIRTHPLACE).perform();
		      action.sendKeys(Mahaltavalod).perform();
		 	  eh.unhighlightLast(driver, BIRTHPLACE);
		 	  		 	  
		 	      		  
 		  //city
 		  eh.highlightElement(driver, CITY);
 	      CITY.click();
 	      CITY.clear();
 		  Thread.sleep(1000);
 		  CITY.click();
 		  Thread.sleep(500);
 		  action.click(CITY).perform();
 		  action.sendKeys(City).perform();
 	      eh.unhighlightLast(driver, CITY);
 	      Thread.sleep(500);

 	      
 	      //Phone
 	      int x= (int)(Math.random()*100000000);
 	     // WebElement PHONE= driver.findElement(By.name("telNo"));
 	      eh.highlightElement(driver, PHONE);
 	      Thread.sleep(500);
 	      PHONE.sendKeys("0935"+x);
 	      eh.unhighlightLastB(driver, PHONE);
 	      
 	    

 	      //Bime
 	      eh.highlightElement(driver, BIME);
 	      Thread.sleep(500);
 	      action.click(BIME).perform();
 	      action.sendKeys(Bime).perform();
 	      eh.unhighlightLast(driver, BIME);
 	      
 	     

 	      //Sabt
 	      eh.highlightElement(driver, SABT);
 	      Thread.sleep(500);
 	      eh.unhighlightLast(driver, SABT);
 		  Thread.sleep(1000);
 		  action.click(SABT).perform();
 	      Thread.sleep(1000);
 	      
 	      //SuccecfulAddMessage
 	      WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container"));
 	      eh.highlightElement(driver, POPUP);
 	      Thread.sleep(1000);
 	      String c= POPUP.getText();
 	      System.out.print("resulte:"+ c);
 	      Assert.assertEquals(c, "پرونده بیمار با موفقیت ثبت شد.\n"
 	      		+ "x");
       		   } 

	   
	   public void AddPatientForeign_Free (WebDriver driver, String Name ,String Family ,String NameEn,String FamilyEn,String Father,String Avatar,String Passport,String Sex ,String Tahol ,String BirthDate ,String Mahaltavalod 
				  ,String City ,String Phone, String TelPhone, String Post,String Adress ,String Email ,String Bime ,String Sandogh ,String BimeDate ,String Nesbat,String Meliat,String OldId,String CaseComment) throws Throwable {
		   
			 Actions action = new Actions(driver);

		     //name
		     eh.highlightElement(driver, NAME);
		     action.click(NAME).perform();
		     action.sendKeys(Name).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, NAME);
			 
             //family
		     eh.highlightElement(driver, FAMILY);
		     action.click(FAMILY).perform();
			 action.sendKeys(Family).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, FAMILY);
			 
             //father name
		     eh.highlightElement(driver, FATHER);
		     action.click(FATHER).perform();
			 action.sendKeys(Father).perform();
		     Thread.sleep(2000);
			 eh.unhighlightLastB(driver, FATHER);
			 
//             //Clear Meliat
//		     action.click(ClearMeliat).perform();
//		     Thread.sleep(2000);
//
//             //Meliat
//		     eh.highlightElement(driver, MELIAT);
//		     action.click(MELIAT).perform();
//			 action.sendKeys(Meliat).perform();
//		     Thread.sleep(2000);
//			 eh.unhighlightLastB(driver, MELIAT);


			  //Avatar
			  WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"file\"]"));
			  upload_file.sendKeys(Avatar);
			  //upload_file.sendKeys("C:/Users/s.mollahasani/Desktop/CIS/mr2.png");
			  
	          //Passport
			 WebElement PASSPORT= driver.findElement(By.xpath("//input[@formcontrolname='passportNumber']"));
			  eh.highlightElement(driver, PASSPORT);
			   action.click(PASSPORT).perform();
			   action.sendKeys(Passport).perform();
			   Thread.sleep(2000);
			 eh.unhighlightLastB(driver, PASSPORT);

			  
             //sex
			  eh.highlightElement(driver, SEX);
			  action.click(SEX).perform();
			  SEX.sendKeys(Sex);
			  eh.unhighlightLast(driver, SEX);
   	           Thread.sleep(500);
		   	  
				//TAHOL
		      eh.highlightElement(driver, TAHOL);
		      Thread.sleep(500);
		      action.click(TAHOL).perform();
		      action.sendKeys(Tahol).perform();
    		  eh.unhighlightLast(driver, TAHOL);
    	      Thread.sleep(500);


			  //tarikh tavalod
			  eh.highlightElement(driver, BIRTHDATE);
			  Thread.sleep(500);
			  BIRTHDATE.sendKeys(BirthDate);
		      eh.unhighlightLast(driver, BIRTHDATE);
		      
		      //mahal tavalod
		      WebElement birthPlace= driver.findElement(By.xpath("//input[@formcontrolname='birthPlaceOut']"));
		      eh.highlightElement(driver, birthPlace);
		      Thread.sleep(500);
		      action.click(birthPlace).perform();
		      action.sendKeys(Mahaltavalod).perform();
		 	  eh.unhighlightLast(driver, birthPlace);
		 	  
		 	      		  
//    		  //clear city
//    		  Thread.sleep(500);
//    		  action.click(CLEARCITY).perform();
//    	      Thread.sleep(500);

		 	  
		 	      		  
    		  //city
    		  eh.highlightElement(driver, CITY);
    		  Thread.sleep(500);
    		  action.click(CITY).perform();
    		  CITY.clear();    		  Thread.sleep(500);
    		  action.click(CITY).perform();
    		  action.sendKeys(City).perform();
    	      eh.unhighlightLast(driver, CITY);
    	      Thread.sleep(500);
    	      
    	      
    	      //Phone
    	      int x= (int)(Math.random()*100000000);
    	     // WebElement PHONE= driver.findElement(By.name("telNo"));
    	      eh.highlightElement(driver, PHONE);
    	      Thread.sleep(500);
    	      PHONE.sendKeys("0935"+x);
    	      eh.unhighlightLastB(driver, PHONE);
    	      
//    	      //TelPhone
//    	      int y= (int)(Math.random()*100000000);
//    	      eh.highlightElement(driver, TELPHONE);
//    	      Thread.sleep(500);
//    	      TELPHONE.sendKeys("021"+y);
//    	      eh.unhighlightLastB(driver, TELPHONE);

    	      
//    	      //Email
//    	      eh.highlightElement(driver, EMAIL);
//    	      Thread.sleep(500);
//    	      EMAIL.sendKeys(Email);
//    	      eh.unhighlightLastB(driver, EMAIL);
    	      
    	      //Sabt
    	      eh.highlightElement(driver, SABT);
    	      Thread.sleep(500);
    	      eh.unhighlightLast(driver, SABT);
    		  Thread.sleep(1000);
    		  action.click(SABT).perform();
    	      Thread.sleep(1000);
    	      
    	      //SuccecfulAddMessage
    	      WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container"));
    	      eh.highlightElement(driver, POPUP);
    	      Thread.sleep(1000);
    	      String c= POPUP.getText();
    	      System.out.print("resulte:"+ c);
    	      Assert.assertEquals(c, "پرونده بیمار با موفقیت ثبت شد.\n"
    	      		+ "x");

		   
	   }
	   
	  
}
