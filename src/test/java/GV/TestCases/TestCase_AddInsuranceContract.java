package GV.TestCases;

import org.testng.annotations.Test;

import GV.Package.element_Highlight;
import GV.Package.DataProviders;
import GV.PageObject.PageObgectLogin;
import GV.PageObject.PageObject_DefinitionCenterParts;
import GV.PageObject.PageObject_Landing;
import GV.PageObject.PageObject_MainMenu;
import GV.PageObject.PageObject_insurance_contract;
import GV.PageObject.PageObject_license;
import GV.PageObject.PageObject_riali_K_tariff;
import GV.PageObject.PageObject_riali_fixed;
import GV.PageObject.PageObject_speciality;
import GV.PageObject.PageObject_tariff_type;

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

public class TestCase_AddInsuranceContract {
      WebDriver driver;
      
      
  @Test(dataProvider="AddInsuranceContract",dataProviderClass=DataProviders.class)
  public void f(String URL ,String UserName ,String Password,String Contract ,String model ,String herfeyiPatientShear ,String herfeyiInsurShear, String herfeyiFeranshiz, String technicalPatientShear,String technicalInsurShare, String technicalFeranshiz, String tariff, String patientDiference, String insurDiference,String exteraKInsurShare,String extraKFranshiz,String drugInsurShare,String drugFranshizShare ,String Contract2,String model2,String herfeyiPatientShear2,String herfeyiInsurShear2,String herfeyiFeranshiz2,String technicalPatientShear2,String technicalInsurShare2,String technicalFeranshiz2,String tariff2,String patientDiference2,String insurDiference2,String exteraKInsurShare2,String extraKFranshiz2,String drugInsurShare2,String drugFranshizShare2) throws Throwable {
	 
	  driver.navigate().to(URL);
	  driver.manage().window().maximize();


	  
	  //Login
	  PageObgectLogin admLoginPage = 
				PageFactory.initElements(driver, PageObgectLogin.class);
		admLoginPage.login(driver, URL ,UserName , Password);
		
		//Landing
		PageObject_Landing Icon = PageFactory.initElements(driver, PageObject_Landing.class);
		Icon.GV_Icon(driver);
		  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  

		
		  	  System.out.println(driver.getCurrentUrl());
	  for(String window : driver.getWindowHandles() ) {
		  driver.switchTo().window(window);
	  }
	  //Enter to InsuranceContract Page
	  PageObject_MainMenu k=PageFactory.initElements(driver, PageObject_MainMenu.class);
	  k.centerContract_Icon(driver);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  

	  //Add InsuranceContract
	  PageObject_insurance_contract AddInsuranceContract=PageFactory.initElements(driver, PageObject_insurance_contract.class);
	  AddInsuranceContract.AddInsuranceContract(driver, Contract, model, herfeyiPatientShear, herfeyiInsurShear, herfeyiFeranshiz, technicalPatientShear, technicalInsurShare, technicalFeranshiz, tariff, patientDiference, insurDiference, exteraKInsurShare, extraKFranshiz, drugInsurShare, drugFranshizShare, Contract2, model2, herfeyiPatientShear2, herfeyiInsurShear2, herfeyiFeranshiz2, technicalPatientShear2, technicalInsurShare2, technicalFeranshiz2, tariff2, patientDiference2, insurDiference2, exteraKInsurShare2, extraKFranshiz2, drugInsurShare2, drugFranshizShare2);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  

	  

	  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  
	  	
  }
	   @AfterMethod
  public void afterMethod() {
	//	driver.quit();
	  
  }

}
