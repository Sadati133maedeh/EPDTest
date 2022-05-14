package GV.TestCases;

import org.testng.annotations.Test;

import GV.Package.element_Highlight;
import GV.Package.DataProviders;
import GV.PageObject.PageObgectLogin;
import GV.PageObject.PageObject_DefinitionCenterParts;
import GV.PageObject.PageObject_Landing;
import GV.PageObject.PageObject_MainMenu;
import GV.PageObject.PageObject_center_services;
import GV.PageObject.PageObject_group_services;
import GV.PageObject.PageObject_license;
import GV.PageObject.PageObject_services;
import GV.PageObject.PageObject_speciality;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_Copy_Center_Services {
      WebDriver driver;
      WebDriver driver2;

      
  @Test(dataProvider="CopyServiceName",dataProviderClass=DataProviders.class)
  public void f(String URL2 ,String UserName2 ,String Password2,String beginCenterGroup ,String beginCentreName, String destinationCenterGroup ,String destinationCentreName ) throws Throwable {
	 
	  driver.navigate().to(URL2);
	  driver.manage().window().maximize();


	  //Login
	  PageObgectLogin admLoginPage = 
				PageFactory.initElements(driver, PageObgectLogin.class);
		admLoginPage.login(driver, URL2 ,UserName2 , Password2);
		  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  

		
		//Landing
			PageObject_Landing Icon = PageFactory.initElements(driver, PageObject_Landing.class);
		Icon.GV_Icon(driver);
		  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  

		
		  	  System.out.println(driver.getCurrentUrl());
	  for(String window : driver.getWindowHandles() ) {
		  driver.switchTo().window(window);
	  }
	  //Enter to center service Page
	  PageObject_MainMenu Service=PageFactory.initElements(driver, PageObject_MainMenu.class);
	  Service.CenterServices_Icon(driver);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  

	  //Copy Services Name
	  PageObject_center_services Copy=PageFactory.initElements(driver, PageObject_center_services.class);
	  Copy.CopyCenterServices(driver, beginCenterGroup, beginCentreName, destinationCenterGroup, destinationCentreName);	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	  Thread.sleep(1000);

	  

	  
	  



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
