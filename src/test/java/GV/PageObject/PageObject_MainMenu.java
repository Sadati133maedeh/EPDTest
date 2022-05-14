package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GV.Package.element_Highlight;


public class PageObject_MainMenu {

  element_Highlight eh= new element_Highlight();
//متغیرهای پایه
   @FindBy(xpath="//span[text()='متغیرهای پایه']")
   WebElement BasicVariable;
 //تحصیلات  
   @FindBy(xpath="//span[text()='تحصیلات']")
   WebElement Basic_Education;
//تخصص   
   @FindBy(xpath="//span[text()='نوع تخصص']")
   WebElement Basic_SpecialityType;
//بخش های استاندارد
   @FindBy(xpath="//span[text()='بخش های استاندارد']")
   WebElement Basic_StandardSection;
//مجوز
   @FindBy(xpath="//span[text()='مجوز']")
   WebElement Basic_License;
//بیمه
   @FindBy(xpath="//span[text()='بیمه']")
   WebElement Basic_Insuranse;
//متغیرهای عمومی
   @FindBy(xpath="//span[text()='متغیرهای عمومی']")
   WebElement PublicVariables;
//تعرییف بخش های مرکز
   @FindBy(xpath="//span[text()='تعریف بخش های مرکز']")
   WebElement Public_DefinitionCenterParts;
//نقش
   @FindBy(xpath="//span[text()='نقش']")
   WebElement Public_Roles;
//خدمات
   @FindBy(xpath="//span[text()='خدمات']")
   WebElement Services;
//گروه خدمات
   @FindBy(xpath="//span[text()='گروه خدمات']")
   WebElement Group_Services;
//خدمت
   @FindBy(xpath="//span[text()='خدمت']")
   WebElement Services_Service;
//خدمات مراکز
   @FindBy(xpath="//span[text()='خدمات مراکز']")
   WebElement Services_CenterServices;
//تنظیمات مالی
   @FindBy(xpath="//span[text()='تنظیمات مالی']")
   WebElement FinancialSettings;
//نام تعرفه
   @FindBy(xpath="//span[text()='نام تعرفه']")
   WebElement Financial_Tariff;
//نام قرارداد
   @FindBy(xpath="//span[text()='نام قرارداد']")
   WebElement Financial_Contract;
//تنظیم ریالی k تعرفه
   @FindBy(xpath="//span[text()='تنظیم ریالیk  تعرفه']")
   WebElement Financial_RialiAdjustTriff;
//تنظیم ثابت ریالی   
   @FindBy(xpath="//span[text()='تنظیم ریالی ثابت']")
   WebElement Financial_FixedRialiAdjust;
//تنظیم قرارداد
   @FindBy(xpath="//span[text()='تنظیم قرارداد ']")
   WebElement Financial_centerContract;
//تخصیص بیمه
   @FindBy(xpath="//span[text()='تخصیص  بیمه']")
   WebElement Financial_InsuranceAllocation;
//گلوبال رسمی خدمات
   @FindBy(xpath="//span[text()='خدمات رسمی گلوبال']")
   WebElement Financial_GlobalServices;
//اضافه به گلوبال
   @FindBy(xpath="//span[text()='اضافه به گلوبال']")
   WebElement Financial_AddToGlobal;
//تنظیمات مالی مراکز
   @FindBy(xpath="//span[text()='تنظیمات مالی مراکز']")
   WebElement Financial_CenterFinancialSettings;

//امنیت
   @FindBy(xpath="(//span[text()='امنیت'])[1]")
   WebElement Security;
//زیرمنوی امنیت
   @FindBy(xpath="(//span[text()='امنیت'])[2]")
   WebElement Security1;
 //خروج
   @FindBy(xpath="//mat-icon[@mattooltip='خروج']")
   WebElement Exit;
//باز و بسته کردن منوی اصلی
   @FindBy(xpath="//div[@mattooltip='منو']")
   WebElement Colaps;

   
   

   public void Education_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   Basic_Education.click();
	   Thread.sleep(1000);	
   }
   
   public void SpecialityType_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Basic_SpecialityType);
	   Basic_SpecialityType.click();
	   Thread.sleep(1000);
   }
   public void StandardSection_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Basic_StandardSection);
	   Basic_StandardSection.click();
	   Thread.sleep(1000);
   }
   public void License_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Basic_License);
	   Basic_License.click();
	   Thread.sleep(1000);
   }
   public void Insuranse_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Basic_Insuranse);
	   Basic_Insuranse.click();
	   Thread.sleep(1000);
   }
   public void DefinitionCenterParts_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,PublicVariables);
	   Thread.sleep(1000);
	   PublicVariables.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Public_DefinitionCenterParts);
	   Public_DefinitionCenterParts.click();
	   Thread.sleep(1000);
   }
   public void Roles_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,PublicVariables);
	   Thread.sleep(1000);
	   PublicVariables.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Public_Roles);
	   Public_Roles.click();
	   Thread.sleep(1000);
   }
   public void Group_Services_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Services);
	   Thread.sleep(1000);
	   Services.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Group_Services);
	   Group_Services.click();
	   Thread.sleep(1000);
   }
   public void Service_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Services);
	   Thread.sleep(1000);
	   Services.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Services_Service);
	   Services_Service.click();
	   Thread.sleep(1000);
   }
   public void CenterServices_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Services);
	   Thread.sleep(1000);
	   Services.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Services_CenterServices);
	   Services_CenterServices.click();
	   Thread.sleep(1000);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   }
   public void Tariff_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_Tariff.click();
	   Thread.sleep(1000);
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

   }
   public void Contract_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_Contract.click();
	   Thread.sleep(1000);
   }
   public void RialiAdjustTriff_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_RialiAdjustTriff.click();
	   Thread.sleep(7000);
   }
   public void FixedRialiAdjust_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_FixedRialiAdjust.click();
	   Thread.sleep(1000);
   }
   public void centerContract_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_centerContract.click();
	   Thread.sleep(1000);
   }
   public void InsuranceAllocation_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_InsuranceAllocation.click();
	   Thread.sleep(1000);
   }
   public void GlobalServices_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_GlobalServices.click();
	   Thread.sleep(1000);
   }
   public void AddToGlobal_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_AddToGlobal.click();
	   Thread.sleep(1000);
   }
   public void CenterFinancialSettings_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_CenterFinancialSettings.click();
	   Thread.sleep(1000);
   }
   public void Security_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Security);
	   Thread.sleep(1000);
	   Security.click();
	   Thread.sleep(1000);
	   Security1.click();
	   Thread.sleep(1000);
   }
   
   public void Exit ( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Exit);
	   Thread.sleep(1000);
	   Exit.click();
	   Thread.sleep(1000);
   }
   public void Colaps ( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Colaps);
	   Thread.sleep(1000);
	   Colaps.click();
	   Thread.sleep(1000);
   }



















   
	   
 }
