package cis.TestCase;

import org.testng.annotations.Test;

import cis.cispackage.DataProviders;
import cis.cispackage.element_Highlight;
import cis.pageObject.PageObgectLogin;
import cis.pageObject.PageObject_AddPatient;
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

public class TestCaseAddPatient {
      String nationalCode;

      
      WebDriver driver;
	element_Highlight eh= new element_Highlight();


  @Test(dataProvider="AddPationesPersian",dataProviderClass=DataProviders.class)
  public void f(String URL ,String UserName ,String Password ,String Name ,String Family ,String Father
		  ,String Avatar,String Sex ,String TAHOL ,String BIRTHDATE ,String Mahaltavalod 
		  ,String City ,String Adress ,String Email ,String BIME ,String SANDOGH ,String BIMEDATE ,String NESBAT,String Meliat,String OLDID) throws Throwable {
	 
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
	   //EnterToAddPatientPage
	  PageObject_MainMenu menu = PageFactory.initElements(driver, PageObject_MainMenu.class);
	  menu.add_patient_menu(driver);
	  Thread.sleep(3000);
	 for(String window : driver.getWindowHandles() ) {
	  driver.switchTo().window(window);
	  }
	 
	
	 driver.findElement(By.name("NationalCode")).sendKeys(nationalCode);
		 
 
	 //AddPatient
	 PageObject_AddPatient sick = PageFactory.initElements(driver, PageObject_AddPatient.class);
	 sick.AddPatient(driver , Name ,Family,Father,Avatar,Sex,TAHOL,BIRTHDATE,Mahaltavalod,City,Adress,Email,BIME,SANDOGH,BIMEDATE,NESBAT,Meliat,OLDID);
	 
	 	 	
	 //EnterToListPatientPage
      menu.list_patient_menu(driver);
      for(String window : driver.getWindowHandles() ) {
		  driver.switchTo().window(window);
	  }
	  //CheckAddPatient
      PageObject_ListPatient CheckAdd = PageFactory.initElements(driver, PageObject_ListPatient.class);
      CheckAdd.Search_Patient_melicode(driver, nationalCode);
      
      WebElement Gridmelicode=  driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-patient-list/div/app-patient-search/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]"));
      Thread.sleep(2000);
      eh.highlightElement(driver, Gridmelicode);
      String w = Gridmelicode.getText();
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
		driver.quit();
	  
  }

}
