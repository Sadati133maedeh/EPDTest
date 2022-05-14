package cis.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cis.cispackage.element_Highlight;

public class PageObgectLogin {
	

	element_Highlight eh= new element_Highlight();


    @FindBy(xpath="//input[@formcontrolname='username']")
	WebElement userName;
    
    @FindBy(xpath="//input[@formcontrolname='password']")
	WebElement password;

    @FindBy(xpath="//iframe[@title='reCAPTCHA']")
	WebElement iframeSwitch;

    @FindBy(xpath="//button[text()='ورود']")
	WebElement loginbutton;
    
    

    public void login( WebDriver driver,String URL, String UserName , String Password) throws InterruptedException {
    	

    	element_Highlight eh= new element_Highlight();
    	
        eh.highlightElement(driver, userName);
		userName.sendKeys(UserName);
		eh.unhighlightLast(driver, userName);
		
    	eh.highlightElement(driver, password);
    	password.sendKeys(Password);
		eh.unhighlightLast(driver, password);

		
	    driver.switchTo().frame(iframeSwitch);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(50000);
		
    	eh.highlightElement(driver, loginbutton);
		loginbutton.click();
		eh.unhighlightLast(driver, loginbutton);
	    Thread.sleep(3000);


	}

}

