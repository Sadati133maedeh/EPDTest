package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_standardSection {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String SpecialityName;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[1]/div/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
   WebElement Active_Diactive;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[1]/div/form/div/div[6]/button[1]")
   WebElement SearchButtom;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[2]/db-angular-tree-grid/table/tbody/tr[1]/td[2]/db-tree-cell/div/div/span/i")
   WebElement OpenDarmani;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[1]/div/form/div/div[4]/mat-form-field/div/div[1]/div/input")
   WebElement SearchName;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[2]/db-angular-tree-grid/table/tbody/tr[2]/td[5]/mat-checkbox/label/span[1]")
   WebElement checkbox;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-header/div[2]/div/button[2]/span[1]/mat-icon")
   WebElement Save;
   
   @FindBy(xpath="")
   WebElement Refresh;
   
   
   PageObject_standardSection DeActive =new PageObject_standardSection();


//نمایش لیست غیر فعال
   public void showDeActivesSection( WebDriver driver ) throws InterruptedException {
	   
   
   }   
 }
