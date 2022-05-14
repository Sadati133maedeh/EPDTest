package hr.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EntesabKarmand {
	WebDriver driver;
	@FindBy(xpath = "//a[@title = 'امنیت']")
	WebElement SecurityPanel;
	
	@FindBy(xpath = "//a[@title = 'گروه کاربری']")
	WebElement ActivityGroup;
	
	
	
	
	@FindBy(xpath = "//td[@class = 'k-hierarchy-cell'][1]")
	WebElement Expand;
	
	
	@FindBy(xpath = "//kendo-combobox[@id = 'AppName']//input[@class= 'k-input']")
	WebElement Roles;
	
	
	@FindBy(xpath = "//input[@role='listbox']")
	WebElement Role2;
	
	
	
	@FindBy(xpath = "//div[@id = 'GroupAssignmen']//a")
	WebElement save;
	
	
	@FindBy(xpath = "//button[text()='بله']")
	WebElement Confirm;
	
	
	public void EntesabKarmand() throws InterruptedException {
		Thread.sleep(3000);
		SecurityPanel.click();
		ActivityGroup.click();
	}
	
	public void EntesabKarmand2() throws InterruptedException, AWTException {
		

		Thread.sleep(2000);
		Expand.click();
		Thread.sleep(500);
		Roles.sendKeys("منابع");

		Roles.sendKeys(Keys.ENTER);
		

		Role2.click();
		Thread.sleep(1000);

		Role2.sendKeys(Keys.DOWN);
		Role2.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		save.click();
		Confirm.click();
		
		Thread.sleep(3000);
	



		
	}
}
