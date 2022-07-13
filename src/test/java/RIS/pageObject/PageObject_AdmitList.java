package cis.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import cis.cispackage.element_Highlight;

public class PageObject_AdmitList {
	
	element_Highlight eh= new element_Highlight();

    WebDriver driver;

	
	@FindBy(name="patientCenId")
	WebElement SearchElectronicNumber;

	@FindBy(name="patientLastName")
	WebElement patientLastName;

	@FindBy(id="inputNationalCode")
	WebElement NationalCode;

        @FindBy(xpath="//label[@for='Nationality']/following::input[1]")
	WebElement Meliat;

	
	public void Search_Admit_ElectronicNumber (WebDriver driver, String electronicNumber) throws Throwable {
		   
		 Actions action = new Actions(driver);

	      eh.highlightElement(driver, SearchElectronicNumber);
	      Thread.sleep(500);
	      action.click(SearchElectronicNumber).perform();
	      action.sendKeys(electronicNumber).perform();
	      Thread.sleep(500);
	      action.sendKeys(Keys.ENTER).perform();
	      Thread.sleep(3000);
}
	public void Search_Admit_FamilyName (WebDriver driver, String familyName) throws Throwable {
		   
		 Actions action = new Actions(driver);

	      eh.highlightElement(driver, patientLastName);
	      Thread.sleep(500);
	      action.click(patientLastName).perform();
	      action.sendKeys(familyName).perform();
	      Thread.sleep(500);
	      action.sendKeys(Keys.ENTER).perform();
	      Thread.sleep(3000);
}
	
	public void Search_Admit_NationalCode (WebDriver driver, String nationalCode) throws Throwable {
		   
		 Actions action = new Actions(driver);

	      eh.highlightElement(driver, NationalCode);
	      Thread.sleep(500);
	      action.click(NationalCode).perform();
	      action.sendKeys(nationalCode).perform();
	      Thread.sleep(500);
	      action.sendKeys(Keys.ENTER).perform();
	      Thread.sleep(3000);
}


	public void Search_Admit_PassportCode (WebDriver driver,String meliat, String passport) throws Throwable {
		   
		 Actions action = new Actions(driver);
              eh.highlightElement(driver, Meliat);
              action.click( Meliat).perform();
	      action.sendKeys(meliat).perform();
              Thread.sleep(500);
              WebElement Passport=driver.findElement(By.name("passCode"));
	      eh.highlightElement(driver, Passport);
	      Thread.sleep(500);
	      action.click(Passport).perform();
	      action.sendKeys(passport).perform();
	      Thread.sleep(500);
	      action.sendKeys(Keys.ENTER).perform();
	      Thread.sleep(3000);
}


}

