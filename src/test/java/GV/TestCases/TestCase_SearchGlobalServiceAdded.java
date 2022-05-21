package GV.TestCases;

import org.testng.annotations.Test;

import GV.Package.element_Highlight;
import GV.Package.DataProviders;
import GV.PageObject.PageObgectLogin;
import GV.PageObject.PageObject_Global_Services_Peyvand;
import GV.PageObject.PageObject_Landing;
import GV.PageObject.PageObject_MainMenu;
import GV.PageObject.PageObject_contract_type;
import GV.PageObject.PageObject_license;
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
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_SearchGlobalServiceAdded {
      WebDriver driver;
      
      
  @Test(dataProvider="LoginPeyvand",dataProviderClass=DataProviders.class)
  public void f(String URL ,String UserName ,String Password) throws Throwable {
	 
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
	  //Enter to Global Service Page
	  PageObject_MainMenu basic=PageFactory.initElements(driver, PageObject_MainMenu.class);
	  basic.GlobalServices_Icon(driver);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  

	  //Search Global Service Added
	  PageObject_Global_Services_Peyvand Search=PageFactory.initElements(driver, PageObject_Global_Services_Peyvand.class);
	  Search.SearchGlobalServiceAdded(driver);
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  

	  

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
