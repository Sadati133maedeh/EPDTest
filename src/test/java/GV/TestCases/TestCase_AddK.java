package GV.TestCases;

import org.testng.annotations.Test;

import GV.Package.element_Highlight;
import GV.Package.DataProviders;
import GV.PageObject.PageObgectLogin;
import GV.PageObject.PageObject_DefinitionCenterParts;
import GV.PageObject.PageObject_Landing;
import GV.PageObject.PageObject_MainMenu;
import GV.PageObject.PageObject_license;
import GV.PageObject.PageObject_riali_K_tariff;
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

public class TestCase_AddK {
      WebDriver driver;
      
      
  @Test(dataProvider="AddK",dataProviderClass=DataProviders.class)
  public void f(String URL ,String UserName ,String Password,String tariff,String tariff2,String contract,String k_herfeyi_Dakheli,String k_fani_Dakheli,String k_bihooshi_Dakheli,String h_herfeyi_Dakheli,String h_fani_Dakheli,String k_herfeyi_Dakheli_al,String k_fani_Dakheli_al,String k_bihooshi_Dakheli_al,String h_herfeyi_Dakheli_al,String h_fani_Dakheli_al,String k_herfeyi_Tebi,String k_fani_Dakheli_Tebi,String k_bihooshi_Tebi,String h_herfeyi_Tebi,String h_fani_Tebi,String k_herfeyi_Tebi_en,String k_fani_Tebi_en,String k_bihooshi_Tebi_en,String h_herfeyi_Tebi_en,String h_fani_Tebi_en,String k_herfeyi_Tasvir,String k_fani_Tasvir,String k_bihooshi_Tasvir,String h_herfeyi_Tasvir,String h_fani_Tasvir,String k_herfeyi_Tasvir_mri,String k_fani_Tasvir_mri,String k_bihooshi_Tasvir_mri,String h_herfeyi_Tasvir_mri,String h_fani_Tasvir_mri,String k_herfeyi_Jarahi,String k_fani_Jarahi,String k_bihooshi_Jarahi,String h_herfeyi_Jarahi,String h_fani_Jarahi,String k_herfeyi_Jarahi_Taz,String k_fani_Jarahi_Taz,String k_bihooshi_Jarahi_Taz,String h_herfeyi_Jarahi_Taz,String h_fani_Jarahi_Taz ,String k_herfeyi_Jarahi2,String k_fani_Jarahi2,String k_bihooshi_Jarahi2	,String h_herfeyi_Jarahi2,String h_fani_Jarahi2,String k_herfeyi_Jarahi_Taz2	,String k_fani_Jarahi_Taz2,String k_bihooshi_Jarahi_Taz2,String h_herfeyi_Jarahi_Taz2,String h_fani_Jarahi_Taz2) throws Throwable {
	 
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
	  //Enter to k Page
	  PageObject_MainMenu k=PageFactory.initElements(driver, PageObject_MainMenu.class);
	  k.RialiAdjustTriff_Icon(driver);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  

	  //Add k
	  PageObject_riali_K_tariff Addk=PageFactory.initElements(driver, PageObject_riali_K_tariff.class);
	  Addk.Add_k(driver, tariff, tariff2, contract, k_herfeyi_Dakheli_al, k_fani_Dakheli_al, k_bihooshi_Dakheli_al, h_herfeyi_Dakheli_al, h_fani_Dakheli_al, k_herfeyi_Dakheli_al, k_fani_Dakheli_al, k_bihooshi_Dakheli_al, h_herfeyi_Dakheli_al, h_fani_Dakheli_al, k_herfeyi_Tebi, k_fani_Dakheli_Tebi, k_bihooshi_Tebi, h_herfeyi_Tebi, h_fani_Tebi, k_herfeyi_Tebi_en, k_fani_Tebi_en, k_bihooshi_Tebi_en, h_herfeyi_Tebi_en, h_fani_Tebi_en, k_herfeyi_Tasvir, k_fani_Tasvir, k_bihooshi_Tasvir, h_herfeyi_Tasvir, h_fani_Tasvir, k_herfeyi_Tasvir_mri, k_fani_Tasvir_mri, k_bihooshi_Tasvir_mri, h_herfeyi_Tasvir_mri, h_fani_Tasvir_mri, k_herfeyi_Jarahi, k_fani_Jarahi, k_bihooshi_Jarahi, h_herfeyi_Jarahi, h_fani_Jarahi, k_herfeyi_Jarahi_Taz, k_fani_Jarahi_Taz, k_bihooshi_Jarahi_Taz, h_herfeyi_Jarahi_Taz, h_fani_Jarahi_Taz, k_herfeyi_Jarahi2, k_fani_Jarahi2,k_bihooshi_Jarahi2	,h_herfeyi_Jarahi2,h_fani_Jarahi2,k_herfeyi_Jarahi_Taz2	,k_fani_Jarahi_Taz2,k_bihooshi_Jarahi_Taz2, h_herfeyi_Jarahi_Taz2,h_fani_Jarahi_Taz2);
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
