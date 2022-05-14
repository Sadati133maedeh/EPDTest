package cis.TestCase;

import org.testng.annotations.Test;

import cis.cispackage.DataProviders;
import cis.cispackage.element_Highlight;
import cis.pageObject.PageObgectLogin;
import cis.pageObject.PageObject_AddPatient;
import cis.pageObject.PageObject_Admit;
import cis.pageObject.PageObject_AdmitList;
import cis.pageObject.PageObject_Landing;
import cis.pageObject.PageObject_ListPatient;
import cis.pageObject.PageObject_MainMenu;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCaseAdmitNewPatient_NationalCode {
      String nationalCode;

      
      WebDriver driver;
	element_Highlight eh= new element_Highlight();


  @Test(dataProvider="AddPationesPersianInAdmit",dataProviderClass=DataProviders.class)
  public void f(String URL ,String UserName ,String Password ,String Name ,String Family ,String Father
		  ,String Avatar,String Sex ,String TAHOL ,String BIRTHDATE ,String Mahaltavalod 
		  ,String City ,String Adress ,String Email ,String BIME ,String SANDOGH ,String BIMEDATE ,String NESBAT,String Meliat,String OLDID ,String clinic,String trapist, String assistant, String shift, String model) throws Throwable {
	 
	  driver.navigate().to(URL);
	  driver.manage().window().maximize();


	  
	  //Login
	  PageObgectLogin admLoginPage = 
				PageFactory.initElements(driver, PageObgectLogin.class);
		admLoginPage.login(driver, URL ,UserName , Password);
		
		//Landing
		PageObject_Landing Icon = PageFactory.initElements(driver, PageObject_Landing.class);
		Icon.CIS_Icon(driver);
		
		  	  System.out.println(driver.getCurrentUrl());
	  for(String window : driver.getWindowHandles() ) {
		  driver.switchTo().window(window);
	  }
	  

	  //AdmitNewPatientWith
	  PageObject_Admit admit =PageFactory.initElements(driver, PageObject_Admit.class);
	  admit.Admit_NationalCode(driver, nationalCode);
      Thread.sleep(1000);
     
      //PageAddPatient
    
      PageObject_Admit NewPatient = PageFactory.initElements(driver,  PageObject_Admit.class);
      NewPatient.AddPatient(driver, Name, Family, Father, Avatar, Sex, TAHOL, BIRTHDATE, Mahaltavalod, City, Adress, Email, BIME, SANDOGH, BIMEDATE, NESBAT, Meliat, OLDID);
      Thread.sleep(3000);
      
      //Admit
	  admit.Admit_Data(driver, clinic,trapist, assistant, shift, model);
      Thread.sleep(500);
      
	   //CheckAdmit
	  PageObject_AdmitList serchectronicNumbe =PageFactory.initElements(driver, PageObject_AdmitList.class);
	  serchectronicNumbe.Search_Admit_NationalCode(driver, nationalCode);
	  
     WebElement GrideNationalCode=  driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit-list/div/div[3]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[6]"));
     Thread.sleep(2000);
     eh.highlightElement(driver, GrideNationalCode);
     String w = GrideNationalCode.getText();
     System.out.print("resulte:"+ w);
     Assert.assertEquals(nationalCode, w);
     Thread.sleep(2000);


  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
      driver.get("http://mellicode.azmads.com/Home/");
	  WebElement Code = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h2[2]"));
	  eh.highlightElement(driver, Code);
	  Thread.sleep(1000);
	  nationalCode = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h2[2]")).getText();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  
	  	
  }
	   @AfterMethod
  public void afterMethod() {
	//	driver.quit();
	  
  }

}
