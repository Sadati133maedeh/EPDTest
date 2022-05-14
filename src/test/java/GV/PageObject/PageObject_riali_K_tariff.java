package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_riali_K_tariff {

	  element_Highlight eh= new element_Highlight();
	  

	  @FindBy(xpath="(//mat-select[@role='combobox'])[1]")
	   WebElement TarrifeType;

	  

	   public void Add_k( WebDriver driver ,String tariff,String tariff2,String contract,String k_herfeyi_Dakheli,String k_fani_Dakheli,String k_bihooshi_Dakheli,String h_herfeyi_Dakheli,String h_fani_Dakheli,String k_herfeyi_Dakheli_al,String k_fani_Dakheli_al,String k_bihooshi_Dakheli_al,String h_herfeyi_Dakheli_al,String h_fani_Dakheli_al,String k_herfeyi_Tebi,String k_fani_Tebi,String k_bihooshi_Tebi,String h_herfeyi_Tebi,String h_fani_Tebi,String k_herfeyi_Tebi_en,String k_fani_Tebi_en,String k_bihooshi_Tebi_en,String h_herfeyi_Tebi_en,String h_fani_Tebi_en,String k_herfeyi_Tasvir,String k_fani_Tasvir,String k_bihooshi_Tasvir,String h_herfeyi_Tasvir,String h_fani_Tasvir,String k_herfeyi_Tasvir_mri,String k_fani_Tasvir_mri,String k_bihooshi_Tasvir_mri,String h_herfeyi_Tasvir_mri,String h_fani_Tasvir_mri,String k_herfeyi_Jarahi,String k_fani_Jarahi,String k_bihooshi_Jarahi,String h_herfeyi_Jarahi,String h_fani_Jarahi,String k_herfeyi_Jarahi_Taz,String k_fani_Jarahi_Taz,String k_bihooshi_Jarahi_Taz,String h_herfeyi_Jarahi_Taz,String h_fani_Jarahi_Taz,String k_herfeyi_Jarahi2,String k_fani_Jarahi2,String k_bihooshi_Jarahi2	,String h_herfeyi_Jarahi2,String h_fani_Jarahi2,String k_herfeyi_Jarahi_Taz2	,String k_fani_Jarahi_Taz2,String k_bihooshi_Jarahi_Taz2,String h_herfeyi_Jarahi_Taz2,String h_fani_Jarahi_Taz2) throws InterruptedException {
		   Actions action = new Actions(driver);   
		   //داخلی
		   action
		   .click(TarrifeType).perform();
		   Thread.sleep(1000);
		   action
		  .sendKeys(tariff).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000);
	   
		   WebElement EditDakheli= driver.findElement(By.xpath("//tr[4]/td[10]/div[1]"));

		   action
		   .click(EditDakheli).perform();
		   Thread.sleep(1000);
		   
		   WebElement K_herfeyi_Dakheli= driver.findElement(By.xpath("//tr[4]/td[3]/descendant::input"));
		   WebElement K_fani_Dakheli= driver.findElement(By.xpath("//tr[4]/td[4]/descendant::input"));
		   WebElement K_bihooshi_Dakheli= driver.findElement(By.xpath("//tr[4]/td[5]/descendant::input"));
		   WebElement H_herfeyi_Dakheli= driver.findElement(By.xpath("//tr[4]/td[6]/descendant::input"));
		   WebElement H_fani_Dakheli= driver.findElement(By.xpath("//tr[4]/td[7]/descendant::input"));

		   action
		   .click(K_herfeyi_Dakheli)
		   .sendKeys(k_herfeyi_Dakheli)
		   .click(K_fani_Dakheli)
		   .sendKeys(k_fani_Dakheli)
		   .click(K_bihooshi_Dakheli)
		   .sendKeys(k_bihooshi_Dakheli)
		   .click(H_herfeyi_Dakheli)
		   .sendKeys(h_herfeyi_Dakheli)
		   .click(H_fani_Dakheli)
		   .sendKeys(h_fani_Dakheli)
		   .perform();
		   
		   WebElement SaveDakheli= driver.findElement(By.xpath("//tr[4]/td[10]/div[1]"));
		   action
		   .click(SaveDakheli).perform();
		   Thread.sleep(3000);
		   
		   //آزمایشگاه تشخیص طبی
	   
		   WebElement EditTebi1= driver.findElement(By.xpath("//tr[1]/td[10]/div[1]"));

		   action
		   .click(EditTebi1).perform();
		   Thread.sleep(1000);
		   
		   WebElement K_herfeyi_Tebi= driver.findElement(By.xpath("//tr[1]/td[3]/descendant::input"));
		   WebElement K_fani_Tebi= driver.findElement(By.xpath("//tr[1]/td[4]/descendant::input"));
		   WebElement K_bihooshi_Tebi= driver.findElement(By.xpath("//tr[1]/td[5]/descendant::input"));
		   WebElement H_herfeyi_Tebi= driver.findElement(By.xpath("//tr[1]/td[6]/descendant::input"));
		   WebElement H_fani_Tebi= driver.findElement(By.xpath("//tr[1]/td[7]/descendant::input"));

		   action
		   .click(K_herfeyi_Tebi)
		   .sendKeys(k_herfeyi_Tebi)
		   .click(K_fani_Tebi)
		   .sendKeys(k_fani_Tebi)
		   .click(K_bihooshi_Tebi)
		   .sendKeys(k_bihooshi_Tebi)
		   .click(H_herfeyi_Tebi)
		   .sendKeys(h_herfeyi_Tebi)
		   .click(H_fani_Tebi)
		   .sendKeys(h_fani_Tebi)
		   .perform();
		   
		   WebElement SaveTebi= driver.findElement(By.xpath("//tr[1]/td[10]/div[1]"));
		   action
		   .click(SaveTebi).perform();
		   Thread.sleep(2000);

		   //تصویربرداری پزشکی
		   
		   WebElement EditTasvir1= driver.findElement(By.xpath("//tr[2]/td[10]/div[1]"));

		   action
		   .click(EditTasvir1).perform();
		   Thread.sleep(1000);
		   
		   WebElement K_herfeyi_Tasvir= driver.findElement(By.xpath("//tr[2]/td[3]/descendant::input"));
		   WebElement K_fani_Tasvir= driver.findElement(By.xpath("//tr[2]/td[4]/descendant::input"));
		   WebElement K_bihooshi_Tasvir= driver.findElement(By.xpath("//tr[2]/td[5]/descendant::input"));
		   WebElement H_herfeyi_Tasvir= driver.findElement(By.xpath("//tr[2]/td[6]/descendant::input"));
		   WebElement H_fani_Tasvir= driver.findElement(By.xpath("//tr[2]/td[7]/descendant::input"));

		   action
		   .click(K_herfeyi_Tasvir)
		   .sendKeys(k_herfeyi_Tasvir)
		   .click(K_fani_Tasvir)
		   .sendKeys(k_fani_Tasvir)
		   .click(K_bihooshi_Tasvir)
		   .sendKeys(k_bihooshi_Tasvir)
		   .click(H_herfeyi_Tasvir)
		   .sendKeys(h_herfeyi_Tasvir)
		   .click(H_fani_Tasvir)
		   .sendKeys(h_fani_Tasvir)
		   .perform();
		   
		   WebElement SaveTasvir= driver.findElement(By.xpath("//tr[2]/td[10]/div[1]"));
		   action
		   .click(SaveTasvir).perform();
		   Thread.sleep(2000);

		   //جراحی
		   
		   WebElement EditJarahi1= driver.findElement(By.xpath("//tr[3]/td[10]/div[1]"));

		   action
		   .click(EditJarahi1).perform();
		   Thread.sleep(1000);
		   
		   WebElement K_herfeyi_Jarahi= driver.findElement(By.xpath("//tr[3]/td[3]/descendant::input"));
		   WebElement K_fani_Jarahi= driver.findElement(By.xpath("//tr[3]/td[4]/descendant::input"));
		   WebElement K_bihooshi_Jarahi= driver.findElement(By.xpath("//tr[3]/td[5]/descendant::input"));
		   WebElement H_herfeyi_Jarahi= driver.findElement(By.xpath("//tr[3]/td[6]/descendant::input"));
		   WebElement H_fani_Jarahi= driver.findElement(By.xpath("//tr[3]/td[7]/descendant::input"));

		   action
		   .click(K_herfeyi_Jarahi)
		   .sendKeys(k_herfeyi_Jarahi)
		   .click(K_fani_Jarahi)
		   .sendKeys(k_fani_Jarahi)
		   .click(K_bihooshi_Jarahi)
		   .sendKeys(k_bihooshi_Jarahi)
		   .click(H_herfeyi_Jarahi)
		   .sendKeys(h_herfeyi_Jarahi)
		   .click(H_fani_Jarahi)
		   .sendKeys(h_fani_Jarahi)
		   .perform();
		   
		   WebElement SaveJarahi= driver.findElement(By.xpath("//tr[3]/td[10]/div[1]"));
		   action
		   .click(SaveJarahi).perform();
		   Thread.sleep(2000);

		   //رفرش صفحه
		   driver.navigate().refresh();
			  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS); 
			   Thread.sleep(2000);
			   action
			   .click(TarrifeType).perform();
			   Thread.sleep(1000);
			   action
			  .sendKeys(tariff).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   Thread.sleep(1000);


		   
		   // چک ثبت داخلی
			   WebElement K_herfeyi_Dakheli_td= driver.findElement(By.xpath("//tr[4]/td[3]"));

			   String AddedK_herfeyi = K_herfeyi_Dakheli_td.getText();
			   Assert.assertEquals(AddedK_herfeyi, k_herfeyi_Dakheli);
			   eh.highlightElement(driver,K_herfeyi_Dakheli_td); 
	       // چک ثبت تشخیص طبی
			   WebElement K_herfeyi_Tebi_td= driver.findElement(By.xpath("//tr[1]/td[3]"));

			   String AddedK_herfeyi2 = K_herfeyi_Tebi_td.getText();
			   Assert.assertEquals(AddedK_herfeyi2, k_herfeyi_Tebi);
			   eh.highlightElement(driver,K_herfeyi_Tebi_td); 

		    // چک ثبت تصویربرداری
			   WebElement K_herfeyi_Tasvir_td= driver.findElement(By.xpath("//tr[2]/td[3]"));

			   String AddedK_herfeyi3 = K_herfeyi_Tasvir_td.getText();
			   Assert.assertEquals(AddedK_herfeyi3, k_herfeyi_Tasvir);
			   eh.highlightElement(driver,K_herfeyi_Tasvir_td); 

		    // چک ثبت جراحی
			   WebElement K_herfeyi_Jarahi_td= driver.findElement(By.xpath("//tr[3]/td[3]"));

			   String AddedK_herfeyi4 = K_herfeyi_Jarahi_td.getText();
			   Assert.assertEquals(AddedK_herfeyi4, k_herfeyi_Jarahi);
			   eh.highlightElement(driver,K_herfeyi_Jarahi_td); 
			   
			   //رفرش صفحه
			   driver.navigate().refresh();
				  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS); 
				   Thread.sleep(2000);
				   action
				   .click(TarrifeType).perform();
				   Thread.sleep(1000);
				   action
				  .sendKeys(tariff).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(Keys.ENTER).perform();
				   Thread.sleep(1000);


			   
			   //k زیرگروه خدمت داخلی
			   WebElement expand1_dakheli= driver.findElement(By.xpath("//tr[4]/td[2]/descendant::i"));
			   action
			   .click(expand1_dakheli).perform();
			   
			   WebElement ContractName= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
			   action
			   .click(ContractName).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(contract).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   Thread.sleep(2000);

			   action
			   .click()
			   .sendKeys(Keys.PAGE_DOWN).perform();
			   Thread.sleep(1000);

			   WebElement EditDakheli_Alergi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][4]/following-sibling::tr[2]/td[10]/div[1]/i"));

			   action
			   .click(EditDakheli_Alergi).perform();
			   Thread.sleep(2000);
			   

			   WebElement K_herfeyi_Dakheli_AL= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][4]/following-sibling::tr[2]/td[3]/descendant::input"));
			   WebElement K_fani_Dakheli_AL= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][4]/following-sibling::tr[2]/td[4]/descendant::input"));
			   WebElement K_bihooshi_Dakheli_AL= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][4]/following-sibling::tr[2]/td[5]/descendant::input"));
			   WebElement H_herfeyi_Dakheli_AL= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][4]/following-sibling::tr[2]/td[6]/descendant::input"));
			   WebElement H_fani_Dakheli_AL= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][4]/following-sibling::tr[2]/td[7]/descendant::input"));

			   action
			   .click(K_herfeyi_Dakheli_AL)
			   .sendKeys(k_herfeyi_Dakheli_al)
			   .click(K_fani_Dakheli_AL)
			   .sendKeys(k_fani_Dakheli_al)
			   .click(K_bihooshi_Dakheli_AL)
			   .sendKeys(k_bihooshi_Dakheli_al)
			   .click(H_herfeyi_Dakheli_AL)
			   .sendKeys(h_herfeyi_Dakheli_al)
			   .click(H_fani_Dakheli_AL)
			   .sendKeys(h_fani_Dakheli_al)
			   .perform();

			   WebElement SaveDakheli_Alergi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][4]/following-sibling::tr[2]/td[10]/div[1]"));
			   action
			   .click(SaveDakheli_Alergi).perform();
			   Thread.sleep(3000);
			   
			   WebElement x= driver.findElement(By.xpath("//tr[6]/td[3]"));

			   
			   action
			   .click(x)
			   .sendKeys(Keys.PAGE_UP).perform();
			   Thread.sleep(2000);


			   //k زیرگروه خدمت تشخیص طبی
			   WebElement expand1_Tebi= driver.findElement(By.xpath("//tr[1]/td[2]/descendant::i"));
			   action
			   .click(expand1_Tebi).perform();
			   
			   WebElement ContractName2= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
			   action
			   .click(ContractName2).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(contract).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   Thread.sleep(2000);

			   
			   WebElement EditTebi_en= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][1]/following-sibling::tr[2]/td[10]/div[1]"));

			   action
			   .click(EditTebi_en).perform();
			   Thread.sleep(2000);
			   
			   WebElement K_herfeyi_Tebi_en= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][1]/following-sibling::tr[2]/td[3]/descendant::input"));
			   WebElement K_fani_Tebi_en= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][1]/following-sibling::tr[2]/td[4]/descendant::input"));
			   WebElement K_bihooshi_Tebi_en= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][1]/following-sibling::tr[2]/td[5]/descendant::input"));
			   WebElement H_herfeyi_Tebi_en= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][1]/following-sibling::tr[2]/td[6]/descendant::input"));
			   WebElement H_fani_Tebi_en= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][1]/following-sibling::tr[2]/td[7]/descendant::input"));

			   action
			   .click(K_herfeyi_Tebi_en)
			   .sendKeys(k_herfeyi_Tebi_en)
			   .click(K_fani_Tebi_en)
			   .sendKeys(k_fani_Tebi_en)
			   .click(K_bihooshi_Tebi_en)
			   .sendKeys(k_bihooshi_Tebi_en)
			   .click(H_herfeyi_Tebi_en)
			   .sendKeys(h_herfeyi_Tebi_en)
			   .click(H_fani_Tebi_en)
			   .sendKeys(h_fani_Tebi_en)
			   .perform();

			   WebElement SaveTebi_en= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][1]/following-sibling::tr[2]/td[10]/div[1]"));
			   action
			   .click(SaveTebi_en).perform();
			   Thread.sleep(3000);
			
			   
			   WebElement t= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][1]/td[2]/descendant::i"));
			   action
			   .click(t).perform();
			   Thread.sleep(1000);

			   //k زیرگروه خدمت تصویربرداری
			   WebElement expand1_Tasvir= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/td[2]/descendant::i"));
			   action
			   .click(expand1_Tasvir).perform();
			   
			   WebElement ContractName3= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
			   action
			   .click(ContractName3).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(contract).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   Thread.sleep(2000);

			   action
			   .sendKeys(Keys.PAGE_DOWN).perform();
			   Thread.sleep(2000);

			   
			   WebElement EditTasvir_mri= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[10]/div[1]"));

			   action
			   .click(EditTasvir_mri).perform();
			   Thread.sleep(2000);
			   
			   WebElement K_herfeyi_Tasvir_mri= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[3]/descendant::input"));
			   WebElement K_fani_Tasvir_mri= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[4]/descendant::input"));
			   WebElement K_bihooshi_Tasvir_mri= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[5]/descendant::input"));
			   WebElement H_herfeyi_Tasvir_mri= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[6]/descendant::input"));
			   WebElement H_fani_Tasvir_mri= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[7]/descendant::input"));

			   action
			   .click(K_herfeyi_Tasvir_mri)
			   .sendKeys(k_herfeyi_Tasvir_mri)
			   .click(K_fani_Tasvir_mri)
			   .sendKeys(k_fani_Tasvir_mri)
			   .click(K_bihooshi_Tasvir_mri)
			   .sendKeys(k_bihooshi_Tasvir_mri)
			   .click(H_herfeyi_Tasvir_mri)
			   .sendKeys(h_herfeyi_Tasvir_mri)
			   .click(H_fani_Tasvir_mri)
			   .sendKeys(h_fani_Tasvir_mri)
			   .perform();

			   WebElement Saveh_Tasvir_mri= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[10]/div[1]"));
			   action
			   .click(Saveh_Tasvir_mri).perform();
			   Thread.sleep(3000);
			   
			   WebElement s= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[3]"));

			   action
			   .click(s)
			   .sendKeys(Keys.PAGE_UP).perform();
			   Thread.sleep(2000);
			   WebElement d= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/td[2]/descendant::i"));

			   action
			   .click(d).perform();
			   Thread.sleep(1000);

			   //k زیرگروه خدمت جراحی
			   WebElement expand1_Jarahi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/td[2]/descendant::i"));
			   action
			   .click(expand1_Jarahi).perform();
			   
			   WebElement ContractName4= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
			   action
			   .click(ContractName4).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(contract).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   Thread.sleep(2000);

			   
			   WebElement expand2_Jarahi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-1 ng-star-inserted']/td[2]/descendant::i"));
			   action
			   .click(expand2_Jarahi).perform();
			   Thread.sleep(1000);
			   WebElement z= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/td[3]"));

			   action
			   .click(z)
			   .sendKeys(Keys.PAGE_UP).perform();
			   Thread.sleep(1000);

			   
			   WebElement expand3_Jarahi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-2 ng-star-inserted']/td[2]/descendant::i"));
			   action
			   .click(expand3_Jarahi).perform();
			   Thread.sleep(1000);
			   WebElement expand4_Jarahi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-3 ng-star-inserted']/td[2]/descendant::i"));
			   action
			   .click(expand4_Jarahi).perform();
			   Thread.sleep(1000);



			   
			   WebElement EditJarahi_taz= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[4]/td[10]/div[1]"));

			   action
			   .click(EditJarahi_taz).perform();
			   Thread.sleep(2000);
			   
			   WebElement K_herfeyi_Jarahi_taz= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-4 ng-star-inserted']/td[3]/descendant::input"));
			   WebElement K_fani_Jarahi_taz= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-4 ng-star-inserted']/td[4]/descendant::input"));
			   WebElement K_bihooshi_Jarahi_taz= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-4 ng-star-inserted']/td[5]/descendant::input"));
			   WebElement H_herfeyi_Jarahi_taz= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-4 ng-star-inserted']/td[6]/descendant::input"));
			   WebElement H_fani_Jarahi_taz= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-4 ng-star-inserted']/td[7]/descendant::input"));

			   action
			   .click(K_herfeyi_Jarahi_taz)
			   .sendKeys(k_herfeyi_Jarahi_Taz)
			   .click(K_fani_Jarahi_taz)
			   .sendKeys(k_fani_Jarahi_Taz)
			   .click(K_bihooshi_Jarahi_taz)
			   .sendKeys(k_bihooshi_Jarahi_Taz)
			   .click(H_herfeyi_Jarahi_taz)
			   .sendKeys(h_herfeyi_Jarahi_Taz)
			   .click(H_fani_Jarahi_taz)
			   .sendKeys(h_fani_Jarahi_Taz)
			   .perform();

			   WebElement Save_Jarahi_Taz= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[4]/td[10]/div[1]"));
			   action
			   .click(Save_Jarahi_Taz).perform();
			   Thread.sleep(3000);
			   
			   WebElement y= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-4 ng-star-inserted']/td[3]"));
			   action
			   .click(y)
			   .sendKeys(Keys.PAGE_UP).perform();
			   Thread.sleep(1000);

			   

			   //رفرش صفحه
			   driver.navigate().refresh();
				  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS); 
				   Thread.sleep(2000);
				   action
				   .click(TarrifeType).perform();
				   Thread.sleep(1000);
				   action
				  .sendKeys(tariff).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(Keys.ENTER).perform();
				   Thread.sleep(1000);
				   
				   
		       // چک ثبت تشخیص طبی/انعقاد
				   WebElement expand2_Tebi= driver.findElement(By.xpath("//tr[1]/td[2]/descendant::i"));
				   action
				   .click(expand2_Tebi).perform();
				   
				   WebElement ContractName5= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
				   action
				   .click(ContractName5).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(contract).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(Keys.ENTER).perform();
				   Thread.sleep(2000);


				   WebElement K_herfeyi_Tebi_td_en= driver.findElement(By.xpath("//tr[3]/td[3]"));

				   String AddedK_herfeyi_td1 = K_herfeyi_Tebi_td_en.getText();
				   Assert.assertEquals(AddedK_herfeyi_td1, k_herfeyi_Tebi_en);
				   eh.highlightElement(driver,K_herfeyi_Tebi_td_en); 
				   
				   WebElement t2= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][1]/td[2]/descendant::i"));
				   action
				   .click(t2).perform();
				   Thread.sleep(1000);


			    // چک ثبت تصویربرداری
				   WebElement expand2_Tasvir= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/td[2]/descendant::i"));
				   action
				   .click(expand2_Tasvir).perform();
				   
				   WebElement ContractName6= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
				   action
				   .click(ContractName6).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(contract).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(Keys.ENTER).perform();
				   Thread.sleep(2000);
				   
				   action
				   .sendKeys(Keys.PAGE_DOWN).perform();
				   Thread.sleep(2000);



				   WebElement K_herfeyi_Tasvir_td_mri= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[3]"));

				   String AddedK_herfeyi_td2 = K_herfeyi_Tasvir_td_mri.getText();
				   Assert.assertEquals(AddedK_herfeyi_td2, k_herfeyi_Tasvir_mri);
				   eh.highlightElement(driver,K_herfeyi_Tasvir_td_mri); 
				   
				   WebElement b= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/following-sibling::tr[2]/td[3]"));

				   action
				   .click(b)
				   .sendKeys(Keys.PAGE_UP).perform();
				   Thread.sleep(2000);
				   WebElement m= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][2]/td[2]/descendant::i"));

				   action
				   .click(m).perform();
				   Thread.sleep(1000);

			    // چک ثبت جراحی
				   
				   WebElement expand5_Jarahi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/td[2]/descendant::i"));
				   action
				   .click(expand5_Jarahi).perform();
				   
				   WebElement ContractName7= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
				   action
				   .click(ContractName7).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(contract).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(Keys.ENTER).perform();
				   Thread.sleep(2000);

				   
				   WebElement expand6_Jarahi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-1 ng-star-inserted']/td[2]/descendant::i"));
				   action
				   .click(expand6_Jarahi).perform();
				   Thread.sleep(1000);
				   

				   WebElement expand7_Jarahi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-2 ng-star-inserted']/td[2]/descendant::i"));
				   action
				   .click(expand7_Jarahi).perform();
				   Thread.sleep(1000);
				   
				   WebElement n= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/td[3]"));

				   action
				   .click(n)
				   .sendKeys(Keys.PAGE_DOWN).perform();
				   Thread.sleep(1000);

				   WebElement expand8_Jarahi= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-3 ng-star-inserted']/td[2]/descendant::i"));
				   action
				   .click(expand8_Jarahi).perform();
				   Thread.sleep(1000);

				   WebElement K_herfeyi_Jarahi_td_taz= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-4 ng-star-inserted'][1]/td[3]/db-tree-cell"));

				   String AddedK_herfeyi_td3 = K_herfeyi_Jarahi_td_taz.getText();
				   Assert.assertEquals(AddedK_herfeyi_td3, k_herfeyi_Jarahi_Taz);
				   eh.highlightElement(driver,K_herfeyi_Jarahi_td_taz); 
				   
				   
				   WebElement l= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][3]/following-sibling::tr[@class='true background-lvl-4 ng-star-inserted']/td[3]"));
				   action
				   .click(l)
				   .sendKeys(Keys.PAGE_UP).perform();
				   Thread.sleep(1000);


			   // چک ثبت داخلی
				   
				   WebElement expand1_dakheli1= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][4]/td[2]/descendant::i"));
				   action
				   .click(expand1_dakheli1).perform();
				   
				   WebElement ContractName1= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
				   action
				   .click(ContractName1).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(contract).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(Keys.ENTER).perform();
				   Thread.sleep(2000);
				   
				   action
				   .click()
				   .sendKeys(Keys.PAGE_DOWN).perform();
				   Thread.sleep(1000);



				   WebElement K_herfeyi_Dakheli_td_al= driver.findElement(By.xpath("//*[contains(@class,'lvl-0')][4]/following-sibling::tr[2]/td[3]"));

				   String AddedK_herfeyi_al = K_herfeyi_Dakheli_td_al.getText();
				   Assert.assertEquals(AddedK_herfeyi_al, k_herfeyi_Dakheli_al);
				   eh.highlightElement(driver,K_herfeyi_Dakheli_td_al); 






	}
	   
	   public void Edit_Tariff_k ( WebDriver driver ,String Newtariff ,String tariff) throws InterruptedException {
		   Actions action = new Actions(driver);
		   //ادیت تعرفه جرااحی
		   action
		   .click(TarrifeType).perform();
		   Thread.sleep(1000);
		   action
		  .sendKeys(tariff).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000);

		   WebElement EditJarahi1= driver.findElement(By.xpath("//tr[3]/td[10]/div[1]"));

		   action
		   .click(EditJarahi1).perform();
		   Thread.sleep(1000);
		   
		   WebElement K_herfeyi_Jarahi= driver.findElement(By.xpath("//tr[3]/td[3]/descendant::input"));
		   action
		   .click(K_herfeyi_Jarahi)
		   .sendKeys(Keys.HOME)
		   .sendKeys(Keys.DELETE)
		   .sendKeys(Keys.DELETE)
		   .sendKeys(Keys.DELETE)
		   .sendKeys(Keys.DELETE)
		   .sendKeys(Newtariff)
		   .perform();
		   Thread.sleep(2000);
		   WebElement EditJarahi2= driver.findElement(By.xpath("//tr[3]/td[10]/div[1]"));

		   action
		   .click(EditJarahi2).perform();
		   Thread.sleep(1000);
		  
		   
		   //رفرش صفحه
		   driver.navigate().refresh();
			  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS); 
			   Thread.sleep(2000);
			   action
			   .click(TarrifeType).perform();
			   Thread.sleep(1000);
			   action
			  .sendKeys(tariff).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   Thread.sleep(1000);
			   //چک ادیت تعرفه جراحی
			   WebElement K_herfeyi_Jarahi_td= driver.findElement(By.xpath("//tr[3]/td[3]"));
			   String EditedK_herfeyi_jarahi = K_herfeyi_Jarahi_td.getText();
			   Assert.assertEquals(EditedK_herfeyi_jarahi, Newtariff);
			   eh.highlightElement(driver,K_herfeyi_Jarahi_td); 


		   
	}
	   
	   public void Delete_Tariff_k ( WebDriver driver,String tariff,String contract ) throws InterruptedException {
		   Actions action = new Actions(driver);
		   action
		   .click(TarrifeType).perform();
		   Thread.sleep(1000);
		   action
		  .sendKeys(tariff).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000);
		   
		   WebElement DeleteTariffK= driver.findElement(By.xpath("//tr[1]/td[10]/div[2]"));
		   action
		   .click(DeleteTariffK)
		   .perform();
		   Thread.sleep(1000);
		   
		   WebElement YesKeyDeleteTariffK= driver.findElement(By.xpath("//button[text()='بله']"));
		   action
		   .click(YesKeyDeleteTariffK)
		   .perform();
		   Thread.sleep(5000);
		   // چک کردن حذف تعرفه گروه اصلی
		   WebElement K_herfeyi_Tebi_td= driver.findElement(By.xpath("//tr[1]/td[3]"));

		   String AddedK_herfeyi2 = K_herfeyi_Tebi_td.getText();
		   Assert.assertEquals(AddedK_herfeyi2, "");
		   eh.highlightElement(driver,K_herfeyi_Tebi_td); 
		   
		   // چک کردن حذف تعرفه زیر گروه
		   WebElement expand2_Tebi= driver.findElement(By.xpath("//tr[1]/td[2]/descendant::i"));
		   action
		   .click(expand2_Tebi).perform();
		   
		   WebElement ContractName5= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
		   action
		   .click(ContractName5).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(contract).perform();
		   Thread.sleep(1000);
		   action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(2000);


		   WebElement K_herfeyi_Tebi_td_en= driver.findElement(By.xpath("//tr[3]/td[3]"));

		   String AddedK_herfeyi_td1 = K_herfeyi_Tebi_td_en.getText();
		   Assert.assertEquals(AddedK_herfeyi_td1, "");
		   eh.highlightElement(driver,K_herfeyi_Tebi_td_en); 


		   
		   

		   

	   }
}
