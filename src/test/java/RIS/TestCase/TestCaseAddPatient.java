package RIS.TestCase;

import org.testng.annotations.Test;

import RIS.Rispackage.RIS_DataProviders;
import RIS.pageObject.PageObject_RIS_AddPatient;
import RIS.pageObject.PageObject_RIS_MainMenu;
import cis.cispackage.element_Highlight;
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

public class TestCaseAddPatient {
      String nationalCode;

      
      WebDriver driver;
	element_Highlight eh= new element_Highlight();


  @Test(dataProvider="AddPersionPatient_AllFields",dataProviderClass=RIS_DataProviders.class)
  public void f(String URL ,String UserName ,String Password ,String Name ,String Family ,String NameEn,String FamilyEn, String Father
			 ,String Avatar,String Sex ,String Tahol ,String BirthDate ,String Mahaltavalod 
			  ,String City ,String Phone, String TelPhone,String Post, String Adress ,String Email ,String Bime ,String Sandogh ,String BimeDate ,String Nesbat,String Meliat,String OldId,String CaseComment) throws Throwable {
	 
	  driver.navigate().to(URL);
	  driver.manage().window().maximize();
	  Thread.sleep(5000);


	  
	  //Login
//	  PageObgectLogin admLoginPage = 
//				PageFactory.initElements(driver, PageObgectLogin.class);
//		admLoginPage.login(driver, URL ,UserName , Password);
		
//		//Landing
//		PageObject_Landing Icon = PageFactory.initElements(driver, PageObject_Landing.class);
//		Icon.CIS_Icon(driver);
//		
//		  	  System.out.println(driver.getCurrentUrl());
//	  for(String window : driver.getWindowHandles() ) {
//		  driver.switchTo().window(window);
//	  }
	   //EnterToAddPatientPage
	  PageObject_RIS_MainMenu menu = PageFactory.initElements(driver, PageObject_RIS_MainMenu.class);
	  menu.add_patient_menu(driver);
	  Thread.sleep(3000);
	 for(String window : driver.getWindowHandles() ) {
	  driver.switchTo().window(window);
	  }
	 
	
	 driver.findElement(By.xpath("//input[@formcontrolname='nationalCode']")).sendKeys(nationalCode);
		 
 
	 //AddPatient
	 PageObject_RIS_AddPatient sick = PageFactory.initElements(driver, PageObject_RIS_AddPatient.class);
	 sick.AddPersionPatient_AllFields(driver, Name, Family, NameEn, FamilyEn, Father, Avatar, Sex, Tahol, BirthDate, Mahaltavalod, City, Phone, TelPhone,Post, Adress, Email, Bime, Sandogh, BimeDate, Nesbat, Meliat, OldId, CaseComment);
	 
	 
	 
	 	 	
//	 //EnterToListPatientPage
//      menu.list_patient_menu(driver);
//      for(String window : driver.getWindowHandles() ) {
//		  driver.switchTo().window(window);
//	  }
//	  //CheckAddPatient
//      PageObject_ListPatient CheckAdd = PageFactory.initElements(driver, PageObject_ListPatient.class);
//      CheckAdd.Search_Patient_melicode(driver, nationalCode);
//      
//      WebElement Gridmelicode=  driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-patient-list/div/app-patient-search/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]"));
//      Thread.sleep(2000);
//      eh.highlightElement(driver, Gridmelicode);
//      String w = Gridmelicode.getText();
//      System.out.print("resulte:"+ w);
//      Assert.assertEquals(nationalCode, w);
//      Thread.sleep(2000);

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
